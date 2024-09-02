package com.sunilbooks.selflearnjava.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Serializes an object and writes it to a file.
 * <p>
 * This class demonstrates how to serialize an object of the
 * {@code MarksheetBean} class and write it to a file using
 * {@code ObjectOutputStream}. The serialized object is saved to the file
 * specified by the path "f:/object.ser".
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WriteObject {

	/**
	 * The entry point of the application. It creates an instance of
	 * {@code MarksheetBean}, sets its values, serializes it, and writes it to a
	 * file.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs or the object cannot be serialized
	 */
	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("f:/object.ser");

		// Wrap file with ObjectOutputStream
		ObjectOutputStream out = new ObjectOutputStream(file);

		// Create an object of MarksheetBean and set values
		MarksheetBean m = new MarksheetBean();
		m.setName("Raju");
		m.setMaths(90);
		m.setPhysics(80);
		m.setChemistry(89);
		m.setTemp(99);

		// Print total marks and percentage
		System.out.println("Total Marks : " + m.getTotal());
		System.out.println("Percentage : " + m.getPercentage());

		// Serialize the object
		out.writeObject(m);

		// Close the file
		out.close();

		System.out.println("Object is serialized and persisted.");
	}
}
