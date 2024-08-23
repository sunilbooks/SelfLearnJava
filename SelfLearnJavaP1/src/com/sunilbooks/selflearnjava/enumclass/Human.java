package com.sunilbooks.selflearnjava.enumclass;

/**
 * Enum class contains Human constants
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public enum Human {

	KID(10, "Child"), MAN(50, "Adult"), OLDMAN(70, "Senior");

	private final int weight;
	private final String description;

	Human(int w, String desc) {
		this.weight = w;
		this.description = desc;
	}

	public void display() {
		System.out.println("Weight: " + weight + ", Description: " + description);
	}

	public static void main(String[] args) {

		Human h = Human.KID;
		h.display();

		Human[] hs = Human.values();

		for (Human human : hs) {
			human.display();
		}

		// Ask user to input human type
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter human type (KID, MAN, OLDMAN): ");
		String input = scanner.next().toUpperCase();

		Human human = Human.valueOf(input);
		human.display();
	}
}
