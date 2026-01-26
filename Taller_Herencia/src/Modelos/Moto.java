package Modelos;

public class Moto extends Vehiculo {

	private int cilindrada;

	
	
	// constructor
	/**
	 * @param marca
	 * @param modelo
	 * @param cilindrada
	 */
	public Moto(int id, String marca, String modelo, Propietario dueño, TipoMotor motor,  int cilindrada) {
		super(id, marca, modelo, dueño, motor);
		this.cilindrada = cilindrada;
	}
	
	
	
	/**
	 * @return el cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}


	/**
	 * @param cilindrada el cilindrada a establecer
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	
	@Override
	public double calcularPresupuesto() {
	    double total = super.calcularPresupuesto();
	    
	    // Si es una moto "tocha", cobramos más mano de obra
	    if (this.cilindrada > 500) {
	        total += 30.0;
	    }
	    
	    return total;
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Cilindrada: "+ cilindrada);
	}



	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", toString()=" + super.toString() + "]";
	}
	

}
