package com.sunilbooks.selflearnjava.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 * RMI Client
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class AddClient {
	public static void main(String[] args) throws Exception {

		// Install security manager
		System.setSecurityManager(new RMISecurityManager());

		// get the remote object from the //registry
		String url = "rmi://localhost:1099/ADD-SERVER";
		AddServerInt rObj = (AddServerInt) Naming.lookup(url);
		System.out.println("SUM : " + rObj.sum(2, 2));

	}
}
