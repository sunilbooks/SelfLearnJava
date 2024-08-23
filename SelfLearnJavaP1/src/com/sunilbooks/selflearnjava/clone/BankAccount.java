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
		clone.address = (Address) this.address.clone(); // deep clone of Address object
		return clone;
	}

	public static void main(String[] args) throws Exception {

		BankAccount a1 = new BankAccount(10);
		a1.address = new Address("123 Main St"); // added an Address object

		BankAccount a2 = (BankAccount) a1.clone();
		a2.balance = 20;
		a2.address.street = "456 Elm St"; // changing the address of a2

		System.out.println("Account 1 Balance: " + a1.balance);
		System.out.println("Account 1 Address: " + a1.address.street);
		System.out.println("Account 2 Balance: " + a2.balance);
		System.out.println("Account 2 Address: " + a2.address.street);
	}
}

class Address implements Cloneable {
	public String street;

	public Address(String s) {
		street = s;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
