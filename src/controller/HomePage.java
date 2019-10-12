package controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;

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

		JPanel conceptosPanel = new JPanel();
		conceptosPanel.setBackground(new Color(245, 222, 179));
		conceptosPanel.setBounds(162, 0, 712, 461);
		homePanel.add(conceptosPanel);
		CardLayout cardLayoutController = new CardLayout(0, 0);
		conceptosPanel.setLayout(cardLayoutController);

		// EMPLEADO
		JLabel lblEmpleado = new JLabel("Empleado");
		lblEmpleado.setForeground(new Color(255, 0, 0));
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmpleado.setBounds(10, 11, 75, 14);

		JPanel empleadoPanel = new JPanel();
		empleadoPanel.setLayout(null);
		empleadoPanel.add(lblEmpleado);

		// PRODUCTO
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProducto.setForeground(new Color(255, 0, 0));
		lblProducto.setBounds(10, 11, 99, 23);

		JPanel productoPanel = new JPanel();
		productoPanel.setLayout(null);
		productoPanel.add(lblProducto);

		// CLIENTE
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setForeground(new Color(255, 0, 0));
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCliente.setBackground(new Color(255, 0, 0));
		lblCliente.setBounds(10, 11, 66, 14);

		JPanel clientePanel = new JPanel();
		clientePanel.setLayout(null);
		clientePanel.add(lblCliente);

		// AGREGAMOS LOS PANELES AL CARDLAYOUT
		conceptosPanel.add(empleadoPanel, "empleadoPanel");
		conceptosPanel.add(productoPanel, "productoPanel");
		conceptosPanel.add(clientePanel, "clientePanel");

		// CREAMOS LOS BOTONES DEL MENU Y LES DAMOS ACTIONS
		JButton empleadoButton = new JButton("Empleado");
		empleadoButton.setBounds(20, 49, 123, 63);
		empleadoButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		empleadoButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayoutController.show(conceptosPanel, "empleadoPanel");

			}
		});

		JButton productoButton = new JButton("Producto");
		productoButton.setBounds(20, 164, 123, 63);
		productoButton.setBackground(Color.GRAY);
		productoButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		productoButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayoutController.show(conceptosPanel, "productoPanel");

			}
		});

		JButton clienteButton = new JButton("Cliente");
		clienteButton.setBounds(20, 283, 123, 63);
		clienteButton.setBackground(Color.GRAY);
		clienteButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		clienteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayoutController.show(conceptosPanel, "clientePanel");

			}
		});
		
		menuPanel.add(empleadoButton);
		menuPanel.add(productoButton);
		menuPanel.add(clienteButton);

	}

}
