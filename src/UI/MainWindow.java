package UI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;



public class MainWindow extends JFrame{
	private JFrame window;
	
	public MainWindow() {
		//optionIcon.paintIcon(window, getGraphics(), EXIT_ON_CLOSE, ABORT);
		window = new JFrame();
		window.setTitle("Main Window");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1000, 1000); //LCDs are 240x320 so turn that on it's side and it's 320x240
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.getContentPane().setBackground(Color.BLACK);
		
		getContentPane().add(new MainPanel());
		
		window.setVisible(true);
	}
}
