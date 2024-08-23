package com.sunilbooks.selflearnjava.basic;

/**
 * A simple most example in JAVA that will print Hello SUNRAYS at console. This program will be your very first program in Java.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class FirstHello {
	public static void main(String[] args) {

		System.out.println("Hello (sun)Rays");

		// Define a string variable and run same program
		String name = "(sun)Rays";
		System.out.println("Hello " + name);

		// Print "Hello (sun)Rays" five times.
		int i = 0;
		while (i < 5) {
			System.out.println(i + " Hello (sun)Rays");
			i++;
		}

	}
}
