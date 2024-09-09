package com.sunilbooks.selflearnjava.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The {@code AddServerInt} interface defines the remote methods that can be
 * accessed by an RMI client. It extends {@code Remote} and declares the methods
 * that are to be implemented by the RMI server.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public interface AddServerInt extends Remote {

	/**
	 * Calculates the sum of two integers. This method can be invoked remotely by an
	 * RMI client.
	 * 
	 * @param a the first integer to sum.
	 * @param b the second integer to sum.
	 * @return the sum of {@code a} and {@code b}.
	 * @throws RemoteException if the remote invocation fails.
	 */
	public int sum(int a, int b) throws RemoteException;
}
