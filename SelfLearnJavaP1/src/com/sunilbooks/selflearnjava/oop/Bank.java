package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code Bank} class represents a general bank with basic attributes like 
 * interest rate and bank name. It serves as a superclass for specific banks like 
 * AxisBank, ICICIBank, and HDFCBank, demonstrating method overriding and runtime 
 * polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see AxisBank
 * @see ICICIBank
 * @see HDFCBank
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Bank {

    /**
     * Returns the default interest rate provided by the bank.
     * 
     * @return the default interest rate, which is 11.0%
     */
    public double interestRate() {
        return 11.0;
    }

    /**
     * Returns the name of the bank.
     * 
     * @return the name of the bank, which is "RBI"
     */
    public String getName() {
        return "RBI";
    }

}
