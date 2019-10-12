package controller.model.entidad;

public class Empaque {

	//Atributos
	private Operario operario;
	private Producto producto;

 /**
  * Metodo constructor
  * @param operario
  * @param producto
  */
	public Empaque(Operario operario, Producto producto) {
		this.operario = operario;
		this.producto = producto;
	}
	
	//Metodos set y get
	public Operario getOperario() {
		return operario;
	}


	public void setOperario(Operario operario) {
		this.operario = operario;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
