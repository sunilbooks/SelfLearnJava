package com.sunilbooks.selflearnjava.impclasses;

/**
 * Test the key methods of java.lang.Math class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestMath {

	/**
	 * Calculate the maximum of two numbers using Math.max()
	 */
	int maxVal = Math.max(2, 5);

	/**
	 * Calculate the minimum of two numbers using Math.min()
	 */
	int minVal = Math.min(2, 5);

	/**
	 * Calculate the absolute value of a number using Math.abs()
	 */
	double absoluteVal = Math.abs(-3.7);

	/**
	 * Calculate the exponential value of a number using Math.exp()
	 */
	double expVal = Math.exp(10);

	/**
	 * Generate a random number between 0.0 and 1.0 using Math.random()
	 */
	double randomNo = Math.random();

	/**
	 * Calculate the square root of a number using Math.sqrt()
	 */
	double sqrtVal = Math.sqrt(4);

	/**
	 * Calculate the smallest integer greater than or equal to a number using Math.ceil()
	 */
	double ceilVal = Math.ceil(5.4);

	public static void main(String[] args) {

		System.out.println("Math functions");
		System.out.println("Max 2,5: " + maxVal);
		System.out.println("Min 2,5: " + minVal);
		System.out.println("Absolute -3.7: " + absoluteVal);
		System.out.println("Exp 10: " + expVal);
		System.out.println("Random Number :" + randomNo);
		System.out.println("Square Root: " + sqrtVal);
		System.out.println("Smallest Integer greater than 5.4 : " + ceilVal);

	}

}
