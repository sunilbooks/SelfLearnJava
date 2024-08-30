package com.sunilbooks.selflearnjava.oop;

/**
 * Demonstrates the use of another class within the same package.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ThisPkgOtherClass {

    /**
     * Main method to create an instance of {@code MyClass} and
     * prints its attributes with different access specifiers.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {

        MyClass c = new MyClass();
        System.out.println(c.defaultAttribute);
        System.out.println(c.protectedAttribute);
        System.out.println(c.publicAttribute);
    }

}
