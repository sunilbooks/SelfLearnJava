package com.sunilbooks.selflearnjava.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
/**
 * Add Client
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class AddClient {
	public static void main(String[] args) {

		// Install security manager
		System.setSecurityManager(new RMISecurityManager());

		// get the remote object from the //registry
		try {
			String url = "rmi://localhost:1099/ADD-SERVER";
			AddServerInt remoteObject = (AddServerInt) Naming.lookup(url);
			System.out.println(" SUM = " + remoteObject.sum(2, 2));

		} catch (Exception e) {
			System.out.println("Error in Remote call " + e.getMessage());
		}
	}
}
