package com.sunilbooks.selflearnjava.exception;

/**
 * Demonstrates the propagation of a checked exception (MistakeException) 
 * through a family-like structure: son -> mom -> dad.
 * 
 * The son() method throws a MistakeException, mom() propagates it, and dad() 
 * catches and handles it.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class FamilyPropagationChecked {

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
     * dad() method tries to handle the MistakeException raised by the son() method.
     * It catches the MistakeException thrown by the son() method and prints 
     * the exception's message.
     */
    public static void dad() {
        try {
            mom();
        } catch (MistakeException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * mom() method calls son() and propagates the MistakeException thrown by son()
     * to the dad() method.
     *
     * @throws MistakeException when the son() method encounters an error.
     */
    public static void mom() throws MistakeException {
        son();
    }

    /**
     * son() method throws a MistakeException to simulate an error. This exception 
     * is propagated up the call stack to mom(), and eventually handled by dad().
     *
     * @throws MistakeException when an error occurs.
     */
    public static void son() throws MistakeException {
        MistakeException e = new MistakeException();
        throw e;
    }
}
