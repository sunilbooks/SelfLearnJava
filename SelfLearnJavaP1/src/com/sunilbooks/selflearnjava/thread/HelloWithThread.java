package com.sunilbooks.selflearnjava.thread;

/**
 * This class demonstrates the use of threads by extending the {@link Thread}
 * class. It shows how to create and run multiple threads concurrently, each
 * executing its own task.
 * 
 * <p>
 * In this example, two threads are created by extending the {@code Thread}
 * class and starting them. Each thread prints a sequence of numbers along with
 * its name, demonstrating concurrent execution.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloWithThread extends Thread {

	/**
	 * The name associated with this thread, used for displaying messages.
	 */
	private String name = null;

	/**
	 * Constructs a new {@code HelloWithThread} object with the specified name.
	 * 
	 * @param name the name to be associated with this thread
	 */
	public HelloWithThread(String name) {
		this.name = name;
	}

	/**
	 * Executes the thread's operation by printing a message 500 times with the
	 * thread's name. This method is called when the thread is started.
	 */
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(i + "#" + name);
		}
	}

	/**
	 * The main method creates two instances of {@code HelloWithThread} and starts
	 * them as separate threads. It also prints a message 500 times from the main
	 * thread to demonstrate concurrent execution.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		// Create and start two threads with different names
		HelloWithThread t1 = new HelloWithThread("Ram");
		HelloWithThread t2 = new HelloWithThread("Shyam");
		t1.start();
		t2.start();

		// Print messages from the main thread
		for (int i = 0; i < 500; i++) {
			System.out.println(i + " I am Main");
		}
	}
}
