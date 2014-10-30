package com.sunilbooks.selflearnjava.oop;

public class HomeLoan {
	public static void main(String[] args) {
		Bank[] banks = new Bank[3];
		banks[0] = new AxisBank();
		banks[1] = new HDFCBank();
		banks[2] = new ICICIBank();
		loanEnquiry(banks);
	}

	public static void loanEnquiry(Bank[] banks) {
		for (Bank b : banks) {
			// different implementation of getName and
			System.out.print(b.getName() + " = ");
			System.out.println(b.interestRate());
		}
	}
}
