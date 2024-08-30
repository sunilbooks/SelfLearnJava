package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code RichMan} interface defines a contract for a rich person with methods 
 * that represent activities or actions that a wealthy individual might engage in.
 * 
 * <p>Implementing classes should provide concrete implementations for the following 
 * methods:</p>
 * <ul>
 *     <li>{@code earnMony} - Method to represent earning money.</li>
 *     <li>{@code donation} - Method to represent making donations.</li>
 *     <li>{@code party} - Method to represent throwing or attending parties.</li>
 * </ul>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public interface RichMan {

    /**
     * Method to represent earning money. Implementing classes should define 
     * the specific way in which money is earned.
     */
    public void earnMony();

    /**
     * Method to represent making donations. Implementing classes should define 
     * the specifics of how donations are made.
     */
    public void donation();

    /**
     * Method to represent attending or throwing parties. Implementing classes 
     * should define the details of how parties are organized or attended.
     */
    public void party();
}
