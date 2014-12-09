package com.sunilbooks.selflearnjava.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Date;

/*
 * Creates Multicast client, receives broadcast messages.  
 * Multicast client join group listening on port number 3336 and identified by "203.0.113.0"  
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MulticastClient {

	public static void main(String[] args) throws Exception {

		// Create socket and setup group port 3336
		MulticastSocket socket = new MulticastSocket(3336);

		// Setup group IP address "202.0.202.0"
		InetAddress group = InetAddress.getByName("202.0.202.0");

		// Join the group
		socket.joinGroup(group);

		System.out.println("Ready to receive brodcast message " + new Date());

		// create empty packet
		byte[] buf = new byte[256];
		DatagramPacket packet;
		packet = new DatagramPacket(buf, buf.length);

		for (int i = 0; i < 3; i++) {

			// Receive broadcasted message
			socket.receive(packet);

			// Print message
			String received = new String(packet.getData());
			System.out.println("Message:" + received);
		}
		// Leave the group
		socket.leaveGroup(group);

		// Close the socket
		socket.close();
	}

}
