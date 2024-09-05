package com.sunilbooks.selflearnjava.swing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A Swing application that demonstrates the use of BorderLayout.
 * <p>
 * This class creates a JFrame with a BorderLayout and adds JButton components
 * to each of the five regions: North, South, East, West, and Center.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowBL {

	public static void main(String[] args) {

		JFrame frame = new JFrame("BorderLayout Demo");

		BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);

		JPanel pan = (JPanel) frame.getContentPane();

		JButton b1 = new JButton("North");
		pan.add(b1, BorderLayout.NORTH);

		JButton b2 = new JButton("South");
		pan.add(b2, BorderLayout.SOUTH);

		JButton b3 = new JButton("Right");
		pan.add(b3, BorderLayout.EAST);

		JButton b4 = new JButton("West");
		pan.add(b4, BorderLayout.WEST);

		JButton b5 = new JButton("Center");
		pan.add(b5);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();

		frame.setVisible(true);

	}

}
