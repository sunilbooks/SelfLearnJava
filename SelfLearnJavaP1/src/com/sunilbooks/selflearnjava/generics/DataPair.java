package com.sunilbooks.selflearnjava.generics;

/**
 * A generic class that holds a pair of objects with different types.
 * The types of the two objects are specified by type parameters {@code K} 
 * and {@code V}, which represent the key and value, respectively. 
 * Two type arguments must be provided when creating an instance of {@code DataPair}.
 * 
 * @param <K> The type of the key object.
 * @param <V> The type of the value object.
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class DataPair<K, V> {

    private K key; // Key object of type K
    private V value; // Value object of type V

    /**
     * Constructs a {@code DataPair} object with the specified key and value.
     * 
     * @param key The key object of type {@code K}.
     * @param val The value object of type {@code V}.
     */
    public DataPair(K key, V val) {
        this.key = key;
        this.value = val;
    }

    /**
     * Returns the key of this pair.
     * 
     * @return The key of type {@code K}.
     */
    public K getKey() {
        return key;
    }

    /**
     * Returns the value of this pair.
     * 
     * @return The value of type {@code V}.
     */
    public V getValue() {
        return value;
    }

    /**
     * Displays the data type of the key and value objects.
     * Prints the class names of the types {@code K} and {@code V} to the console.
     */
    public void showType() {
        System.out.println("Type of K is " + key.getClass().getName());
        System.out.println("Type of V is " + value.getClass().getName());
    }

    /**
     * Demonstrates the usage of the {@code DataPair} class with different types.
     * Creates instances of {@code DataPair} for account and marks information 
     * and displays their types and values.
     * 
     * @param args Command line arguments (not used here).
     */
    public static void main(String[] args) {

        // Keep Account Information
        System.out.println("\nAccount Information");

        DataPair<String, Double> account = new DataPair<>("SBI-100", 20.5);
        account.showType(); // Show the type of data used by account.
        String accNum = account.getKey(); // No type cast is required.
        double accBal = account.getValue();
        System.out.println(accNum + " : " + accBal);

        // Keep Marksheet Information
        System.out.println("\nMarksheet Information");

        DataPair<String, Integer> marksheet = new DataPair<>("RN_786", 98);
        marksheet.showType(); // Show the type of data used by marksheet.
        String rollNo = marksheet.getKey(); // No type cast is required.
        int marks = marksheet.getValue(); // No type cast is required.
        System.out.println(rollNo + " : " + marks);
    }

}
