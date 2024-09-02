package com.sunilbooks.selflearnjava.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * An example of the {@code Externalizable} interface that demonstrates custom
 * serialization and deserialization of a transient variable.
 * <p>
 * This class implements the {@code Externalizable} interface and provides
 * custom methods to serialize and deserialize its fields. Unlike {@code Serializable},
 * {@code Externalizable} allows explicit control over the serialization process.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MarksheetBeanExt implements Externalizable {

	private String name;
	private int maths;
	private int physics;
	private int chemistry;

	// Transient variables will not be automatically serialized
	/**
	 * Total is a calculated transient field. This field is not serialized
	 * by default, but it is explicitly handled in the {@code writeExternal}
	 * method and re-calculated in {@code readExternal}.
	 */
	 transient int total;

	/**
	 * Percentage is a calculated transient field. This field is not serialized
	 * by default, but it is explicitly handled in the {@code writeExternal}
	 * method and re-calculated in {@code readExternal}.
	 */
	transient double percentage;

	/**
	 * A transient temporary variable used during serialization and
	 * deserialization. It is handled explicitly in the custom methods.
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
	 * Calculates the total marks by summing up marks in mathematics, physics,
	 * and chemistry. This method updates the transient {@code total} field.
	 * 
	 * @return the total marks
	 */
	public int getTotal() {
		total = maths + physics + chemistry;
		return total;
	}

	/**
	 * Calculates the percentage based on the total marks. This method updates
	 * the transient {@code percentage} field.
	 * 
	 * @return the percentage of marks
	 */
	public double getPercentage() {
		percentage = total / 3.0; // Changed to division by 3.0 to ensure double result
		return percentage;
	}

	/**
	 * Reads the object state from the input stream. This method handles
	 * the deserialization of non-transient fields and explicitly reads
	 * transient fields that need to be restored.
	 * 
	 * @param in the input stream from which the object is read
	 * @throws IOException if an I/O error occurs
	 * @throws ClassNotFoundException if the class of a serialized object cannot be found
	 */
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		physics = in.readInt();
		chemistry = in.readInt();
		maths = in.readInt();
		// Deserialize transient variable
		temp = in.readInt();
	}

	/**
	 * Writes the object state to the output stream. This method handles
	 * the serialization of non-transient fields and explicitly writes
	 * transient fields that need to be stored.
	 * 
	 * @param out the output stream to which the object is written
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(physics);
		out.writeInt(chemistry);
		out.writeInt(maths);
		// Serialize transient variable
		out.writeInt(temp);
	}
}
