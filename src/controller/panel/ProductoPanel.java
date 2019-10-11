package controller.panel;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProductoPanel extends JPanel{

	
	public ProductoPanel() {
		super();
//		setSize(200,200);
		setBackground( Color.cyan);
		setVisible(true);
	}
	public void init() {
		JLabel titlePanel = new JLabel("Producto");
		add(titlePanel);
	}
	
}
