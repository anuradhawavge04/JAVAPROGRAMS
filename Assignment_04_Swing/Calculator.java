package Assignment_04_Swing;

import java.awt.*;
import javax.swing.*;

public class Calculator {

    JFrame f;

    public Calculator() {
        f = new JFrame("Calculator");
        
        JTextField textField = new JTextField();
        textField.setEditable(false);
        f.add(textField, BorderLayout.NORTH);

      
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5)); 

     
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            ".", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            panel.add(button);
        }

        
        JButton clearButton = new JButton("Clear");
        f.add(clearButton, BorderLayout.SOUTH);

        f.add(panel, BorderLayout.CENTER);

        f.setSize(300, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
