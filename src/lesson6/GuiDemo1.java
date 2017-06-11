package lesson6;

 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GuiDemo1 implements ActionListener{ 
	JButton button;
public static void main(String[] args) { 
	GuiDemo1 gui=new GuiDemo1(); 
	gui.go();
}
public void go() {
JFrame frame=new JFrame();
button=new JButton("Click");
frame.getContentPane().add(button); 
button.addActionListener(this); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300, 200);
frame.setTitle("Click Demo");
frame.setVisible(true); }
public void actionPerformed(ActionEvent e) {
	JTextField field = new JTextField(50);
	field.setBounds(33,46,34,36);
button.add(field); }
}