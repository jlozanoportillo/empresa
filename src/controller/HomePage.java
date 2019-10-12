package controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable; 

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTable empleadoTable;
	private JTable productoTable;
	private JTable clienteTable;

	public HomePage() {
		super("Pagina de Inicio");
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
		lblEmpleado.setBounds(10, 11, 75, 14);
		lblEmpleado.setForeground(new Color(255, 0, 0));
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 14));

		JPanel empleadoPanel = new JPanel();
		empleadoPanel.setLayout(null);
		empleadoPanel.add(lblEmpleado);
		//CARGA TABLA EMPLEADO
		String[] columns = new String[] {
	            "Nombre", "Codigo", "Direccion"
	        };
		Object[][] data = new Object[][] {
            {  "John",  "001", "Direccion1" },
            {  "Rambo", "002", "Direccion2" },
            {  "Zorro", "003", "Direccion3" },
        };
        
        JTable table = new JTable(data, columns);
        table.setBounds(30,40,200,300);
        JScrollPane scrollPane = new JScrollPane(table);
        empleadoPanel.add(scrollPane);
		cargaTablaEmpleado(empleadoPanel);
		//FIN DE CARGA TABLA EMPLEADO

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
		empleadoButton.setBackground(Color.GREEN);

		JButton productoButton = new JButton("Producto");
		productoButton.setBounds(20, 164, 123, 63);
		productoButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		productoButton.setBackground(Color.GRAY);

		JButton clienteButton = new JButton("Cliente");
		clienteButton.setBounds(20, 283, 123, 63);
		clienteButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		clienteButton.setBackground(Color.GRAY);
		
		empleadoButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayoutController.show(conceptosPanel, "empleadoPanel"); 
				empleadoButton.setBackground(Color.GREEN);
				productoButton.setBackground(Color.GRAY);
				clienteButton.setBackground(Color.GRAY);
			}
		});
		
		productoButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayoutController.show(conceptosPanel, "productoPanel");  
				empleadoButton.setBackground(Color.GRAY);
				productoButton.setBackground(Color.GREEN);
				clienteButton.setBackground(Color.GRAY);
			}
		});
		
		clienteButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayoutController.show(conceptosPanel, "clientePanel"); 
				empleadoButton.setBackground(Color.GRAY);
				productoButton.setBackground(Color.GRAY);
				clienteButton.setBackground(Color.GREEN);
			}
		});
		
		menuPanel.add(empleadoButton);
		menuPanel.add(productoButton);
		menuPanel.add(clienteButton);

	}
	
	public void cargaTablaEmpleado(JPanel panelEmpleado) {
//		String[] columns = new String[] {
//	            "Nombre", "Codigo", "Direccion"
//	        };
//		Object[][] data = new Object[][] {
//            {  "John",  "001", "Direccion1" },
//            {  "Rambo", "002", "Direccion2" },
//            {  "Zorro", "003", "Direccion3" },
//        };
//        
//        JTable table = new JTable(data, columns);
//        table.setBounds(30,40,200,300);
//        JScrollPane scrollPane = new JScrollPane(table);
//        panelEmpleado.add(scrollPane);
		
	}
	
	
	
	
	
	
	
	
	
	
}
