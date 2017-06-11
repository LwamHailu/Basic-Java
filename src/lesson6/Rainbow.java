package lesson6;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Rainbow implements ActionListener{

	JButton button;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JPanel Pane;
	JFrame frame;
	public static void main(String[] args) {
		Rainbow s= new Rainbow ();
		s.dis();

	}
	public void dis(){
		frame=new JFrame("Rainbow color");
		frame.setSize(600,100);
		frame.setResizable(true);
		Pane=new JPanel();
		Pane.setLayout(null);
		Pane.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    button=new JButton();
	    button.setBorderPainted(false);
        button.setOpaque(true);
		button.setBounds(100,200,100,100);
	    button.setBackground(Color.RED);
	    button1=new JButton();
	    button1.setBackground(Color.orange);
	    button1.setBorderPainted(false);
        button1.setOpaque(true);
	    button2=new JButton();
	    button2.setBackground(Color.yellow);
	    button2.setBorderPainted(false);
        button2.setOpaque(true);
	    button3=new JButton();
	    button3.setBackground(Color.green);
	    button3.setBorderPainted(false);
        button3.setOpaque(true);
	    button4=new JButton();
	    button4.setBackground(Color.BLUE);
	    button4.setBorderPainted(false);
        button4.setOpaque(true);
	    button5=new JButton();
	    button5.setBackground(new Color(55,6,150));
	    button5.setBorderPainted(false);
        button5.setOpaque(true);
	    button6=new JButton();
	    button6.setBackground(new Color(100,34,200)); 
	    button6.setBorderPainted(false);
        button6.setOpaque(true);
	    
	    Pane.add(button);
	    Pane.add(button1);
	    Pane.add(button2);
	    Pane.add(button3);
	    Pane.add(button4);
	    Pane.add(button5);
	    Pane.add(button6);
	    frame.add(Pane);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    button.addActionListener(this);
	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    button3.addActionListener(this);
	    button4.addActionListener(this);
	    button5.addActionListener(this);
	    button6.addActionListener(this);
	    button.setActionCommand("0");
	    button1.setActionCommand("1");
	    button2.setActionCommand("2");
	    button3.setActionCommand("3");
	    button4.setActionCommand("4");
	    button5.setActionCommand("5");
	    button6.setActionCommand("6");
	    
	    
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		int event =Integer.parseInt(e.getActionCommand());
		switch(event){
		case 0:
	 JOptionPane.showMessageDialog(Pane,"Red signifies passion, vitality, enthusiasm and security","Color Meaning", JOptionPane.PLAIN_MESSAGE);
			break;
		case 1:	
			 JOptionPane.showMessageDialog(Pane,"Orange color representing creativity, practicality, playfulness as well as equilibrium or control.","Color Meaning", JOptionPane.PLAIN_MESSAGE);
				break;
		case 2:
			 JOptionPane.showMessageDialog(Pane,"Yellow color of the sunshine itself. It represents clarity of thought, wisdom, orderliness and energy.","Color Meaning", JOptionPane.PLAIN_MESSAGE);
				break;
		case 3:
			 JOptionPane.showMessageDialog(Pane,"Green color of the rainbow and denotes fertility, growth, balance, health and wealth.","Color Meaning", JOptionPane.PLAIN_MESSAGE);
				break;
		case 4:
		 JOptionPane.showMessageDialog(Pane,"Blue color is The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity.","Color Meaning", JOptionPane.PLAIN_MESSAGE);
			break;
		case 5:
			 JOptionPane.showMessageDialog(Pane,"Vilot can ignite one’s imagination and be an inspiration to artists and Dark tones of violet are associated with sorrow. ","Color Meaning", JOptionPane.PLAIN_MESSAGE);
				break;
		case 6:
			 JOptionPane.showMessageDialog(Pane,"Indigo is mystical as it bridges the Gap between Finite and Infinite. ","Color Meaning", JOptionPane.PLAIN_MESSAGE);
				break;
		
		}
		
	}

}
