package main.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * View that will be displayed on start
 * @author justin.bell
 * @version 0.1
 */
@SuppressWarnings("serial")
public class MainMenuPanel extends JPanel implements ActionListener {
	JButton playNewGameButton;
	JButton loadGameButton;
	JButton mapEditorButton;
	
	public MainMenuPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		playNewGameButton = new JButton("New Game");
		playNewGameButton.setAlignmentX(CENTER_ALIGNMENT);
		playNewGameButton.addActionListener(this);
		
		loadGameButton = new JButton("Load Game");
		loadGameButton.setAlignmentX(CENTER_ALIGNMENT);
		loadGameButton.addActionListener(this);
		
		mapEditorButton = new JButton("Map Editor");
		mapEditorButton.setAlignmentX(CENTER_ALIGNMENT);
		mapEditorButton.addActionListener(this);
		
		this.add(playNewGameButton);
		this.add(loadGameButton);
		this.add(mapEditorButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
