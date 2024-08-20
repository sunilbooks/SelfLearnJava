package com.sunilbooks.selflearnjava.array;

/**
 * This class demonstrates basic operations with arrays in Java. 
 * The example includes creating an array, assigning values to array elements, 
 * accessing elements, determining the size of the array, and printing the class 
 * name of the array.
 * 
 * The operations performed include:
 * - Declaring and initializing an array
 * - Assigning values to array elements
 * - Accessing specific elements from the array
 * - Determining the size of the array
 * - Printing the class name of the array
 * - Iterating over and printing all elements of the array
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright Copyright (c) Sunil Sahu
 * @website www.sunilbooks.com
 */

public class TestArray {

    public static void main(String[] args) {

        // Declares an array of integers
        int[] table;

        // Allocates memory for 10 integers
        table = new int[10];

        // Assign values to the array elements
        table[0] = 2;
        table[1] = 4;
        table[2] = 6;
        table[3] = 8;
        table[4] = 10;
        table[5] = 12;
        table[6] = 14;
        table[7] = 16;
        table[8] = 18;
        table[9] = 20;

        // Access the 5th element of the array
        int ele = table[4];
        System.out.println("5th Element of Table: " + ele);

        // Get the size of the array
        int size = table.length;
        System.out.println("Size of array: " + size);

        // Get the class name of the array
        String name = table.getClass().getName();
        System.out.println("Class name of Array: " + name);

        // Print all elements of the array
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + i + ": " + table[i]);
        }
    }
}
