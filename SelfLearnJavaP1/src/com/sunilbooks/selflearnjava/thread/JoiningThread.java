package com.sunilbooks.selflearnjava.thread;

/**
 * This class demonstrates the use of the {@code join()} method in threading.
 * The {@code join()} method allows one thread to wait for another thread to
 * complete before proceeding. In this example, each thread waits for its
 * predecessor to finish before executing, creating a sequence of execution.
 * 
 * <p>
 * Threads are created such that each one waits for the previous thread to
 * complete before it starts. This ensures that threads execute in a specific
 * order. The main thread waits for the first thread in the sequence to finish
 * before printing the completion message.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class JoiningThread extends Thread {

	/**
	 * The next thread in the sequence to wait for.
	 */
	private Thread nextThread;

	/**
	 * Constructs a new {@code JoiningThread} with the specified name.
	 * 
	 * @param name the name of the thread
	 */
	public JoiningThread(String name) {
		super(name);
	}

	/**
	 * Constructs a new {@code JoiningThread} with the specified name and the thread
	 * to join.
	 * 
	 * @param name  the name of the thread
	 * @param other the thread to wait for
	 */
	public JoiningThread(String name, Thread other) {
		super(name);
		this.nextThread = other;
	}

	/**
	 * Runs the thread. This method prints the start message, waits for the next
	 * thread to complete (if specified), and then prints the end message.
	 */
	@Override
	public void run() {
		System.out.println(getName() + " Started");

		if (nextThread != null) {
			if (nextThread.isAlive()) {
				try {
					// Wait for the next thread to complete
					nextThread.join();
				} catch (InterruptedException e) {
					// Handle interruption
					Thread.currentThread().interrupt();
				}
			}
		}

		System.out.println(getName() + " Ended");
	}

	/**
	 * The main method creates a sequence of {@code JoiningThread} instances. Each
	 * thread waits for the previous thread to finish before starting. The main
	 * thread waits for the first thread in the sequence to finish before printing
	 * the final completion message.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		// Create threads with a dependency sequence
		Thread d = new JoiningThread("D");
		Thread c = new JoiningThread("C", d);
		Thread b = new JoiningThread("B", c);
		Thread a = new JoiningThread("A", b);

		// Start threads
		a.start();
		b.start();
		c.start();
		d.start();

		try {
			// Wait for the first thread to finish
			a.join();
		} catch (InterruptedException e) {
			// Handle interruption
			Thread.currentThread().interrupt();
		}
		System.out.println("Main is finished");
	}
}
