package com.sunilbooks.selflearnjava.swing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A Swing application that demonstrates the use of GridLayout.
 * <p>
 * This class creates a JFrame with a GridLayout, arranging components in a grid
 * of 3 rows and 2 columns. Each JButton component is placed into one of the
 * grid cells. The layout ensures that all components are evenly spaced within
 * the grid.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowGL {

	public static void main(String[] args) {

		JFrame frame = new JFrame("GridLayout Demo");

		JPanel pane = (JPanel) frame.getContentPane();

		pane.setLayout(new GridLayout(3, 2));

		JButton b1 = new JButton("Button1");
		pane.add(b1);

		JButton b2 = new JButton("Button2");
		pane.add(b2);

		JButton b3 = new JButton("Button3");
		pane.add(b3);

		JButton b4 = new JButton("Button4");
		pane.add(b4);

		JButton b5 = new JButton("Button5");
		pane.add(b5);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(400, 200);

		frame.setVisible(true);

	}

}
