package controller;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.panel.EmpleadoPanel;

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;

	public HomePage() {
		super("Pagina de Inicio");
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents();
		setVisible(true);
	}

	private void placeComponents() {
		setLayout(null);
		JButton clienteButton = new JButton("Cliente");
		clienteButton.setBounds(40, 20, 200, 40);
		add(clienteButton);

		JButton empleadoButton = new JButton("Empleado");
		empleadoButton.setBounds(40, 80, 200, 40);
		add(empleadoButton);

		JButton productoButton = new JButton("Producto");
		productoButton.setBounds(40, 140, 200, 40);
		add(productoButton);
		
		EmpleadoPanel empleadoPanel = new EmpleadoPanel();
		empleadoPanel.setBounds(260, 20 , 600, 400);
		add(empleadoPanel);
	}
}
