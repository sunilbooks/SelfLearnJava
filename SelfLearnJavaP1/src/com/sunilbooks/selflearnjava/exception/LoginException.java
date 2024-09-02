package com.sunilbooks.selflearnjava.exception;

/**
 * Represents a custom checked exception that is thrown when a login operation 
 * fails due to invalid user credentials. This exception is considered "checked" 
 * because it inherits from the Exception class, meaning it must be either caught 
 * or declared to be thrown by any method that uses it.
 * 
 * The exception is specifically designed to handle login-related errors, such as 
 * incorrect user ID or password.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class LoginException extends Exception {

    /**
     * Default constructor that creates a new LoginException with a predefined 
     * error message indicating invalid user ID or password.
     */
    public LoginException() {
        super("Invalid User ID/Password");
    }
}
