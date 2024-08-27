package com.sunilbooks.selflearnjava.basic;

/**
 * Example of explicit and implicit type casting
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TypeCasting {

	public static void main(String[] args) {

		int i = 1;
		double d;
		char c = 'S';
		long l;
		float f;

		// converting int to double
		d = i;// Implicit conversion
		System.out.println("int -> double = " + d);

		// converting double to int
		i = (int) d; // Explicit conversion
		System.out.println("double -> int = " + i);

		// converting char to double
		d = c; // Implicit conversion
		System.out.println("char --> double = " + d);

		// converting double to char
		c = (char) d; // Explicit conversion to char
		System.out.println("double --> char = " + c);

		// converting int to long
		l = i; // Implicit conversion
		System.out.println("int -> long = " + l);

		// converting long to int
		i = (int) l; // Explicit conversion
		System.out.println("long -> int = " + i);

		// converting float to double
		d = 10.5f; // Implicit conversion
		System.out.println("float -> double = " + d);

		// converting double to float
		f = (float) d; // Explicit conversion
		System.out.println("double -> float = " + f);

		// converting char to int
		i = c; // Implicit conversion
		System.out.println("char -> int = " + i);

		// converting int to char
		c = (char) i; // Explicit conversion
		System.out.println("int -> char = " + c);

	}

}
