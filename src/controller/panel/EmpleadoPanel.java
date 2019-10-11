package controller.panel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmpleadoPanel extends JPanel{

	
	public EmpleadoPanel() {
		super();
//		setSize(200,200);
		setBackground( Color.cyan);
		setVisible(true);
	}
	public void init() {
		JLabel titlePanel = new JLabel("Empleado");
		add(titlePanel);
	}
	
}
