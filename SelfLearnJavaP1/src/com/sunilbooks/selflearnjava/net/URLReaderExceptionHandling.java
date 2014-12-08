package com.sunilbooks.selflearnjava.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/*
 * Reads text from a URL and displays at console using java.net.URL class.
 * It handles exception and prints user friendly message
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class URLReaderExceptionHandling {

	public static void main(String[] args) {

		try {

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

		} catch (MalformedURLException e) {
			System.out.println("Invalid URL");
		} catch (IOException e) {
			System.out.println("Input Output Error");
		}
	}

}
