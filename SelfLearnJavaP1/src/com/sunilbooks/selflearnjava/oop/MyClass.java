package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code MyClass} class demonstrates the use of different access specifiers 
 * in Java. It contains attributes with various access levels to illustrate 
 * the visibility and accessibility of each access specifier.
 * 
 * <p>The class includes:</p>
 * <ul>
 *     <li>{@code privateAttribute} - Private attribute accessible only within this class.</li>
 *     <li>{@code defaultAttribute} - Default (package-private) attribute accessible within the same package.</li>
 *     <li>{@code protectedAttribute} - Protected attribute accessible within the same package and subclasses.</li>
 *     <li>{@code publicAttribute} - Public attribute accessible from any class.</li>
 * </ul>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyClass {

    /**
     * Private attribute accessible only within this class.
     */
    private int privateAttribute = 0;

    /**
     * Default (package-private) attribute accessible within the same package.
     */
    int defaultAttribute = 0;

    /**
     * Protected attribute accessible within the same package and subclasses.
     */
    protected int protectedAttribute = 0;

    /**
     * Public attribute accessible from any class.
     */
    public int publicAttribute = 0;

}
