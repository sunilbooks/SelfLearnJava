package com.sunilbooks.selflearnjava.ref;

import java.lang.reflect.Constructor;
import java.util.Date;
import com.sunilbooks.selflearnjava.oop.Person;

/**
 * The {@code InvokeConstructor} class demonstrates how to create an instance of
 * a class by invoking a specific constructor using the Reflection API. This
 * example specifically examines the {@code Person} class and creates an
 * instance using its parameterized constructor.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class InvokeConstructor {

	/**
	 * The entry point of the application. It demonstrates how to use reflection to
	 * locate a specific constructor of the {@code Person} class and create an
	 * instance of that class using the constructor. The program then prints out the
	 * information of the created {@code Person} instance.
	 * 
	 * @param args Command line arguments (not used).
	 * @throws Exception if the class cannot be found, the constructor cannot be
	 *                   accessed, or an instance cannot be created.
	 */
	public static void main(String[] args) throws Exception {

		// Create instance of Person class using reflection
		Class c = Class.forName("com.sunilbooks.selflearnjava.oop.Person");

		// Get the constructor with specific parameters
		Constructor oneCunst = c.getConstructor(String.class, String.class, Date.class);

		// Create instance using the constructor
		Person p = (Person) oneCunst.newInstance("Abhay", "Sadar Bazar", new Date());

		// Print class and person information
		System.out.println("Class Name: " + c.getName());
		System.out.println();
		System.out.println("Person Information");
		System.out.println("Name: " + p.getName());
		System.out.println("Address: " + p.getAddress());
		System.out.println("Date of Birth: " + p.getDateOfBirth());
	}
}
