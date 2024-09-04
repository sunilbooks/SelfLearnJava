package com.sunilbooks.selflearnjava.generics;

/**
 * Demonstrates a generic method that handles multiple type parameters. The
 * method checks if a specified object is present in an array of a specific
 * type.
 * 
 * @param <T> The type of the object to search for.
 * @param <V> The type of the elements in the array, which must extend
 *            {@code T}.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class GenericMethodMultipleTypeParam {

	/**
	 * A generic method to determine if an object of type {@code T} is present in an
	 * array of type {@code V[]}. The type {@code V} must be a subclass of
	 * {@code T}.
	 * 
	 * @param <T> The type of the object to search for.
	 * @param <V> The type of the elements in the array, which must extend
	 *            {@code T}.
	 * @param x   The object to search for.
	 * @param y   The array to search within.
	 * @return {@code true} if {@code x} is found in the array {@code y};
	 *         {@code false} otherwise.
	 */
	static <T, V extends T> boolean contains(T x, V[] y) {
		for (V element : y) {
			if (x.equals(element)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Tests the {@code contains} method with different data types. Demonstrates
	 * searching for integers and strings in respective arrays.
	 * 
	 * @param args Command line arguments (not used here).
	 */
	public static void main(String[] args) {

		Integer nums[] = { 1, 2, 3, 4, 5 };
		if (contains(2, nums)) {
			System.out.println("2 is in nums");
		}

		if (!contains(7, nums)) {
			System.out.println("7 is not in nums");
		}
		System.out.println();

		// Use contains() on Strings.
		String strs[] = { "one", "two", "three", "four", "five" };

		if (contains("two", strs)) {
			System.out.println("two is in strs");
		}

		if (!contains("seven", strs)) {
			System.out.println("seven is not in strs");
		}

		// Compilation error ! Types must be compatible.
		// if(contains("two", nums)) {
		// System.out.println("two is in nums");
		// }
	}
}
