package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code HDFCBank} class represents a specific bank, HDFC Bank. It extends 
 * the {@code Bank} class, demonstrating method overriding and runtime polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Bank
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HDFCBank extends Bank {

    /**
     * Returns the interest rate offered by HDFC Bank.
     * 
     * @return the interest rate of HDFC Bank, which is 10.10%
     */
    @Override
    public double interestRate() {
        return 10.10;
    }

    /**
     * Returns the name of the bank.
     * 
     * @return the name of the bank, which is "HDFC Bank"
     */
    @Override
    public String getName() {
        return "HDFC Bank";
    }

}
