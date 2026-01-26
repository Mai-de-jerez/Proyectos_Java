package com.maimm.appfacturas.modelo;

public class Producto {

	private int codigo;
	private String nombre;
	private float precio;
	private static int ultimoCodigo;
	
	
	// Constructor
	
	/**
	 * @param codigo
	 */
	public Producto() {
		this.codigo = ++ultimoCodigo;
	}

	/**
	 * @return el codigo
	 */
	public int getCodigo() {
		return codigo;
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
	 * @return el precio
	 */
	public float getPrecio() {
		return precio;
	}
	/**
	 * @param precio el precio a establecer
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
	
	
	
	
}
