package com.sunilbooks.selflearnjava.system;

import java.util.Date;

/**
 * A test class that demonstrates various capabilities of the {@code System}
 * class, such as writing to the console, reading from the keyboard, and
 * obtaining the current time in milliseconds.
 * 
 * <p>
 * This class covers multiple aspects of system input/output operations and time
 * management using methods from the {@code System} class.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestSystemClass {

	/**
	 * The main method that demonstrates the capabilities of the {@code System}
	 * class. It writes to the standard output and error streams, reads input from
	 * the user, and displays the current system time in milliseconds and date
	 * format.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an input/output error occurs while reading from the
	 *                   keyboard
	 */
	public static void main(String[] args) throws Exception {

		// Write text to Console
		System.out.println("This is the standard output stream");
		System.out.println();

		// Write error text to Console
		System.err.println("This is the standard error output stream");
		System.out.println();

		// Read from keyboard
		System.out.print("Enter a Character : ");
		int ch = System.in.read();
		char chr = (char) ch;
		System.out.println("You have typed : " + chr);

		// Get Current Time
		long timeInMillSec = System.currentTimeMillis();

		// Convert into date object
		Date date = new Date(timeInMillSec);
		System.out.println("Current time in milli Seconds =" + timeInMillSec);
		System.out.println(date); // prints current date and time

	}
}
