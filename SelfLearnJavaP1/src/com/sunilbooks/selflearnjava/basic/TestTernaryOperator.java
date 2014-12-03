package com.sunilbooks.selflearnjava.basic;

/**
 * Test Ternary Operator
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 */


public class TestTernaryOperator {

	public static void main(String[] args) {
		int num = 5;
		String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(evenOdd);

		String name = "Vijay";
		boolean result = name instanceof String;
		System.out.println(result);
		
		
	}
}
