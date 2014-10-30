package com.sunilbooks.selflearnjava.basic;

/**
 * Example of Deep Cloning
 * 
 * @author Sunil Sahu
 */

public class Customer implements Cloneable {

	public String name = null;
	public Account account = null;

	public Customer(String n) {
		name = n;
		account = new Account(10);
	}

	/**
	 * Deep clone the Customer and Account object
	 */
	public Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (Account) account.clone();
		return c;
	}

}
