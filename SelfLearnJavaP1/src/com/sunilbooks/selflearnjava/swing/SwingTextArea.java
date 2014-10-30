package com.sunilbooks.selflearnjava.swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingTextArea {

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		JPanel pane = (JPanel) frame.getContentPane();

		JLabel label = new JLabel("Email : ");
		pane.add(label, BorderLayout.NORTH);

		JTextArea text = new JTextArea(5, 80);
		pane.add(text);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(200, 100);

		frame.setVisible(true);

	}

}
