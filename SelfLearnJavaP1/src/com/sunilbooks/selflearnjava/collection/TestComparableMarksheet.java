package com.sunilbooks.selflearnjava.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableMarksheet {

	public static void main(String[] args) {

		ArrayList marksheets = new ArrayList();
		marksheets.add(new Marksheet("A2", "Rishi", 90));
		marksheets.add(new Marksheet("A3", "Saurabh", 80));
		marksheets.add(new Marksheet("A1", "Ankush", 95));
		marksheets.add(new Marksheet("A4", "Suraj", 89));

		// Print all elements
		System.out.println("Actual List");
		for (Object o : marksheets) {
			System.out.println(o);
		}

		// Sort the List
		Collections.sort(marksheets);

		// Print all elements
		System.out.println("\nSorted List");
		for (Object o : marksheets) {
			System.out.println(o);
		}

	}
}
