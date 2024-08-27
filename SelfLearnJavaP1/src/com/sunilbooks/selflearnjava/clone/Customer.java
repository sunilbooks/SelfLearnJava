package com.sunilbooks.selflearnjava.clone;

/**
 * Represents a customer who holds a bank account. The customer's account is
 * deep cloned, but the customer's address is shallow cloned.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @Author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Customer implements Cloneable {

	public String name;
	public BankAccount account;
	public CustomerAddress address;

	public Customer(String n) {
		name = n;
		account = new BankAccount(10);
		address = new CustomerAddress();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		// Shallow clone of address
		c.address = address;
		return c;
	}
}
