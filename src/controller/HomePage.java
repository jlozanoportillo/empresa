package controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;

	public HomePage() {
		super("Pagina de Inicio");
//		getContentPane().setLayout(manager);
		setSize(900, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents();
		setVisible(true);
	}

	private void placeComponents() {
		getContentPane().setLayout(null);
		
		JPanel homePanel = new JPanel();
		homePanel.setBackground(Color.YELLOW);
		homePanel.setBounds(0, 0, 874, 461);
		getContentPane().add(homePanel);
				homePanel.setLayout(null);
				
				JPanel menuPanel = new JPanel();
				menuPanel.setBackground(new Color(0, 206, 209));
				menuPanel.setBounds(0, 0, 162, 461);
				homePanel.add(menuPanel);
				menuPanel.setLayout(null);
		
				JButton empleadoButton = new JButton("Empleado");
				empleadoButton.setBounds(20, 49, 123, 63);
				empleadoButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				empleadoButton.setBackground(Color.GRAY);
				menuPanel.add(empleadoButton);
		
				JButton productoButton = new JButton("Producto");
				productoButton.setBounds(20, 164, 123, 63);
				productoButton.setBackground(Color.GRAY);
				productoButton.setFont(new Font("Tahoma", Font.BOLD, 18));
				menuPanel.add(productoButton);
		JButton clienteButton = new JButton("Cliente");
		clienteButton.setBounds(20, 283, 123, 63);
		clienteButton.setBackground(Color.GRAY);
		clienteButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		menuPanel.add(clienteButton);
		
		JPanel conceptosPanel = new JPanel();
		conceptosPanel.setBackground(new Color(245, 222, 179));
		conceptosPanel.setBounds(162, 0, 712, 461);
		homePanel.add(conceptosPanel);
		conceptosPanel.setLayout(new CardLayout(0, 0));
		
		JPanel empleadoPanel = new JPanel();
		conceptosPanel.add(empleadoPanel, "name_8739982526199");
		empleadoPanel.setLayout(null);
		
		JLabel lblEmpleado = new JLabel("Empleado");
		lblEmpleado.setForeground(new Color(255, 0, 0));
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmpleado.setBounds(10, 11, 75, 14);
		empleadoPanel.add(lblEmpleado);
		
		JPanel productoPanel = new JPanel();
		conceptosPanel.add(productoPanel, "name_8874416263500");
		productoPanel.setLayout(null);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProducto.setForeground(new Color(255, 0, 0));
		lblProducto.setBounds(10, 11, 99, 23);
		productoPanel.add(lblProducto);
		
		JPanel clientePanel = new JPanel();
		conceptosPanel.add(clientePanel, "name_9012807975500");
		clientePanel.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 11, 66, 14);
		clientePanel.add(lblCliente);
	}
}
