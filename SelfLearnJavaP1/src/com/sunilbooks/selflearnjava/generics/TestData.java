package com.sunilbooks.selflearnjava.generics;

/**
 * Test Generic class Data. It creates two Data objects one holds Integer and
 * second holds String value
 * 
 * @see Data
 * 
 * @author SUNRAYS Developer
 * @URL : www.sunrays.co.in
 * 
 *      Copyright (c) sunRays Technologies. All rights reserved.
 */

public class TestData {

	public static void main(String[] args) {

		// Create a Data<Integer> object and assign Integer value 786.
		Data<Integer> i = new Data<Integer>(786);

		i.showType(); // Show the type of data used by iOb.

		int v = i.getValue(); // No type cast is required.

		System.out.println("Value: " + v);

		// Create a Data object for Strings.
		Data<String> str = new Data<String>("Vijay");

		str.showType(); // Show Type

		String val = str.getValue(); // No type cast

		System.out.println("value: " + val);
	}
}
