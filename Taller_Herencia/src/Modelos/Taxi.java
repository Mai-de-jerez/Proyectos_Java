package Modelos;

public class Taxi extends Coche {
    
    private String marcaTaximetro;
    private String nombreEmpresa;

    public Taxi(int id, String marca, String modelo, Propietario dueño,TipoMotor motor,  int numPuertas, String marcaTaximetro, String nombreEmpresa) {
        // El super envía los datos al constructor de Coche
        super(id, marca, modelo, dueño,motor,  numPuertas);
        this.marcaTaximetro = marcaTaximetro;
        this.nombreEmpresa = nombreEmpresa; 
    } 
    
    

    /**
	 * @return el marcaTaximetro
	 */
	public String getMarcaTaximetro() {
		return marcaTaximetro;
	}



	/**
	 * @param marcaTaximetro el marcaTaximetro a establecer
	 */
	public void setMarcaTaximetro(String marcaTaximetro) {
		this.marcaTaximetro = marcaTaximetro;
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
	
	
	@Override
	public double calcularPresupuesto() {
	    // El super.calcularPresupuesto() de Taxi llamará al de COCHE
	    double totalCoche = super.calcularPresupuesto();
	    
	    // Aplicamos un 10% de descuento a los taxistas
	    return totalCoche * 0.9;
	}



	@Override
    public void mostrarInfo() {
        // Imprime lo de Vehiculo (id, marca, modelo) y lo de Coche (puertas)
        super.mostrarInfo();
        // Y ahora añadimos lo específico del Taxi
        System.out.println("Empresa: " + nombreEmpresa + " | Taxímetro: " + marcaTaximetro);
    }

	@Override
	public String toString() {
		return "Taxi [marcaTaximetro=" + marcaTaximetro + ", nombreEmpresa=" + nombreEmpresa + ", toString()="
				+ super.toString() + "]";
	}
    
    
   
}

    
