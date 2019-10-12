package controller.model.entidad;

public class Empleado {
	
	private String nombre;
	private String codigo;
	private String direccion;
	
	public Empleado() {
		
	}
	
	
	public Empleado(String nombre, String codigo, String direccion) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.direccion = direccion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
