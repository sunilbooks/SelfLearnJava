package com.sunilbooks.selflearnjava.basic;

/**
 * This class demonstrates the conversion of various primitive data types into
 * their corresponding String representations.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ConvertPrimitiveDataIntoString {

	/**
	 * The main method where primitive data types are converted into Strings.
	 * 
	 * @param args Command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Convert and store byte value as String
		String btStr = String.valueOf((byte) 1);

		// Convert and store short value as String
		String shortStr = String.valueOf((short) 2);

		// Convert and store int value as String
		String intStr = String.valueOf(3);

		// Convert and store long value as String
		String longStr = String.valueOf(4L);

		// Convert and store float value as String
		String floatStr = String.valueOf(5.5f);

		// Convert and store double value as String
		String doubleStr = String.valueOf(5.5D);

		// Convert and store boolean value as String
		String boolStr = String.valueOf(true);
	}
}
