package com.sunilbooks.selflearnjava.impclasses;

import java.util.Date;

public class TestStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("This is Java");
		sb.append(",Java is OOP");
		sb.append(",Java is guarantee for Job");
		System.out.println(sb);

		//Date d = new Date();
		//System.out.println(d);

		long fifteenMin = 15 * 60 * 1000 ;
		Date d = new Date(fifteenMin);
		System.out.println(d);
		
		
	}

}
