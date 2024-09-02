package com.sunilbooks.selflearnjava.impclasses;

import java.util.Date;

/**
 * Demonstrates the use of {@link java.lang.StringBuffer} for mutable string
 * manipulation and shows how to work with dates.
 * <p>
 * This program tests:
 * <ul>
 * <li>Appending strings using {@link StringBuffer}</li>
 * <li>Creating and displaying a {@link Date} object with a specific time
 * offset</li>
 * </ul>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestStringBuffer {

	public static void main(String[] args) {

		// Create a StringBuffer and append strings to it
		StringBuffer sb = new StringBuffer("This is Java");
		sb.append(", Java is OOP");
		sb.append(", Java is guarantee for Job");
		System.out.println(sb);

		// Create a Date object with a time offset of 15 minutes
		long fifteenMin = 15 * 60 * 1000; // 15 minutes in milliseconds
		Date d = new Date(fifteenMin);
		System.out.println(d);
	}

}
