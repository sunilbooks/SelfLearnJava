package com.sunilbooks.selflearnjava.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
 
/*
 * Send a message to Server
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class HelloTCPClient {

	public static void main(String[] args) throws Exception {
		// Create Socket object using constructor accepting Server's IP and Port
		// number
		Socket client = new Socket("localhost", 1234);
		// Open Client’s Input Stream
		DataInputStream in = new DataInputStream(client.getInputStream());
		// Open Client’s Output Stream
		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		// Write greetings to Server
		out.writeBytes("Hello Server\n");

		// Read greeting sent by Server
		String greeting = in.readLine();

		System.out.println(greeting);

		// Close connection with server
		client.close();
	}
}
