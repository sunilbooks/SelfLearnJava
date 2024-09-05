package com.sunilbooks.selflearnjava.thread;

/**
 * Test class for demonstrating the use of {@code wait()} and
 * {@code notify()}/{@code notifyAll()} methods in Java concurrency.
 * 
 * <p>
 * This class simulates the interaction between threads that wait on a shared
 * {@link Message} object and threads that notify them. {@code WaiterThread}
 * instances call {@code wait()} on the {@code Message} object to release the
 * lock and wait for notification. {@code NotifierThread} instances call
 * {@code notify()} or {@code notifyAll()} to wake up the waiting threads and
 * allow them to process the message.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WaitNotifyTest {

	/**
	 * Main method to start the {@code WaiterThread} and {@code NotifierThread}
	 * threads.
	 * 
	 * <p>
	 * Creates a shared {@code Message} object, starts two {@code WaiterThread}
	 * instances that will wait on this object, and then starts a
	 * {@code NotifierThread} that will notify the waiting threads.
	 * </p>
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		Message msg = new Message("Process It");

		WaiterThread w1 = new WaiterThread("Ram", msg);
		WaiterThread w2 = new WaiterThread("Shyam", msg);
		w1.start();
		w2.start();

		NotifierThread notifier = new NotifierThread(msg);
		notifier.start();

		System.out.println("All threads are started");
	}
}
