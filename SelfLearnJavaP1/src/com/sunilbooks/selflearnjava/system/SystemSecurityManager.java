package com.sunilbooks.selflearnjava.system;

/**
 * This class demonstrates how to apply and configure an application
 * {@code SecurityManager}. It checks whether a security manager is already
 * configured, and if not, it sets a custom security manager using
 * {@code System.setSecurityManager()}.
 * 
 * <p>
 * The {@code SecurityManager} is responsible for enforcing security policies
 * within an application, such as access control and resource permissions.
 * </p>
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SystemSecurityManager {

	/**
	 * The main method that configures and checks the status of the
	 * {@code SecurityManager}.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// Check if a SecurityManager is already configured
		SecurityManager secManager = System.getSecurityManager();
		if (secManager == null) {
			System.out.println("SecurityManager is not configured");
		}

		// Set a custom SecurityManager
		SecurityManager mySecManager = new SecurityManager();
		System.setSecurityManager(mySecManager);

		// Check again if the SecurityManager is configured
		secManager = System.getSecurityManager();
		if (secManager != null) {
			System.out.println("SecurityManager is configured");
		}
	}
}
