package com.sunilbooks.selflearnjava.oop;

/**
 * The {@code SocialWorker} interface defines a contract for a social worker with 
 * a method that represents an action of helping others. Classes implementing this 
 * interface should provide a concrete implementation of the {@code helpToOthers} 
 * method.
 * 
 * <p>Methods:</p>
 * <ul>
 *     <li>{@code helpToOthers} - Represents an action of helping others.</li>
 * </ul>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public interface SocialWorker {

    /**
     * Represents an action of helping others. Implementing classes should define 
     * the specific way in which they help others.
     */
    public void helpToOthers();
}
