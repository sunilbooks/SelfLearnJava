package com.sunilbooks.selflearnjava.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Writes text to a file using {@code PrintWriter} class.
 * <p>
 * This class demonstrates how to use {@code PrintWriter} to write lines of text
 * to a file. The text is written to the file specified by the path
 * "f:/test11.txt".
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WritePrintWriterTextFile {

	/**
	 * The entry point of the application. It creates a {@code PrintWriter} to write
	 * multiple lines of text to a file.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Write to a Text file using PrintWriter");
		// Open a file
		FileWriter file = new FileWriter("f:/test11.txt");
		PrintWriter out = new PrintWriter(file, true);

		// Write lines of text to the file
		out.println("Line 1");
		out.println("Line 2");
		out.println("Line 3");

		// Close the PrintWriter and FileWriter
		out.close();
		file.close();
	}
}
