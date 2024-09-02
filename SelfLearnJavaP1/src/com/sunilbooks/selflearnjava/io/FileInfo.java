package com.sunilbooks.selflearnjava.io;

import java.io.File;
import java.util.Date;

/**
 * Retrieves and prints information about a specified file in the file system.
 * <p>
 * This class uses the {@link File} class to check for file existence, retrieve
 * file attributes such as name, path, access permissions, modification date,
 * and length. It also distinguishes between files and directories.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class FileInfo {

	/**
	 * Main method to display file information.
	 * <p>
	 * This method creates a {@link File} object for a specified file, checks if the
	 * file exists, and prints various attributes of the file, including its name,
	 * path, access permissions, whether it is a file or directory, its last
	 * modification date, and its length.
	 * 
	 * @param args Command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// Refer to a.txt file
		File f = new File("c:/a.txt");

		// Check if file exists
		if (f.exists()) {
			// Name of the file
			System.out.println("Name: " + f.getName());
			// Path of the file
			System.out.println("Path: " + f.getAbsolutePath());

			// Check access permissions
			System.out.println("Access permission:");
			System.out.println("Writable: " + f.canWrite());
			System.out.println("Readable: " + f.canRead());

			// Check if it is a file or directory
			System.out.println("Is File: " + f.isFile());
			System.out.println("Is Directory: " + f.isDirectory());

			// Check file's last modified date
			Date d = new Date(f.lastModified());
			System.out.println("Date Modified: " + d);

			// Length of the file
			long length = f.length();
			System.out.println("Length: " + length + " bytes");

		} else {
			System.out.println("File does not exist.");
		}
	}

}
