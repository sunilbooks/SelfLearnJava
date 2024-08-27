package com.sunilbooks.selflearnjava.clone;

/**
 * Represents a customer's address, which will be shallow cloned. This class
 * contains information about the street, city, and pin code.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class CustomerAddress {

	public String street;
	public String city;
	public String pin;

	public CustomerAddress() {
		street = "123 Main St";
		city = "Anytown";
		pin = "12345";
	}
}
