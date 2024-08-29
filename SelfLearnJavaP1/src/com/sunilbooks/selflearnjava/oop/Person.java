package com.sunilbooks.selflearnjava.oop;

import java.util.Date;

/**
 * The {@code Person} class represents an individual with attributes such as 
 * name, address, and date of birth. It includes constructors for initializing 
 * these attributes and getter and setter methods to access and modify them.
 * 
 * <p>The class includes:</p>
 * <ul>
 *     <li>{@code name} - The name of the person.</li>
 *     <li>{@code address} - The address of the person.</li>
 *     <li>{@code dateOfBirth} - The date of birth of the person.</li>
 *     <li>{@code AVERAGE_AGE} - A constant representing the average age of a person (60).</li>
 * </ul>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Person {

    /**
     * The name of the person.
     */
    private String name = null;

    /**
     * The address of the person.
     */
    private String address = null;

    /**
     * The date of birth of the person.
     */
    private Date dateOfBirth = null;

    /**
     * A constant representing the average age of a person.
     */
    public static final int AVERAGE_AGE = 60;

    /**
     * Default constructor for the {@code Person} class.
     */
    public Person() {
    }

    /**
     * Parameterized constructor to initialize the {@code name} and {@code address} 
     * of the person.
     * 
     * @param name the name of the person
     * @param address the address of the person
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Parameterized constructor to initialize the {@code name}, {@code address}, 
     * and {@code dateOfBirth} of the person.
     * 
     * @param name the name of the person
     * @param address the address of the person
     * @param dateOfBirth the date of birth of the person
     */
    public Person(String name, String address, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Gets the name of the person.
     * 
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     * 
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the address of the person.
     * 
     * @return the address of the person
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the person.
     * 
     * @param address the new address of the person
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the date of birth of the person.
     * 
     * @return the date of birth of the person
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth of the person.
     * 
     * @param dateOfBirth the new date of birth of the person
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
