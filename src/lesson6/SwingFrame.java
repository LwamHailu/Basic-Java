package lesson6;

import javax.swing.JFrame;

public class SwingFrame {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setTitle("HelloWorld");
		frame.setSize(694,600);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setLocation(100, 30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
