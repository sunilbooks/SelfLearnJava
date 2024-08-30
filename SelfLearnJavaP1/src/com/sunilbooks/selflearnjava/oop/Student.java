package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code Student} class extends the {@code Person} class and represents a student with additional attributes.
 * It includes a roll number and marks, and provides methods to get and set these attributes. 
 * It also provides a static method to get a default age.
 * 
 * <p>Attributes:</p>
 * <ul>
 *     <li>{@code rollNo} - The roll number of the student.</li>
 *     <li>{@code marks} - The marks obtained by the student.</li>
 * </ul>
 * 
 * <p>Methods:</p>
 * <ul>
 *     <li>{@code getRollNo} - Gets the roll number of the student.</li>
 *     <li>{@code setRollNo} - Sets the roll number of the student.</li>
 *     <li>{@code getMarks} - Gets the marks obtained by the student.</li>
 *     <li>{@code setMarks} - Sets the marks obtained by the student.</li>
 *     <li>{@code getAge} - Returns a default age for a student.</li>
 * </ul>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @see Person
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Student extends Person {

    /**
     * The roll number of the student.
     */
    private String rollNo = null;

    /**
     * The marks obtained by the student.
     */
    private int marks = 0;

    /**
     * Returns a default age for a student. This method is static and does not
     * depend on any instance variables.
     * 
     * @return the default age of a student
     */
    public static int getAge() {
        return 10;
    }

    /**
     * Gets the roll number of the student.
     * 
     * @return the roll number of the student
     */
    public String getRollNo() {
        return rollNo;
    }

    /**
     * Sets the roll number of the student.
     * 
     * @param rollNo the new roll number of the student
     */
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * Gets the marks obtained by the student.
     * 
     * @return the marks obtained by the student
     */
    public int getMarks() {
        return marks;
    }

    /**
     * Sets the marks obtained by the student.
     * 
     * @param marks the new marks obtained by the student
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }

}
