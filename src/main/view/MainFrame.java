package main.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The MainFrame is where the entire game will be played
 * @author justin.bell
 * @version 0.1
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	JPanel critterPanel;
	
	public MainFrame() {
		//TODO Create a general Panel so that additional panels can be added during runtime
		critterPanel = new CritterPanel();
		this.add(critterPanel);
		
		setTitle("TD");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
