package com.sunilbooks.selflearnjava.exception;

/**
 * Demonstrates the use of a universal exception handler to catch and handle 
 * all exceptions in a hierarchy using a single catch block. This approach 
 * catches any exception that may occur within the try block, such as 
 * NullPointerException or StringIndexOutOfBoundsException.
 * 
 * The example attempts to perform operations on a string, including getting 
 * its length and accessing a specific character, which may raise exceptions.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class HandleAllExceptions {

    /**
     * The entry point of the application. Demonstrates the handling of multiple 
     * potential exceptions using a universal exception handler.
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
        } catch (Exception e) {
            // Universal Exception Handler catches any Exception
            System.out.println("Universal Exception Handler: " + e.getMessage());
        }

    }
}
