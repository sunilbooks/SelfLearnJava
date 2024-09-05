package com.sunilbooks.selflearnjava.thread;

/**
 * This class demonstrates how to create a thread by implementing the
 * {@link Runnable} interface. Two concurrent threads are created and started,
 * each running a loop and printing a message.
 * 
 * <p>
 * Implementing {@link Runnable} is a common way to define thread behavior in
 * Java.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloRunnable implements Runnable {

	/**
	 * The name of the thread, used for identifying the thread during execution.
	 */
	private String name = null;

	/**
	 * Constructs a new {@code HelloRunnable} object with the specified thread name.
	 * 
	 * @param n the name of the thread
	 */
	public HelloRunnable(String n) {
		this.name = n;
	}

	/**
	 * Executes the thread's operation by running a loop 5000 times and printing the
	 * current iteration along with the thread's name.
	 */
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(i + "#" + name);
		}
	}

	/**
	 * The main method creates two threads using the {@code HelloRunnable} class and
	 * starts them. Each thread will print its name and iteration number
	 * concurrently.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String args[]) {
		// Create and start two threads with different names
		Thread t1 = new Thread(new HelloRunnable("Ram"));
		Thread t2 = new Thread(new HelloRunnable("Shyam"));
		t1.start();
		t2.start();
	}
}
