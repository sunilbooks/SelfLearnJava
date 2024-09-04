package com.sunilbooks.selflearnjava.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This class implements a TCP server that listens on port 1234 and handles
 * client connections. It receives a greeting message from the client and 
 * responds with a greeting message.
 * <p>
 * In case of any IOException during server operations, the exception is caught
 * and its stack trace is printed.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloTCPServerExcpetion {

	/**
	 * The main method that starts the TCP server. It creates a server socket, 
	 * waits for a client to connect, reads a message from the client, sends a 
	 * response, and then closes the connection and server. 
	 * <p>
	 * Any IOException encountered during these operations is caught and its
	 * stack trace is printed.
	 * </p>
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// Create a Server
		ServerSocket server;
		try {
			server = new ServerSocket(1234);

			// Wait for Client
			Socket client = server.accept();

			// Open Client’s Input Stream
			DataInputStream in = new DataInputStream(client.getInputStream());

			// Open Client’s Output Stream
			DataOutputStream out = new DataOutputStream(client.getOutputStream());

			// Read greeting sent by Client
			String greeting = in.readLine();
			System.out.println(greeting);

			// Write greetings to Client
			out.writeBytes("Hello Client\n");

			// Close connection with Client
			client.close();

			// Close Server
			server.close();
		} catch (IOException e) {
			// Handle I/O exceptions
			e.printStackTrace();
		}
	}
}
