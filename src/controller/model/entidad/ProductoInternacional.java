package controller.model.entidad;

public class ProductoInternacional extends Producto {

	//Atributos 
	private int codigoExportacion;
	private String paisDestino;
	
	public ProductoInternacional(String nombre, int codigo, int codigoExportacion, String paisDestino ) {
		super(nombre, codigo);
		this.codigoExportacion = codigoExportacion;
		this.paisDestino = paisDestino;
	}
	
	//Metodos set y get
	public int getCodigoExportacion() {
		return codigoExportacion;
	}

	public void setCodigoExportacion(int codigoExportacion) {
		this.codigoExportacion = codigoExportacion;
	}

	public String getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

}
