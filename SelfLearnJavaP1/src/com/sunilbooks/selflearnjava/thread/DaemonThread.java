package com.sunilbooks.selflearnjava.thread;

/**
 * This class demonstrates the use of a daemon thread in Java. A daemon thread
 * is a low-priority thread that runs in the background, typically performing
 * tasks such as monitoring or logging. Daemon threads do not prevent the JVM
 * from exiting once all user (non-daemon) threads have finished.
 * 
 * <p>
 * The daemon thread in this example runs an infinite loop, waking up every 500
 * milliseconds to perform an action, simulating a background task.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class DaemonThread extends Thread {

	/**
	 * The run method contains an infinite loop that wakes up every 500
	 * milliseconds, simulating a daemon thread running in the background.
	 */
	public void run() {
		System.out.println("Daemon Thread started: " + Thread.currentThread());

		// Infinite loop that wakes up every 500ms
		while (true) {
			try {
				Thread.sleep(500);
				System.out.println("Daemon Thread: woke up again");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * The main method creates a daemon thread and starts it. The main thread sleeps
	 * for 3 seconds, then exits, causing the JVM to shut down and the daemon thread
	 * to terminate.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		System.out.println("Main Started");

		// Create thread, make it a daemon, and start it
		DaemonThread t = new DaemonThread();
		t.setDaemon(true);
		t.start();

		try {
			Thread.sleep(3000); // Main thread sleeps for 3 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Leaving main method, now JVM will exit");
	}
}
