package com.sunilbooks.selflearnjava.array;

/**
 * This class demonstrates basic operations with multi-dimensional arrays in Java.
 * The example includes the creation and manipulation of two-dimensional, 
 * three-dimensional, and four-dimensional arrays. It also shows how to 
 * initialize arrays and access their elements.
 * 
 * The operations performed include:
 * - Declaring and initializing a two-dimensional array
 * - Assigning values to elements of the two-dimensional array
 * - Iterating over the two-dimensional array and printing its contents
 * - Creating and initializing three-dimensional and four-dimensional arrays
 * - Accessing specific elements within multi-dimensional arrays
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright Copyright (c) Sunil Sahu
 * @website www.sunilbooks.com
 */

public class TestMultdimensionArray {

    public static void main(String[] args) {

        // Declares a two-dimensional array of integers with 10 rows and 2 columns
        int[][] tables = new int[10][2];

        // Assign values to the first column (index 0) for each row (Row 1-10)
        tables[0][0] = 2;
        tables[1][0] = 4;
        tables[2][0] = 6;
        tables[3][0] = 8;
        tables[4][0] = 10;
        tables[5][0] = 12;
        tables[6][0] = 14;
        tables[7][0] = 16;
        tables[8][0] = 18;
        tables[9][0] = 20;

        // Assign values to the second column (index 1) for each row (Row 1-10)
        tables[0][1] = 3;
        tables[1][1] = 6;
        tables[2][1] = 9;
        tables[3][1] = 12;
        tables[4][1] = 15;
        tables[5][1] = 18;
        tables[6][1] = 21;
        tables[7][1] = 24;
        tables[8][1] = 27;
        tables[9][1] = 30;

        // Print the contents of the two-dimensional array
        System.out.println("Tables ");
        System.out.println("#2\t#3");

        for (int row = 0; row < tables.length; row++) {
            for (int col = 0; col < tables[0].length; col++) {
                System.out.print(tables[row][col] + "\t");
            }
            System.out.println();
        }

        // Declares a three-dimensional array of integers with dimensions 10x3x2
        int[][][] threeD = new int[10][3][2];
        
        // Assign a value to a specific element in the three-dimensional array
        threeD[0][1][1] = 100;

        // Declares a four-dimensional array of integers with dimensions 10x3x2x3
        int[][][][] fourD = new int[10][3][2][3];
        
        // Assign a value to a specific element in the four-dimensional array
        fourD[0][1][1][0] = 100;
    }
}
