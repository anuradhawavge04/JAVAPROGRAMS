package Assignment_04_Swing;


	import javax.swing.*;
	import java.awt.*;

	public class Login {
	    public static void main(String[] args) {

	        JFrame frame = new JFrame("Login Page");
	        frame.setSize(300, 180);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null);

	     
	        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
	        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

	        JLabel userLabel = new JLabel("Username:");
	        JTextField userText = new JTextField();

	        JLabel passLabel = new JLabel("Password:");
	        JPasswordField passText = new JPasswordField();

	        JButton loginButton = new JButton("Login");
	        JButton resetButton = new JButton("Reset");

	       
	        panel.add(userLabel);
	        panel.add(userText);
	        panel.add(passLabel);
	        panel.add(passText);
	        panel.add(loginButton);
	        panel.add(resetButton);

	        frame.add(panel);
	        frame.setVisible(true);
	    }
	}


