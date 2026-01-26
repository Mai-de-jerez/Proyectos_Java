package ProyectoOrdenCompra;

public class Producto {

	private String fabricante;
	private String nombre;
	private int precio;
	
	
	/**
	 * @param fabricante
	 * @param nombre
	 * @param precio
	 */
	public Producto(String fabricante, String nombre, int precio) {
		super();
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.precio = precio;
	}


	/**
	 * @return el fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}


	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return el precio
	 */
	public int getPrecio() {
		return precio;
	}


	@Override
	public String toString() {
		return "Producto [fabricante=" + fabricante + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
}
