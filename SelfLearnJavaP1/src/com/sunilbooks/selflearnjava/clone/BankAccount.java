package com.sunilbooks.selflearnjava.clone;

/**
 * Bank Account implements Cloneable interface to be part of Deep Cloning.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class BankAccount implements Cloneable {

    public double balance = 0;
    public Address address; // added an Address object

    public BankAccount() {
    }

    public BankAccount(double b) {
        balance = b;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        BankAccount clone = (BankAccount) super.clone();
        if (this.address != null) {
            clone.address = (Address) this.address.clone(); // deep clone of Address object
        }
        return clone;
    }
}
