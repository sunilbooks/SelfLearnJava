package com.sunilbooks.selflearnjava.impclasses;

import java.util.Random;

/**
 * Java training example source code developed by sunRays Technologies, Indore
 * Copyright (c) 2008 sunRays Technologies
 * 
 * @date 08/08/08
 * @version 1.0
 * @author sunRays Developer
 * 
 *         Test Math methods
 */

public class TestRandomNumbers {

	public static void main(String[] args) {

		// Generate random integers between 0 to 100
		for (int i = 0; i < 10; i++) {
			int randonNo = (int) (Math.random() * 100);
			System.out.println(randonNo);

		}

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
