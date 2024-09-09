package com.sunilbooks.selflearnjava.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

import com.sunilbooks.selflearnjava.oop.Person;

/**
 * The {@code GetClassInfo} class demonstrates how to use the Reflection API in
 * Java to create an instance of a class dynamically and retrieve various
 * information about the class, such as its fields, constructors, and methods.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class GetClassInfo {

	/**
	 * The entry point of the application. It uses reflection to create an instance
	 * of {@code Person}, sets its attributes, and prints detailed information about
	 * the class's fields, constructors, and methods.
	 * 
	 * @param args Command line arguments (not used).
	 * @throws Exception if the class cannot be found or an instance cannot be
	 *                   created.
	 */
	public static void main(String[] args) throws Exception {

		// Returns the class object
		Class c = Class.forName("com.sunilbooks.selflearnjava.oop.Person");

		// Create instance of the class
		Person person = (Person) c.newInstance();

		// Set person information
		person.setName("Abhay");
		person.setAddress("Sadar Bazar");
		person.setDateOfBirth(new Date());

		// Print class details
		System.out.println("Class Information");
		System.out.println("\tName: " + c.getName());
		System.out.println("\tPackage: " + c.getPackage());
		System.out.println();

		// Get field information
		Field[] fields = c.getFields();
		System.out.println("Field Information");

		// Iterate through all fields
		for (Field f : fields) {
			System.out.println("\tName: " + f.getName());
			System.out.println("\tType: " + f.getType());
		}
		System.out.println();

		// Get class constructors
		Constructor[] ctrs = c.getConstructors();
		System.out.println("Constructor Information");

		// Iterate through all constructors
		for (Constructor ctr : ctrs) {
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

		// Get class methods
		Method[] methods = c.getMethods();
		System.out.println("Method Information");

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
	}
}
