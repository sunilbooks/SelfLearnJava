package com.sunilbooks.selflearnjava.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * The {@code AddServerImpl} class is an RMI (Remote Method Invocation) server
 * that implements the remote interface {@code AddServerInt} and extends
 * {@code UnicastRemoteObject}. This server provides a remote method to
 * calculate the sum of two integers.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class AddServerImpl extends UnicastRemoteObject implements AddServerInt {

	/**
	 * Constructs an {@code AddServerImpl} object and exports it on a default port.
	 * 
	 * @throws RemoteException if the server cannot be exported.
	 */
	AddServerImpl() throws RemoteException {
		super();
	}

	/**
	 * The remote method that calculates the sum of two integers.
	 * 
	 * @param a the first integer to sum.
	 * @param b the second integer to sum.
	 * @return the sum of {@code a} and {@code b}.
	 * @throws RemoteException if the remote invocation fails.
	 */
	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}

	/**
	 * A local method that displays a message to the console. This method is not
	 * available remotely.
	 */
	public void display() {
		System.out.println("Display is working");
	}

	/**
	 * The entry point of the RMI server application. It installs a security
	 * manager, creates a server instance, and binds it to the RMI Registry with the
	 * name "ADD-SERVER".
	 * 
	 * @param args command line arguments (not used).
	 * @throws Exception if an error occurs during server setup or binding.
	 */
	public static void main(String args[]) throws Exception {
		// Install security manager
		System.setSecurityManager(new RMISecurityManager());

		// Create a local instance of the server object
		AddServerImpl server = new AddServerImpl();

		// Bind the server instance with the RMI Registry
		Naming.rebind("ADD-SERVER", server);

		System.out.println("Server started!");
	}

}
