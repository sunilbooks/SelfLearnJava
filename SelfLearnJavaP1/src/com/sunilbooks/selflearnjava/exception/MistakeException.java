package com.sunilbooks.selflearnjava.exception;

/**
 * Represents a custom checked exception that is thrown when a specific mistake 
 * or error occurs in the application. This exception is "checked" because it 
 * inherits from the Exception class, meaning it must be either caught or 
 * declared to be thrown by any method that uses it.
 * 
 * The exception is designed to handle general errors where a custom error 
 * message indicating a mistake is appropriate.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class MistakeException extends Exception {

    /**
     * Default constructor that creates a new MistakeException with a predefined 
     * error message indicating that a mistake has been made.
     */
    public MistakeException() {
        super("I made a mistake");
    }
}
