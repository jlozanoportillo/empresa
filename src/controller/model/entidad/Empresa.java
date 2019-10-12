package controller.model.entidad;

import java.util.ArrayList;

public class Empresa {

	// Atributos
	private String nombre;
	private int codigo;
	private String direccion;
	private Gerente gerente;
	private Administrador administrador;
	private Operario operario;
	ArrayList<Pedido> listaPedidos = new ArrayList<>();
	ArrayList<Cliente> listaClientes = new ArrayList<>();
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();

	// Metodo Constructor
	public Empresa(String nombre, int codigo, String direccion, Gerente gerente, Administrador administrador,
			Operario operario, ArrayList<Empleado> listaEmpleados, ArrayList<Pedido> listaPedidos,
			ArrayList<Cliente> listaClientes) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.direccion = direccion;
		this.gerente = gerente;
		this.administrador = administrador;
		this.operario = operario;
		this.listaEmpleados = listaEmpleados;
		this.listaPedidos = listaPedidos;
		this.listaClientes = listaClientes;
	}

	public Empresa() {
		this.listaEmpleados = new ArrayList<Empleado>();
		this.listaPedidos = new ArrayList<Pedido>();
		this.listaClientes = new ArrayList<Cliente>();
	}

	// Metodos set y get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	public Operario getOperario() {
		return operario;
	}

	public void setOperario(Operario operario) {
		this.operario = operario;
	}

	public ArrayList<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public void agregarCliente(String nombre, String apellido, String cedula, String direccion) {
		Cliente nuevoCliente = new Cliente();
		nuevoCliente.setNombre(nombre);
		nuevoCliente.setDireccion(direccion);
		nuevoCliente.setCedula(cedula);
		;
		getListaClientes().add(nuevoCliente);
	}

	public void actualizarCliente(String nombre, String apellido, String cedula, int telefono, String direccion) {
		Cliente cliente = obtenerCliente(cedula);

		if (cliente != null) {
			cliente.setNombre(nombre);
			cliente.setDireccion(direccion);
			cliente.setTelefono(telefono);
			cliente.setDireccion(direccion);
		}
	}

	public Boolean eliminarcliente(String cedulaCliente) {

		Boolean flagEliminado = false;
		Cliente cliente = obtenerCliente(cedulaCliente);

		if (cliente != null) {
			getListaClientes().remove(cliente);
			flagEliminado = true;
		}

		return flagEliminado;
	}

	public Cliente obtenerCliente(String cedulaCliente) {

		Cliente clienteEncontrado = null;

		for (Cliente cliente : listaClientes) {
			if (cliente.getCedula().equals(cedulaCliente)) {
				clienteEncontrado = cliente;
				break;
			}
		}

		return clienteEncontrado;
	}

	public void agregarEmpleado(String nombre, String codigo, String direccion) {

		Empleado empleado = new Empleado();
		empleado.setNombre(nombre);
		empleado.setCodigo(codigo);
		empleado.setDireccion(direccion);
		getListaEmpleados().add(empleado);
	}

	public Empleado obtenerEmpleado(String cedulaEmpleado) {

		Empleado empleado = null;

		for (Empleado empleados : listaEmpleados) {
			if (empleados.getCodigo().equals(cedulaEmpleado)) {
				empleado = empleados;
				break;
			}
		}

		return empleado;
	}

	// Metodo to String
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", codigo=" + codigo + ", direccion=" + direccion + "]";
	}

	public void actualizarEmpleado(String nombre, String cedula, String direccion) {
		Empleado empleado = obtenerEmpleado(cedula);

		if (empleado != null) {
			empleado.setNombre(nombre);
			empleado.setDireccion(direccion);
			empleado.setCodigo(cedula);
		}

	}
}
