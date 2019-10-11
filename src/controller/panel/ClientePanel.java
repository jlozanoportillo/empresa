package controller.panel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientePanel extends JPanel{

	
	public ClientePanel() {
		super();
//		setSize(200,200);
		setBackground( Color.cyan);
		setVisible(true);
	}
	public void init() {
		JLabel titlePanel = new JLabel("Cliente");
		add(titlePanel);
	}
	
}
