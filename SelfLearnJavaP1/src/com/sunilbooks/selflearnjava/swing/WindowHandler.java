package com.sunilbooks.selflearnjava.swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 * Demonstrates the use of a WindowListener to handle various window events.
 * <p>
 * This class implements WindowListener to listen for and respond to different
 * window events such as opening, closing, activating, deactivating, iconifying,
 * and deiconifying. Each event triggers a corresponding message to be printed
 * to the console.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class WindowHandler implements WindowListener {

	/**
	 * Called when the window is opened.
	 * 
	 * @param e the WindowEvent representing the event
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Opened");
	}

	/**
	 * Called when the window is activated.
	 * 
	 * @param e the WindowEvent representing the event
	 */
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Activated");
	}

	/**
	 * Called when the window is deactivated.
	 * 
	 * @param e the WindowEvent representing the event
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Minimized");
	}

	/**
	 * Called when the window is deiconified (restored to its normal state).
	 * 
	 * @param e the WindowEvent representing the event
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Maximized");
	}

	/**
	 * Called when the window is iconified (minimized).
	 * 
	 * @param e the WindowEvent representing the event
	 */
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Iconified");
	}

	/**
	 * Called when the window is closing.
	 * 
	 * @param e the WindowEvent representing the event
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing");
	}

	/**
	 * Called when the window is closed.
	 * 
	 * @param e the WindowEvent representing the event
	 */
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Closed");
	}

	/**
	 * The entry point of the application. Creates a JFrame and adds a WindowHandler
	 * to it to handle various window events.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// Create a JFrame with a title
		JFrame frame = new JFrame("Demo WindowListener");
		frame.addWindowListener(new WindowHandler());

		// Set default close operation, window size, and make the window visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
}
