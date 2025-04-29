package UI;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;



public class SecondaryWindow extends JFrame implements KeyListener{
	private JFrame window;
	
	public SecondaryWindow() {
		window = new JFrame();
		window.setTitle("Secondary Window");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(320, 240);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.getContentPane().setBackground(Color.BLACK);
		
		MainPanel mp = new MainPanel();
		
		window.setVisible(true);
		
		mp.setVisible(true);
		mp.setLocation(100, 100);
		
		window.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("You typed the key " + e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
