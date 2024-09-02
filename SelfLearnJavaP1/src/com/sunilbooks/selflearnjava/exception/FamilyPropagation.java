package com.sunilbooks.selflearnjava.exception;

/**
 * Demonstrates the propagation of an unchecked exception (RuntimeException) 
 * through different methods in a family-like structure: son -> mom -> dad.
 * 
 * The son() method throws a RuntimeException, mom() propagates it, and dad() 
 * catches and handles it.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class FamilyPropagation {

    /**
     * The entry point of the application. Calls the dad() method, which in turn 
     * handles the exception propagated by son() through mom().
     *
     * @param args Command line arguments (not used here).
     */
    public static void main(String[] args) {
        dad();
    }

    /**
     * dad() method tries to handle the exception raised by the son() method.
     * It catches a RuntimeException thrown by the son() method and prints 
     * a message indicating that the dad caught the exception.
     */
    public static void dad() {
        try {
            mom();
        } catch (RuntimeException e) {
            System.out.println("Caught by Dad, raised by son");
        }
    }

    /**
     * mom() method calls son() and does not handle any exceptions, 
     * thus propagating the RuntimeException to the dad() method.
     */
    public static void mom() {
        son();
    }

    /**
     * son() method throws a RuntimeException to simulate an error. This exception 
     * is propagated up the call stack to mom(), and eventually handled by dad().
     */
    public static void son() {
        RuntimeException e = new RuntimeException("I made a mistake");
        throw e;
    }
}
