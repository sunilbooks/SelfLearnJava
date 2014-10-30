package com.sunilbooks.selflearnjava.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Class contains Wildcards examples
 * 
 * @author Sunil Sahu
 * 
 */
public class WildcardsTest {

	/**
	 * Upper bound list to Number class
	 * 
	 * @param list
	 */
	public static void display(List<? extends Number> list) {
		for (Number e : list) {
			System.out.println(e);
		}
	}

	/**
	 * Upper bound list to Number class
	 * 
	 * @param list
	 * @return total
	 */
	public static double sum(List<? extends Number> list) {
		double total = 0;
		for (Number e : list) {
			total += e.doubleValue();
		}
		return total;
	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		display(l);
		System.out.println(sum(l));
	}

}
