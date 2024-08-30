package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code AxisBank} class represents a specific bank, Axis Bank. It extends 
 * the {@code Bank} class, demonstrating method overriding and runtime polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Bank
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class AxisBank extends Bank {

    /**
     * Returns the interest rate offered by Axis Bank.
     * 
     * @return the interest rate of Axis Bank, which is 11.25%
     */
    @Override
    public double interestRate() {
        return 11.25;
    }

    /**
     * Returns the name of the bank.
     * 
     * @return the name of the bank, which is "Axis Bank"
     */
    @Override
    public String getName() {
        return "Axis Bank";
    }

}
