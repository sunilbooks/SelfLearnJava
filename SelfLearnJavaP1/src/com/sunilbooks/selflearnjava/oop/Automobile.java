package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code Automobile} class represents a basic automobile with properties like
 * color, speed, gear, and make. It provides methods to get and set these properties 
 * and to change the gear.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Automobile {

    /**
     * The color of the automobile.
     */
    private String color = null;

    /**
     * The speed of the automobile.
     */
    private int speed = 0;

    /**
     * The current gear of the automobile.
     */
    private int gear = 0;

    /**
     * The make of the automobile (e.g., manufacturer or brand).
     */
    private String make = null;

    /**
     * Gets the color of the automobile.
     * 
     * @return the color of the automobile
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the automobile.
     * 
     * @param color the new color of the automobile
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the speed of the automobile.
     * 
     * @return the speed of the automobile
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the automobile.
     * 
     * @param speed the new speed of the automobile
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Gets the make of the automobile.
     * 
     * @return the make of the automobile
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the make of the automobile.
     * 
     * @param make the new make of the automobile
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Gets the current gear of the automobile.
     * 
     * @return the current gear of the automobile
     */
    public int getGear() {
        return gear;
    }

    /**
     * Changes the gear of the automobile by the specified amount.
     * 
     * @param g the amount to change the gear by
     * @return the new gear of the automobile
     */
    public int changeGear(int g) {
        gear += g;
        return gear;
    }
}
