package com.sunilbooks.selflearnjava.swing;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A Swing application that demonstrates the use of JCheckBox component.
 * <p>
 * This class creates a simple JFrame window containing a JCheckBox with the
 * label "Has Account?". The checkbox is added to a JPanel with a FlowLayout.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingRadioButton {

	/**
	 * The entry point of the application. Creates and displays a JFrame containing
	 * a JCheckBox.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing CheckBox");
		JPanel panel = (JPanel) frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);

		// Create Checkbox
		JCheckBox checkBox = new JCheckBox("Has Account?");
		panel.add(checkBox);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
}
