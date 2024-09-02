package com.sunilbooks.selflearnjava.generics;

/**
 * A simple generic class that holds only numeric values. The type parameter T
 * is bounded by the Number class, meaning it can only be a subclass of Number.
 * 
 * @param <T> the type of the numeric value, which must be a subclass of Number
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class NumberData<T extends Number> {

	// Declare an object of type T
	T value;

	/**
	 * Constructs a NumberData object with the specified value.
	 * 
	 * @param val the numeric value to be stored
	 */
	public NumberData(T val) {
		value = val;
	}

	/**
	 * Returns the numeric value stored in this NumberData.
	 * 
	 * @return the stored numeric value
	 */
	T getValue() {
		return value;
	}

	/**
	 * Displays the type of the numeric value stored in this NumberData.
	 */
	void showType() {
		System.out.println("Type of T is " + value.getClass().getName());
	}

	public static void main(String[] args) {
		NumberData<Integer> iData = new NumberData<Integer>(5);
		NumberData<Double> dData = new NumberData<Double>(5.5);
		// NumberData<String> sData = new NumberData<String>("5.5"); // Incorrect
	}
}
