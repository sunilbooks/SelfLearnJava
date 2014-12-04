package com.sunilbooks.selflearnjava.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 * Test the generic collections
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestGenericCollection {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram"); // Correct
		names.add("Shyam"); // Correct
		names.add("Krishn"); // Correct
		// name.add(5); // will cause compilation Error

		// No typecasting is required to get an object
		String val = names.get(1);
		System.out.println(val);

		// Other collections using generic data type

		// Sets
		Set<String> s = new HashSet<String>();
		Iterator<String> it = s.iterator();
		TreeSet<String> ts = new TreeSet<String>();

		// Lists
		ArrayList<String> a = new ArrayList<String>();
		Vector<String> v = new Vector<String>();
		Enumeration<String> e = v.elements();

		// Queues
		Queue<String> q = new LinkedList<String>();

		// Maps
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Hashtable<String, Integer> mapTable = new Hashtable<String, Integer>();

	}
}
