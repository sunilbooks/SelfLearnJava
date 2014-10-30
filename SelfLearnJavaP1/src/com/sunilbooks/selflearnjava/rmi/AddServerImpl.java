package com.sunilbooks.selflearnjava.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServerImpl extends UnicastRemoteObject implements AddServerInt {

	AddServerImpl() throws RemoteException {
		super();
	}

	// remote Method
	public int sum(int a, int b) throws RemoteException {
		return a + b;
	}

	// Local Method
	public void display() {
		System.out.println("Display is working");
	}

	public static void main(String args[]) throws Exception {
		// Install security manager
		System.setSecurityManager(new RMISecurityManager());

		// create a local instance of the server //object
		AddServerImpl Server = new AddServerImpl();

		// Bind server instance with RMI Registry
		Naming.rebind("ADD-SERVER", Server);

		System.out.println("Server is waiting.....");
	}

}
