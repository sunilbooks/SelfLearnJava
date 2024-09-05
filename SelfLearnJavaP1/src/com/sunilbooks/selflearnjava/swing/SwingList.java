package com.sunilbooks.selflearnjava.swing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 * A simple Swing application that demonstrates the use of a JList component.
 * <p>
 * This class creates a JFrame containing a JLabel and a JList. The JLabel is
 * positioned at the top of the window, while the JList displays a list of
 * skills including "JAVA", ".NET", "PHP", and "VB". The layout is managed using
 * BorderLayout.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingList {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing List");
		JPanel panel = (JPanel) frame.getContentPane();
		BorderLayout layout = new BorderLayout();
		panel.setLayout(layout);

		JLabel label = new JLabel("Skill :");
		panel.add(label, BorderLayout.NORTH);

		// String array is created
		String number[] = { "JAVA", ".NET", "PHP", "VB" };
		// list is created
		JList<String> list = new JList<>(number);

		// Add list to the panel
		panel.add(list, BorderLayout.CENTER);

		// Set a event: when window is closed, it is removed from memory
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make the window visible to the user
		frame.setVisible(true);
		frame.pack();

	}

}
