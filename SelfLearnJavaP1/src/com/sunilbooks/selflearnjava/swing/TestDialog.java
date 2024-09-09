package com.sunilbooks.selflearnjava.swing;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates the creation and display of a simple dialog window in Swing.
 * <p>
 * This class creates a JFrame with a JButton. It also creates a JDialog with a
 * title and a button, displaying the dialog on top of the main window.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestDialog {

	/**
	 * The entry point of the application. Creates a JFrame and a JDialog. The
	 * JFrame contains a JButton, while the JDialog displays an "Alarm!!" message
	 * with an "Ok" button.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// Create a JFrame and set the title
		JFrame frame = new JFrame("My First Window");

		// Get the default content pane
		JPanel pane = (JPanel) frame.getContentPane();

		// Create a JButton and add it to the JPanel
		JButton b = new JButton("Click Me");
		pane.add(b);

		// Set the default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the size of the JFrame
		frame.setSize(200, 100);

		// Make the JFrame visible
		frame.setVisible(true);

		// Create a JDialog and set its title
		JDialog dialog = new JDialog();
		dialog.setTitle("Alarm!!");

		// Add a JButton to the JDialog
		dialog.add(new JButton("Ok"));

		// Pack and display the JDialog
		dialog.pack();
		dialog.setVisible(true);
	}
}
