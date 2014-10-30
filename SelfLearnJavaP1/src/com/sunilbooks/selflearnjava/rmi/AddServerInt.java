package com.sunilbooks.selflearnjava.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddServerInt extends Remote {
	public int sum(int a, int b) throws RemoteException;
}
