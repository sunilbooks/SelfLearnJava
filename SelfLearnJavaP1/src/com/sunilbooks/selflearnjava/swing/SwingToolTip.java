package com.sunilbooks.selflearnjava.swing;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A Swing application that demonstrates the use of tooltips in Swing
 * components.
 * <p>
 * This class creates a JFrame containing a JButton with a tooltip. The tooltip
 * provides additional information when the user hovers over the button.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingToolTip {

	/**
	 * The entry point of the application. Creates and displays a JFrame containing
	 * a JButton with a tooltip.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing ToolTip Example");
		JPanel pane = (JPanel) frame.getContentPane();
		pane.setLayout(new FlowLayout());

		// Create a JButton
		JButton button = new JButton("Save");

		// Attach a tooltip to the JButton
		button.setToolTipText("Click here to save File");
		pane.add(button);

		// Set a default close operation for the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Make the window visible to the user
		frame.setVisible(true);
		// Pack the frame to fit the components
		frame.pack();
	}
}
