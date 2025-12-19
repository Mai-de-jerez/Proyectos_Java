package POO;

public class Persona {
	
	// Atributos
	private String nombre;
	private String apellido;
	
	// Constructor
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	/*
	 * Método toString() sobrrescrito
	 */
	@Override
	public String toString() {
		return nombre + " " + apellido;
	}

	
	
	
	
	
	

}
