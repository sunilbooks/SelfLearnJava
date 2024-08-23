package com.sunilbooks.selflearnjava.clone;

/**
 * A program to test Deep cloning.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestCloning {

	public static void main(String[] args) throws Exception {

		Customer c1 = new Customer("Ram");
		c1.address.city = "Mumbai";

		// Clone the customer and change values
		Customer c2 = (Customer) c1.clone();
		c2.name = "Balram";
		c2.account.balance = 20;
		c2.address.city = "Delhi";

		System.out.println("Original Object ");
		System.out.println("Name : " + c1.name);
		System.out.println("Balance of Account : " + c1.account.balance);
		System.out.println("City : " + c1.address.city);

		System.out.println("\n--------------------------");
		System.out.println("Cloned Object");
		System.out.println("Name : " + c2.name);
		System.out.println("Balance of Account : " + c2.account.balance);
		System.out.println("City : " + c2.address.city);
	}
}

class Customer implements Cloneable {

	public String name = null;
	public BankAccount account = null;
	public CustomerAddress address = null;

	public Customer(String n) {
		name = n;
		account = new BankAccount(10);
		address = new CustomerAddress();
	}

	public Object clone() throws CloneNotSupportedException {
		Customer c = (Customer) super.clone();
		c.account = (BankAccount) account.clone();
		c.address = address; // shallow clone of address
		return c;
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
	public String city = null;
	public String pin = null;
}

	/**
	 * OUTPUT 
	 * 
	 * Original Object Name : Ram 
	 * Balance of Account : 10.0 
	 * City : Delhi
	 * 
	 * -------------------------- 
	 * Cloned Object 
	 * Name : Balram 
	 * Balance of Account: 20.0 
	 * City : Delhi
	 */

}
