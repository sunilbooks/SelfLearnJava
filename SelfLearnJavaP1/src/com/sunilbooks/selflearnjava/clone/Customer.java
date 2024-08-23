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
	public CustomerAddress address = null;

	public Customer(String n) {
		name = n;
		account = new BankAccount(10);
		address = new CustomerAddress();
	}

	/**
	 * Deep clone the Customer and Account object
	 */
	public Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		return c;
	}

	public static void main(String[] args) throws Exception {
		Customer c1 = new Customer("John");
		Customer c2 = (Customer) c1.clone();

		c2.name = "Jane";
		c2.account.balance = 20;

		System.out.println("Customer 1 Name: " + c1.name);
		System.out.println("Customer 1 Account Balance: " + c1.account.balance);
		System.out.println("Customer 2 Name: " + c2.name);
		System.out.println("Customer 2 Account Balance: " + c2.account.balance);
	}
}

class BankAccount implements Cloneable {
	public double balance = 0;

	public BankAccount(double b) {
		balance = b;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class CustomerAddress {
	public String street = null;

	public CustomerAddress() {
		street = "123 Main St";
	}
}
