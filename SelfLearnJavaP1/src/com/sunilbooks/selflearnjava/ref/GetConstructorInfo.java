package com.sunilbooks.selflearnjava.ref;

import java.lang.reflect.Constructor;
import com.sunilbooks.selflearnjava.oop.Person;

/**
 * The {@code GetConstructorInfo} class demonstrates how to retrieve and display
 * constructor details of a class using the Reflection API. This example
 * specifically examines the {@code Person} class.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class GetConstructorInfo {

	/**
	 * The entry point of the application. It creates an instance of {@code Person},
	 * retrieves the class's constructors using reflection, and prints detailed
	 * information about them.
	 * 
	 * @param args Command line arguments (not used).
	 * @throws Exception if an error occurs during reflection operations.
	 */
	public static void main(String[] args) throws Exception {

		// Create instance of Person
		Person person = new Person();
		Class c = person.getClass();
		System.out.println("Class Name: " + c.getName());

		// Get class constructors
		Constructor[] constructors = c.getConstructors();
		System.out.println("Constructor Information");

		// Iterate through all constructors
		for (Constructor ctr : constructors) {
			System.out.println("\tName: " + ctr.getName());
			Class[] params = ctr.getParameterTypes();
			if (params.length > 0) {
				System.out.println("\tConstructor Parameter Types:");
				for (Class p : params) {
					System.out.println("\t\t" + p.getName());
				}
			}
			System.out.println();
		}
	}
}
