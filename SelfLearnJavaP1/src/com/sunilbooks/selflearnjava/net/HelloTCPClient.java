package com.sunilbooks.selflearnjava.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
 
/*
 * Creates a TCP client. Sends a greeting string to server and receives back greeting string from the server.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class HelloTCPClient {

	public static void main(String[] args) throws Exception {

		// Connect to server IP (localhost) and port (1234) using parameterized
		// constructor.
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
