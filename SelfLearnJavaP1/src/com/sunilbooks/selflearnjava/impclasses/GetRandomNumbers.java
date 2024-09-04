package com.sunilbooks.selflearnjava.impclasses;

import java.util.Random;

/**
 * Demonstrates how to generate random numbers using different methods in Java.
 * Includes examples of generating random integers using `Math.random()` and the
 * `Random` class, as well as generating random double values.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class GetRandomNumbers {

	public static void main(String[] args) {

		// Generate random integers between 0 to 100
		System.out.println("Random integer between 1 to 100 using Math.random()");
		for (int i = 0; i < 10; i++) {
			int randomNo = (int) (Math.random() * 100);
			System.out.println((i + 1) + " :" + randomNo);
		}

		System.out.println("\nRandom integer between 1 to 100 using Random class");
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int randomInt = r.nextInt(100);
			System.out.println(randomInt);
		}

		// Generate random double numbers
		System.out.println("\nRandom double between 0.0 and 1.0 using Random class");
		for (int i = 0; i < 10; i++) {
			double randomD = r.nextDouble();
			System.out.println(randomD);
		}

	}
}
