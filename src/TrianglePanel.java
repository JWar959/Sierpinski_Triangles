import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * TrianglePanel is a custom JPanel that draws a Sierpinski Triangle based
 * on user input specifying the number of iterations to run.
 */
public class TrianglePanel extends JPanel {
	
	private int iterations;
	
	/**
	 * Constructor that sets the member field instances to the value captured 
	 * from the user.
	 * @param iterations Number of recursive levels to draw.
	 */
	public TrianglePanel(int iterations) {
		
			this.iterations = iterations;
	}
	
	/**
	 * Overrides the paintComponent method to draw the Sierpinski Triangle.
	 * @param g Graphics context used for drawing.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
				
		// Cast g to Graphics2D for better control
		Graphics2D g2d = (Graphics2D)g;
		
		// Set to random color
		g2d = setRandomColor(g2d);
		
		// Set the starting point for the initial triangle
		Point p1 = new Point(300,50);
		Point p2 = new Point(50, 500);
		Point p3 = new Point(550, 500);
		
		// Invoke the recursion drawing function which will run 5 times
		drawTriangle(g2d, p1, p2, p3, iterations);
	}
	
	/**
	 * Recursively draws a Sierpinski Triangle
	 * @param g2d {@link Graphics2D} context
	 * @param p1 First Vertex
	 * @param p2 Second Vertex
	 * @param p3 Third Vertex
	 * @param iterations Number of remaining iterations of recursive drawing.
	 */
	private void drawTriangle(Graphics2D g2d, Point p1, Point p2, Point p3, int iterations) {
		// set up the base case to stop the recursion
		if(iterations == 0) {
			int[] xPoints = {p1.x, p2.x, p3.x};
			int[] yPoints = {p1.y, p2.y, p3.y};
			
			//Set Random color
			g2d = setRandomColor(g2d);
			
			g2d.fillPolygon(xPoints, yPoints, 3);
			
			// return to caller and halt the recursion
			return;
		}
		
		// First thing we'll need to do is to locate the midpoints
		Point mid1 = findMiddle(p1, p2);
		Point mid2 = findMiddle(p2, p3);
		Point mid3 = findMiddle(p3,p1);
		
		// Set Random color
		g2d = setRandomColor(g2d);
		
		// Recursively draw the three smaller triangles
		drawTriangle(g2d, p1, mid1, mid3, iterations - 1);
		drawTriangle(g2d, mid1, p2, mid2, iterations - 1);
		drawTriangle(g2d, mid3, mid2, p3, iterations - 1);		
	}
	
	/**
	 * Calculates the midpoint between two points.
	 * @param p1 First Vertex
	 * @param p2 Second Vertex
	 * @return Midpoint between p1 and p2
	 */
	private Point findMiddle(Point p1, Point p2) {
		int middleX = (p1.x + p2.x) / 2;
		int middleY = (p1.y + p2.y) / 2;
		
		// return the new middle point back to the caller
		return new Point(middleX, middleY);
	}
	
	/**
	 * This function will set the drawing object to a randomized color based off
	 * of 3 randomly generated values that are fed into the R, G, B values of a new
	 * Color object.
	 * 
	 * @param Graphics2D object that is set to draw the Sierpinski Triangles
	 * @return Graphics2D object set to a random color
	 */
	private Graphics2D setRandomColor(Graphics2D g2d) {
		// Randomly generate a color to paint with, ensuring
		// the likelihood of every iteration being different.
		Random randomNum = new Random();
		
		// generate a random number between 0-255 for RGB values
		int rNum = randomNum.nextInt(256);
		int gNum = randomNum.nextInt(256);		
		int bNum = randomNum.nextInt(256);
		
		// Now, create the color
		Color newColor = new Color(rNum, gNum, bNum);
		
		// Set color
		g2d.setColor(newColor);		
		
		return g2d;
	}
}
