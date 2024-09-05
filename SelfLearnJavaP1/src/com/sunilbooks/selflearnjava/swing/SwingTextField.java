package com.sunilbooks.selflearnjava.swing;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * A Swing application that demonstrates the use of JTextField and
 * JPasswordField components.
 * <p>
 * This class creates a JFrame window containing a grid layout with labels and
 * text fields. The JTextField is used for user login input, and the
 * JPasswordField is used for password input.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingTextField {

	/**
	 * The entry point of the application. Creates and displays a JFrame containing
	 * text fields for login and password.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing TextField Example");

		JPanel pane = (JPanel) frame.getContentPane();
		pane.setLayout(new GridLayout(2, 2));

		JLabel login = new JLabel("Login : ");
		pane.add(login);

		JTextField text = new JTextField();
		pane.add(text);

		JLabel pwd = new JLabel("Password : ");
		pane.add(pwd);

		JPasswordField pwdT = new JPasswordField();
		pane.add(pwdT);

		// Set a default close operation for the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size of the window
		frame.setSize(300, 100);
		// Make the window visible to the user
		frame.setVisible(true);
	}
}
