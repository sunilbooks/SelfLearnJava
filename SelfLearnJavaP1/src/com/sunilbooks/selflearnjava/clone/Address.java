package com.sunilbooks.selflearnjava.clone;

/**
 * Represents an address which can be cloned.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Address implements Cloneable {
    public String street;

    public Address(String s) {
        street = s;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
