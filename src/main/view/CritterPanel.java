package main.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.controller.GameController;

/**
 * View that displays the number of critters and allows a user to add critters  
 * @author justin.bell
 * @version 0.1
 */
@SuppressWarnings("serial")
public class CritterPanel extends JPanel implements Observer, ActionListener {
	JButton addCritterButton;
	JLabel numberOfCrittersLabel;
	GameController gc;
	
	public CritterPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		gc = GameController.getInstance();
		gc.addObserver(this);
		
		addCritterButton = new JButton("Add Critter");
		addCritterButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
		addCritterButton.addActionListener(this);
		
		numberOfCrittersLabel = new JLabel("No Critters");
		addCritterButton.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		this.add(addCritterButton);
		this.add(numberOfCrittersLabel);
	}
	
	/**
	 * the update method that's implemented from Observer
	 */
	public void update() {
		int numberOfCritters = gc.getNumberOfCritters();
		String text = Integer.toString(numberOfCritters);
		numberOfCrittersLabel.setText(text);
	}
	
	/**
	 * method called when an action even happens
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == addCritterButton) {
			gc.addCritter();
		}
	}
	
}
