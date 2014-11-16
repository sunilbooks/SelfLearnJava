package com.sunilbooks.selflearnjava.basic;

public class TestTernaryOperator {

	public static void main(String[] args) {
		int num = 5;
		String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(evenOdd);

		String name = "Vijay";
		boolean result = name instanceof String;
		System.out.println(result);
		
		
	}
}
