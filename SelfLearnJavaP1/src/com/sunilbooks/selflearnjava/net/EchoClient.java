package com.sunilbooks.selflearnjava.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * A TCP client that reads text input from the console and sends it to a server.
 * <p>
 * This client connects to a server running on the IP address "127.0.0.1" and
 * port "4444". It sends the input text to the server and prints the server's
 * response. The client continues to send and receive messages until "Bye" is
 * entered, which closes the connection.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class EchoClient {

	/**
	 * The entry point of the application. It connects to the server, reads text
	 * from the console, sends it to the server, and prints the server's response.
	 * The client terminates if the text "Bye" is entered.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws IOException if an I/O error occurs
	 */
	public static void main(String[] args) throws IOException {

		// Connect to server running on given IP and Port
		Socket cSocket = new Socket("127.0.0.1", 4444);

		// Open Socket's Output Stream to write to the Server
		PrintWriter out = new PrintWriter(cSocket.getOutputStream(), true);

		// Open Socket's Input Stream to read from the Server
		BufferedReader in = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));

		System.out.println("Echo Client Started");

		// Open Input Stream to read text from Keyboard ( System.in )
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		// Read text from Keyboard
		String line = stdIn.readLine();

		// Execute loop until line is not null
		while (line != null) {

			// Write text to Server
			out.println(line);

			// Received echo string and print
			System.out.println("Echo: " + in.readLine());

			// If text is "Bye" then break the loop.
			if ("Bye".equals(line)) {
				break;
			}
			// Read next line from Keyboard
			line = stdIn.readLine();
		}

		// Close streams
		out.close();
		in.close();
		stdIn.close();

		// Close socket
		cSocket.close();
	}
}
