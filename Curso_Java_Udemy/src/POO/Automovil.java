package POO;

public class Automovil implements Comparable<Automovil>{
	
	// Atributos privados
	private int id;
	private String fabricante;
	private String modelo;
	private Motor motor;
	private Estanque estanque;
	private Persona conductor;
	private Rueda[] ruedas; 
	private int indiceRuedas;
	// privados que ahora son de tipo enum y no string
	private Color color = Color.GRIS ; 
	private TipoAutomovil tipo;
	
	// Atributos privados estáticos (lo tienen todos los objetos de la clase)
	// Se accede a ellos a través del nombre de la clase
	private static int capacidadEstanqueEstatico = 30;
	private static Color colorPatente = Color.NARANJA; // este tb se cambia a tipo Color
	private static int ultimoId;
	
	// Atributos públicos estáticos + final
	public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
	// NO puede ser modificado a posteriori porque es una constante, solo la podemos imprimir
	public static final int VELOCIDAD_MAX_CIUDAD = 60;
	public static final String COLOR_ROJO="Rojo";
	public static final String COLOR_AMARILLO="Amarillo";
	public static final String COLOR_AZUL="Azul";
	public static final String COLOR_BLANCO="Blanco";
	public static final String COLOR_GRIS="Gris Oscuro";
	
	
	
	// CONSTRUCTORES:
	
	public Automovil() {
		this.id = ++ultimoId;
		this.ruedas = new Rueda[5];
	}
	
	// Sobrecarga de constructores
	public Automovil(String fabricante, String modelo) {
		this();
		this.fabricante = fabricante;
		this.modelo = modelo;
	}
		
	
	public Automovil(String fabricante, String modelo, Color color) {
		this(fabricante, modelo); // reutilizamos los ya creados
		this.color = color;
	}
	
	
	public Automovil(String fabricante, String modelo, Color color, Motor motor) {
		this(fabricante, modelo, color);
		this.motor = motor;
	}
	
	
	public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
		this(fabricante, modelo, color, motor);
		this.estanque = estanque;
	}
	
	/**
	 * @param fabricante
	 * @param modelo
	 * @param motor
	 * @param estanque
	 * @param conductor
	 * @param ruedas
	 * @param color
	 */
	public Automovil(String fabricante, String modelo, Motor motor, Estanque estanque, Persona conductor,
			Rueda[] ruedas, Color color) {
		this(fabricante, modelo, color, motor, estanque);
		this.conductor = conductor;
		this.ruedas = ruedas;

	}

	// GETTERS AND SETTERS

	// como los métodos son privados no se pueden leer desde fuera de la clase
	// hay que hacerlo asi, POR CONVENCION SE USA get
	
	// tiene que ser estatico porque es un atributo estático
	public static Color getColorPatente() {
		return colorPatente;
	}
	
	public static void setColorPatente(Color colorPatente) {
		Automovil.colorPatente = colorPatente;
		// para diferenciar la variable del atributo de la clase ponemos delante Automovil()
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	

	public String getModelo() {
		return this.modelo;
	}
	
	
	public static int getCapacidadEstanqueEstatico() {
		return capacidadEstanqueEstatico;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	


	public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
		Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	/**
	 * @return el motor
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * @param motor el motor a establecer
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	/**
	 * @return el estanque
	 */
	public Estanque getEstanque() {
		if(estanque==null) {
			this.estanque= new Estanque();
		}
		return estanque;
	}

	/**
	 * @param estanque el estanque a establecer
	 */
	public void setEstanque(Estanque estanque) {
		this.estanque = estanque;
	}
	
	

	/**
	 * @return el conductor
	 */
	public Persona getConductor() {
		return conductor;
	}

	/**
	 * @param conductor el conductor a establecer
	 */
	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}

	/**
	 * @return el ruedas
	 */
	public Rueda[] getRuedas() {
		return ruedas;
	}

	/**
	 * @param ruedas el ruedas a establecer
	 */
	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public TipoAutomovil getTipo() {
		return tipo;
	}

	public void setTipo(TipoAutomovil tipo) {
		this.tipo = tipo;
	} 
	
	// MÉTODOS:
	

	/*
	 * Método para añadir las ruedas de una en una y valida que no metas mas de 5
	 * @param rueda
	 */
	public Automovil addRueda(Rueda rueda) {
		if(indiceRuedas < this.ruedas.length) {
		this.ruedas[indiceRuedas++] = rueda;
		}
		return this;
	}
	
	// Método que imprime el detalle del vehiculo
	public String verDetalle() {
		String detalle = "\nId de auto: "+ this.id + 
				"\nFabricante auto: "+ this.getFabricante() +
				"\nModelo auto: "+ this.getModelo();
				
		if(this.getTipo() != null) {
			
				detalle +="\nTipo Automóvil: "+ this.getTipo().getDescripcion();
		}
		
		detalle += "\nColor auto: "+ this.color +
			"\nColor patente: "+ colorPatente;
		
		if(this.motor != null) {
			detalle += "\nCilindrada auto: "+ this.motor.getCilindrada();
		}
		
		if(conductor!=null) {
			detalle += "\nConductor: "+ this.getConductor();
		}
		
		if(getRuedas()!=null) {
			detalle += "\nRuedas del Automóvil: ";
			for (Rueda r: this.getRuedas()) {
				detalle += "\nFabricante: " + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho();
			}
		}
		
		return detalle;
	}    
	
	/* Método que imprime el detalle del vehiculo (otra forma)
	   
	    public String detalle2() {
	    StringBuilder sb = new StringBuilder();
		sb.append("\nFabricante auto: "+ this.fabricante);
		sb.append("\nModelo auto: "+ this.modelo);
		sb.append("\nColor auto: "+ this.color);
		sb.append("\nCilindrada auto: "+ this.cilindrada);
		return sb.toString();
	}
	*/
	
	public String acelerar(int rpm) {
		return "\nEl auto " + this.fabricante + " acelerando a " + rpm + " rpm";
	}
	
	public String frenar() {
		return this.fabricante + " " + this.modelo + " frenando." ;
	}
	
	public String acelerarFrenar (int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar;
	}
	
	// sobrecarga de métodos
	public float calcularConsumo(int km, float porcentajeBencina) {
		return km/(this.getEstanque().getCapacidad()*porcentajeBencina);
	}
	
	public float calcularConsumo(int km, int porcentajeBencina) {
		return km/(this.getEstanque().getCapacidad()*(porcentajeBencina/100f));
	}
	
	public static float calcularConsumoEstatico(int km, int porcentajeBencina) {
		return km/(Automovil.capacidadEstanqueEstatico * (porcentajeBencina/100f));
	}
	
	

	
	
	/* 
	 * Método equals()
	 * Generar: clic derecho > codigo fuente > generar hasCode() y equals()
	 * Sobreescribir método equals(): clic derecho > codigo fuente > alterar temporalmente/implementar métodos
	 */
		 


	@Override
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true; 
		}
		if (!(obj instanceof Automovil)) {
			return false; 
		}
		Automovil a = (Automovil) obj;
		return (this.fabricante != null && this.modelo != null
				&& this.fabricante.equals(a.getFabricante()) 
				&& this.modelo.equals(a.getModelo()));
	}

	
	/*
	 * Generar: (clic derecho > codigo fuente > Generar toString()
	 * Ayuda a leer los atributos del objeto
	 * Lo hemos sobreescrito para que solo devuelva modelo y fabricante
	 */
	
	@Override
	public String toString() {
		return "Automovil [id="+ id +"fabricante=" + fabricante + ", modelo=" + modelo + "]";
	}

	@Override
	public int compareTo(Automovil a) {	
		return this.fabricante.compareTo(a.fabricante);
	}  
	
	
	
}
