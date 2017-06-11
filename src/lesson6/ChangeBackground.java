package lesson6;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class ChangeBackground extends JFrame{

public static void main(String[] args) {
ChangeBackground frame = new ChangeBackground(); 
}
ChangeBackground(){
setTitle("Backgroung Changing");
setSize(300,300);
setVisible(true);
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setDefaultCloseOperation( EXIT_ON_CLOSE ); 
Container contentPane = getContentPane(); 
contentPane.setBackground(Color.blue);
getContentPane().setBackground(Color.pink);

}}