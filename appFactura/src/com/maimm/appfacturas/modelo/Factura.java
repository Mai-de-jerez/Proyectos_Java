package com.maimm.appfacturas.modelo;

import java.util.Date;

public class Factura {
	
	private int folio;
	private String descripcion;
	private Date fecha;
	private Cliente cliente;
	private ItemFactura[] items;
	private int indiceItems;
	public static final int MAX_ITEMS = 12;
	private static int ultimoFolio;
	
	/**
	 * @param descripcion
	 * @param cliente
	 */
	public Factura(String descripcion, Cliente cliente) {
		super();
		this.descripcion = descripcion;
		this.cliente = cliente;
		this.items = new ItemFactura[MAX_ITEMS];
		this.folio = ++ultimoFolio;
		this.fecha = new Date();
	}
	
	
	
	/**
	 * @return el folio
	 */
	public int getFolio() {
		return folio;
	}
	
	/**
	 * @return el descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion el descripcion a establecer
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return el fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha el fecha a establecer
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return el cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente el cliente a establecer
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * @return el items
	 */
	public ItemFactura[] getItems() {
		return items;
	}
	
	public void addItemFacrura(ItemFactura item) {
		if (indiceItems < MAX_ITEMS) {
			this.items[indiceItems++] = item;
		}
		
	}
	
	public float calcularTotal() {
		float total = 0.0f;
		for (ItemFactura item : this.items) {
			if (item == null) {
				continue;
			}
			
			total += item.calcularImporte();
		}
		
		return total; 
	}
	
	public String generarDetalle() {
		StringBuilder sb = new StringBuilder("Factura Nº: ");
		sb.append(folio)
		.append("\nCliente: ")
		.append(cliente.getNombre())
		.append("\t NIF: ")
		.append(cliente.getNif())
		.append("\nDescripción: ")
		.append(this.descripcion)
		.append("\n")
		.append("\n#\tNombre\t$\tCant.\tTotal\n");
		
		return sb.toString();
		
	}
		

}
