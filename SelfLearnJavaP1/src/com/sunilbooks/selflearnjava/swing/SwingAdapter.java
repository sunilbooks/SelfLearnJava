package com.sunilbooks.selflearnjava.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A Swing application that demonstrates the use of a MouseAdapter for handling
 * mouse events.
 * <p>
 * This class creates a JFrame containing a JButton. The MouseHandler class is
 * used to handle mouse events such as mouse entry and exit over the button.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
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

/**
 * A MouseAdapter implementation to handle mouse events.
 * <p>
 * This class overrides the {@code mouseEntered} and {@code mouseExited} methods
 * to handle mouse enter and exit events respectively. It provides custom
 * behavior for these events.
 * </p>
 */
class MouseHandler extends MouseAdapter {
	public void mouseEntered(MouseEvent event) {
		System.out.println("Mouse Entered");
	}

	public void mouseExited(MouseEvent event) {
		System.out.println("Mouse Exit");
	}
}
