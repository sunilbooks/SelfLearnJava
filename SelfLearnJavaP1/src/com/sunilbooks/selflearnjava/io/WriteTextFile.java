package com.sunilbooks.selflearnjava.io;

import java.io.FileWriter;

/**
 * Writes to a text file using {@code FileWriter}.
 * <p>
 * This class demonstrates how to use {@code FileWriter} to write characters,
 * character arrays, and strings to a file. The text is written to the file
 * specified by the path "f:/test1.txt".
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WriteTextFile {

	/**
	 * The entry point of the application. It creates a {@code FileWriter} to write
	 * a character array, a single character, and a string to a file.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs
	 */
	public static void main(String[] args) throws Exception {

		System.out.println("Write to a Text file char by char");

		// Open a file
		FileWriter file = new FileWriter("f:/test1.txt");

		// Character array to write
		char[] cArray = { 'H', 'i' };

		// Write character array
		file.write(cArray);
		// Write a single character
		file.write(',');
		// Write a string
		file.write("SUNRAYS");

		// Close the FileWriter
		file.close();
	}
}
