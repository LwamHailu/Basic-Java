package lesson1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;

public class Bmi implements ActionListener{

	JButton button;
	JLabel label1;
	JLabel label2;
	 JPanel Pane;
	 JFrame frame;
	  JTextField filed;
	   JTextField filed1;
	  double x;
	
	public void display(){
		//getContanPanel().setlayout(null);
		 frame=new JFrame("BMI Calculator");
		frame.setVisible(true);
		frame.setSize(500, 400);
		  Pane=new JPanel();
		Pane.setLayout(null);
		button =new JButton("Calculate BMI");
	    button.setBounds(250,200,75,60);
	    frame.setResizable(true);
	    label1=new JLabel("Your mass(In Pounds):");
	    label1.setBounds(50,100,45,100);
	    label2=new JLabel("Your height(In Inches):");
	    label2.setBounds(28,20,90,9);
	    filed=new JTextField(10);
	    filed.setBounds(27,59,49,75);
	     filed1=new JTextField(10);
	    filed1.setBounds(4,100,29,30);
	    Pane.add(button);
	    Pane.add(label1);
	    Pane.add(label2);
	    Pane.add(filed);
	    Pane.add(filed1);
	    frame.add(Pane);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    button.addActionListener(this);
	    }
	  public void actionPerformed(ActionEvent e){
		   double y=Double.parseDouble(filed.getText());
		  x = Double.parseDouble(filed1.getText());
		  double  s=(x/(y*y))*703;
		 //String d=Double.toString(s);	
		
		   JOptionPane.showMessageDialog(Pane,s,"BMI", JOptionPane.PLAIN_MESSAGE);
		   
		   } 
	    
	  public static void main(String[] args) {
		Bmi s= new Bmi();
	s.display();

	}

}
