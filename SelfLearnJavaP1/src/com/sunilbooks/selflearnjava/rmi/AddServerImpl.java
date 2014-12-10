package com.sunilbooks.selflearnjava.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * It is the RMI Server that implements remote interface and extends
 * UnicastRemoteObject.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class AddServerImpl extends UnicastRemoteObject implements AddServerInt {

	/**
	 * Default constructor
	 * 
	 * @throws RemoteException
	 */
	AddServerImpl() throws RemoteException {
		super();
	}

	/**
	 * Remote Method
	 */
	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}

	/**
	 * Local method
	 */
	public void display() {
		System.out.println("Display is working");
	}

	/**
	 * Instantiate RMI Server and bind with RMI Registry.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		// Install security manager
		System.setSecurityManager(new RMISecurityManager());

		// create a local instance of the server //object
		AddServerImpl server = new AddServerImpl();

		// Bind server instance with RMI Registry
		Naming.rebind("ADD-SERVER", server);

		System.out.println("Server started!");
	}

}
