package POO;

public class Rueda {

	
	// ATRIBUTOS
	private String fabricante;
	private int aro;
	private double ancho;
	
	
	// CONSTRUCTORES
	/**
	 * @param fabricante
	 * @param aro
	 * @param ancho
	 */
	public Rueda(String fabricante, int aro, double ancho) {
		super();
		this.fabricante = fabricante;
		this.aro = aro;
		this.ancho = ancho;	
	}


	// GETTERS 
	
	/**
	 * @return el fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}


	/**
	 * @return el aro
	 */
	public int getAro() {
		return aro;
	}



	/**
	 * @return el ancho
	 */
	public double getAncho() {
		return ancho;
	}

}
