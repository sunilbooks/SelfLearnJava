package com.sunilbooks.selflearnjava.net;

import java.net.*;
import java.util.Scanner;
import java.io.*;

/*
 * Sends a search parameter to www.ask.com and read the search results.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class URLWriter {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://www.ask.com/web");

		String question = "java";

		// Create URLConnection object
		URLConnection conn = url.openConnection();

		// Inform URLConnection object for writing parameters
		conn.setDoOutput(true);

		// Open output stream
		OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

		// Write question parameter
		out.write("q=" + question);

		// Close output stream
		out.close();

		// Connect to the Server
		conn.connect();

		// Open input channel to read data
		InputStream iStr = conn.getInputStream();

		// Scanner will convert bytes into text
		Scanner in = new Scanner(iStr);

		System.out.print("URL contents ***");

		// Read text line by line from URL
		while (in.hasNext()) {
			String html = in.nextLine();
			System.out.println(html);
		}

		in.close();

	}
}
