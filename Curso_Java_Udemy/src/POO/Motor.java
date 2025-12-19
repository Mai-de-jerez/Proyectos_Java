package POO;

public class Motor {

	private double cilindrada;
	private TipoMotor tipo;
	
	// CONSTRUCTORES
	
	public Motor(double cilindrada, TipoMotor tipo) {
		super();
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}
	
	
	public Motor() {
		super();
	}


	// GETTERS AND SETTERS
	
	/**
	 * @return el cilindrada
	 */
	public double getCilindrada() {
		return cilindrada;
	}
	
	/**
	 * @param cilindrada el cilindrada a establecer
	 */
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	/**
	 * @return el tipo
	 */
	public TipoMotor getTipo() {
		return tipo;
	}
	/**
	 * @param tipo el tipo a establecer
	 */
	public void setTipo(TipoMotor tipo) {
		this.tipo = tipo;
	}
	
	
	
}
