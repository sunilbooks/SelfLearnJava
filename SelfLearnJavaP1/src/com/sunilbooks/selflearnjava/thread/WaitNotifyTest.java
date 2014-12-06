package com.sunilbooks.selflearnjava.thread;

public class WaitNotifyTest {

	public static void main(String[] args) {

		Message msg = new Message("Process It");
		
		WaiterThread w1 = new WaiterThread("Ram", msg);
		WaiterThread w2 = new WaiterThread("Shyam", msg);
		w1.start();
		w2.start();

		NotifierThread notifier = new NotifierThread(msg);
		notifier.start();
		
		System.out.println("All threads are started");
	}

}