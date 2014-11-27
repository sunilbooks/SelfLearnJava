package com.sunilbooks.selflearnjava.collection;

/**
 * Test the Map interface and its concrete class
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.*;

public class TestMap {

	public static void main(String[] args) {

		HashMap map = new HashMap();

		// Add Elements
		map.put("1", "One");
		map.put("2", "Two");
		map.put("3", "Three");

		// Get size of map
		int size = map.size();
		System.out.println("Length : " + size);

		// Get an element by key
		String val = (String) map.get("2");
		System.out.println(val);

		// Remove an element by key
		map.remove("1");

		// Check if key exists
		boolean flag = map.containsKey("1");
		System.out.println(flag);

		// Check if value exists
		flag = map.containsValue("Two");
		System.out.println(flag);

		System.out.println("Key Set View");
		// Get collection of Keys and print
		Set keys = map.keySet();
		for (Object k : keys) {
			System.out.println(k);
		}

		System.out.println("Value Collection View");

		// Get collection of Values and print
		Collection values = map.values();
		for (Object v : values) {
			System.out.println(v);
		}
		System.out.println("Key-Value Pair View");

		// get the key-value pairs and Print them
		Set keyValue = map.entrySet();
		for (Object ele : keyValue) {
			Map.Entry pair = (Map.Entry) ele;
			System.out.println(pair.getKey() + " - " + pair.getValue());
		}

	}
}
