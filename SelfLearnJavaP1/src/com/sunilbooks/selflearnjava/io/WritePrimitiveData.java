package com.sunilbooks.selflearnjava.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * Writes primitive data to a binary stream.
 * <p>
 * This class demonstrates how to write primitive data types such as
 * {@code int}, {@code boolean}, {@code char}, and {@code double} to a binary
 * file using {@code DataOutputStream}. The data is written to the file
 * specified by the path "f:/binary.dat".
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WritePrimitiveData {

	/**
	 * The entry point of the application. It creates a {@code DataOutputStream} to
	 * write primitive data types to a binary file.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs
	 */
	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("f:/binary.dat");
		DataOutputStream out = new DataOutputStream(file);

		// Write primitive data to the file
		out.writeInt(1);
		out.writeBoolean(true);
		out.writeChar('A');
		out.writeDouble(1.2);
		out.close();

		System.out.println("Primitive Data successfully written");
	}
}
