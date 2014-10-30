package com.sunilbooks.selflearnjava.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Multi-threaded Echo Server handles multiple concurrent Clients at a time.
 * 
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 * 
 */

public class MultiThreadedEchoServer {

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
 * Class to communicate with Client socket
 */
class TalkingThread extends Thread {
	private Socket client = null;

	public TalkingThread(Socket clientSocket) {
		this.client = clientSocket;
	}

	/**
	 * Communicate with Client
	 */
	public void run() {
		try {
			// Open Socket's Output Stream to write to the Client
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);

			// Open Socket's Input Stream to read from the Client
			BufferedReader in = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			// Read text from Client
			String line = in.readLine();

			// Execute loop until line is null
			while (line != null) {

				System.out.println("Server Recived : " + line);

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
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}