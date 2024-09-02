package com.sunilbooks.selflearnjava.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Demonstrates a generic method to copy elements from an array to a collection.
 * The method allows copying elements of an array into any collection whose
 * element type is a supertype of the element type of the array.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class GenericMethods {

	public static void main(String[] args) {

		// Create an Object array and a Collection of Objects
		Object[] objectArray = new Object[100];
		Collection<Object> objectList = new ArrayList<Object>();
		copyArrayToCollection(objectArray, objectList); // T inferred to be Object

		// Create a String array and a Collection of Strings
		String[] strArray = new String[100];
		Collection<String> strCollection = new ArrayList<String>();
		copyArrayToCollection(strArray, strCollection); // T inferred to be String
		copyArrayToCollection(strArray, objectList); // T inferred to be Object

		// Create an Integer array and a Collection of Integers
		Integer[] iArray = new Integer[100];
		Collection<Integer> iCol = new ArrayList<Integer>();
		copyArrayToCollection(iArray, iCol); // T inferred to be Integer

		// Create a Float array and a Collection of Floats
		Float[] fArray = new Float[100];
		Collection<Float> fCol = new ArrayList<Float>();
		copyArrayToCollection(fArray, fCol); // T inferred to be Float
	}

	/**
	 * Copies elements from an array to a collection. The method can be called with
	 * any type of array and a collection whose element type is a supertype of the
	 * element type of the array.
	 * 
	 * @param <T> The type of elements in the array and collection.
	 * @param a   The array containing elements to be copied.
	 * @param c   The collection to which elements from the array will be added.
	 * @throws NullPointerException if either the array or the collection is null.
	 */
	public static <T> void copyArrayToCollection(T[] a, Collection<T> c) {
		if (a == null || c == null) {
			throw new NullPointerException("Array or collection cannot be null");
		}
		for (T o : a) {
			c.add(o); // Adds each element of the array to the collection
		}
	}
}
