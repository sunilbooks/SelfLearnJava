package com.sunilbooks.selflearnjava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copies the contents of a binary file from a source to a target location.
 * <p>
 * This program reads bytes from the source file and writes them to the target
 * file. It uses {@link FileInputStream} to read bytes and
 * {@link FileOutputStream} to write bytes.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class CopyBinaryFile {

	/**
	 * Main method to execute the file copying process.
	 * 
	 * @param args Command-line arguments (not used)
	 * @throws IOException if an I/O error occurs
	 */
	public static void main(String[] args) throws IOException {

		// Paths for the source and target files
		String source = "f:/baby.jpg";
		String target = "f:/girl.jpg";

		// Create input and output streams
		try (FileInputStream in = new FileInputStream(source); FileOutputStream out = new FileOutputStream(target)) {

			int ch = in.read(); // Read a byte

			// Read bytes from the source and write them to the target
			while (ch != -1) { // -1 indicates end-of-file
				out.write(ch); // Write a byte
				ch = in.read(); // Read the next byte
			}

			System.out.println(source + " is copied to " + target);
		} // Streams are automatically closed by the try-with-resources statement
	}
}
