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
		
	}

}
