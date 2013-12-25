package project_euler;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Rummy {

	public static void main(String[] args) {
		int points = ((int)(Math.random()*40)*5);
		Component frame = null;
		JOptionPane.showMessageDialog(frame, "You have " + points + " this round.");
	}
}