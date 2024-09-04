package com.sunilbooks.selflearnjava.exception;

/**
 * Tests the custom {@link LoginException} class by simulating a login
 * authentication process. This example demonstrates how a custom checked
 * exception can be used to handle specific error scenarios in a program.
 * 
 * The program attempts to authenticate a user with given login credentials. If
 * certain conditions are met, a {@link LoginException} is thrown to indicate an
 * authentication failure.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestCustomLoginException {

	/**
	 * The entry point of the application. Tries to authenticate a user with
	 * specific credentials and catches any {@link LoginException} that is thrown.
	 *
	 * @param args Command line arguments (not used here).
	 */
	public static void main(String[] args) {

		try {
			// Attempt to authenticate with given credentials
			authenticate("SUNRAYS", "SUNRAYS");
		} catch (LoginException e) {
			// Handle the custom exception
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Simulates a user authentication process. Throws a {@link LoginException} if
	 * certain conditions are met.
	 * 
	 * @param login The login ID provided by the user.
	 * @param pwd   The password provided by the user.
	 * @throws LoginException If the authentication fails.
	 */
	public static void authenticate(String login, String pwd) throws LoginException {
		boolean flag = true; // Simulate a condition that triggers the exception
		if (flag) {
			// Throw a custom exception indicating authentication failure
			throw new LoginException();
		}
	}

}
