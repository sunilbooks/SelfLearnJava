package com.sunilbooks.selflearnjava.test;

/**
 * This class demonstrates the parsing of primitive data types from
 * {@code String} values using the {@code parseXXX()} methods provided by
 * wrapper classes such as {@code Integer}, {@code Double}, {@code Boolean}, and
 * {@code Float}.
 * 
 * <p>
 * Each primitive type is converted from a string representation to its
 * respective primitive type using methods like {@code Integer.parseInt()},
 * {@code Double.parseDouble()}, and so on.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Test {

	/**
	 * The main method demonstrates the parsing of primitive data types from string
	 * values.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {

		int i = Integer.parseInt("5");
		double d = Double.parseDouble("5.5");
		boolean b = Boolean.parseBoolean("true");
		float f = Float.parseFloat("5.2");
	}

}
