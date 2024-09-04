package com.sunilbooks.selflearnjava.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP client that sends an empty packet to a server and receives a quote. This
 * client sends a request to the server and then waits for a response containing
 * the quote of the moment.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class QuoteClient {

	/**
	 * Main method to execute the UDP client. Starts a UDP socket, sends an empty
	 * packet to the server, waits for a response, and prints the received quote.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws IOException if an I/O error occurs while sending or receiving packets
	 */
	public static void main(String[] args) throws IOException {

		// Start UDP Socket on a port assigned by OS
		DatagramSocket socket = new DatagramSocket();

		// Create a byte buffer
		byte[] buf = new byte[256];

		// Encapsulate Server's IP Address
		InetAddress address = InetAddress.getByName("127.0.0.1");

		// Create a new packet with Server IP Address and Port Number
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);

		// Send packet
		socket.send(packet);

		// Create an empty data packet to receive Server's packet
		packet = new DatagramPacket(buf, buf.length);

		// Wait for a packet and receive
		socket.receive(packet);

		// Convert byte into string
		String received = new String(packet.getData()).trim();

		System.out.println("Quote of the Moment: " + received);

		// Close Socket
		socket.close();
	}
}
