package com.sunilbooks.selflearnjava.collection;

import java.util.Comparator;

/**
 * Contains Marksheet attributes and methods. Marksheet implements Comparable
 * interface and override compareTo() method to provide natural ordering on Roll
 * Number field .
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Marksheet implements Comparable<Marksheet> {

	public String rollNo;

	public String name;

	public int marks;

	/**
	 * Default constructor
	 */
	public Marksheet() {
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param rollNo
	 * @param name
	 * @param marks
	 */
	public Marksheet(String rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	/**
	 * Natural ordering is done by Roll Number field
	 */
	@Override
	public int compareTo(Marksheet m) {
		return rollNo.compareTo(m.rollNo);
	}

	/**
	 * Returns Marksheet attributes as string
	 */
	@Override
	public String toString() {
		return rollNo + "," + name + "," + marks;
	}

}

/**
 * A comparator class to sort Marksheet elements by Name in ascending order
 */
class MarksheetOrderByName implements Comparator<Marksheet> {
	public int compare(Marksheet m1, Marksheet m2) {
		return m1.name.compareTo(m2.name);
	}
}

// Sorts Marksheet elements by Name in descending order

/**
 * A comparator class to sort Marksheet elements by Name in descending order
 */
class MarksheetOrderByNameDesc implements Comparator<Marksheet> {
	public int compare(Marksheet m1, Marksheet m2) {
		return m2.name.compareTo(m1.name);
	}
}

/**
 * A comparator class to sort Marksheet elements by Marks in descending order
 */
class MarksheetOrderByMarksDesc implements Comparator<Marksheet> {
	public int compare(Marksheet m1, Marksheet m2) {
		if (m1.marks > m2.marks) {
			return -1;
		} else if (m1.marks == m2.marks) {
			return 0;
		} else {
			return 1;
		}
	}
}