package com.sunilbooks.selflearnjava.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Reads and displays primitive data from a binary file.
 * <p>
 * This class demonstrates how to read various primitive data types from a
 * binary stream using {@code DataInputStream}. It reads data from a file and
 * prints the values of different primitive data types to the console.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadPrimitiveData {

	/**
	 * The entry point of the application. It reads primitive data from a binary
	 * file and prints the values.
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an I/O error occurs or data cannot be read
	 */
	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("f:/binary.dat");

		DataInputStream in = new DataInputStream(file);

		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());

		in.close();
	}

}
