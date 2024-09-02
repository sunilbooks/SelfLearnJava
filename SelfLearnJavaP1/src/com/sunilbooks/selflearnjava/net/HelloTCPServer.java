package com.sunilbooks.selflearnjava.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * A TCP server that listens for client connections on port 1234.
 * <p>
 * This server accepts connections from clients, receives a greeting message
 * from the client, and sends a response back to the client. It then closes the
 * connection with the client and terminates.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloTCPServer {

	/**
	 * The entry point of the server application. It sets up a server socket, waits
	 * for a client to connect, exchanges messages with the client, and then closes
	 * the connection.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs or the server fails to start
	 */
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
