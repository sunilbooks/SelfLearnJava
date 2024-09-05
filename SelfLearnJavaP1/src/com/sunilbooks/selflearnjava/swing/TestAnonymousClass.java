package com.sunilbooks.selflearnjava.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Demonstrates the use of anonymous inner classes in Swing.
 * <p>
 * This class creates a JFrame with a JButton. An anonymous inner class is used
 * to handle mouse click events on the button, printing a message to the console
 * when the button is clicked.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class TestAnonymousClass {

	/**
	 * The entry point of the application. Creates a JFrame with a JButton and
	 * attaches an anonymous inner class to handle mouse click events on the button.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// Create a JFrame
		JFrame f = new JFrame();

		// Create a JButton and add an anonymous MouseAdapter to handle mouse events
		JButton b = new JButton("Send");
		b.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse Clicked");
			}
		});

		// Add the button to the frame
		f.add(b);

		// Set the frame properties
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
