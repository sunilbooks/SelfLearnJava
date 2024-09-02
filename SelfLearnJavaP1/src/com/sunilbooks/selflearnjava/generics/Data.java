package com.sunilbooks.selflearnjava.generics;

/**
 * A simple generic class that holds an object of any specified type. The type
 * parameter {@code T} is used to define the type of the data held by the class,
 * which is determined when an instance of {@code Data} is created.
 * 
 * @param <T> The type of the data held by this class.
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Data<T> {

	// Declare an object of type T
	private T value;

	/**
	 * Constructs a {@code Data} object with the specified value.
	 * 
	 * @param val The value to be stored in this {@code Data} object.
	 */
	public Data(T val) {
		value = val;
	}

	/**
	 * Returns the value stored in this {@code Data} object.
	 * 
	 * @return The value of type {@code T}.
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Displays the type of the stored object. This method prints the class name of
	 * the type {@code T} to the console.
	 */
	public void showType() {
		System.out.println("Type of T is " + value.getClass().getName());
	}

	/**
	 * The main method that demonstrates the usage of the {@code Data} class with
	 * different types including {@code Integer}, {@code String}, and raw type.
	 * 
	 * @param args Command line arguments (not used here).
	 */
	public static void main(String[] args) {

		// Create a Data<Integer> object and assign Integer value 786.
		System.out.println("\nInteger Data Type ");
		Data<Integer> i = new Data<>(786);

		i.showType(); // Show the type of data used by i.
		int v = i.getValue(); // No type cast is required.
		System.out.println("Value: " + v);

		// Create a Data object for Strings.
		System.out.println("\nString Data Type ");
		Data<String> str = new Data<>("Vijay");
		str.showType(); // Show the type of data used by str.
		String val = str.getValue(); // No type cast is required.
		System.out.println("Value: " + val);

		// Raw Type: If type parameter is not specified
		Data rawData = new Data("Ram");
		val = (String) rawData.getValue(); // Type casting required
		System.out.println("\nRaw Type Value: " + val);

	}

}
