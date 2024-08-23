package com.sunilbooks.selflearnjava.basic;
/**
 * Example to Test Ternary Operator
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestTernaryOperator {

	public static void main(String[] args) {
		int num = 5;
		String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(evenOdd);

		String name = "Vijay";
		boolean result = name instanceof String;
		System.out.println(result);

		// Example 2: Assigning a value to a variable based on a condition
		int x = 10;
		int y = (x > 5) ? 20 : 30;
		System.out.println("Value of y: " + y);

		// Example 3: Using ternary operator to return a value from a method
		String message = getMessage(true);
		System.out.println("Message: " + message);

		// Example 4: Using ternary operator to assign a value to an array element
		int[] scores = new int[5];
		scores[0] = (num > 10) ? 100 : 50;
		System.out.println("Score: " + scores[0]);
	}

	// Example 
