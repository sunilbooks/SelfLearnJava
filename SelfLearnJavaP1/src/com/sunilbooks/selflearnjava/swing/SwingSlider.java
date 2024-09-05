package com.sunilbooks.selflearnjava.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 * A Swing application that demonstrates the use of the JSlider component.
 * <p>
 * This class creates a JFrame window containing a JSlider with custom
 * configurations. The slider includes minor and major tick marks, label
 * painting, and snap-to-tick functionality.
 * </p>
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */
public class SwingSlider {

	/**
	 * The entry point of the application. Creates and displays a JFrame containing
	 * a JSlider.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Swing Slider");
		JPanel panel = (JPanel) frame.getContentPane();

		// Create a slider
		JSlider slider = new JSlider();

		// Set minor tick spacing
		slider.setMinorTickSpacing(5);

		// Set major tick spacing
		slider.setMajorTickSpacing(10);

		// Set tick marks visible
		slider.setPaintTicks(true);

		// Set the knob to snap to the closest tick mark
		slider.setSnapToTicks(true);

		// Paint the track of the slider
		slider.setPaintTrack(false);

		// Paint the labels of the slider
		slider.setPaintLabels(true);

		panel.add(slider);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
}
