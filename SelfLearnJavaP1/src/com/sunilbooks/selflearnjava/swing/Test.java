package com.sunilbooks.selflearnjava.swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * A Swing application that demonstrates the use of message dialog boxes using
 * {@link JOptionPane}.
 * <p>
 * This class creates a JFrame and displays a message dialog box that informs
 * the user that data has been saved.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class Test {

	/**
	 * The entry point of the application. Creates a JFrame and displays a message
	 * dialog box.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// Create a JFrame
		JFrame frame = new JFrame();

		// Display a message dialog box
		JOptionPane.showMessageDialog(frame, "Data is saved !");

		// Set a default close operation for the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size of the window
		frame.setSize(400, 200);
		// Make the window visible to the user
		frame.setVisible(true);
	}
}
