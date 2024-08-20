package com.sunilbooks.selflearnjava.array;

/**
 * This class demonstrates how to get the class name of an array in Java.
 * The example uses a character array and prints its class name.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright Copyright (c) Sunil Sahu
 * @website www.sunilbooks.com
 */

public class ClassOfArray {

    public static void main(String[] args) {

        char[] myArray = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
        String name = myArray.getClass().getName();
        System.out.println("Name of char[] array is " + name);

    }
}
