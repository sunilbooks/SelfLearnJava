package com.sunilbooks.selflearnjava.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Creates a UDP server that broadcasts messages to a multicast client group.
 * The server sends a series of predefined quotes to a multicast group
 * identified by the IP address "202.0.202.0" and port number 3336.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MulticastServer {

	/**
	 * The main method that initializes the UDP socket, creates and sends broadcast
	 * messages to the multicast group, and then closes the socket.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an error occurs during socket operations or message
	 *                   broadcasting
	 */
	public static void main(String[] args) throws Exception {

		String[] quotes = { "Bura Mat Dekho", "Bura Mat Kaho", "Bura Mat Suno" };

		System.out.println("Broadcasting Server Started");

		// Start UDP Socket @ port#4446
		DatagramSocket socket = new DatagramSocket(4446);

		// Group IP address
		InetAddress groupIP = InetAddress.getByName("202.0.202.0");
		// Group port number
		int groupPort = 3336;

		byte[] msg;
		DatagramPacket packet;

		for (int i = 0; i < quotes.length; i++) {
			msg = quotes[i].getBytes();

			// Create a packet for group
			packet = new DatagramPacket(msg, msg.length, groupIP, groupPort);

			// Broadcast message to group
			socket.send(packet);

			System.out.println("Broadcasted " + quotes[i]);
		}

		// Close the socket
		socket.close();
		System.out.println("Broadcasting Server End");
	}
}
