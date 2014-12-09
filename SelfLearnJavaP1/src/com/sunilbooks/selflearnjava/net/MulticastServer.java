package com.sunilbooks.selflearnjava.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * Created DatagramSocket server that broadcast a message to Muticast client group
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MulticastServer {

	public static void main(String[] args) throws Exception {

		String[] quotes = { "Bura Mat Dekho", "Bura Mat kaho", "Bura Mat suno" };

		System.out.println("Broadcasting Server Started");
		// Start UDP Socket @ port#4445
		DatagramSocket socket = new DatagramSocket(4446);

		// Grpup IP address
		InetAddress groupIP = InetAddress.getByName("202.0.202.0");
		// Group port number
		int groupPort = 3336;

		byte[] msg = null;
		DatagramPacket packet = null;

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
