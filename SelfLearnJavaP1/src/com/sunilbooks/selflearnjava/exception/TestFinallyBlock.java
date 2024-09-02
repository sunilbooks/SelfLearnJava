package com.sunilbooks.selflearnjava.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Demonstrates the use of the `finally` block to ensure that resources are 
 * properly cleaned up, regardless of whether an exception occurs. This example 
 * shows how to use the `finally` block to close a file input stream.
 * 
 * The program reads data from a file and prints it to the console. Regardless 
 * of whether an exception occurs during file operations, the `finally` block 
 * ensures that the file input stream is closed properly.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class TestFinallyBlock {

    /**
     * The entry point of the application. Opens a file, reads its content, 
     * and prints it to the console. Ensures that the file input stream is 
     * closed in the `finally` block to prevent resource leaks.
     * 
     * @param args Command line arguments (not used here).
     * @throws IOException If an I/O error occurs while reading the file.
     */
    public static void main(String[] args) throws IOException {

        InputStream input = null;

        try {
            // Open file input stream
            input = new FileInputStream("file.txt");
            int data = input.read();
            // Read and print file content
            while (data != -1) {
                System.out.print((char) data);  
                data = input.read();
            }
        } finally {
            // Cleanup file resource
            if (input != null) {
                input.close();
            }
        }
    }

}
 