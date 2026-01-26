package Modelos;


public class Propietario {

	private String nombre;
	private String apellido;
	
	
	/**
	 * constructor
	 * @param nombre
	 * @param apellido
	 */
	public Propietario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return el apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @param apellido el apellido a establecer
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
