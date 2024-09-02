package com.sunilbooks.selflearnjava.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Reads text input from the keyboard and stores it into a specified text file.
 * <p>
 * This class demonstrates how to read lines of text from the keyboard using
 * {@link BufferedReader} and {@link InputStreamReader} and write these lines
 * into a file using {@link FileWriter} and {@link PrintWriter}. The process
 * continues until the user types "quit".
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class KeyboardToFileCopy {

	/**
	 * Main method that performs the reading and writing operations.
	 * <p>
	 * This method opens a file for writing, sets up readers and writers for
	 * keyboard input and file output, and repeatedly reads lines from the keyboard,
	 * writing each line to the file until the user types "quit".
	 * 
	 * @param args Command-line arguments (not used)
	 * @throws Exception if an I/O error occurs
	 */
	public static void main(String[] args) throws Exception {

		// Open file for writing
		FileWriter file = new FileWriter("f:/temp.txt");
		// Enable line-by-line writing
		PrintWriter out = new PrintWriter(file);

		// Open keyboard for reading
		InputStreamReader kb = new InputStreamReader(System.in);
		// Enable line-by-line reading
		BufferedReader in = new BufferedReader(kb);

		// Read line from keyboard
		String line = in.readLine();

		// Continue reading and writing until user types "quit"
		while (!line.equals("quit")) {
			out.println(line); // Write to file
			line = in.readLine(); // Read next line
		}

		// Close all streams
		file.close();
		out.close();
		kb.close();
	}
}
