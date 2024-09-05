package com.sunilbooks.selflearnjava.swing;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A simple Swing application that demonstrates the use of a JCheckBox.
 * <p>
 * This class creates a JFrame containing a single JCheckBox, which is laid out
 * using a FlowLayout. The JCheckBox is labeled "Has Account?" and allows the
 * user to make a selection.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingCheckBox {
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
