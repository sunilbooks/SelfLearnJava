package com.sunilbooks.selflearnjava.basic;

/**
 * Example of Cloning
 * 
 * @author Sunil Sahu
 */

public class Account implements Cloneable {

	public double balance = 0;

	public Account() {
	}

	public Account(double b) {
		balance = b;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws Exception {

		Account a1 = new Account(10);
		Account a2 = (Account) a1.clone();
		a2.balance = 20;

		System.out.println(a1.balance);
		System.out.println(a2.balance);
	}

}
