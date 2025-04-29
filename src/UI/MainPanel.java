package UI;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MainPanel extends JPanel implements KeyListener{
	ImageIcon optionIcon = new ImageIcon("icon.png");
	
	public MainPanel() {
		setVisible(true);
		
		
    }
	
	public void update(Graphics window)
	{
		paint(window);
	}
    
	public void paint(Graphics g) {
		System.out.println(getGraphics());
		
		JLabel imgLabel = new JLabel();
    	imgLabel.setIcon(optionIcon);
	}
	
	public void run() {
		try
		{
			while(true)
	   		{
				Thread.currentThread().sleep(35);
				repaint();
	        }
		}	
		catch(Exception e){
	    	  
		}
  	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
