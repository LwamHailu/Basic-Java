package lesson6;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CountLetters  implements ActionListener{

	JButton button;
	JButton button1;
	JButton button2;
	JLabel label2;
	JLabel label1;
	JPanel Pane;
	JFrame frame;
	JTextField filed;
	JTextField filed1;
	static String s;
	 

    
	  public static void main(String[] args) {
		CountLetters s= new CountLetters();
		 
	    s.display();

	}
	  public void display(){
		  
			frame=new JFrame("String Utility");
			frame.setSize(500, 200);
			Pane=new JPanel();
			Pane.setLayout(null);
			button =new JButton("Count Letter's");
			button1 =new JButton("Reverse Letteers");
			button2 =new JButton("Remove Dublicate");
			button.setBounds(100,10,100,40);
			button1.setBounds(100,50,120,40);
			button.setBackground(Color.RED);
			button2.setBounds(100,90,130,40);
		    frame.setResizable(true);
		    label1=new JLabel("Input");
		    label1.setBounds(300,0,45,100);
		    label2=new JLabel("OutPut");
		    label2.setBounds(300,35,45,100);
		    filed=new JTextField(50);
		    filed.setBounds(255,55,150,20);
		    filed1=new JTextField(50);
		    filed1.setBounds(255,90,150,20);
		    Pane.add(button);
		    Pane.add(button1);
		    Pane.add(button2);
		    Pane.add(label1);
		    Pane.add(label2);
		    Pane.add(filed);
		    Pane.add(filed1);
		    frame.add(Pane);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setVisible(true);
		    button.addActionListener(this);
		    button1.addActionListener(this);
		    button2.addActionListener(this);
		    }
		@Override
	public void actionPerformed(ActionEvent e) {
			s=filed.getText();
			if(e.getSource().equals(button)){
				String x=Integer.toString(s.length());
				filed1.setText(x);
				
			}
			else if(e.getSource().equals(button1)){
				String d="";
				for(int i=0;i<s.length();i++){
				d=d+""+s.charAt(s.length()-1-i);
				}
				filed1.setText(d.toString());
			}
			
			else{
				String c="";
			withNextChar:for(int i=0;i<s.length();i++){
					for(int j=0;j<c.length();j++){
					if(s.charAt(i)==c.charAt(j)){
						continue withNextChar;
						}
					}
					c=c+""+s.charAt(i);	
					}
				filed1.setText(c.toString());
			}
			
		}

}
