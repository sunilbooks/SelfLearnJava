package com.sunilbooks.selflearnjava.thread;

/**
 * Demonstrates the execution of threads with different priorities.
 * 
 * <p>
 * This class extends {@code Thread} and illustrates how threads with different
 * priority levels are executed. Threads are created with varying priorities to
 * observe their behavior.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class PriorityThread extends Thread {

	/**
	 * Constructs a thread with the specified name.
	 * 
	 * @param name the name of the thread
	 */
	public PriorityThread(String name) {
		super(name);
	}

	/**
	 * Executes the thread by printing the thread's name and priority 500 times.
	 * 
	 * <p>
	 * This method prints the name of the thread and its priority in each iteration
	 * of the loop.
	 * </p>
	 */
	@Override
	public void run() {
		for (int x = 1; x <= 500; x++) {
			System.out.println(getName() + " P = " + getPriority());
		}
	}

	/**
	 * Creates and starts threads with different priorities.
	 * 
	 * <p>
	 * This method creates three {@code PriorityThread} objects with varying
	 * priority levels, starts them, and observes their execution. Thread priorities
	 * are set to demonstrate their effect.
	 * </p>
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		PriorityThread t1 = new PriorityThread("T # A");
		PriorityThread t2 = new PriorityThread("T # B");
		PriorityThread t3 = new PriorityThread("T # C");

		t1.setPriority(3); // Set custom priority
		t2.setPriority(1); // Set lowest priority
		// t3 has default priority 5

		t1.start();
		t2.start();
		t3.start();
	}
}
