package com.sunilbooks.selflearnjava.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Reads data line by line from a text file using {@code BufferedReader} and
 * {@code Scanner} classes.
 * <p>
 * This class demonstrates two methods for reading a text file line by line:
 * <ul>
 * <li>Using {@code BufferedReader} to read lines from a file.</li>
 * <li>Using {@code Scanner} to read lines from a file.</li>
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
public class ReadTextFileByLine {

	/**
	 * The entry point of the application. It calls methods to read a file line by
	 * line using different approaches.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs or the file cannot be read
	 */
	public static void main(String[] args) throws Exception {
		readByBufferedReader();
		System.out.println();
		readByScanner();
	}

	/**
	 * Reads and displays the contents of a file line by line using a
	 * {@code BufferedReader}.
	 * <p>
	 * This method uses a {@code BufferedReader} to read lines from the file
	 * "c:/test.txt" and prints each line to the console.
	 * </p>
	 * 
	 * @throws Exception if an I/O error occurs or the file cannot be read
	 */
	public static void readByBufferedReader() throws Exception {

		System.out.println("Read file by Buffered Reader");

		// Open a file
		FileReader r = new FileReader("c:/test.txt");

		// Wrap reader by BufferedReader
		BufferedReader br = new BufferedReader(r);

		// Read a single line
		String line = br.readLine();

		// Process loop if line is not null
		while (line != null) {
			System.out.println(line);

			// Read next line
			line = br.readLine();
		}

		// Close BufferedReader
		br.close();

		// Close FileReader
		r.close();
	}

	/**
	 * Reads and displays the contents of a file line by line using a
	 * {@code Scanner}.
	 * <p>
	 * This method uses a {@code Scanner} to read lines from the file "c:/test.txt"
	 * and prints each line to the console.
	 * </p>
	 * 
	 * @throws Exception if an I/O error occurs or the file cannot be read
	 */
	public static void readByScanner() throws Exception {

		System.out.println("Read file by Scanner");

		// Open a file
		FileReader r = new FileReader("c:/test.txt");

		// Wrap reader by Scanner
		Scanner sc = new Scanner(r);

		String line;

		// Process loop if scanner has next line
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			System.out.println(line);
		}

		// Close Scanner
		sc.close();

		// Close FileReader
		r.close();
	}
}
