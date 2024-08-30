package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code Shape} class is an abstract class that represents a geometric shape.
 * It contains attributes related to the shape, such as color and border width, 
 * and provides methods to access and modify these attributes. It also defines 
 * an abstract method {@code area} that must be implemented by subclasses to 
 * calculate the area of specific shapes.
 * 
 * <p>Attributes:</p>
 * <ul>
 *     <li>{@code color} - The color of the shape.</li>
 *     <li>{@code borderWidth} - The width of the shape's border.</li>
 * </ul>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public abstract class Shape {

    /**
     * The color of the shape.
     */
    protected String color = null;

    /**
     * The width of the shape's border.
     */
    protected int borderWidth = 0;

    /**
     * Default constructor for the {@code Shape} class.
     */
    public Shape() {
    }

    /**
     * Parameterized constructor for the {@code Shape} class.
     * 
     * @param color the color of the shape
     * @param borderWidth the width of the shape's border
     */
    public Shape(String color, int borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    /**
     * Gets the color of the shape.
     * 
     * @return the color of the shape
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the shape.
     * 
     * @param color the new color of the shape
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the width of the shape's border.
     * 
     * @return the width of the shape's border
     */
    public int getBorderWidth() {
        return borderWidth;
    }

    /**
     * Sets the width of the shape's border.
     * 
     * @param borderWidth the new width of the shape's border
     */
    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    /**
     * Abstract method to calculate the area of the shape. This method must be 
     * implemented by subclasses of {@code Shape} to provide the specific 
     * calculation for the area of that shape.
     * 
     * @return the area of the shape
     */
    public abstract double area();

}
