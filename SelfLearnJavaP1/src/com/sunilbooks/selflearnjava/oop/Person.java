package com.sunilbooks.selflearnjava.oop;

import java.util.Date;

/**
 * Class contains Person related attribute and methods.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 */

public class Person {

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

	public void setName(String n) {
		name = n;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String a) {
		address = a;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date d) {
		dateOfBirth = d;
	}

}
