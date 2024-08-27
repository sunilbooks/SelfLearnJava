package com.sunilbooks.selflearnjava.collection;

/**
 * Represents an employee with a last name and first name.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Employee {
    private String lastName;
    private String firstName;

    /**
     * Constructs an Employee with the specified last name and first name.
     * 
     * @param lastName the last name of the employee
     * @param firstName the first name of the employee
     */
    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the employee.
     * 
     * @return the last name of the employee
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the first name of the employee.
     * 
     * @return the first name of the employee
     */
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
