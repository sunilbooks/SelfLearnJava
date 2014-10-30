package com.sunilbooks.selflearnjava.controlstatement;

public class TestBreakLabel {

	public static void main(String[] args) {

		int[][] table = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		// Define Label
		search:
		// Iterate rows
		for (int[] row : table) {
			for (int n : row) {
				// Check if number is even
				if (n % 2 == 0) {
					System.out.println(n);
					// Terminate loop from label
					break search;
				}
			}
		}

	}

}
