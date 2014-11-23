package com.sunilbooks.selflearnjava.impclasses;

import java.util.Random;

/**
 * Get the Random numbers
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
		for (int i = 0; i < 10; i++) {
			int randonNo = (int) (Math.random() * 100);
			System.out.println(randonNo);

		}

		// get random number with help of Random class
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int randomInt = r.nextInt(100);
			System.out.println(randomInt);
		}

		// generate random double numbers
		for (int i = 0; i < 10; i++) {
			double randomD = r.nextDouble();
			System.out.println(randomD);
		}

	}
}
