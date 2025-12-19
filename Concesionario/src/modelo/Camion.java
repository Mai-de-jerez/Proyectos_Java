package modelo;

public class Camion extends Vehiculo{

	private int carga;	
	private Tipo tipo;
	/**
	 * @param marca
	 * @param modelo
	 * @param matricula
	 * @param carga
	 * @param tipo
	 */
	
	
	public Camion(String marca, String modelo, String matricula, int carga, Tipo tipo) {
		super(marca, modelo, matricula);
		this.carga = carga;
		this.tipo = tipo;
	}
	/**
	 * @return el carga
	 */
	public int getCarga() {
		return carga;
	}
	/**
	 * @param carga el carga a establecer
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}
	/**
	 * @return el tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}
	/**
	 * @param tipo el tipo a establecer
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Camion [carga=" + carga + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
	
	
}
