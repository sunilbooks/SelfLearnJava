package com.sunilbooks.selflearnjava.io;

import java.io.FileReader;

/**
 * Reads a text file character by character and by character array.
 * <p>
 * This class demonstrates two methods of reading characters from a text file:
 * <ul>
 * <li>Character by character using {@code FileReader}.</li>
 * <li>Character array using {@code FileReader}.</li>
 * </ul>
 * The file path used for reading is "c:/test.txt".
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadTextFile {

	/**
	 * The entry point of the application. It calls methods to read a file by
	 * character and by character array.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs or file cannot be read
	 */
	public static void main(String[] args) throws Exception {
		readByChar();
		System.out.println();
		readByArray();
	}

	/**
	 * Reads and displays the contents of a file character by character.
	 * <p>
	 * This method uses a {@code FileReader} to read one character at a time from
	 * the file "c:/test.txt" and prints each character to the console.
	 * </p>
	 * 
	 * @throws Exception if an I/O error occurs or the file cannot be read
	 */
	private static void readByChar() throws Exception {

		System.out.println("Read file char by char");

		// Open a file
		FileReader r = new FileReader("c:/test.txt");

		// Reads a single character
		int ch = r.read();
		char chr;

		// ch is -1 if no more character in file
		while (ch != -1) {
			chr = (char) ch; // cast to char
			System.out.print(chr);
			ch = r.read();
		}
		r.close();
	}

	/**
	 * Reads and displays the contents of a file using a character array.
	 * <p>
	 * This method uses a {@code FileReader} to read characters into a buffer
	 * (character array) and then creates a {@code String} from the buffer. It
	 * prints the contents of the file to the console in chunks defined by the
	 * buffer size.
	 * </p>
	 * 
	 * @throws Exception if an I/O error occurs or the file cannot be read
	 */
	private static void readByArray() throws Exception {

		System.out.println("Read file by char Array");

		// Open a file
		FileReader r = new FileReader("c:/test.txt");

		// Create char array
		char[] buffer = new char[10];

		// Reads a character array
		int count = r.read(buffer);

		// count is 0 if no more character in file
		while (count > 0) {

			// Create string from array
			String str = new String(buffer);

			// Trim empty characters
			str = str.substring(0, count);

			System.out.print(str);

			// Read more characters
			count = r.read(buffer);
		}
		// Close file
		r.close();
	}
}
