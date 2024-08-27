package com.sunilbooks.selflearnjava.collection;

import java.util.Comparator;

/**
 * Comparator for comparing two Employee objects by their last name and first name.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class EmployeeByNameComparator implements Comparator<Employee> {

    /**
     * Compares two Employee objects first by their last name, and if the last names are
     * equal, then by their first name.
     * 
     * @param e1 the first Employee to be compared
     * @param e2 the second Employee to be compared
     * @return a negative integer, zero, or a positive integer as the first Employee's
     *         last name is less than, equal to, or greater than the second Employee's last name;
     *         or if the last names are equal, as the first Employee's first name is less than,
     *         equal to, or greater than the second Employee's first name
     */
    @Override
    public int compare(Employee e1, Employee e2) {
        // Compare Last Name
        int i = e1.getLastName().compareTo(e2.getLastName());

        // If last name is equal then compare First Name
        if (i == 0) {
            i = e1.getFirstName().compareTo(e2.getFirstName());
        }
        return i;
    }
}
