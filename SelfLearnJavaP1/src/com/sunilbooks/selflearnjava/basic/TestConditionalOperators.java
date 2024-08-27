package com.sunilbooks.selflearnjava.basic;

/**
 * Test Conditional Operators
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestConditionalOperators {

	public static void main(String[] args) {

		int value1 = 1;
		int value2 = 2;

		if (value1 == 1 && value2 == 2) // AND Operator
		{
			System.out.println("value1 is 1 AND value2 is 2");
		}
		if (value1 == 1 || value2 == 1) // OR Operator
		{
			System.out.println("value1 is 1 OR value2 is 1");
		}

		// Short-Circuit AND Operator
		if ((value1 == 1) && ((value2 = 3) == 3)) {
			System.out.println("Short-Circuit AND Operator: value1 is 1 and value2 is 3");
		}
		System.out.println("Value of value2 after Short-Circuit AND Operator: " + value2);

		// Short-Circuit OR Operator
		if ((value1 == 2) || ((value2 = 4) == 4)) {
			System.out.println("Short-Circuit OR Operator: value1 is not 2 or value2 is 4");
		}
		System.out.println("Value of value2 after Short-Circuit OR Operator: " + value2);
	}
}
