/**
 * @author John Warren
 * @version S2025
 * @title CMPS-367 Lab 9
 */
import java.util.Scanner;

import javax.swing.*;

/**
 * References Used: CMPS 367 Course Examples, 
 * GeeksForGeeks, and official Java Graphics Documentation.
 */

/**
 * Main Class to launch the Sierpinski Triangle Drawing.
 */
public class Main {

	public static void main(String[] args) {
		
		// Prompt the user to enter how many iterations they would like the program
		// to run
		System.out.println("How many iterations of triangles would you like to draw.");
		Scanner scnr = new Scanner(System.in);
		int userPrompt = 0;
		
		try {
			// Ensure the user input is in the range [1,10]
			while( ! (userPrompt > 0 && userPrompt < 11 ) ) {
				System.out.println( "Enter a number between 1-10.");
				userPrompt = scnr.nextInt();				
			}		
			
			scnr.close();
			
		}catch(Exception e) {
			scnr.next();
			System.out.println("Error: " + e.getMessage());
			// Set the default value to be 5 if there is an error
			userPrompt = 5;
		}			
		
		// create frame
		JFrame frame = new JFrame("Sierpinski Triangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Instantiate an object 
		TrianglePanel panel = new TrianglePanel(userPrompt);
		
		// set the size of the panel
		panel.setPreferredSize(new java.awt.Dimension(600,600));
		
		// add the panel to the frame
		frame.getContentPane().add(panel);
		
		// invoke pack to ensure proper sizing
		frame.pack();
		frame.setVisible(true);

	}
}
