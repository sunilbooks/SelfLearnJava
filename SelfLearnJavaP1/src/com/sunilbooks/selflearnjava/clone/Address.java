package com.sunilbooks.selflearnjava.clone;

/**
 * The {@code Address} class implements the {@code Cloneable} interface to allow
 * shallow cloning of its instances using the {@code clone()} method. This means
 * that the cloned object will have the same values for its fields as the
 * original object, but any references to other objects will not be deep copied.
 * 
 * @version 1.1
 * @since 16 Nov 2014 author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Address implements Cloneable {

	/**
	 * Name of the street for the address.
	 */
	public String street = null;

	/**
	 * Name of the city for the address.
	 */
	public String city = null;

	/**
	 * Postal code (PIN) for the address.
	 */
	public String pin = null;

	/**
	 * Default constructor that initializes the address with default values. The
	 * street is set to "123 Main St", city to "Anytown", and pin to "12345".
	 */
	public Address() {
		street = "123 Main St";
		city = "Anytown";
		pin = "12345";
    }

	/**
	 * Creates and returns a shallow copy of this object. The {@code clone()} method
	 * is overridden to make it public, allowing the {@code Address} class to be
	 * cloned. This method returns a shallow copy, meaning the primitive fields are
	 * copied directly, and references to objects are copied as references (not deep
	 * copies).
	 * 
	 * @return a shallow copy of this {@code Address} object.
	 * @throws CloneNotSupportedException if the object's class does not support the
	 *                                    {@code Cloneable} interface. Subclasses
	 *                                    that override the {@code clone} method can
	 *                                    also throw this exception to indicate that
	 *                                    an instance cannot be cloned.
	 */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
