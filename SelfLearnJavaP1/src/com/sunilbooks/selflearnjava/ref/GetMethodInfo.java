package com.sunilbooks.selflearnjava.ref;

import java.lang.reflect.Method;
import com.sunilbooks.selflearnjava.oop.Person;

/**
 * The {@code GetMethodInfo} class demonstrates how to retrieve and print
 * information about the methods of a class using the Reflection API. This
 * example specifically examines the {@code Person} class, including its
 * inherited methods and those declared within the class.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class GetMethodInfo {

	/**
	 * The entry point of the application. It creates an instance of {@code Person},
	 * retrieves method information using reflection, and prints details about each
	 * method, including its name, return type, and parameter types. It also
	 * demonstrates how to exclude inherited methods.
	 * 
	 * @param args Command line arguments (not used).
	 * @throws Exception if an error occurs during reflection operations.
	 */
	public static void main(String[] args) throws Exception {

		// Create instance of Person
		Person person = new Person();
		Class c = person.getClass();

		// Get all methods information
		Method[] methods = c.getMethods();
		System.out.println("Class: " + c.getName());
		System.out.println("Method Information:");

		// Iterate through all methods
		for (Method m : methods) {
			System.out.println("\tName: " + m.getName());
			System.out.println("\tReturn Type: " + m.getReturnType());
			Class[] params = m.getParameterTypes();
			if (params.length > 0) {
				System.out.println("\tMethod Parameter Types:");
				for (Class p : params) {
					System.out.println("\t\t" + p.getName());
				}
			}
			System.out.println();
		}

		System.out.println("Exclude Parent Methods");

		// Get methods declared in the class (excluding inherited methods)
		methods = c.getDeclaredMethods();

		// Iterate through all declared methods
		for (Method m : methods) {
			System.out.println("\tName: " + m.getName());
			System.out.println("\tReturn Type: " + m.getReturnType());
			Class[] params = m.getParameterTypes();
			if (params.length > 0) {
				System.out.println("\tMethod Parameter Types:");
				for (Class p : params) {
					System.out.println("\t\t" + p.getName());
				}
			}
			System.out.println();
		}
	}
}
