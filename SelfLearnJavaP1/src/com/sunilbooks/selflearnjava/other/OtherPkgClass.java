package com.sunilbooks.selflearnjava.other;

import com.sunilbooks.selflearnjava.oop.MyClass;

/**
 * The {@code OtherPkgClass} demonstrates the visibility of class members
 * inherited from another package. It attempts to access the attributes
 * of {@code MyClass}, highlighting the accessibility of public, protected,
 * and default attributes.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class OtherPkgClass {

    /**
     * The entry point of the application. Attempts to access the attributes
     * of {@code MyClass} and demonstrates which are accessible.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        MyClass c = new MyClass();
        // System.out.println(c.defaultAttribute); // Compilation error
        // System.out.println(c.protectedAttribute); // Compilation error
        System.out.println(c.publicAttribute);
    }
}

/**
 * The {@code OtherPkgChild} class extends {@code MyClass} and provides
 * methods to access protected and default attributes. Demonstrates
 * the accessibility of these attributes in a subclass from a different package.
 * 
 * @version 1.1
 * @since 16 Nov 2014
 */
class OtherPkgChild extends MyClass {

    /**
     * Returns the value of the protected attribute inherited from {@code MyClass}.
     * 
     * @return The value of the protected attribute.
     */
    public int getProtectedValue() {
        return protectedAttribute;
    }

    /**
     * Attempts to return the value of the default attribute inherited from {@code MyClass}.
     * Since the default attribute is not accessible in a subclass from a different package,
     * this method returns 0.
     * 
     * @return Always returns 0.
     */
    public int getDefaultValue() {
        // return defaultAttribute; // Compilation error
        return 0;
    }
}
