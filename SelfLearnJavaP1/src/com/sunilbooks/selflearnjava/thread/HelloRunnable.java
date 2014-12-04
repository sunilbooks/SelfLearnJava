package com.sunilbooks.selflearnjava.thread;

/**
 * An example thread class created by Runnable interface
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class HelloRunnable implements Runnable {

	/**
	 * Name of thread
	 */
	private String name = null;

	/**
	 * Parameterized constructor
	 * 
	 * @param name
	 */
	public HelloRunnable(String name) {
		this.name = name;
	}

	/**
	 * Execute thread operation
	 */
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(i + "Hello " + name);
		}

	}

	/**
	 * Test concurrent thread
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		Thread t1 = new Thread(new HelloRunnable("Santa"));
		Thread t2 = new Thread(new HelloRunnable("Banta"));
		t1.start();
		t2.start();
	}

}
