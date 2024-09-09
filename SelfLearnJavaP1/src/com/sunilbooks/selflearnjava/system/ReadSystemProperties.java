package com.sunilbooks.selflearnjava.system;

import java.util.Properties;
import java.util.Set;

/**
 * This class demonstrates how to use the {@code System} class to read, clear,
 * and set system properties. It retrieves all system-defined properties and
 * prints them, along with examples of manipulating specific properties like
 * "user.country".
 * 
 * <p>
 * The {@code System.getProperties()} method is used to obtain the system
 * properties, and {@code System.getProperty()}, {@code System.setProperty()},
 * and {@code System.clearProperty()} demonstrate how to work with individual
 * properties.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadSystemProperties {

	/**
	 * The main method that reads, clears, and sets system properties.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// Get All System Defined Properties
		Properties prop = System.getProperties();
		Set<Object> keySet = prop.keySet();

		for (Object o : keySet) {
			String key = (String) o;
			String val = prop.getProperty(key);
			System.out.println(key + "=" + val);
		}

		// Get Specific Property
		String country = System.getProperty("user.country");
		System.out.println(country);

		// Clear property example
		System.clearProperty("user.country");
		System.out.println(System.getProperty("user.country")); // prints null

		// Set System property
		System.setProperty("user.country", "IN");
		country = System.getProperty("user.country");
		System.out.println(country); // prints "IN"

	}

}
