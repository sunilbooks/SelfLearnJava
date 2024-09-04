package com.sunilbooks.selflearnjava.exception;

/**
 * Demonstrates the concept of throwing a programmatic exception in Java. 
 * This example shows how to manually raise an exception when certain 
 * conditions are not met—in this case, when a user is determined to be invalid.
 * 
 * The example includes a method that always returns false to simulate a failed 
 * user validation, and then throws a RuntimeException to indicate an "Invalid User."
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class PragramaticExceptions {

    /**
     * Simulates a user validation check. This method always returns false 
     * to trigger an exception for testing purposes.
     *
     * @return boolean indicating whether the user is valid (always false).
     */
    public static boolean isValidUser() {
        // Always return false to test exception
        return false;
    }

    /**
     * The entry point of the application. Checks if the user is valid and throws 
     * a RuntimeException if the user is invalid.
     *
     * @param args Command line arguments (not used here).
     */
    public static void main(String[] args) {

        // Check if the user is valid
        boolean userFound = isValidUser();

        if (userFound) {
            System.out.println("Valid User");
        } else {
            // Instantiate and raise an exception
            RuntimeException e = new RuntimeException("Invalid User");
            throw e;
        }
    }

}
