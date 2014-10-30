package com.sunilbooks.selflearnjava.swing;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SwingRadioButton {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing RadioButton");
		JPanel panel = (JPanel) frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);

		JLabel skill = new JLabel("Skill :");
		panel.add(skill);

		JRadioButton java = new JRadioButton("Java", true);
		panel.add(java);
		JRadioButton dNet = new JRadioButton(".NET", false);
		panel.add(dNet);
		JRadioButton php = new JRadioButton("PHP", false);
		panel.add(php);

		ButtonGroup group = new ButtonGroup();
		group.add(java);
		group.add(dNet);
		group.add(php);

		// Window will made visible to User
		frame.setVisible(true);

		// Set a event : when window is closed, it is removed from memory
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
}
