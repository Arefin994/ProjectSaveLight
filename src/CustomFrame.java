import java.awt.Color;

import javax.swing.*;

public class CustomFrame extends JFrame{
	CustomFrame(){
		 setTitle("Project SaveLight");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setResizable(false);

	        ImageIcon logo = new ImageIcon("SaveLight.PNG");
	        setIconImage(logo.getImage());

	        getContentPane().setBackground(new Color(123, 50, 250));
	        pack(); // Adjust the frame size based on its components
	        setLocationRelativeTo(null); // Center the frame on the screen
	        setVisible(true); // Make the frame visible
	}
	CustomFrame(String s){
		 setTitle(s);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setResizable(false);

	        ImageIcon logo = new ImageIcon("SaveLight.PNG");
	        setIconImage(logo.getImage());

	        getContentPane().setBackground(new Color(123, 50, 250));
	        pack(); // Adjust the frame size based on its components
	        setLocationRelativeTo(null); // Center the frame on the screen
	        setVisible(true); // Make the frame visible
	}
}
