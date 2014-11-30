package com.sunilbooks.selflearnjava.collection;

/**
 * Contains Marksheet attributes and methods. It implements Comparable interface
 * to provide natural ordering.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class Marksheet implements Comparable<Marksheet> {

	private String rollNo;

	private String name;

	private int marks;

	public Marksheet() {
	}

	public Marksheet(String rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Marksheet m) {
		return rollNo.compareTo(m.getRollNo());
	}

	@Override
	public String toString() {
		return rollNo + "," + name + "," + marks;
	}

}
