package controller.model.entidad;

public class Cliente {

	//Atributos
	private String nombre;
	private String direccion;
	private int telefono;
	private String cedula;
	

	public Cliente(String nombre, String direccion, int telefono, String cedula ) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cedula = cedula;
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	//Metodos set y get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}
