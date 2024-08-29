package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code Businessman} class extends the {@code Person} class and represents
 * a businessman with an income attribute. It provides methods to get and set 
 * the income of the businessman.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Person
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Businessman extends Person {

    /**
     * The income of the businessman.
     */
    private double income = 0;

    /**
     * Gets the income of the businessman.
     * 
     * @return the income of the businessman
     */
    public double getIncome() {
        return income;
    }

    /**
     * Sets the income of the businessman.
     * 
     * @param income the new income of the businessman
     */
    public void setIncome(double income) {
        this.income = income;
    }
}
