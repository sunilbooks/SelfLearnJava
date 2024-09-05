package com.sunilbooks.selflearnjava.swing;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Demonstrates the use of inner and static inner classes for handling events.
 * <p>
 * This class contains an instance method and a static method, and demonstrates
 * the use of an inner class and a static inner class to handle mouse and focus
 * events, respectively.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class OuterClass {

	private int instanceVar = 0;
	private static int staticVar = 0;

	private void instanceMethod() {
		System.out.println("Instance Method");
	}

	private static void staticMethod() {
		System.out.println("Static Method");
	}

	/**
	 * Inner class to handle mouse events.
	 * <p>
	 * This class extends {@link MouseAdapter} and overrides the
	 * {@code mouseClicked} method to handle mouse click events. It has access to
	 * the instance and static variables and methods of the outer class.
	 * </p>
	 */
	private class InnMouseHandler extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			System.out.println("Mouse Clicked");
			// Can be used
			instanceVar = 0;
			staticVar = 0;
			instanceMethod();
			staticMethod();
		}
	}

	/**
	 * Static inner class to handle focus events.
	 * <p>
	 * This class extends {@link FocusAdapter} and overrides the {@code focusGained}
	 * method to handle focus events. It has access only to static variables and
	 * methods of the outer class.
	 * </p>
	 */
	private static class FocusHandler extends FocusAdapter {
		public void focusGained(FocusEvent e) {
			System.out.println("Focus gained");
			// Can be used
			staticVar = 0;
			staticMethod();
		}
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();

		OuterClass o = new OuterClass();
		InnMouseHandler h = o.new InnMouseHandler();

		JButton b = new JButton("Send");
		b.addMouseListener(h);
		f.add(b);

		OuterClass.FocusHandler fh = new OuterClass.FocusHandler();
		b.addFocusListener(fh);

		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
