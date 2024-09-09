package com.sunilbooks.selflearnjava.thread;

/**
 * Represents a message object used for inter-thread communication between
 * {@code WaiterThread} and {@code NotifierThread}.
 * 
 * <p>
 * This class is used to facilitate communication between threads by providing a
 * way to pass messages between them. The {@code WaiterThread} acquires a lock
 * (monitor) on the {@code Message} object and waits for a notification to
 * process the message. The {@code NotifierThread} notifies the
 * {@code WaiterThread} to process the message by calling {@code notify()} or
 * {@code notifyAll()} methods on the {@code Message} object.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Message {

	/**
	 * The message content.
	 */
	private String msg;

	/**
	 * Constructs a {@code Message} object with the specified message string.
	 * 
	 * @param str the message string
	 */
	public Message(String str) {
		this.msg = str;
	}

	/**
	 * Returns the message string.
	 * 
	 * @return the message string
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * Sets the message string.
	 * 
	 * @param str the message string to set
	 */
	public void setMsg(String str) {
		this.msg = str;
	}

}
