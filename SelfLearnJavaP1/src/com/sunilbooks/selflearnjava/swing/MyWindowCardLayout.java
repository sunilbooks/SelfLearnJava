package com.sunilbooks.selflearnjava.swing;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A Swing application that demonstrates the use of CardLayout.
 * <p>
 * This class creates a JFrame with a CardLayout. It includes two buttons that
 * allow the user to navigate between different panels in the card layout.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class MyWindowCardLayout {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel pane = (JPanel) frame.getContentPane();

		CardLayout card = new CardLayout();
		pane.setLayout(card);

		ButtonHandler handler = new ButtonHandler(pane);

		JButton b1 = new JButton("Next Panel");
		b1.addActionListener(handler);
		pane.add(b1);

		JButton b2 = new JButton("Previous Panel");
		b2.addActionListener(handler);
		pane.add(b2);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);

	}

}

/**
 * Event listener for navigating between panels in a CardLayout.
 * <p>
 * This class handles button click events to switch to the next panel in the
 * CardLayout.
 * </p>
 */
class ButtonHandler implements ActionListener {
	JPanel pane = null;

	ButtonHandler(JPanel pane) {
		this.pane = pane;
	}

	public void actionPerformed(ActionEvent e) {
		CardLayout card = (CardLayout) pane.getLayout();
		card.next(pane);
	}
}
