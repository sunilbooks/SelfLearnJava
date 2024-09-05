package com.sunilbooks.selflearnjava.thread;

/**
 * This class represents a bank account that allows for depositing and
 * withdrawing funds. It demonstrates the use of both method synchronization and
 * block synchronization to ensure thread-safe operations. Only one thread can
 * access critical sections (deposit and withdraw) at a time, preventing race
 * conditions.
 * 
 * <p>
 * The class uses a simulated database delay to mimic real-world scenarios where
 * database operations take time.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Account {

	/**
	 * Contains the current balance of the account.
	 */
	private int balance = 0;

	/**
	 * Deposits the specified amount into the account. This method is synchronized,
	 * ensuring that only one thread can perform a deposit operation at a time.
	 * 
	 * <p>
	 * This method demonstrates method-level synchronization.
	 * </p>
	 * 
	 * @param msg a message describing the deposit action
	 * @param amt the amount to be deposited
	 */
	public synchronized void deposit(String msg, int amt) {
		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(msg + " new balance " + bal);
	}

	/**
	 * Withdraws the specified amount from the account. This method uses a
	 * synchronized block, ensuring that only one thread can perform a withdraw
	 * operation at a time.
	 * 
	 * <p>
	 * This method demonstrates block-level synchronization.
	 * </p>
	 * 
	 * @param msg a message describing the withdrawal action
	 * @param amt the amount to be withdrawn
	 */
	public synchronized void withdraw(String msg, int amt) {
		int bal = 0;
		synchronized (this) { // Block synchronization
			bal = getBalance() - amt;
			setBalance(bal);
		}
		System.out.println(msg + " Now Balance is " + bal);
	}

	/**
	 * Returns the current balance of the account. This method simulates a delay to
	 * represent the time taken by database operations.
	 * 
	 * @return the current balance of the account
	 */
	public int getBalance() {
		// Simulate a database operation taking 200 milliseconds
		databaseDelay();
		return balance;
	}

	/**
	 * Sets the account balance. This method simulates a delay to represent the time
	 * taken by database operations.
	 * 
	 * @param balance the new balance of the account
	 */
	public void setBalance(int balance) {
		// Simulate a database operation taking 200 milliseconds
		databaseDelay();
		this.balance = balance;
	}

	/**
	 * Simulates a database delay by pausing the thread for 200 milliseconds. This
	 * is used to mimic real-world database latency.
	 */
	public void databaseDelay() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// Handle interruption
		}
	}
}
