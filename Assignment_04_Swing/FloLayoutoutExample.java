package Assignment_04_Swing;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import java.awt.FlowLayout;
    class FlowLayoutExample extends JFrame{
		
		JLabel l1,l2,l3,l4,l5;


	public FlowLayoutExample() {

		  setLayout(new FlowLayout(FlowLayout.RIGHT));
		  
		l1=new JLabel("Label 1");
		l2=new JLabel("Label 2");
		l3=new JLabel("Label 3");
		l4=new JLabel("Label 4");
		l5=new JLabel("Label 5");
		
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
	}
	}

	class Main{
		public static void main(String[]args) {
			FlowLayoutExample l=new FlowLayoutExample();
			l.setTitle("Flowlayout Example");
			l.setBounds(200,100,600,400);
			l.setVisible(true);
			l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

