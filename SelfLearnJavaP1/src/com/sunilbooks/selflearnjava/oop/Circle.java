package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code Circle} class inherits from the {@code Shape} class and represents 
 * a circle with a specific radius. It includes methods to get and set the radius, 
 * as well as to calculate the area of the circle.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Shape
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Circle extends Shape {

    /**
     * The radius of the circle.
     */
    private int radius;

    /**
     * The constant value of PI, used in the calculation of the area of the circle.
     */
    public static final double PI = 3.14;

    /**
     * Gets the radius of the circle.
     * 
     * @return the radius of the circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     * 
     * @param radius the new radius of the circle
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Calculates and returns the area of the circle.
     * 
     * @return the area of the circle
     */
    public double area() {
        return PI * radius * radius;
    }

}
