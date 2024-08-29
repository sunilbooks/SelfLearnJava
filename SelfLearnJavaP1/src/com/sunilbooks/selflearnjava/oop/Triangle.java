package com.sunilbooks.selflearnjava.oop;

/**
 * Inherits the {@code Shape} class and represents a triangle with attributes for base and height.
 * Provides implementation for calculating the area of the triangle.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Triangle extends Shape {

    /**
     * Base of the triangle.
     */
    private int base;

    /**
     * Height of the triangle.
     */
    private int height;

    /**
     * Gets the base of the triangle.
     * 
     * @return the base of the triangle
     */
    public int getBase() {
        return base;
    }

    /**
     * Sets the base of the triangle.
     * 
     * @param base the base of the triangle
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * Gets the height of the triangle.
     * 
     * @return the height of the triangle
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the triangle.
     * 
     * @param height the height of the triangle
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Calculates the area of the triangle using the formula: (base * height) / 2.
     * 
     * @return the area of the triangle
     */
    @Override
    public double area() {
        return (base * height) / 2.0;
    }

}
