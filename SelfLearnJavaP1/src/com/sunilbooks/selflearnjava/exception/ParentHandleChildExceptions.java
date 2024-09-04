package com.sunilbooks.selflearnjava.exception;

/**
 * Demonstrates how a parent exception class, such as RuntimeException, can
 * handle exceptions thrown by its child classes within a class hierarchy. This
 * example illustrates that when an exception occurs, the parent class can catch
 * and handle exceptions of its derived types.
 * 
 * The program tries to get the length of a string and access the 7th character.
 * If an exception occurs, it is caught by the RuntimeException class, which is
 * the parent of both NullPointerException and StringIndexOutOfBoundsException.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ParentHandleChildExceptions {

	/**
	 * The entry point of the application. Demonstrates how a parent exception class
	 * (RuntimeException) can handle exceptions thrown by its child classes (e.g.,
	 * NullPointerException, StringIndexOutOfBoundsException).
	 *
	 * @param args Command line arguments (not used here).
	 */
	public static void main(String[] args) {

		String name = null;
		// String name = "Vijay";

		try {
			// Get the length of the string
			System.out.println(name.length());
			// Get the 7th character of the string
			System.out.println(name.charAt(6));
		} catch (RuntimeException e) {
			// Handles exceptions from child classes like NullPointerException and
			// StringIndexOutOfBoundsException
			System.out.println("Parent Handles Exception: " + e.getMessage());
		}

	}

}
