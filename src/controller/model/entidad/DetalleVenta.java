package controller.model.entidad;

public class DetalleVenta {

	//Atributos 
	private Producto producto;
	private Pedido pedido;
	private String fecha;
	private double total_Iva;
	

	public DetalleVenta(Producto producto, Pedido pedido, String fecha, double total_Iva) {
		this.producto = producto;
		this.pedido = pedido;
		this.fecha = fecha;
		this.total_Iva = total_Iva;
	}
	
	//Metodos set y get
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getTotal_Iva() {
		return total_Iva;
	}

	public void setTotal_Iva(double total_Iva) {
		this.total_Iva = total_Iva;
	}
	
}
