package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code TestPerson} class is used to test the functionality of the {@code Person} class.
 * It demonstrates how to create an instance of {@code Person}, set values for its attributes,
 * and retrieve and print these values.
 * 
 * <p>The {@code main} method performs the following actions:</p>
 * <ul>
 *     <li>Creates an instance of the {@code Person} class.</li>
 *     <li>Sets the values of the instance variables using setter methods.</li>
 *     <li>Retrieves and prints the values of the instance variables using getter methods.</li>
 * </ul>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestPerson {

    /**
     * Main method to execute the test for the {@code Person} class.
     * It creates an instance of {@code Person}, sets its name and address,
     * and then retrieves and prints these values to the console.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        Person p = null; // Declare a Person object
        p = new Person(); // Instantiate the Person object

        // Call methods and set values
        p.setName("Karan");
        p.setAddress("MG Road");

        // Get values and print them
        System.out.println("Name : " + p.getName());
        System.out.println("Address : " + p.getAddress());

    }

}
