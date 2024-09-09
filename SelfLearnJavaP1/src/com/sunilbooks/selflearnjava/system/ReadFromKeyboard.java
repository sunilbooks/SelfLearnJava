package com.sunilbooks.selflearnjava.system;

/**
 * A class that reads a line of text from the keyboard and prints it to the
 * console. It captures input character by character until the Enter key
 * (represented by the Unicode value 13) is pressed.
 * 
 * <p>
 * This program demonstrates basic usage of reading input from the console using
 * {@code System.in.read()}.
 * </p>
 * 
 * @version 2.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadFromKeyboard {

	/**
	 * The main method that reads input from the user and prints it back to the
	 * console.
	 *
	 * @param args command-line arguments (not used)
	 * @throws Exception if an input/output error occurs while reading from the
	 *                   keyboard
	 */
	public static void main(String[] args) throws Exception {

		int ch = 0;
		char chr = (char) ch;
		StringBuffer sb = new StringBuffer();

		System.out.print("Enter a Line : ");

		do {
			// Read a unicode of character
			ch = System.in.read();

			// Convert it into character
			chr = (char) ch;

			sb.append(chr);

		} while (ch != 13); // 13 is the end line character representing Enter key

		System.out.println("You have entered : " + sb.toString());
	}
}
