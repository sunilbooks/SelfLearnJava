package com.sunilbooks.selflearnjava.oop;

/**
 * Tests polymorphic behavior of the {@code Shape} class by demonstrating how different 
 * {@code Shape} subclasses (such as {@code Rectangle}, {@code Circle}, and {@code Triangle}) 
 * can be used interchangeably. This is achieved through the {@code area()} method.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestShapePoly {

    /**
     * Main method to test polymorphic behavior of {@code Shape} subclasses.
     * It creates an array of {@code Shape} objects, calculates the total area of these shapes,
     * and prints the result.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Rectangle();
        s[1] = new Circle();
        s[2] = new Triangle();
        double totalArea = calcArea(s);
        System.out.println(totalArea);
    }

    /**
     * Calculates the total area of the shapes in the given array.
     * 
     * @param s an array of {@code Shape} objects
     * @return the total area of all shapes
     */
    static double calcArea(Shape[] s) {
        double totalArea = 0;

        for (int i = 0; i < s.length; i++) {
            totalArea += s[i].area();
        }
        return totalArea;
    }

}
