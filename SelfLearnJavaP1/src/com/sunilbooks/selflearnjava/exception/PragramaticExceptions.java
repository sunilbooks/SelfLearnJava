package com.sunilbooks.selflearnjava.exception;

/**
 * Throws an programmatic exception
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 */

public class PragramaticExceptions {

	public static boolean isValidUser() {
		// Always return false to test exception
		return false;
	}

	public static void main(String[] args) {

		// Check if user is valid
		boolean userNotFound = isValidUser();

		if (!userNotFound) {
			// raise an exception
			throw new RuntimeException("Invalid User");
		}
	}

}
