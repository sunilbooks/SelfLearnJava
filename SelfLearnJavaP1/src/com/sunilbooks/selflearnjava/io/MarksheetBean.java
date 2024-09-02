package com.sunilbooks.selflearnjava.io;

import java.io.Serializable;

/**
 * Represents a student's marksheet with serializable attributes.
 * <p>
 * This class contains fields for storing a student's name and marks in various
 * subjects. It also includes transient fields for calculated values such as
 * total and percentage, which are not serialized.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MarksheetBean implements Serializable {

	private static final long serialVersionUID = 1L; // Added serialVersionUID for serialization compatibility

	private String name;
	private int maths;
	private int physics;
	private int chemistry;

	// transient variables will not be serialized
	/**
	 * The total marks, calculated based on maths, physics, and chemistry. This
	 * field is transient and will not be serialized.
	 */
	private transient int total;

	/**
	 * The percentage of marks calculated from the total. This field is transient
	 * and will not be serialized.
	 */
	private transient double percentage;

	/**
	 * A temporary variable for internal use, which is transient and will not be
	 * serialized.
	 */
	private transient int temp;

	/**
	 * Gets the name of the student.
	 * 
	 * @return the name of the student
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the student.
	 * 
	 * @param name the name of the student
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the marks in mathematics.
	 * 
	 * @return the marks in mathematics
	 */
	public int getMaths() {
		return maths;
	}

	/**
	 * Sets the marks in mathematics.
	 * 
	 * @param maths the marks in mathematics
	 */
	public void setMaths(int maths) {
		this.maths = maths;
	}

	/**
	 * Gets the marks in physics.
	 * 
	 * @return the marks in physics
	 */
	public int getPhysics() {
		return physics;
	}

	/**
	 * Sets the marks in physics.
	 * 
	 * @param physics the marks in physics
	 */
	public void setPhysics(int physics) {
		this.physics = physics;
	}

	/**
	 * Gets the marks in chemistry.
	 * 
	 * @return the marks in chemistry
	 */
	public int getChemistry() {
		return chemistry;
	}

	/**
	 * Sets the marks in chemistry.
	 * 
	 * @param chemistry the marks in chemistry
	 */
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	/**
	 * Gets the temporary value.
	 * 
	 * @return the temporary value
	 */
	public int getTemp() {
		return temp;
	}

	/**
	 * Sets the temporary value.
	 * 
	 * @param temp the temporary value
	 */
	public void setTemp(int temp) {
		this.temp = temp;
	}

	/**
	 * Calculates the total marks by summing up marks in mathematics, physics, and
	 * chemistry. This method also updates the transient {@code total} field.
	 * 
	 * @return the total marks
	 */
	public int getTotal() {
		total = maths + physics + chemistry;
		return total;
	}

	/**
	 * Calculates the percentage based on the total marks. This method updates the
	 * transient {@code percentage} field.
	 * 
	 * @return the percentage of marks
	 */
	public double getPercentage() {
		percentage = (total / 3.0); // Changed to division by 3.0 to ensure double result
		return percentage;
	}
}
