package com.sunilbooks.selflearnjava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Demonstrates various utilities provided by the Collections class including
 * copying, searching, sorting, reversing, shuffling, and synchronizing
 * collections.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestCollectionsClass {

	/**
	 * Main method to test various utilities provided by the Collections class.
	 * 
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// Create and populate an ArrayList
		ArrayList<String> a = new ArrayList<>();
		a.add("Zero");
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		a.add("Five");

		// Copy collection
		ArrayList<String> toList = new ArrayList<>(10);
		toList.add("0");
		toList.add("1");
		toList.add("2");
		toList.add("3");
		toList.add("4");
		toList.add("5");

		Collections.copy(toList, a);
		System.out.println("Copied List : " + toList);

		// Search an element
		int ind = Collections.binarySearch(a, "Two");
		System.out.println("Index of element \"Two\" is " + ind);

		// Sort a collection elements
		Collections.sort(a);
		System.out.println("Sorted List : " + a);

		// Employee List
		List<Employee> employeesList = new ArrayList<>();
		employeesList.add(new Employee("Vishwakarma", "Sandeep"));
		employeesList.add(new Employee("Sahu", "Karan"));
		employeesList.add(new Employee("Pacharne", "Prachi"));
		employeesList.add(new Employee("Gupta", "Ashish"));
		employeesList.add(new Employee("Gupta", "Ranu"));
		employeesList.add(new Employee("Sahu", "Rahul"));

		// Sort collection of employee objects using comparator
		EmployeeByNameComparator empComp = new EmployeeByNameComparator();
		Collections.sort(employeesList, empComp);
		System.out.println("Sorted List By Comparator : " + employeesList);

		// Reverse a collection elements
		Collections.reverse(a);
		System.out.println("Reversed List : " + a);

		// Create Empty collections
		System.out.println("Empty Collections:");
		System.out.println("Enumeration: " + Collections.emptyEnumeration());
		System.out.println("Iterator: " + Collections.emptyIterator());
		System.out.println("List: " + Collections.emptyList());
		System.out.println("Set: " + Collections.emptySet());
		System.out.println("Map: " + Collections.emptyMap());

		// Shuffle collection
		Collections.shuffle(a);
		System.out.println("Shuffled List : " + a);

		// Synchronize Collections
		ArrayList<String> al = new ArrayList<>();
		List<String> l = Collections.synchronizedList(al);

		HashSet<String> hs = new HashSet<>();
		Set<String> s = Collections.synchronizedSet(hs);

		TreeSet<String> ts = new TreeSet<>();
		SortedSet<String> ss = Collections.synchronizedSortedSet(ts);

		HashMap<String, String> hm = new HashMap<>();
		Map<String, String> m = Collections.synchronizedMap(hm);

		TreeMap<String, String> tm = new TreeMap<>();
		SortedMap<String, String> sm = Collections.synchronizedSortedMap(tm);
	}
}
