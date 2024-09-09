package com.sunilbooks.selflearnjava.thread;

/**
 * This class demonstrates a simple example of a non-threaded operation where
 * methods are executed sequentially in the main thread. It shows how operations
 * are performed without utilizing the threading concept.
 * 
 * <p>
 * In this example, two instances of {@code HelloWithoutThread} are created and
 * their {@code run()} methods are called sequentially from the main method.
 * Additionally, the main method performs its own operations.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class HelloWithoutThread {

	/**
	 * The name associated with this instance, used for displaying messages.
	 */
	private String name = null;

	/**
	 * Constructs a new {@code HelloWithoutThread} object with the specified name.
	 * 
	 * @param name the name to be associated with this instance
	 */
	public HelloWithoutThread(String name) {
		this.name = name;
	}

	/**
	 * Executes an operation by printing a message 50 times with the instance's
	 * name.
	 */
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " Hello " + name);
		}
	}

	/**
	 * The main method creates two instances of {@code HelloWithoutThread} and calls
	 * their {@code run()} methods sequentially. It also prints a message 50 times
	 * to show that operations in the main method are executed in the same thread.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		// Create instances of HelloWithoutThread
		HelloWithoutThread t1 = new HelloWithoutThread("Ram");
		HelloWithoutThread t2 = new HelloWithoutThread("Shyam");

		// Execute their run methods
		t1.run();
		t2.run();

		// Print messages from the main thread
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " This is Main ");
		}
	}
}
