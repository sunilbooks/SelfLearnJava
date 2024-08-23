package com.sunilbooks.selflearnjava.impclasses;

/**
 * Program to Test String
 *
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestString {

	/**
	 * Main method to test various methods of String class
	 */
	public static void main(String[] args) {

		testCreateStrings();
		testKeyMethods();
		testConcatingString();
	}

	/**
	 * Method to test creating strings using literals and new keyword
	 */
	public static void testCreateStrings() {

		// Literals
		String s1 = "SUNRAYS";
		String s2 = "SUNRAYS";

		boolean result = (s1 == s2);
		System.out.println("s1 == s2 : " + result);

		String s3 = new String("SUNRAYS");
		String s4 = new String("SUNRAYS");

		result = (s3 == s4);
		System.out.println("s3 == s4 : " + result);

		result = s3.equals(s4);
		System.out.println("s3.equals(s4): " + result);

		char[] chars = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
		String s5 = new String(chars);

	}

	/**
	 * Method to test key methods of String class
	 */
	public static void testKeyMethods() {

		String n = "Vijay Dinanth Chouhan";

		System.out.println("String Length: " + n.length());
		System.out.println("7th character: " + n.charAt(6));
		System.out.println("Index Of Dina: " + n.indexOf("Dina"));
		System.out.println("First position of i: " + n.indexOf("i"));
		System.out.println("Last position of i: " + n.lastIndexOf("i"));
		System.out.println("a is replaced by b : " + n.replace("a", "b"));
		System.out.println("Chota vijay: " + n.toLowerCase());
		System.out.println("Bada vijay: " + n.toUpperCase());
		System.out.println("Starts With Vijay: " + n.startsWith("Vijay"));
		System.out.println("Ends with han: " + n.endsWith("han"));
		System.out.println("Dad's name: " + n.substring(6));
	}

	/**
	 * Method to test concatenating strings
	 */
	public static void testConcatingString() {

		String firstName = "Nayna";
		String lastName = "Sahu";
		String name = firstName + lastName;
		name = firstName.concat(lastName);
		System.out.println(name);

		name = "Nayna Sahu";
		System.out.println(name.substring(6)); // Sahu
		System.out.println(name.substring(0, 6)); // Nayna

	}

}
