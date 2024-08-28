package com.sunilbooks.selflearnjava.clone;

/**
 * This program is the example of DEEP CLONING. Customer contains BankAccount.
 * When Customer is cloned BankAccoubt is also cloned. For deep cloning all
 * containing classes must be clone able.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @Author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Customer implements Cloneable {

	public String name = null;

	/**
	 * Customer's account, will be deep cloned
	 */
	public BankAccount account = null;

	/**
	 * Customer's Address. Shallow cloned
	 */
	public Address address = null;

	public Customer(String n) {
		name = n;
		account = new BankAccount(10);
		address = new Address();
	}

	/**
	 * Deep clone the Customer and Account object
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		// Shallow clone of address
		c.address = address;
		return c;
	}
}
