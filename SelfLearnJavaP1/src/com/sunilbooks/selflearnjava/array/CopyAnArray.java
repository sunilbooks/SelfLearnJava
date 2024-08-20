package com.sunilbooks.selflearnjava.array;

/**
 * The {@code CopyAnArray} class demonstrates how to copy elements from one array to another
 * using the {@link System#arraycopy(Object, int, Object, int, int)} method.
 * <p>
 * In this example, a portion of a character array is copied into another array,
 * and the result is printed to the console.
 * </p>
 * 
 * @author Sunil Sahu
 * @version 1.0
 * @since 16 Nov 2014
 * @see <a href="http://www.sunilbooks.com">www.sunilbooks.com</a>
 */
public class CopyAnArray {

    /**
     * The main method executes the array copy demonstration.
     * <p>
     * It creates a source array containing the characters of the word "SUNRAYS",
     * then copies a subset of this array into a destination array using 
     * {@code System.arraycopy}, and finally prints the contents of the destination array.
     * </p>
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        char[] copyFrom = { 'S', 'U', 'N', 'R', 'A', 'Y', 'S' };
        char[] copyTo = new char[4];

        /**
         * Copies 4 elements from the {@code copyFrom} array starting at index 3
         * to the {@code copyTo} array starting at index 0.
         */
        System.arraycopy(copyFrom, 3, copyTo, 0, 4);

        System.out.println(new String(copyTo)); // Outputs: RAYS
    }
}
