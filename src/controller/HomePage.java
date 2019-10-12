package controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controller.model.entidad.Empleado; 

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTable empleadoTable;
	private JTable productoTable;
	private JTable clienteTable; 
	DefaultTableModel empleadoTableModel;

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


		
		 //termina la carga de tabla
		JButton btnAgregarEmpleado = new JButton("Agregar Empleado");
		btnAgregarEmpleado.setBounds(20, 386, 121, 34);
		empleadoPanel.add(btnAgregarEmpleado);
		
		JButton btnEliminarempleado = new JButton("EliminarEmpleado");
		btnEliminarempleado.setBounds(174, 386, 121, 34);
		empleadoPanel.add(btnEliminarempleado);
		
		JButton btnEditarEmpleado = new JButton("Editar Empleado");
		btnEditarEmpleado.setBounds(331, 386, 121, 34);
		empleadoPanel.add(btnEditarEmpleado);
		
		// AGREGAMOS LOS PANELES AL CARDLAYOUT
		conceptosPanel.add(empleadoPanel, "empleadoPanel");
		conceptosPanel.add(productoPanel, "productoPanel");
		conceptosPanel.add(clientePanel, "clientePanel");
		cargaTablaEmpleado(empleadoPanel);
		
		JLabel lblNombreEmpleado = new JLabel("Nombre:");
		lblNombreEmpleado.setBounds(490, 96, 46, 14);
		empleadoPanel.add(lblNombreEmpleado);
		
		JLabel lblCodigoEmpleado = new JLabel("Codigo");
		lblCodigoEmpleado.setBounds(490, 135, 46, 14);
		empleadoPanel.add(lblCodigoEmpleado);
		
		JLabel lblDireccionEmpleado = new JLabel("Direccion");
		lblDireccionEmpleado.setBounds(490, 170, 46, 14);
		empleadoPanel.add(lblDireccionEmpleado);
		
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
		empleadoTable = new JTable();
		empleadoTable.setBorder(new LineBorder(new Color(128, 128, 0), 2));
		empleadoTable.setEnabled(true);
		empleadoTableModel = new DefaultTableModel(
				cargarDataEmpleados(),
				new String[] {
					"Nombre", "Codigo", "Direccion"
				}
			);
		empleadoTable.setModel(empleadoTableModel);	 
		empleadoTable.setBounds(20, 36, 432, 310);
		cargarDataEmpleados();
		panelEmpleado.add(empleadoTable);		
	}
	public Object[][] cargarDataEmpleados() {
		System.out.println("hola llege punto 1");
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(new Empleado("daniel-1", "cod1", "direccion1"));
		empleados.add(new Empleado("daniel-2", "cod2", "direccion2"));
		empleados.add(new Empleado("daniel-3", "cod3", "direccion3"));
		empleados.add(new Empleado("daniel-4", "cod4", "direccion4"));
		empleados.add(new Empleado("daniel-5", "cod5", "direccion5"));
		empleados.add(new Empleado("daniel-6", "cod6", "direccion6"));
		empleados.add(new Empleado("daniel-7", "cod7", "direccion7"));
		empleados.add(new Empleado("daniel-8", "cod8", "direccion8"));
		
		if(empleados == null || empleados.isEmpty()) {
			return new Object[][] {
			};
		}
		Object[][] data = new Object [empleados.size()][3];
		
		for (int i = 0; i < empleados.size(); i++) {
			data[i][0]=empleados.get(i).getNombre();
			data[i][1]=empleados.get(i).getCodigo();
			data[i][2]=empleados.get(i).getDireccion();
			
		}
	System.out.println("hola llege punto 2");
		return data;
	}
	
	
}
