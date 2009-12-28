#!/usr/bin/perl -w
use IO::Socket;
$remote = IO::Socket::INET->new(
				   Proto    => "tcp",
				   PeerAddr => "localhost",
				   PeerPort => "daytime(2345)",
				   #PeerPort => "daytime(13)",
			   )
			 or die "cannot connect to daytime port at localhost";
while ( <$remote> ) { print }
