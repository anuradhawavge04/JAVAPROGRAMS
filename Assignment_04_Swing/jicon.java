package Assignment_04_Swing;


	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;
	public class jicon {

		private JFrame mainFrame;
		private JLabel headerLabel;
		private JLabel statusLabel;
		private JPanel controlPanel;
		
		public jicon() {
			prepareGUI();
		}
		
		public static void main(String[]args) {
			jicon j=new jicon();
			j. showImageIconDemo();
		}
		
		private void prepareGUI() {
			mainFrame=new JFrame("KAMIL Java Swing Examples");
			mainFrame.setSize(400,400);
			mainFrame.setLayout(new GridLayout(3,1));
			
			mainFrame.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent windowEvent) {
					System.exit(0);
				}
				
			});
			
			headerLabel=new JLabel(" ",JLabel.CENTER);
			statusLabel=new JLabel("",JLabel.CENTER);
			statusLabel.setSize(350,100);
			controlPanel=new JPanel();
			controlPanel.setLayout(new FlowLayout());
			mainFrame.add(headerLabel);
			mainFrame.add(controlPanel);
			mainFrame.add(statusLabel);
			mainFrame.setVisible(true);
			
		}
		
		private static ImageIcon createImageIcon(String path,String description) {
			java.net.URL imgURL=jicon.class.getResource("C:\\Users\\Admin\\Pictures\\Saved Pictures\\bulb.webp");
			if(imgURL!=null) { 
				return new ImageIcon(imgURL,description);
			}
			
			else {
				System.err.println("Couldnt find file:"+path);
				return null;
			}
		}
		
		private void showImageIconDemo() {
			headerLabel.setText("Control in action:ImageIcon");
			ImageIcon icon=createImageIcon("","Java");
			JLabel commentLabel=new JLabel("",icon,JLabel.CENTER);
			controlPanel.add(commentLabel);
			mainFrame.setVisible(true);
		}
		
	}

