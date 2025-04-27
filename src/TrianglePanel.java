import javax.swing.*;
import java.awt.*;

public class TrianglePanel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Cast g to Graphics2D for better control
		Graphics2D g2d = (Graphics2D)g;
		
		// Set color
		g2d.setColor(Color.BLACK);
		
		// Set the starting point for the initial triangle
		Point p1 = new Point(300,50);
		Point p2 = new Point(50, 500);
		Point p3 = new Point(550, 500);
		
		// Invoke the recursion drawing function which will run 5 times
		drawTriangle(g2d, p1, p2, p3, 5);
	}
	
	private void drawTriangle(Graphics2D g2d, Point p1, Point p2, Point p3, int iterations) {
		// set up the base case to stop the recursion
		if(iterations == 0) {
			int[] xPoints = {p1.x, p2.x, p3.x};
			int[] yPoints = {p1.y, p2.y, p3.y};
			g2d.fillPolygon(xPoints, yPoints, 3);
			
			// return to caller and halt the recursion
			return;
		}
		
		// First thing we'll need to do is to locate the midpoints
		Point mid1 = findMiddle(p1, p2);
		Point mid2 = findMiddle(p2, p3);
		Point mid3 = findMiddle(p3,p1);
		
		// Recursively draw the three smaller triangles
		drawTriangle(g2d, p1, mid1, mid3, iterations - 1);
		drawTriangle(g2d, mid1, p2, mid2, iterations - 1);
		drawTriangle(g2d, mid3, mid2, p3, iterations - 1);		
	}
	
	private Point findMiddle(Point p1, Point p2) {
		int middleX = (p1.x + p2.x) / 2;
		int middleY = (p1.y + p2.y) / 2;
		
		// return the new middle point back to the caller
		return new Point(middleX, middleY);
	}

}
