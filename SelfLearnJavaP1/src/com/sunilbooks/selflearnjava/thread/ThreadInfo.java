package com.sunilbooks.selflearnjava.thread;

/**
 * Prints information about all threads and thread groups in the Java Virtual
 * Machine (JVM).
 * 
 * <p>
 * This class retrieves and displays detailed information about the current
 * thread, its thread group, and recursively all other thread groups and threads
 * in the JVM. This information includes thread names, IDs, priorities, states,
 * and other attributes.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ThreadInfo {

	/**
	 * Retrieves and prints information about all threads and thread groups in the
	 * JVM.
	 * 
	 * <p>
	 * This method gets the current thread and its thread group, then traverses up
	 * to the root thread group. It calls the {@code info} method to print details
	 * about each thread group and its threads recursively.
	 * </p>
	 * 
	 * @param args command-line arguments (not used)
	 * @throws Exception if an error occurs during thread or thread group
	 *                   enumeration
	 */
	public static void main(String[] args) throws Exception {

		Thread t = Thread.currentThread(); // Get current thread from JVM
		ThreadGroup tg = t.getThreadGroup(); // Get thread group object of current running thread

		// Find root thread group
		while (tg.getParent() != null) {
			tg = tg.getParent();
		}

		info("", tg);
	}

	/**
	 * Prints information about a thread group and its threads and sub-groups.
	 * 
	 * <p>
	 * This method prints details about the given thread group, including its name,
	 * daemon status, and active threads. It also recursively prints information
	 * about all active sub-groups.
	 * </p>
	 * 
	 * @param indent the string used for indentation in the output
	 * @param tg     the thread group whose information is to be printed
	 */
	public static void info(String indent, ThreadGroup tg) {

		int threadCount = tg.activeCount(); // Get active thread count
		Thread[] threads = new Thread[threadCount];
		tg.enumerate(threads); // Get active threads

		System.out.println(indent + "THREAD GROUP NAME: " + tg.getName());
		System.out.println(indent + "Is Daemon : " + tg.isDaemon());
		// Log threads details
		for (int i = 0; i < threads.length; i++) {
			log(indent + "\t", threads[i]);
		}

		int groupCount = tg.activeGroupCount(); // Get active thread group count
		ThreadGroup[] groups = new ThreadGroup[groupCount];
		tg.enumerate(groups); // Get thread groups

		for (int i = 0; i < groups.length; i++) {
			info(indent + "\t", groups[i]);
		}
	}

	/**
	 * Prints detailed information about a thread.
	 * 
	 * <p>
	 * This method prints various attributes of the specified thread, including its
	 * name, ID, priority, state, and whether it is alive or a daemon thread.
	 * </p>
	 * 
	 * @param indent the string used for indentation in the output
	 * @param t      the thread whose information is to be printed
	 */
	public static void log(String indent, Thread t) {
		System.out.println(indent + "THREAD Name :" + t.getName());
		System.out.println(indent + "ID :" + t.getId());
		System.out.println(indent + "Priority :" + t.getPriority());
		System.out.println(indent + "State :" + t.getState());
		System.out.println(indent + "Thread Group :" + t.getThreadGroup().getName());
		System.out.println(indent + "Is Alive :" + t.isAlive());
		System.out.println(indent + "Is Daemon :" + t.isDaemon() + "\n");
	}
}
