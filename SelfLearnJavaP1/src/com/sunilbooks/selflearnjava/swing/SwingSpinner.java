package com.sunilbooks.selflearnjava.swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 * A Swing application that demonstrates the use of the JSpinner component.
 * <p>
 * This class creates a JFrame window containing a JSpinner with a GridLayout.
 * The spinner allows users to select numeric values within a range with step
 * increments.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingSpinner {

	/**
	 * The entry point of the application. Creates and displays a JFrame containing
	 * a JSpinner.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing Spinner");
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new GridLayout(1, 2));

		JLabel label = new JLabel("  Exp : ");
		panel.add(label);

		// Create a spinner
		JSpinner spinner = new JSpinner();
		spinner.setSize(20, 30);
		// Set the starting step, lower bound, upper bound, and step size
		panel.add(spinner);

		// Set a default close operation for the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Size the window to fit its contents
		frame.pack();
		// Make the window visible to the user
		frame.setVisible(true);
	}
}
