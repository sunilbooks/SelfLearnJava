package com.sunilbooks.selflearnjava.basic;

/**
 * Parses Strings into Primitive Data Types using Wrapper classes.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ParseStringsIntoPrimitiveData {

    public static void main(String[] args) {

        // Parsing a String to a byte
        byte bt = Byte.parseByte("1");
        System.out.println("byte value " + bt);

        // Parsing a String to a short
        short s = Short.parseShort("2");
        System.out.println("short value " + s);

        // Parsing a String to an int
        int i = Integer.parseInt("3");
        System.out.println("int value " + i);

        // Parsing a String to a long
        long l = Long.parseLong("4444");
        System.out.println("long value " + l);

        // Parsing a String to a float
        float f = Float.parseFloat("5.2");
        System.out.println("float value " + f);

        // Parsing a String to a double
        double d = Double.parseDouble("5.5");
        System.out.println("double value " + d);

        // Parsing a String to a boolean
        boolean b = Boolean.parseBoolean("true");
        System.out.println("boolean value " + b);
    }
}
