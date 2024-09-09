package com.sunilbooks.selflearnjava.ref;

import java.lang.reflect.Method;
import java.util.Date;
import com.sunilbooks.selflearnjava.oop.Person;

/**
 * The {@code InvokeMethod} class demonstrates how to invoke methods of a class
 * using the Reflection API. This example specifically examines the
 * {@code Person} class, setting its properties using setter methods and then
 * retrieving those properties using getter methods, all through reflection.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class InvokeMethod {

	/**
	 * The entry point of the application. It demonstrates how to use reflection to
	 * invoke setter methods to set values for a {@code Person} object's fields and
	 * how to invoke getter methods to retrieve and print those values.
	 * 
	 * @param args Command line arguments (not used).
	 * @throws Exception if an error occurs during reflection operations.
	 */
	public static void main(String[] args) throws Exception {

		// Create an instance of the Person class
		Person person = new Person();
		Class c = person.getClass();
		System.out.println("Class Name: " + c.getName());

		// Call setter methods using reflection API

		// Set Name
		Method oneMethod = c.getMethod("setName", String.class);
		oneMethod.invoke(person, "Abhay");

		// Set Address
		oneMethod = c.getMethod("setAddress", String.class);
		oneMethod.invoke(person, "Sadar Bazar");

		// Set Date of Birth
		oneMethod = c.getMethod("setDateOfBirth", Date.class);
		oneMethod.invoke(person, new Date());

		// Get all declared methods, excluding parent methods
		Method[] methods = c.getDeclaredMethods();

		// Call all getter methods
		String name;
		for (Method m : methods) {
			name = m.getName();
			if (name.startsWith("get")) {
				Object o = m.invoke(person, (Object[]) null);
				System.out.println(name + " = " + o);
			}
		}
	}
}
