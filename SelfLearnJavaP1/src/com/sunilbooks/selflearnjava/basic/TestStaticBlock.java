package com.sunilbooks.selflearnjava.basic;

/**
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestStaticBlock {

	static {
		System.out.println("I will call first!");
	}

	static {
		System.out.println("I will call second!");
	}

	public static void main(String[] args) {
		System.out.println("I will call third!!");

	}

	/**
	 * I will call first! I will call second! I will call third!!
	 */
}
