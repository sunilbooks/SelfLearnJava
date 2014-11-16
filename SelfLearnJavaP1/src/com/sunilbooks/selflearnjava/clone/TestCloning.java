package com.sunilbooks.selflearnjava.clone;

/**
 * A program to test Deep cloaning.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 */
public class TestCloning {

	public static void main(String[] args) throws Exception {

		Customer c1 = new Customer("Ram");

		// Clone the customer and change values
		Customer c2 = (Customer) c1.clone();
		c2.name = "Balram";
		c1.account.balance = 20;

		System.out.println("Original Object ");
		System.out.println("Name : " + c1.name);
		System.out.println("Balance of Account : " + c1.account.balance);

		System.out.println("Cloned Object");
		System.out.println("Name : " + c2.name);
		System.out.println("Balance of Account : " + c2.account.balance);

	}

}
