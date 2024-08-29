package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code Employee} class extends the {@code Person} class and represents 
 * an employee with a salary attribute. It provides constructors to initialize 
 * an employee with or without a salary, address, and name, and methods to get 
 * and set the salary.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Person
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Employee extends Person {

    /**
     * The salary of the employee.
     */
    private float salary = 0;

    /**
     * Default constructor for the {@code Employee} class.
     */
    public Employee() {
    }

    /**
     * Parameterized constructor for the {@code Employee} class.
     * Initializes the employee with a salary, address, and name.
     * 
     * @param sal the salary of the employee
     * @param add the address of the employee
     * @param name the name of the employee
     */
    public Employee(float sal, String add, String name) {
        super(name, add);
        this.salary = sal;
    }

    /**
     * Gets the salary of the employee.
     * 
     * @return the salary of the employee
     */
    public float getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     * 
     * @param salary the new salary of the employee
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

}
