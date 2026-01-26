package com.maimm.appfacturas.modelo;

public class ItemFactura {
	
	// Atributos
	
	private int cantidad;
	private Producto producto;
	
	// Constructores
	
	/**
	 * @param cantidad
	 * @param producto
	 */
	public ItemFactura(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}
	
	
	// Getters and setters

	public int getCantidad() {
		return cantidad;
	}
	
	/**
	 * @param cantidad el cantidad a establecer
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return el producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto el producto a establecer
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public float calcularImporte() {
		return this.cantidad * this.producto.getPrecio();
		}



	
	
	

}
