package com.sunilbooks.selflearnjava.thread;

/**
 * Demonstrates a racing condition scenario with multiple threads accessing a
 * shared {@code Account} object.
 * 
 * <p>
 * This class extends {@code Thread} and simulates a racing condition where
 * multiple threads attempt to deposit money into a shared {@code Account}
 * object. The racing condition is resolved by using a synchronized
 * {@code deposit} method in the {@code Account} class.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class RacingCondThread extends Thread {

	/**
	 * A single static instance of {@code Account} shared among all threads.
	 */
	public static Account data = new Account();

	/**
	 * Constructs a thread with the specified name.
	 * 
	 * @param name the name of the thread
	 */
	public RacingCondThread(String name) {
		super(name);
	}

	/**
	 * Deposits Rs 1000 five times into the shared {@code Account} object.
	 * 
	 * <p>
	 * This method runs in a loop, depositing Rs 1000 into the account five times.
	 * The method demonstrates how multiple threads can access and modify a shared
	 * resource, and how the {@code Account} class handles racing conditions through
	 * synchronization.
	 * </p>
	 */
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			data.deposit(getName(), 1000);
		}
	}

	/**
	 * Creates and starts two threads that perform deposit operations concurrently.
	 * 
	 * <p>
	 * This method creates two {@code RacingCondThread} objects, each with a
	 * different name, and starts them to demonstrate the racing condition and its
	 * resolution.
	 * </p>
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		RacingCondThread u1 = new RacingCondThread("Ram");
		RacingCondThread u2 = new RacingCondThread("Shyam");

		u1.start();
		u2.start();
	}
}
