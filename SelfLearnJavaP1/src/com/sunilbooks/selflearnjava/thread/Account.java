package com.sunilbooks.selflearnjava.thread;

/**
 * Account class containing synchronized method an d block
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Account {

	/**
	 * Contains balance of amount
	 */
	private int balance = 0;

	/**
	 * Deposits amount in account. It is synchronized, only one thread can
	 * deposit amount at a time.
	 * 
	 * @param msg
	 * @param amt
	 */
	public synchronized void deposit(String msg, int amt) {
		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + " Now Balance is " + bal);
	}

	/**
	 * Withdraws amount from account
	 * 
	 * @param msg
	 * @param amt
	 */
	public void withdraw(String msg, int amt) {
		int bal = 0;
		synchronized (this) {
			bal = getBalance() + amt;
			setBalance(bal);
		}
		System.out.println(msg + " Now Balance is " + bal);
	}

	/**
	 * Gets the account balance
	 * 
	 * @return
	 */
	public int getBalance() {

		// Assuming that Database operation will take 0.2 Seconds
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		return balance;
	}

	/**
	 * Sets the balance
	 * 
	 * @param balance
	 */
	public void setBalance(int balance) {

		// Assuming that Database operation will take 0.2 Seconds
		try {
			Thread.sleep(200);// Simulate Database Operation
		} catch (InterruptedException e) {
		}
		this.balance = balance;
	}

}
