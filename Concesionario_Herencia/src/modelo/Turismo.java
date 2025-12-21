package modelo;

public abstract class Turismo extends Vehiculo {

	
	// Atributos
	
	protected int puertas;
	protected int maletero;
	
	

	/**
	 * constructor
	 * @param marca
	 * @param modelo
	 * @param matricula
	 * @param propietario
	 * @param puertas
	 * @param maletero
	 */
	public Turismo(String marca, String modelo, String matricula, Propietario propietario, int puertas, int maletero) {
		super(marca, modelo, matricula, propietario);
		this.puertas = puertas;
		this.maletero = maletero;
	}


	/**
	 * @return el puertas
	 */
	public int getPuertas() {
		return puertas;
	}

	
	/**
	 * @param puertas el puertas a establecer
	 */
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}


	/**
	 * @return el maletero
	 */
	public int getMaletero() {
		return maletero;
	}



	/**
	 * @param maletero el maletero a establecer
	 */
	public void setMaletero(int maletero) {
		this.maletero = maletero;
	}



	@Override
	public String toString() {
		return "Turismo [puertas=" + puertas + ", maletero=" + maletero + ", marca=" + getMarca()
				+ ", modelo=" + getModelo() + ", matricula=" + getMatricula() + "]";
	}



	



	



	



	



	



	

	
	
	
	
	
	
}
