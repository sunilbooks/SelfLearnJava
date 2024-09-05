package com.sunilbooks.selflearnjava.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Demonstrates the use of a local class for handling mouse events.
 * <p>
 * This class creates a JFrame with a JButton. It uses a local class defined
 * within the main method to handle mouse click events on the button.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestLocalClass {

	/**
	 * The entry point of the application. Creates a JFrame and a JButton, and uses
	 * a local class to handle mouse click events on the button.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// Define a local class for handling mouse events
		class LocalClass extends MouseAdapter {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse Clicked");
			}
		}

		// Create a JFrame
		JFrame f = new JFrame();

		// Instantiate the local class
		LocalClass h = new LocalClass();

		// Create a JButton and add the mouse listener
		JButton b = new JButton("Send");
		b.addMouseListener(h);
		f.add(b);

		// Set the default close operation
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make the JFrame visible
		f.setVisible(true);
	}
}
