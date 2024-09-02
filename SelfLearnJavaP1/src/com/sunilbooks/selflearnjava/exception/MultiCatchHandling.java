package com.sunilbooks.selflearnjava.exception;

/**
 * Demonstrates the use of one try block with multiple catch blocks to handle 
 * different types of exceptions. This example shows how to handle both 
 * NullPointerException and StringIndexOutOfBoundsException when working 
 * with strings.
 * 
 * The program tries to get the length of a string and then access the 7th 
 * character. Depending on the state of the string, different exceptions 
 * may be thrown and are handled accordingly.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MultiCatchHandling {

    /**
     * The entry point of the application. Demonstrates how multiple catch blocks 
     * can be used to handle different exceptions that might occur during string 
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
        } catch (NullPointerException e) {
            // Executed when name is null
            System.out.println("Name cannot be null");
        } catch (StringIndexOutOfBoundsException e) {
            // Executed when string has less than 7 characters
            System.out.println("String is too short");
        }

    }

}
