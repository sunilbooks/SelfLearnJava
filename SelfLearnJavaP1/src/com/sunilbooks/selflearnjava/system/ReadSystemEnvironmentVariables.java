package com.sunilbooks.selflearnjava.system;

import java.util.Map;
import java.util.Set;

/**
 * This class demonstrates how to use the {@code System} class to read and print
 * environment variables from the operating system. It retrieves both a single
 * environment variable (PATH) and all available environment variables.
 * 
 * <p>
 * This example shows how to interact with the system's environment using the
 * {@code System.getenv()} method.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ReadSystemEnvironmentVariables {

	/**
	 * The main method that reads and prints environment variables.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// Read a single environment variable
		String path = System.getenv("PATH");
		System.out.println("$PATH=" + path);

		// Read all Environment Variables
		Map<String, String> envMap = System.getenv();
		Set<String> keySet = envMap.keySet();
		for (String key : keySet) {
			String val = envMap.get(key);
			System.out.println(key + "=" + val);
		}

	}
}
