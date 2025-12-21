package modelo;

public abstract class Vehiculo {

	// Atributos
	private String marca;
	private String modelo;
	private String matricula;
	private Propietario propietario;
	
	// Constructores
	
	
	public Vehiculo() {
		
	}
	
	/**
	 * constructor
	 * @param marca
	 * @param modelo
	 * @param matricula
	 * @param propietario
	 */
	public Vehiculo(String marca, String modelo, String matricula, Propietario propietario) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.propietario = propietario;
	}

	// GETTERS & SETTERS
	
	/**
	 * @return la marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca a establecer de tipo string
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
	 * @param modelo a establecer
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
	

	/**
	 * @return el propietario
	 */
	public Propietario getPropietario() {
		return propietario;
	}

	/**
	 * @param propietario el propietario a establecer
	 */
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
