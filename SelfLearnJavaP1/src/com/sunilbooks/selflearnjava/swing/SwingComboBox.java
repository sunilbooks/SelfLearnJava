package com.sunilbooks.selflearnjava.swing;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A simple Swing application that demonstrates the use of a JComboBox.
 * <p>
 * This class creates a JFrame containing a JLabel and a JComboBox. The
 * JComboBox is used to provide a dropdown menu for selecting gender, with
 * options "Male" and "Female". The components are laid out using a FlowLayout.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingComboBox {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = (JPanel) frame.getContentPane();

		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);

		JLabel label = new JLabel("Gender : ");
		panel.add(label);

		String gender[] = { "Male", "Female" };
		JComboBox<String> comboBox = new JComboBox<>(gender);
		panel.add(comboBox);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();

	}
}
