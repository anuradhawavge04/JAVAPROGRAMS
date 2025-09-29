package Assignment_04_Swing;

import javax.swing.*;
import java.awt.*;

public class VaccinationForm {

	    public static void main(String[] args) {
	   
	        JFrame frame = new JFrame("Vaccination Form");
	        frame.setSize(500, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null);

	        JPanel panel = new JPanel();
	        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

	   
	        JLabel titleLabel = new JLabel("Vaccination Details");
	        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	        panel.add(titleLabel);

	      
	        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JLabel nameLabel = new JLabel("Name:");
	        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	        JTextField nameField = new JTextField(20);
	        namePanel.add(nameLabel);
	        namePanel.add(nameField);
	        panel.add(namePanel);

	    
	        JPanel midPanel = new JPanel(new GridLayout(2, 2, 10, 5));

	        
	        JPanel dosePanel = new JPanel();
	        dosePanel.setLayout(new BoxLayout(dosePanel, BoxLayout.Y_AXIS));
	        JLabel doseLabel = new JLabel("Dose:");
	        JCheckBox dose1 = new JCheckBox("Dose 1");
	        JCheckBox dose2 = new JCheckBox("Dose 2");
	        dosePanel.add(doseLabel);
	        dosePanel.add(dose1);
	        dosePanel.add(dose2);

	       
	        JPanel vaccinePanel = new JPanel();
	        vaccinePanel.setLayout(new BoxLayout(vaccinePanel, BoxLayout.Y_AXIS));
	        JLabel vaccineLabel = new JLabel("Vaccine:");
	        JRadioButton covaxin = new JRadioButton("Covaxin");
	        JRadioButton covishield = new JRadioButton("Covishield");
	        JRadioButton sputnik = new JRadioButton("Sputnik");

	        ButtonGroup vaccineGroup = new ButtonGroup();
	        vaccineGroup.add(covaxin);
	        vaccineGroup.add(covishield);
	        vaccineGroup.add(sputnik);

	        vaccinePanel.add(vaccineLabel);
	        vaccinePanel.add(covaxin);
	        vaccinePanel.add(covishield);
	        vaccinePanel.add(sputnik);

	     
	        JPanel combinedPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        combinedPanel.add(dosePanel);
	        combinedPanel.add(Box.createHorizontalStrut(40));
	        combinedPanel.add(vaccinePanel);

	        panel.add(combinedPanel);
	        


	        frame.add(panel);
	        frame.setVisible(true);
	    }
	}

