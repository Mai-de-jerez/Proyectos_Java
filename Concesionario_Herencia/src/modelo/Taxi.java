package modelo;

public class Taxi extends Turismo {

	private String nombreEmpresa;
	private Propulsion propulsion;
	


	/**
	 * constructor
	 * @param marca
	 * @param modelo
	 * @param matricula
	 * @param propietario
	 * @param puertas
	 * @param maletero
	 * @param nombreEmpresa
	 * @param propulsion
	 */
	public Taxi(String marca, String modelo, String matricula, Propietario propietario, int puertas, int maletero,
			String nombreEmpresa, Propulsion propulsion) {
		super(marca, modelo, matricula, propietario, puertas, maletero);
		this.nombreEmpresa = nombreEmpresa;
		this.propulsion = propulsion;
	}


	/**
	 * @return el nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	/**
	 * @param nombreEmpresa el nombreEmpresa a establecer
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	/**
	 * @return el propulsion
	 */
	public Propulsion getPropulsion() {
		return propulsion;
	}


	/**
	 * @param propulsion el propulsion a establecer
	 */
	public void setPropulsion(Propulsion propulsion) {
		this.propulsion = propulsion;
	}


	@Override
	public String toString() {
		return "Taxi [nombreEmpresa=" + nombreEmpresa + ", propulsion=" + propulsion + ", "
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	
}
