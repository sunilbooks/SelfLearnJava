package com.sunilbooks.selflearnjava.basic;

public class TestEnumDay {

	public static void main(String[] args) {

		Day fd = Day.FRIDAY;
		System.out.println(fd.getWeekDay());

		switch (fd) {

		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		}

		//Get all days
		Day[] days = fd.values();
		for (Day d : days) {
			System.out.println(d);
		}

	}
}
