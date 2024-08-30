package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code HomeLoan} class calculates the interest rates for home loans 
 * by demonstrating runtime (dynamic) polymorphism with the {@code Bank} class 
 * and its child classes. It showcases how different banks provide different 
 * interest rates using method overriding.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Bank
 * @see AxisBank
 * @see HDFCBank
 * @see ICICIBank
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HomeLoan {

    /**
     * The main method that initializes an array of {@code Bank} objects 
     * with different bank instances and calls the {@code loanEnquiry} 
     * method to display the interest rates.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Bank[] banks = new Bank[3];
        banks[0] = new AxisBank();
        banks[1] = new HDFCBank();
        banks[2] = new ICICIBank();
        loanEnquiry(banks);
    }

    /**
     * Prints the names and interest rates of the banks in the provided array.
     * Demonstrates runtime polymorphism by calling overridden methods of 
     * {@code Bank} class in its child classes.
     * 
     * @param banks an array of {@code Bank} objects
     */
    public static void loanEnquiry(Bank[] banks) {
        for (Bank b : banks) {
            // different implementation of getName and interestRate
            String name = b.getName();
            double rate = b.interestRate();
            System.out.println(name + " = " + rate);
        }
    }
}
