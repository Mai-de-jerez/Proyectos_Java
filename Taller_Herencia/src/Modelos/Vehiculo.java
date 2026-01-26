package Modelos;

public class Vehiculo {
	
	protected int id;
	protected String marca;
	protected String modelo;
	protected Propietario dueño;
	protected TipoMotor motor;
	
	/**
	 * @param marca
	 * @param modelo
	 */
	public Vehiculo(int id, String marca, String modelo, Propietario dueño, TipoMotor motor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.dueño = dueño;
        this.motor = motor;
    }
	
	
	// GETTERS AND SETTERS
	
	
	/**
	 * @return el motor
	 */
	public TipoMotor getMotor() {
		return motor;
	}


	/**
	 * @param motor el motor a establecer
	 */
	public void setMotor(TipoMotor motor) {
		this.motor = motor;
	}


	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}
	
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
	 * @return el dueño
	 */
	public Propietario getDueño() {
		return dueño;
	}


	/**
	 * @param dueño el dueño a establecer
	 */
	public void setDueño(Propietario dueño) {
		this.dueño = dueño;
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
	
	public void mostrarInfo() {
		System.out.println("ID: " + id + " | " + marca + " " + modelo + " | Dueño: " + dueño.getNombre() + " " + dueño.getApellido() +" | Motor: " + motor);
	}
	
	
	
	public double calcularPresupuesto() {
	    double precioBase = 50.0;
	    
	    // El precio varía según el motor
	    switch (this.motor) {
	        case ELECTRICO:
	            return precioBase + 20.0; 
	        case HIBRIDO:
	            return precioBase + 15.0;
	        case DIESEL:
	            return precioBase + 10.0;
	        case GASOLINA:
	        default:
	            return precioBase;
	    }
	}


	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", dueño=" + dueño + ", motor="
				+ motor + "]";
	}


	


	
	


	
	
	
	
	
	
	

}
