package com.sunilbooks.selflearnjava.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingAdapter {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Demo Button Click");
		JPanel pane = (JPanel) frame.getContentPane();
		JButton b = new JButton("Mouse Test");

		// Create button listener and add with button
		MouseHandler listener = new MouseHandler();
		b.addMouseListener(listener);

		pane.add(b);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		frame.setVisible(true);

	}
}

class MouseHandler extends MouseAdapter {
	public void mouseEntered(MouseEvent event) {
		System.out.println("Mouse Entered");
	}

	public void mouseExited(MouseEvent event) {
		System.out.println("Mouse Exit");
	}
}
