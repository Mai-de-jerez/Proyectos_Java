package POO;

public enum TipoAutomovil {

	SEDAN("Sedan", "Auto Mediano", 4),
	STATION_WAGON("Station Wagon", "Auto grande", 5),
	HATCHBACK("Hatchback", "Auto Compacto", 5),
	PICKUP("Pickup", "Camioneta", 4),
	COUPE("Coupé","Auto pequeño",2),
	CONVERTIBLE("Convertible", "Auto deportivo",2),
	FURGON("Furgón", "Auto utilitario", 4);
	
	private final String nombre;
	private final int numPuertas;
	private final String descripcion;
	
	// Constructor
	private TipoAutomovil(String nombre, String descripcion, int numPuertas) {
		this.nombre = nombre;	
		this.descripcion = descripcion;
		this.numPuertas = numPuertas;
		
	// getters	
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
