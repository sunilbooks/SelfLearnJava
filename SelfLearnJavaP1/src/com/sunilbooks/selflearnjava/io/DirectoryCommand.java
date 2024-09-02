package com.sunilbooks.selflearnjava.io;

import java.io.File;

/**
 * Demonstrates basic file and directory operations including listing files and
 * subdirectories, creating a new subdirectory, renaming a directory, and
 * scheduling a directory for deletion upon program exit.
 * <p>
 * This program uses the {@link File} class to perform operations such as
 * listing directory contents, creating directories, renaming directories, and
 * deleting directories.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class DirectoryCommand {

	/**
	 * Main method to perform file and directory operations.
	 * <p>
	 * This method lists the files and subdirectories of a specified directory,
	 * creates a new subdirectory, renames it, and then deletes it. It also
	 * demonstrates scheduling the directory for deletion on exit.
	 * 
	 * @param args Command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// File object referring to the directory
		File directory = new File("g:/temp");

		// Get the list of files and subdirectories
		String[] files = directory.list();

		if (files != null) {
			for (String f : files) {
				System.out.println(f);
			}
		} else {
			System.out.println("Directory does not exist or is not a directory.");
		}

		// Create a subdirectory inside the specified directory
		File subDir = new File(directory, "test");
		boolean created = subDir.mkdir();

		if (created) {
			System.out.println("Subdirectory 'test' created.");
		} else {
			System.out.println("Failed to create subdirectory 'test'.");
		}

		// Rename the created subdirectory
		File renamedDir = new File(directory, "Nest");
		boolean renamed = subDir.renameTo(renamedDir);

		if (renamed) {
			System.out.println("Subdirectory renamed to 'Nest'.");
		} else {
			System.out.println("Failed to rename subdirectory.");
		}

		// Remove the renamed subdirectory
		boolean deleted = renamedDir.delete();

		if (deleted) {
			System.out.println("Subdirectory 'Nest' deleted.");
		} else {
			System.out.println("Failed to delete subdirectory 'Nest'.");
		}

		// Schedule the directory for deletion on JVM exit
		renamedDir.deleteOnExit();
		System.out.println("Subdirectory 'Nest' scheduled for deletion on exit.");

	}
}
