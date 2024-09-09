package com.sunilbooks.selflearnjava.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 * The {@code AddClient} class acts as a client in an RMI (Remote Method Invocation) 
 * application. It connects to a remote RMI server to invoke methods on the server 
 * object, specifically to calculate the sum of two numbers.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class AddClient {

    /**
     * The entry point of the RMI client application. It installs a security manager, 
     * connects to the RMI server using a specified URL, and invokes the `sum` method 
     * on the remote server object.
     * 
     * @param args Command line arguments (not used).
     * @throws Exception if an error occurs during the RMI operations, such as lookup failure.
     */
    public static void main(String[] args) throws Exception {

        // Install security manager
        System.setSecurityManager(new RMISecurityManager());

        // Get the remote object from the registry
        String url = "rmi://localhost:1099/ADD-SERVER";
        AddServerInt rObj = (AddServerInt) Naming.lookup(url);
        
        // Invoke the sum method and print the result
        System.out.println("SUM: " + rObj.sum(2, 2));
    }
}
