package com.sunilbooks.selflearnjava.impclasses;

/**
 * Demonstrates the usage of key methods from the {@link java.lang.Math} class.
 * Shows examples of mathematical functions including max, min, absolute value,
 * exponential, random number generation, square root, and ceiling of a value.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestMath {

	public static void main(String[] args) {

		// Demonstrate Math class methods
		int maxVal = Math.max(2, 5);
		int minVal = Math.min(2, 5);
		double absoluteVal = Math.abs(-3.7);
		double expVal = Math.exp(10);
		double randomNo = Math.random();
		double sqrtVal = Math.sqrt(4);
		double ceilVal = Math.ceil(5.4);

		System.out.println("Math functions");
		System.out.println("Max of 2 and 5: " + maxVal);
		System.out.println("Min of 2 and 5: " + minVal);
		System.out.println("Absolute value of -3.7: " + absoluteVal);
		System.out.println("Exponential of 10: " + expVal);
		System.out.println("Random Number: " + randomNo);
		System.out.println("Square Root of 4: " + sqrtVal);
		System.out.println("Smallest integer greater than 5.4: " + ceilVal);

	}

}
