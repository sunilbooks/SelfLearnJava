package com.sunilbooks.selflearnjava.exception;

/**
 * Demonstrates handling multiple exception types in a single catch block. 
 * This feature is supported in Java 7 and later versions. The example shows 
 * how a single catch block can handle both NullPointerException and 
 * StringIndexOutOfBoundsException when working with strings.
 * 
 * The program attempts to get the length of a string and access its 7th 
 * character. If either a NullPointerException or StringIndexOutOfBoundsException 
 * occurs, they are both handled by a single catch block.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MultiExceptionHandling {

    /**
     * The entry point of the application. Demonstrates the use of a single catch 
     * block to handle multiple exception types that may occur during string 
     * operations.
     *
     * @param args Command line arguments (not used here).
     */
    public static void main(String[] args) {

        String name = "Vijay";

        try {
            // Get the length of the string
            System.out.println(name.length());
            // Get the 7th character of the string
            System.out.println(name.charAt(6));
        } catch (NullPointerException | StringIndexOutOfBoundsException ex) {
            // Handles both NullPointerException and StringIndexOutOfBoundsException
            System.out.println(ex.getMessage());
        }

    }

}
