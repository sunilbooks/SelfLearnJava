package com.sunilbooks.selflearnjava.net;

import java.io.*;
import java.net.*;

/**
 * A TCP server that communicates with multiple clients sequentially.
 * <p>
 * This server listens on port 4444 and handles each client's request by reading
 * the text sent from the client and echoing it back. The server continues to
 * handle new client connections until stopped. The communication ends when the
 * server receives the message "Bye" from the client.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class EchoServer {

	/**
	 * The entry point of the server application. It starts the server, listens for
	 * incoming client connections, and handles communication with each client
	 * sequentially.
	 * 
	 * @param a command-line arguments (not used)
	 * @throws IOException if an I/O error occurs
	 */
	public static void main(String[] a) throws IOException {

		// Start Server @ port# 4444
		ServerSocket sSocket = new ServerSocket(4444);

		System.out.println("Echo Server is Started");

		// Socket object
		Socket cSocket = null;

		boolean flag = true;
		// Listen Clients until flag is false
		while (flag) {
			// Receive a new Client's request
			cSocket = sSocket.accept();
			// Talk to the Client
			talk(cSocket);
		}

		// Closing Server
		sSocket.close();

		System.out.println("Echo Server is Closed");
	}

	/**
	 * Handles communication with a client. It reads lines of text sent by the
	 * client and echoes each line back with added suffix until the client sends
	 * "Bye".
	 * 
	 * @param cSocket the socket connected to the client
	 * @throws IOException if an I/O error occurs
	 */
	public static void talk(Socket cSocket) throws IOException {

		// Open Socket's Output Stream to write to the Client
		PrintWriter out = new PrintWriter(cSocket.getOutputStream(), true);

		// Open Socket's Input Stream to read from the Client
		BufferedReader in = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));

		// Read text from Client
		String line = in.readLine();

		// Execute loop until line is null
		while (line != null) {

			System.out.println("Server Received : " + line);

			// Echo line back to the Client
			out.println(line + " .. " + line);

			// If Client sent "Bye" then break the loop.
			if (line.equals("Bye")) {
				break;
			}
			// Read next line
			line = in.readLine();
		}

		// Close streams
		out.close();
		in.close();

		// Close socket
		cSocket.close();

	}
}
