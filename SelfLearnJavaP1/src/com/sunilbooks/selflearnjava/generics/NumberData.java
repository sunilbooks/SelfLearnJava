package com.sunilbooks.selflearnjava.generics;

/**
 * A simple generic class that holds only Numbers, T is a type parameter and
 * Upper Bound to Number
 * 
 * @param <T>
 *            Type parameter name
 * 
 * @author SUNRAYS Developer
 * @URL : www.sunrays.co.in
 * 
 *      Copyright (c) sunRays Technologies. All rights reserved.
 */

public class NumberData<T extends Number> {

	// declare an object of type T
	T value;

	// pass the parameter of type T.
	public NumberData(T val) {
		value = val;
	}

	/**
	 * @return Object
	 */
	T getValue() {
		return value;
	}

	/**
	 * Show data type of stored object
	 */
	void showType() {
		System.out.println("Type of T is " + value.getClass().getName());
	}

	public static void main(String[] args) {
		NumberData<Integer> iData = new NumberData<Integer>(5);
		NumberData<Double> dData = new NumberData<Double>(5.5);
		// NumberData<String> sData = new NumberData<String>("5.5");//Incorrect
	}
}