package com.sunilbooks.selflearnjava.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Reads text from a specified URL and displays it on the console using the
 * {@link java.net.URL} class. This class demonstrates how to open a connection
 * to a URL, read its contents, and print them.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class URLReader {

	/**
	 * Main method to execute the URL reading. Opens a connection to a given URL,
	 * retrieves its contents, and prints the text to the console.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an error occurs while opening the stream or reading the
	 *                   URL
	 */
	public static void main(String[] args) throws Exception {

		URL u = new URL("http://www.sunrays.co.in:80/Home");

		System.out.println("Protocol: " + u.getProtocol());
		System.out.println("Host Name: " + u.getHost());
		System.out.println("Port Number: " + u.getPort());
		System.out.println("File Name: " + u.getFile());

		// Open input channel to read data
		InputStream iStr = u.openStream();

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
