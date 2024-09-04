package com.sunilbooks.selflearnjava.exception;

/**
 * Demonstrates an ArithmeticException by attempting to divide a number by zero.
 * This example shows what happens when division by zero is performed in Java,
 * leading to an exception that disrupts the normal flow of the program.
 * 
 * The program will attempt to divide an integer by zero, which will trigger an
 * ArithmeticException. This example illustrates how unhandled exceptions can
 * terminate a program and prevent subsequent code from executing.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestArithmeticException {

	/**
	 * The entry point of the application. Attempts to divide an integer by zero,
	 * which causes an ArithmeticException. Demonstrates the impact of unhandled
	 * exceptions on the flow of the program.
	 *
	 * @param args Command line arguments (not used here).
	 */
	public static void main(String[] args) {

		int k = 0;
		int i = 15;

		System.out.println("Before Exception: This will be executed");

		try {
			/**
			 * Attempting to divide by zero, which will raise an ArithmeticException.
			 */
			double div = i / k;

			// This block will not be executed because the exception is raised.
			System.out.println("After Exception: This will NOT be executed");
			System.out.println("Div is " + div);
		} catch (ArithmeticException e) {
			// Catching the exception to prevent program termination.
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		}

	}

}
