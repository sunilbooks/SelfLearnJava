package com.sunilbooks.selflearnjava.impclasses;

public class TestMath {

    /**
     * Demonstrates the use of various key methods from the {@code java.lang.Math} class.
     * 
     * Methods used include:
     * <ul>
     *   <li>{@code Math.max(int, int)}: Finds the maximum of two integers.</li>
     *   <li>{@code Math.min(int, int)}: Finds the minimum of two integers.</li>
     *   <li>{@code Math.abs(double)}: Returns the absolute value of a number.</li>
     *   <li>{@code Math.exp(double)}: Returns Euler's number raised to the power of a value.</li>
     *   <li>{@code Math.random()}: Returns a random double between 0.0 and 1.0.</li>
     *   <li>{@code Math.sqrt(double)}: Returns the square root of a value.</li>
     *   <li>{@code Math.ceil(double)}: Returns the smallest integer greater than or equal to a value.</li>
     * </ul>
     */
    public static void main(String[] args) {

        int maxVal = Math.max(2, 5);
        int minVal = Math.min(2, 5);
        double absoluteVal = Math.abs(-3.7);
        double expVal = Math.exp(10);
        double randomNo = Math.random();
        double sqrtVal = Math.sqrt(4);
        double ceilVal = Math.ceil(5.4);

        System.out.println("Math functions");
        System.out.println("Max 2,5: " + maxVal);
        System.out.println("Min 2,5: " + minVal);
        System.out.println("Absolute -3.7: " + absoluteVal);
        System.out.println("Exp 10: " + expVal);
        System.out.println("Random Number :" + randomNo);
        System.out.println("Square Root: " + sqrtVal);
        System.out.println("Smallest Integer greater than 5.4 : " + ceilVal);

    }

}
