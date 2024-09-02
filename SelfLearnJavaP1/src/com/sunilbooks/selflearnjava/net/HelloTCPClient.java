package com.sunilbooks.selflearnjava.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 * A TCP client that sends a greeting message to a server and receives a
 * greeting message back from the server.
 * <p>
 * This client connects to a server running on localhost at port 1234. It sends
 * the string "Hello Server" to the server and waits to receive a response. The
 * received message is then printed to the console. The client closes the
 * connection once the exchange is complete.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloTCPClient {

	/**
	 * The entry point of the client application. It establishes a connection to the
	 * server, sends a greeting message, reads the server's response, and then
	 * closes the connection.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs or the connection fails
	 */
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
