package com.sunilbooks.selflearnjava.swing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestAnonymousClass {

	public static void main(String[] args) {

		JFrame f = new JFrame();

		JButton b = new JButton("Send");
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mouse Clicked");
			}

		});

		f.add(b);

		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
