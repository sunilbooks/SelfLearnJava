package com.sunilbooks.selflearnjava.oop;

/**
 * Test the person class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 */

public class TestPerson {

	public static void main(String[] args) {

		Person p = null; // declare an object
		p = new Person(); // Instantiate
		// Set values
		p.setName("Karan");
		p.setAddress("MG Road");

		// Get values
		System.out.println("Name : " + p.getName());
		System.out.println("Address : " + p.getAddress());

	}

}
