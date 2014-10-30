package com.sunilbooks.selflearnjava.oop;

/**
 * This class test polymorphic behavior of Shape class. Polymorphic behavior is
 * achieved by area() method.
 * 
 * @author Sunil Sahu
 * @URL : www.sunilbooks.com
 * 
 *      Copyright (c) Sunil Sahu. All rights reserved.
 */
public class TestShapePoly {

	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();
		double totalArea = calcArea(s);
		System.out.println(totalArea);

	}

	static double calcArea(Shape[] s) {
		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {
			totalArea += s[i].area();
		}
		return totalArea;
	}

}
