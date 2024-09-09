package com.sunilbooks.selflearnjava.thread;

import java.util.Date;

/**
 * A thread that waits for a notification on a {@link Message} object.
 * 
 * <p>
 * The {@code WaiterThread} releases the lock on the {@code Message} object by
 * calling the {@code wait()} method and waits until it is notified by a
 * {@link NotifierThread}. Once notified, it processes the message.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WaiterThread extends Thread {

	private Message msg;

	/**
	 * Initializes a {@code WaiterThread} with the given name and {@code Message}
	 * object.
	 * 
	 * @param name the name of the thread
	 * @param m    the {@code Message} object that the thread will wait on
	 */
	public WaiterThread(String name, Message m) {
		super(name);
		this.msg = m;
	}

	/**
	 * Executes the thread's run method.
	 * <p>
	 * This method synchronizes on the {@code Message} object, calls {@code wait()}
	 * to release the lock, and waits until it is notified. After being notified, it
	 * processes the message and prints the notification details.
	 * </p>
	 */
	@Override
	public void run() {
		String name = getName();
		System.out.println(name + " started ");
		synchronized (msg) {
			try {
				System.out.println(name + " waiting since " + new Date());
				msg.wait(); // Release lock and wait
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " got notified at " + new Date());

			// Process the message now
			System.out.println(name + " processed message " + msg.getMsg());
		}
	}
}
