package com.sunilbooks.selflearnjava.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copies the contents of a binary file from a source to a target location using
 * buffered input and output streams for improved performance.
 * <p>
 * This program uses {@link BufferedInputStream} and
 * {@link BufferedOutputStream} to read and write bytes in larger chunks,
 * reducing the number of I/O operations compared to using unbuffered streams.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class CopyBufferedBinaryFile {

	/**
	 * Main method to execute the file copying process.
	 * <p>
	 * This method creates buffered input and output streams to read from the source
	 * file and write to the target file. It reads the file in chunks and writes
	 * each chunk to the target file, improving performance over byte-by-byte
	 * operations.
	 * 
	 * @param args Command-line arguments (not used)
	 * @throws IOException if an I/O error occurs
	 */
	public static void main(String[] args) throws IOException {

		// Paths for the source and target files
		String source = "f:/baby.jpg";
		String target = "f:/girl.jpg";

		// Create buffered input and output streams
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target))) {

			byte[] buff = new byte[256]; // Buffer to hold data
			int count = in.read(buff); // Read a chunk of bytes

			// Read bytes from the source and write them to the target
			while (count > 0) { // 0 indicates end-of-file
				out.write(buff, 0, count); // Write the chunk
				count = in.read(buff); // Read the next chunk
			}

			System.out.println(source + " is copied to " + target);
		} // Streams are automatically closed by the try-with-resources statement
	}
}
