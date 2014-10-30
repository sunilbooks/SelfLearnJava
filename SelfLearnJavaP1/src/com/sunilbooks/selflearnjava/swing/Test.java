package com.sunilbooks.selflearnjava.swing;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame, "Data is saved !");

		// Set a event : when window is closed, it is removed from memory
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit from
		// Size window as per contained components
		frame.setSize(400, 200);
		// Window will made visible to User
		frame.setVisible(true);

	}

}
