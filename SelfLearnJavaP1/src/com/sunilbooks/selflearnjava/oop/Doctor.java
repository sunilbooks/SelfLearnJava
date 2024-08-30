package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code Doctor} class is a child class of {@code Person} and represents 
 * a doctor with a specific registration number. It includes methods to get and 
 * set the registration number.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Person
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Doctor extends Person {

    /**
     * The registration number of the doctor.
     */
    String registrationNo = null;

    /**
     * Gets the registration number of the doctor.
     * 
     * @return the registration number of the doctor
     */
    public String getRegistrationNo() {
        return registrationNo;
    }

    /**
     * Sets the registration number of the doctor.
     * 
     * @param registrationNo the new registration number of the doctor
     */
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

}
