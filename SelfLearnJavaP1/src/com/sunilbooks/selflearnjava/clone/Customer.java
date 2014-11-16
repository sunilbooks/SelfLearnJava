package com.sunilbooks.selflearnjava.clone;


/**
 * This program is the example of DEEP CLONING. Customer contains BankAccount.
 * When Customer is cloned BankAccoubt is also cloned. For deep cloning all
 * containing classes must be clone able.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 */
public class Customer implements Cloneable {

	public String name = null;
	public BankAccount account = null;

	public Customer(String n) {
		name = n;
		account = new BankAccount(10);
	}

	/**
	 * Deep clone the Customer and Account object
	 */
	public Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		return c;
	}

}
