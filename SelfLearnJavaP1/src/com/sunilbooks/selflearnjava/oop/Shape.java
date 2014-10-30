package com.sunilbooks.selflearnjava.oop;

public abstract class Shape {

	protected String color = null;
	protected int borderWidth = 0;

	//Default constructor 
	public Shape() {
	}

	//Parameterized constructor
	public Shape(String c, int bw) {
		color = c;
		borderWidth = bw;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public abstract double area();

}
