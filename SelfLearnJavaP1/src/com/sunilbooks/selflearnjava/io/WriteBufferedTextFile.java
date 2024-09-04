package com.sunilbooks.selflearnjava.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Writes buffered character streams to a text file.
 * <p>
 * This class demonstrates how to write data to a text file using the
 * {@code BufferedWriter} and {@code FileWriter} classes. The data is written
 * character by character and as a string to the file specified by the path
 * "f:/test11.txt".
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WriteBufferedTextFile {

	/**
	 * The entry point of the application. It writes characters and strings to a
	 * text file using {@code BufferedWriter}.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs or the file cannot be written
	 */
	public static void main(String[] args) throws Exception {

		System.out.println("Write to a Text file char by char");

		// Open a file
		FileWriter file = new FileWriter("f:/test11.txt");
		BufferedWriter out = new BufferedWriter(file);

		// Define character array
		char[] cArray = { 'H', 'i' };

		// Write character array
		out.write(cArray);

		// Write a single character
		out.write(',');

		// Write a string
		out.write("SUNRAYS");

		// Close BufferedWriter and FileWriter
		out.close();
		file.close();
	}
}
