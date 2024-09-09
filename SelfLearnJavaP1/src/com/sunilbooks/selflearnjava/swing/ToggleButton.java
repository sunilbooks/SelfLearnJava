package com.sunilbooks.selflearnjava.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates a toggle button that switches between "ON" and "OFF" states when
 * clicked.
 * <p>
 * This class creates a JFrame with a JButton. The button toggles its label
 * between "ON" and "OFF" each time it is clicked, using an ActionListener to
 * handle the click events.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class ToggleButton {

	/**
	 * The entry point of the application. Creates a JFrame and a JButton that
	 * toggles its label between "ON" and "OFF" when clicked.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		// Create a JFrame with a title
		JFrame frame = new JFrame("Demo Button Click");
		JPanel pane = (JPanel) frame.getContentPane();

		// Create a JButton with initial label "ON"
		JButton b = new JButton("ON");

		// Create button listener and add it to the button
		ButtonListener listener = new ButtonListener();
		b.addActionListener(listener);

		// Add the button to the pane
		pane.add(b);

		// Set default close operation, window size, and make the window visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		frame.setVisible(true);
	}
}

/**
 * Listens for button click events and toggles the button label between "ON" and
 * "OFF".
 * <p>
 * This class implements ActionListener to handle button click events and
 * changes the button label based on its current text.
 * </p>
 */
class ButtonListener implements ActionListener {

	/**
	 * Changes the button label between "ON" and "OFF" when the button is clicked.
	 * 
	 * @param event the ActionEvent triggered by the button click
	 */
	@Override
	public void actionPerformed(ActionEvent event) {

		JButton b = (JButton) event.getSource();
		String label = b.getText();
		if (label.equals("ON")) {
			b.setText("OFF");
		} else if (label.equals("OFF")) {
			b.setText("ON");
		}
	}
}
