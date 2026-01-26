package modelo;


public class Coche {

	
	// Atributos
	private int id;
	private String marca;
	private String modelo;
	private String matricula;
	private String color;
	private Double precio;
	private int km;
	private String anio;
	private TipoMotor tipoMotor;
	private int numPuertas;	
	private EstadoVehiculo estado;
	
	 

	/**
	 * constructor vacío
	 */
	
	public Coche() {
		super();
	}	
	
	/**
	 * @param id
	 * @param marca
	 * @param modelo
	 * @param matricula
	 * @param color
	 * @param precio
	 * @param km
	 * @param anio
	 * @param tipoMotor
	 * @param numPuertas
	 * @param estado
	 */
	public Coche(int id, String marca, String modelo, String matricula, String color, Double precio, int km,
			String anio, TipoMotor tipoMotor, int numPuertas, EstadoVehiculo estado) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.color = color;
		this.precio = precio;
		this.km = km;
		this.anio = anio;
		this.tipoMotor = tipoMotor;
		this.numPuertas = numPuertas;
		this.estado = estado;
	}
	
	// Getters y Setters
	

	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
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

	/**
	 * @return el color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color el color a establecer
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return el precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio el precio a establecer
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return el km
	 */
	public int getKm() {
		return km;
	}

	/**
	 * @param km el km a establecer
	 */
	public void setKm(int km) {
		this.km = km;
	}

	/**
	 * @return el anio
	 */
	public String getAnio() {
		return anio;
	}

	/**
	 * @param anio el anio a establecer
	 */
	public void setAnio(String anio) {
		this.anio = anio;
	}

	/**
	 * @return el tipoMotor
	 */
	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}

	/**
	 * @param tipoMotor el tipoMotor a establecer
	 */
	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

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

	/**
	 * @return el estado
	 */
	public EstadoVehiculo getEstado() {
		return estado;
	}

	/**
	 * @param estado el estado a establecer
	 */
	public void setEstado(EstadoVehiculo estado) {
		this.estado = estado; 
	}
	
	// Métodos personales
	
	public String getPrecioFormateado() {
        return String.format("%.2f €", this.precio);
    }
	
	public boolean isDisponible() {
        return this.estado == EstadoVehiculo.DISPONIBLE;
    }

    public boolean isReservado() {
        return this.estado == EstadoVehiculo.RESERVADO;
    }

    public boolean isVendido() {
        return this.estado == EstadoVehiculo.VENDIDO;
    }

	
	// toString
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", color="
				+ color + ", precio=" + precio + ", km=" + km + ", anio=" + anio + ", tipoMotor=" + tipoMotor
				+ ", numPuertas=" + numPuertas + ", estado=" + estado + "]";
	}	
	
}

	
