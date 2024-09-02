package com.sunilbooks.selflearnjava.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the use of wildcards with generics.
 * Includes methods for displaying and summing a list of numbers with upper bounds.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WildcardsTest {

    /**
     * Displays each element in a list of type that extends Number.
     * The list can contain any subclass of Number.
     * 
     * @param list a list of elements that extend Number
     */
    public static void display(List<? extends Number> list) {
        for (Number e : list) {
            System.out.println(e);
        }
    }

    /**
     * Computes the sum of elements in a list of type that extends Number.
     * The list can contain any subclass of Number, and the sum is computed using double precision.
     * 
     * @param list a list of elements that extend Number
     * @return the sum of the elements in the list
     */
    public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number e : list) {
            total += e.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        display(l);
        System.out.println(sum(l));
    }

}
