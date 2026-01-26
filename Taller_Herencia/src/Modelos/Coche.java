package Modelos;

public class Coche extends Vehiculo {

	private int numPuertas;

	/**
	 * @param marca
	 * @param modelo
	 * @param numPuertas
	 */
	public Coche(int id, String marca, String modelo, Propietario dueño, TipoMotor motor,  int numPuertas) {
		super(id, marca, modelo, dueño, motor);
		this.numPuertas = numPuertas;
		
	}
	
	
	// getters and setters
	
	/**
	 * @return el numPuertas
	 */
	public int getNumPuertas() {
		return numPuertas;
	}


	/**
	 * @param numPuertas el numPuertas a establecer
	 */
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	
	@Override
	public double calcularPresupuesto() {
	    // Cogemos lo que diga el padre según el motor
	    double total = super.calcularPresupuesto();
	    
	    // Añadimos un extra por cada puerta (por ejemplo 5€)
	    total += (this.numPuertas * 5);
	    
	    return total;
	}
	
	
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Puertas: "+ numPuertas);
	}



	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + ", toString()=" + super.toString() + "]";
	}
	
}
