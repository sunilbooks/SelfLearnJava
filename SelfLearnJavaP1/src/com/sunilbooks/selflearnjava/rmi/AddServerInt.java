package com.sunilbooks.selflearnjava.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Interface Add Server entends Remote
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public interface AddServerInt extends Remote {
	public int sum(int a, int b) throws RemoteException;
}
