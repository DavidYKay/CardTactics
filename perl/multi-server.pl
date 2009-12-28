#!/usr/bin/perl -Tw
#multi-server.pl
#Multi-Process echo server
use strict;
BEGIN { $ENV{PATH} = '/usr/ucb:/bin' }
use Socket;
use Carp;
my $EOL = "\015\012";

sub spawn;  # forward declaration
sub logmsg { print "$0 $$: @_ at ", scalar localtime, "\n" }

my $port = shift || 2345;
my $proto = getprotobyname('tcp');

($port) = $port =~ /^(\d+)$/                        or die "invalid port";

socket(Server, PF_INET, SOCK_STREAM, $proto)        || die "socket: $!";
setsockopt(Server, SOL_SOCKET, SO_REUSEADDR,
								   pack("l", 1))   || die "setsockopt: $!";
bind(Server, sockaddr_in($port, INADDR_ANY))        || die "bind: $!";
listen(Server,SOMAXCONN)                            || die "listen: $!";

logmsg "server started on port $port";

my $waitedpid = 0;
my $paddr;

use POSIX ":sys_wait_h";
use Errno;

sub REAPER {
   local $!;   # don't let waitpid() overwrite current error
   while ((my $pid = waitpid(-1,WNOHANG)) > 0 && WIFEXITED($?)) {
	   logmsg "reaped $waitedpid" . ($? ? " with exit $?" : '');
   }
   $SIG{CHLD} = \&REAPER;  # loathe sysV
}

$SIG{CHLD} = \&REAPER;

while(1) {
   $paddr = accept(Client, Server) || do {
	   # try again if accept() returned because a signal was received
	   next if $!{EINTR};
	   die "accept: $!";
   };
   my ($port, $iaddr) = sockaddr_in($paddr);
   my $name = gethostbyaddr($iaddr, AF_INET);

   logmsg "connection from $name [",
		  inet_ntoa($iaddr),
		  "] at port $port";

   spawn sub {
	   $|=1;
	   print "Hello there, $name, it's now ", scalar localtime, $EOL;
	   exec '/usr/games/fortune'       # XXX: `wrong' line terminators
		   or confess "can't exec fortune: $!";
   };
   close Client;
}

sub spawn {
   my $coderef = shift;

   unless (@_ == 0 && $coderef && ref($coderef) eq 'CODE') {
	   confess "usage: spawn CODEREF";
   }

   my $pid;
   if (! defined($pid = fork)) {
	   logmsg "cannot fork: $!";
	   return;
   }
   elsif ($pid) {
	   logmsg "begat $pid";
	   return; # I'm the parent
   }
   # else I'm the child -- go spawn

   open(STDIN,  "<&Client")   || die "can't dup client to stdin";
   open(STDOUT, ">&Client")   || die "can't dup client to stdout";
   ## open(STDERR, ">&STDOUT") || die "can't dup stdout to stderr";
   exit &$coderef();
}
