import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		// create frame
		JFrame frame = new JFrame("Sierpinski Triangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Instantiate an object 
		TrianglePanel panel = new TrianglePanel();
		
		// set the size of the panel
		panel.setPreferredSize(new java.awt.Dimension(600,600));
		
		// add the panel to the frame
		frame.getContentPane().add(panel);
		
		// invoke pack to ensure proper sizing
		frame.pack();
		frame.setVisible(true);

	}

}
