package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code Rectangle} class inherits from the {@code Shape} class and represents 
 * a rectangle with attributes for its length and width. It provides methods to get 
 * and set these attributes and to calculate the area of the rectangle.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Shape
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Rectangle extends Shape {

    /**
     * The length of the rectangle.
     */
    private int length;

    /**
     * The width of the rectangle.
     */
    private int width;

    /**
     * Gets the length of the rectangle.
     * 
     * @return the length of the rectangle
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the length of the rectangle.
     * 
     * @param length the new length of the rectangle
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Gets the width of the rectangle.
     * 
     * @return the width of the rectangle
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle.
     * 
     * @param width the new width of the rectangle
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle.
     * 
     * @return the area of the rectangle, computed as length multiplied by width
     */
    public double area() {
        return length * width;
    }

}
