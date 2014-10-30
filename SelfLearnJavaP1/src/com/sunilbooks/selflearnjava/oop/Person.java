package com.sunilbooks.selflearnjava.oop;

import java.util.Date;

public abstract class Person {

	private String name = null;
	private String address = null;
	private Date dateOfBirth = null;

	public Person() {
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Person(String n, String a, Date d) {
		name = n;
		address = a;
		dateOfBirth = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
