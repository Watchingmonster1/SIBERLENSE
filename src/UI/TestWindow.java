package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.ScrollPane;
import javax.swing.JScrollBar;

public class TestWindow implements KeyListener{

	private JFrame window;
	int selectedOption;
	JLabel [] icons = new JLabel [3];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWindow window = new TestWindow();
					window.window.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println("Turning on! =>O o O<=");
		window = new JFrame();
		window.setTitle("Main Window");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(320, 240); //LCDs are 240x320 so turn that on it's side and it's 320x240
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.getContentPane().setBackground(Color.BLACK);
		
		JPanel panel = new JPanel();
		window.getContentPane().add(panel, BorderLayout.NORTH);
		
		window.addKeyListener(this);
		selectedOption = 0;
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TestWindow.class.getResource("/UI/icon.png")));
		panel.add(lblNewLabel);
		icons[0] = lblNewLabel;
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TestWindow.class.getResource("/UI/icon.png")));
		panel.add(lblNewLabel_1);
		icons[1] = lblNewLabel_1;
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(TestWindow.class.getResource("/UI/icon.png")));
		panel.add(lblNewLabel_1_1); //Test
		icons[2] = lblNewLabel_1_1;
		
		updateIcons(selectedOption);
	}
	
	public void updateIcons(int selOp) {
		icons[0].setIcon(new ImageIcon(TestWindow.class.getResource("/UI/icon.png")));
		icons[1].setIcon(new ImageIcon(TestWindow.class.getResource("/UI/icon.png")));
		icons[2].setIcon(new ImageIcon(TestWindow.class.getResource("/UI/icon.png")));
		
		icons[selOp].setIcon(new ImageIcon(TestWindow.class.getResource("/UI/icon2.png")));
	}

	//Don't use this one because it is dumb and uses the actual characters typed and not the keycode which is dumb. Keep bc this is implemented :/
	@Override
	public void keyTyped(KeyEvent e) { 
		//System.out.println(e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//37 = <-, 38 = ^, 39 = ->, 40 = v, 10 = enter. Just use 37 and 39, we ain't gonna need the others.
		if(e.getKeyCode() == 37 && !(selectedOption < 1)) {
			selectedOption--;
		} else if (e.getKeyCode() == 39 && !(selectedOption > 1)) {
			selectedOption++;
		}
		System.out.println("You just selected option: " + selectedOption + ". :O");
		updateIcons(selectedOption);
	}

	//Maybe? Maybe not. Uses keycode. Keep.
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
