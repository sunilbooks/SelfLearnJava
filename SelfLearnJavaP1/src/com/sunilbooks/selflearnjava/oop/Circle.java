package com.sunilbooks.selflearnjava.oop;

/*
 * copyright (c) sunRays Technologies Indore
 * @author: sunRays Developer
 * @url : www.sunrays.co.in
 *
 */

public class Circle extends Shape {

	private int radius; //instance variable 
	public static final double PI = 3.14; // static variable

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		double area = 0;
		area = PI * radius * radius;
		return area;
	}

}
