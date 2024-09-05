package com.sunilbooks.selflearnjava.thread;

import java.util.Date;

/**
 * A thread that notifies other threads waiting for a lock on a {@code Message}
 * object.
 * 
 * <p>
 * This {@code NotifierThread} acquires a lock on the provided {@code Message}
 * object and sends a notification to any waiting threads after updating the
 * message content. It can notify either a single waiting thread or all waiting
 * threads, depending on the method used.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class NotifierThread extends Thread {

	/**
	 * The {@code Message} object to be notified.
	 */
	private Message msg;

	/**
	 * Initializes the {@code NotifierThread} with the specified message object.
	 * 
	 * @param msg the {@code Message} object to be notified
	 */
	public NotifierThread(Message msg) {
		super("Notifier");
		this.msg = msg;
	}

	/**
	 * Runs the thread, which notifies the {@code Message} object after a delay.
	 * 
	 * <p>
	 * This method sleeps for 1 second, acquires the lock on the {@code Message}
	 * object, updates the message content with the current thread's name and
	 * timestamp, and then sends a notification to one of the waiting threads. Use
	 * {@code msg.notifyAll()} to notify all waiting threads.
	 * </p>
	 */
	@Override
	public void run() {

		String name = getName();
		System.out.println(name + " started");

		try {
			Thread.sleep(1000);
			synchronized (msg) {

				msg.setMsg(name + " notified at " + new Date());
				msg.notify(); // Notify one waiting thread
				// msg.notifyAll(); // Notify all waiting threads
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
