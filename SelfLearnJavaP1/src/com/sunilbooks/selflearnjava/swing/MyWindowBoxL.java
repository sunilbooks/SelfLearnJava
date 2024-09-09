package com.sunilbooks.selflearnjava.swing;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * A Swing application that demonstrates the use of BoxLayout.
 * <p>
 * This class creates a JFrame with a BoxLayout. It provides an option to
 * arrange components in either a horizontal row (X_AXIS) or a vertical column
 * (Y_AXIS). The JFrame contains various components including buttons, a text
 * field, a checkbox, and a label, all arranged according to the selected
 * BoxLayout orientation.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowBoxL {

	public static void main(String[] args) {

		JFrame frame = new JFrame("BoxLayout Demo");

		JPanel pane = (JPanel) frame.getContentPane();

		// One Row
		BoxLayout layout = new BoxLayout(pane, BoxLayout.X_AXIS);

		// One Column
		// BoxLayout layout = new BoxLayout(pane, BoxLayout.Y_AXIS);

		pane.setLayout(layout);

		JButton b1 = new JButton("Button1");
		pane.add(b1);

		JTextField text = new JTextField("Enter Text");
		pane.add(text);

		JCheckBox cb = new JCheckBox("Select Here");
		pane.add(cb);

		JButton b2 = new JButton("Button2");
		pane.add(b2);

		JLabel label = new JLabel("This is Label");
		pane.add(label);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// frame.setSize(400, 200);
		frame.pack();

		frame.setVisible(true);

	}

}
