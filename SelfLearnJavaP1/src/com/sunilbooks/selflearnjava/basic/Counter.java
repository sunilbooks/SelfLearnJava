package com.sunilbooks.selflearnjava.basic;

/**
 * This is a classic example of static method and static variable. Static method
 * nextNumber() will use count static attribute and return next number in the
 * sequence increased by 1.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 */
public class Counter {

	/**
	 * Counter is static, will be allocated memory once in the life
	 */
	public static int count = 0;

	/**
	 * Return next number
	 * 
	 * @return
	 */
	public static int nextNumber() {
		return count++;
	}

	/**
	 * Test the counter
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("No # " + Counter.nextNumber());
		}
	}

	/**
	 * Output : No # 0 No # 1 No # 2 No # 3 No # 4
	 */

}
