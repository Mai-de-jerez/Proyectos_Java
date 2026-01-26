package com.mai_de_jerez.app.hogar;


public class Persona {

	private String nombre;
	private String apellido;
	private ColorPelo colorPelo;
	
	public static final String GENERO_MASCULINO = "Masculino";
	public static final String GENERO_FEMENINO = "Femenino";
	
	
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
	
	
	/**
	 * @return el colorPelo
	 */
	public ColorPelo getColorPelo() {
		return colorPelo;
	}
	/**
	 * @param colorPelo el colorPelo a establecer
	 */
	public void setColorPelo(ColorPelo colorPelo) {
		this.colorPelo = colorPelo;
	}
	
	
	public String lanzarPelota() {
		return "lanza la pelota al perro!";
	}
	
	public static String saludar() {
		return "Hola que tal";
	}
	
	
	
	
	
	
	
	
	
}



