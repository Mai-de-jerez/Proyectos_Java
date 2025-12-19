package modelo;

public class Vehiculo {

	// Atributos
	private String marca;
	private String modelo;
	private String matricula;
	
	// Constructores
	
	
	/**
	 * @param marca
	 * @param modelo
	 * @param matricula
	 */
	public Vehiculo(String marca, String modelo, String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}
	
	public Vehiculo() {
		
	}

	
	
	// GETTERS & SETTERS
	
	/**
	 * @return el marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca el marca a establecer
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return el modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo el modelo a establecer
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return el matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula el matricula a establecer
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
