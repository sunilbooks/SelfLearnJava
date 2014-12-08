package com.sunilbooks.selflearnjava.net;

import java.io.*;
import java.net.*;

/*
 * Created UDP client that send an empty packet to server and received today's quote.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class QuoteClient {

	public static void main(String[] args) throws IOException {

		// Start UDP Socket on a port assigned by OS
		DatagramSocket socket = new DatagramSocket();

		// Create a byte buffer
		byte[] buf = new byte[256];

		// Encapsulate Server's IP Address
		InetAddress address = InetAddress.getByName("127.0.0.1");

		// Create a new packet with Server IP Address and Port Number
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address,
				4445);

		// Send packet
		socket.send(packet);

		// Create an empty data packet to receive Server's packet
		packet = new DatagramPacket(buf, buf.length);

		// Wait for a packet and receive
		socket.receive(packet);

		// Convert byte into string
		String received = new String(packet.getData());

		System.out.println("Quote of the Moment: " + received);

		// Close Socket
		socket.close();
	}
}
