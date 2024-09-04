package com.sunilbooks.selflearnjava.impclasses;

import java.util.Calendar;
import java.util.Date;

/**
 * Demonstrates date arithmetic operations using the `Date` and `Calendar`
 * classes. Includes examples of getting yesterday's date, tomorrow's date, a
 * date 30 days in the future, and performing date comparisons.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestDateArithmetic {

	public static void main(String[] args) {

		// Get the current date
		Date today = new Date();

		// Get a Calendar instance for the current locale & time zone
		Calendar cal = Calendar.getInstance();

		// Set the Calendar to the current date and time
		cal.setTime(today);

		// Get yesterday’s date
		cal.add(Calendar.DATE, -1);
		Date yesterday = cal.getTime();

		// Get tomorrow's date
		cal.add(Calendar.DATE, 2);
		Date tomorrow = cal.getTime();

		// Get the date 30 days from today
		cal.add(Calendar.DATE, 30);
		Date nextEvent = cal.getTime();

		// Print dates
		System.out.println("Yesterday : " + yesterday);
		System.out.println("Today : " + today);
		System.out.println("Tomorrow : " + tomorrow);
		System.out.println("Event after 30 Days : " + nextEvent);

		// Get the day of the year for today's date
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

		// Compare dates
		if (today.getTime() > yesterday.getTime()) {
			System.out.println("Today is greater than Yesterday");
		}

		if (today.after(yesterday)) {
			System.out.println("Today comes after Yesterday");
		}

		if (yesterday.compareTo(today) == -1) {
			System.out.println("Yesterday is smaller than Today");
		}

		if (today.compareTo(yesterday) == 1) {
			System.out.println("Yesterday is smaller than Today");
		}

		if (today.compareTo(today) == 0) {
			System.out.println("Today is today, do not lose it");
		}

	}
}
