package com.sunilbooks.selflearnjava.basic;

/**
 * This is the example of Deep Cloning
 * 
 * @author Sunil Sahu
 */
public class TestCloning {

	public static void main(String[] args) throws Exception {

		Customer c1 = new Customer("Ram");
		Customer c2 = (Customer) c1.clone();
		c2.name = "Balram";
		c1.account.balance = 20;

		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c1.account.balance);
		System.out.println(c2.account.balance);

	}

}
