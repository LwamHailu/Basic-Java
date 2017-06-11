package lesson6;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest1 extends JFrame {
JButton b1=new JButton("Red"),
b2=new JButton("Green"),
b3=new JButton("Blue"),
b4=new JButton("Yellow"),
b5=new JButton("Pink");
public FlowLayoutTest1() {
setTitle("FlowLayout Test");
setBounds(0,0,600,100);

getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
add(b1); add(b2); add(b3); add(b4); add(b5); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]) { 
	FlowLayoutTest1 f = new FlowLayoutTest1();
       f.setVisible(true);
}}