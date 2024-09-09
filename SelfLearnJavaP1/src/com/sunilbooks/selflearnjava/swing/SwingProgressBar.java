package com.sunilbooks.selflearnjava.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

/**
 * A Swing application that demonstrates the use of a JProgressBar component.
 * <p>
 * This class extends {@link JFrame} to create a window with a progress bar and
 * a button. The progress bar's range is from 20 to 100, and it updates its
 * value when the button is clicked. The progress is simulated using a separate
 * thread to increment the progress bar's value.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingProgressBar extends JFrame {

	protected int min = 20;
	protected int max = 100;
	protected int counter = 25;
	protected JProgressBar jpb;

	/**
	 * Constructs a {@code SwingProgressBar} frame with a JProgressBar and a start
	 * button. The progress bar's minimum and maximum values are set, and colors are
	 * customized. A button is provided to start the progress, which updates the
	 * progress bar in a separate thread.
	 */
	public SwingProgressBar() {
		super("JProgressBar");
		setSize(300, 80);

		// Set Background color
		UIManager.put("ProgressBar.selectionBackground", Color.black);

		// Set Foreground color
		UIManager.put("ProgressBar.selectionForeground", Color.white);
		UIManager.put("ProgressBar.foreground", new Color(8, 32, 128));

		// Create Progress Bar
		jpb = new JProgressBar();
		jpb.setMinimum(min);
		jpb.setMaximum(max);

		// Set String Visible (Paint String )
		jpb.setStringPainted(true);

		// Create Start Button
		JButton start = new JButton("Go ..");

		// Add Listeners
		start.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Thread runner = new Thread() {
					public void run() {
						counter = min;
						while (counter <= max) {

							jpb.setValue(counter);

							counter = counter + 1;
							try {
								Thread.sleep(100);
							} catch (InterruptedException ex) {
							}
						}
					}
				};
				runner.start();
			}
		});

		getContentPane().add(jpb, BorderLayout.CENTER);
		getContentPane().add(start, BorderLayout.WEST);
	}

	/**
	 * The entry point of the application. Creates and displays an instance of
	 * {@code SwingProgressBar}.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		SwingProgressBar frame = new SwingProgressBar();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
