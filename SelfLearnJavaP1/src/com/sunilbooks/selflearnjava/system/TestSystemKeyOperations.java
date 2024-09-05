package com.sunilbooks.selflearnjava.system;

/**
 * This class demonstrates key operations of the {@code System} class, such as
 * running the garbage collector, mapping library names to OS-specific strings,
 * running finalization for objects waiting for finalization, and terminating
 * the Java Virtual Machine (JVM).
 * 
 * <p>
 * The {@code System.gc()} method is used to request garbage collection,
 * {@code System.mapLibraryName()} to map a library name,
 * {@code System.runFinalization()} to run finalizers for objects awaiting
 * finalization, and {@code System.exit()} to terminate the JVM.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestSystemKeyOperations {

	/**
	 * The main method that demonstrates system key operations such as garbage
	 * collection, library name mapping, running finalization, and JVM termination.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// Run the garbage collector
		System.gc();
		System.out.println("Garbage collector executed.");

		// Map library name to OS-specific string
		String libName = System.mapLibraryName("os.name");
		System.out.println("os.name library=" + libName);

		// Run finalization for objects waiting for finalization
		System.runFinalization();

		// Terminate the currently running JVM
		System.exit(1);

		// This line will never print because JVM is terminated
		System.out.println("JVM is terminated");
	}
}
