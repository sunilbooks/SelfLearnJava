package com.sunilbooks.selflearnjava.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP server that sends a random quote to the client upon receiving a packet
 * from the client. The server listens on port 4445 and sends one of the
 * predefined quotes in response to each packet received.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class QuoteServer {

	/**
	 * Main method to execute the UDP server. Starts a UDP socket on port 4445,
	 * listens for packets from clients, and responds with a random quote.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws IOException if an I/O error occurs while receiving or sending packets
	 */
	public static void main(String[] args) throws IOException {

		String[] quotes = { "Bura Mat Dekho", "Bura Mat kaho", "Bura Mat suno" };

		// Start UDP Socket @ port#4445
		DatagramSocket socket = new DatagramSocket(4445);

		// Create a byte buffer
		byte[] buf = new byte[256];

		// Create an empty data packet to receive sender's packet
		DatagramPacket emptyPkt = new DatagramPacket(buf, buf.length);

		boolean flag = true;

		// Listen Packets until flag is false
		while (flag) {

			// Wait for a packet and receive
			socket.receive(emptyPkt);

			// Get Sender's IP Address
			InetAddress address = emptyPkt.getAddress();

			// Get Sender's Port Number
			int port = emptyPkt.getPort();

			// Get random index number between 0 to 2
			int ind = (int) (Math.random() * 3);

			// Get random quote and convert into byte array
			byte[] quote = quotes[ind].getBytes();

			// Create a new packet with quote and address to Sender's IP and Port
			DatagramPacket quotePkt = new DatagramPacket(quote, quote.length, address, port);

			// Send packet
			socket.send(quotePkt);
		}

		// Close the socket
		socket.close();
	}
}
