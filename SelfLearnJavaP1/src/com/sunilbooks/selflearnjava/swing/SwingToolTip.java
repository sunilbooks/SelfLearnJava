package com.sunilbooks.selflearnjava.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingToolTip {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel pane = (JPanel) frame.getContentPane();

		// Create a Label
		JButton button = new JButton("Save");

		// Attache a Tool Tip 'Label'
		button.setToolTipText("Click here to save File");
		pane.add(button);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}

}
