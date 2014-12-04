package com.sunilbooks.selflearnjava.generics;

/**
 * A simple generic class that holds any Class of data, T is a type parameter
 * that will be replaced by a real type when an object of type Data is created.
 *
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Data<T> {

	// declare an object of type T
	T value;

	// pass the parameter of type T.
	public Data(T val) {
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
}
