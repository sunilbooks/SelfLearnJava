package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code ICICIBank} class represents ICICI Bank and extends the {@code Bank} 
 * class. It provides specific implementations for the interest rate and bank name, 
 * demonstrating method overriding and runtime polymorphism.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Bank
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ICICIBank extends Bank {

    /**
     * Returns the interest rate offered by ICICI Bank.
     * 
     * @return the interest rate of ICICI Bank, which is 9.75%
     */
    @Override
    public double interestRate() {
        return 9.75;
    }

    /**
     * Returns the name of the bank.
     * 
     * @return the name of the bank, which is "ICICI Bank"
     */
    @Override
    public String getName() {
        return "ICICI Bank";
    }

}
