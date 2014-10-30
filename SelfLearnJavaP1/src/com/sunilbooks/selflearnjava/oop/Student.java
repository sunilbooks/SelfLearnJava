package com.sunilbooks.selflearnjava.oop;

public class Student extends Person {

	private String rollNo = null;
	private int marks = 0;

	public static int getAge() {
		return 10;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
