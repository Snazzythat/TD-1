package main.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The MainFrame is where the entire game will be played
 * @author justin.bell
 * @version 0.1
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame implements ActionListener {
	JPanel critterPanel;
	//JPanel mainMenuPanel;
	
	public MainFrame() {
		//TODO Create a general Panel so that additional panels can be added during runtime
		critterPanel = new CritterPanel();
		this.add(critterPanel);
		
		//mainMenuPanel = new MainMenuPanel();
		//this.add(mainMenuPanel);
		
		setTitle("TD");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}
