package com.sunilbooks.selflearnjava.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Creates a TCP server that listen client's request at port number 1234. 
 * It receives a greeting string from client and send back greeting to the client
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloTCPServer {
	public static void main(String[] args) throws Exception {

		// Create a TCP Server @ port#1234
		ServerSocket server = new ServerSocket(1234);

		// Wait for Client
		Socket client = server.accept();

		// Open Client’s Input Stream
		DataInputStream in = new DataInputStream(client.getInputStream());

		// Open Client’s Output Stream
		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		// Read greeting sent by Client
		String greeting = in.readLine();
		System.out.println(greeting);

		// Write greetings back to the Client
		out.writeBytes("Hello Client\n");

		// Close client's connection
		client.close();

		// Close Server
		server.close();

	}
}
