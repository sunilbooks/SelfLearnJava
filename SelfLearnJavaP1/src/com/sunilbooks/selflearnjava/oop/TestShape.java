package com.sunilbooks.selflearnjava.oop;

/**
 * Tests the functionality of the {@code Circle} class and demonstrates polymorphism
 * with the {@code Shape} class.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestShape {

    /**
     * Creates a {@code Circle} object, sets its attributes, and prints its details including
     * the calculated area. Demonstrates polymorphism by using a {@code Shape} reference for a 
     * {@code Circle} object and prints its attributes.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        Circle c = new Circle();
        c.setColor("Red");
        c.setBorderWidth(5);
        c.setRadius(2);

        System.out.println(c.getColor());
        System.out.println(c.getBorderWidth());
        System.out.println(c.getRadius());
        System.out.println(c.area());

        Shape s = new Circle();

        s.setColor("Red");
        s.setBorderWidth(5);

        System.out.println(s.getColor());
        System.out.println(s.getBorderWidth());
    }

}
