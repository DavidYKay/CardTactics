#!/usr/bin/perl -w
use strict;
use IO::Socket;
my ($host, $port, $kidpid, $handle, $line);

unless (@ARGV == 2) { die "usage: $0 host port" }
($host, $port) = @ARGV;

# create a tcp connection to the specified host and port
$handle = IO::Socket::INET->new(Proto     => "tcp",
							   PeerAddr  => $host,
							   PeerPort  => $port)
	  or die "can't connect to port $port on $host: $!";

$handle->autoflush(1);              # so output gets there right away
print STDERR "[Connected to $host:$port]\n";

# split the program into two processes, identical twins
die "can't fork: $!" unless defined($kidpid = fork());

# the if{} block runs only in the parent process
if ($kidpid) {
   # copy the socket to standard output
   while (defined ($line = <$handle>)) {
	   print STDOUT $line;
   }
   kill("TERM", $kidpid);                  # send SIGTERM to child
}
# the else{} block runs only in the child process
else {
   # copy standard input to the socket
   while (defined ($line = <STDIN>)) {
	   print $handle $line;
   }
}

