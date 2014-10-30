package com.sunilbooks.selflearnjava.oop;

public class Account {

	String number = null;
	String type = null;
	double balance = 0;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public double deposit(double amount) {
		balance += amount;
		return balance;
	}

	public double withdraw(double amount) {
		balance -= amount;
		return balance;
	}

	public void fundTransfer(String accountNo, double amount) {
		// TODO
	}
}
