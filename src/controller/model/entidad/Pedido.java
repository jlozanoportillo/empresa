package controller.model.entidad;

public class Pedido {

	// Atributos
	private String nombreCliente;
	private String nombreProducto;
	private double valorPedido;
	private Cliente listaClientes;
	

	public Pedido(String nombreCliente, String nombreProducto, double valorPedido, Cliente listaClientes) {
		this.nombreCliente = nombreCliente;
		this.nombreProducto = nombreProducto;
		this.valorPedido = valorPedido;
		this.listaClientes = listaClientes;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}
	public Cliente getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Cliente listaClientes) {
		this.listaClientes = listaClientes;
	}
}
