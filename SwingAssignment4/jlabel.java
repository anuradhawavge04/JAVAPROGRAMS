package SwingAssignment4;

import java.awt.*;
import javax.swing.*;

public class jlabel extends JFrame{
	private JLabel jlabel1=new JLabel();
	private JLabel jlabel2=new JLabel();
	
	public jlabel() {
		this.getContentPane().setLayout(null);
        this.setSize(new Dimension(400,300));
        jlabel1.setText("Username:");
        jlabel1.setBounds(new Rectangle(40,55,80,25));
        jlabel2.setText("Password:");
        jlabel2.setBounds(new Rectangle(40,95,60,25));
        this.getContentPane().add(jlabel2,null);
        this.getContentPane().add(jlabel1,null);
		

}
	
	public static void main(String[]args) {
		jlabel j=new jlabel();
		j.setVisible(true);
	}
}