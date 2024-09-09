package com.sunilbooks.selflearnjava.swing;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * A Swing application that demonstrates the use of the JTextArea component.
 * <p>
 * This class creates a JFrame window containing a JTextArea with a JLabel above
 * it. The JTextArea allows users to enter multi-line text.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingTextArea {

	/**
	 * The entry point of the application. Creates and displays a JFrame containing
	 * a JTextArea.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing TextArea Example");

		JPanel pane = (JPanel) frame.getContentPane();
		pane.setLayout(new BorderLayout());

		JLabel label = new JLabel("Email : ");
		pane.add(label, BorderLayout.NORTH);

		JTextArea text = new JTextArea(5, 80);
		pane.add(text, BorderLayout.CENTER);

		// Set a default close operation for the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size of the window
		frame.setSize(400, 200);
		// Make the window visible to the user
		frame.setVisible(true);
	}
}
