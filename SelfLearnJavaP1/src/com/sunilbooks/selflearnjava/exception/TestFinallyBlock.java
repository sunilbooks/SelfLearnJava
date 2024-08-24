package com.sunilbooks.selflearnjava.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestFinallyBlock {

    /**
     * Reads data from a file and prints it to the console. The {@code finally}
     * block is used to ensure that the file resource is properly closed after
     * the operations are completed.
     *
     * @throws IOException if an I/O error occurs.
     */
    public static void main(String[] args) throws IOException {

        InputStream input = null;

        try {
            input = new FileInputStream("file.txt");
            int data = input.read();
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
