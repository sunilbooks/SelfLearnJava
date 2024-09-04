package com.sunilbooks.selflearnjava.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Multi-threaded Echo Server that handles multiple concurrent clients. This
 * server accepts client connections and starts a new thread for each client to
 * handle communication independently.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MultiThreadedEchoServer {

	/**
	 * Main method to start the Echo Server. Creates a ServerSocket on port 4444,
	 * listens for client connections, and spawns a new {@link TalkingThread} for
	 * each client.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws IOException if an I/O error occurs when opening the socket
	 */
	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(4444);

		System.out.println("Echo Server Started");

		boolean flag = true;

		while (flag) {
			Socket clientSocket = server.accept();
			TalkingThread talkingThread = new TalkingThread(clientSocket);
			talkingThread.start();
		}

		System.out.println("Echo Server Stopped");

		server.close();
	}
}

/**
 * Handles communication with a single client in a separate thread. Reads
 * messages from the client and echoes them back until the client sends "Bye".
 */
class TalkingThread extends Thread {
	private Socket client = null;

	/**
	 * Constructs a new {@code TalkingThread} with the specified client socket.
	 * 
	 * @param clientSocket the socket associated with the client
	 */
	public TalkingThread(Socket clientSocket) {
		this.client = clientSocket;
	}

	/**
	 * Runs the thread to handle communication with the client. Reads input from the
	 * client, processes it, and sends responses back.
	 * 
	 * @see Thread#run()
	 */
	public void run() {
		try {
			// Open Socket's Output Stream to write to the Client
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);

			// Open Socket's Input Stream to read from the Client
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

			// Read text from Client
			String line = in.readLine();

			// Execute loop until line is null
			while (line != null) {
				System.out.println("Server Received: " + line);

				// Echo line back to the Client
				out.println(line + " .. " + line);

				// If Client sent "Bye" then break the loop
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
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
