package modelo;

public class NaveEstelarFundacion {
	// atributos
	private String nombre;
	private String modelo;
	private int escudo;
	private int velocidadMaxima;
	private int misionesCompletadas;
	
	// Constructores
	// Con atributos preestablecidos
	public NaveEstelarFundacion() {
		super();
		this.nombre = "Halcón Milenario";
		this.modelo = "YT-1300";
		this.escudo = 50;
		this.velocidadMaxima = 2000;
		this.misionesCompletadas = 0; 
	}
	
	
	// en este al llamarlo solo debemos pasar 2 parametros  el resto se generan aleatorios y misiones completadas por defecto en 0.
	public NaveEstelarFundacion(String nombre, String modelo) {
		this.nombre = nombre;
		this.modelo = modelo;
		escudo = generarAleatorio(40, 90);
		velocidadMaxima = generarAleatorio(1500, 4000); 
		misionesCompletadas = 0;
	}



    // aqui pasaremos nosotros todos los parametros al construir el objeto nave
	public NaveEstelarFundacion(String nombre, String modelo, int escudo, int velocidadMaxima,
			int misionesCompletadas) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.escudo = escudo;
		this.velocidadMaxima = velocidadMaxima;
		this.misionesCompletadas = misionesCompletadas;
	} 
	

	/*
	 * Estos metodos asignan (setters) y obtener (getters) los valores de los atributos privados
	 */
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getEscudo() {
		return escudo;
	}



	public void setEscudo(int escudo) {
		this.escudo = escudo;
	}



	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}



	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}



	public int getMisionesCompletadas() {
		return misionesCompletadas;
	}



	public void setMisionesCompletadas(int misionesCompletadas) {
		this.misionesCompletadas = misionesCompletadas;
	}
	
	
	/**
	 * Método auxiliar para generar con Math.random() valores aleatorios para los atributos en un momento dado
	 * @param min valor minimo que queremos para el aleatorio generado
	 * @param max valor maximo que queremos para el aleatorio generado
	 * @return
	 */
	private int generarAleatorio(int min, int max) { 
		return (int)(Math.random() * (max - min + 1)) + min; 
		}

	/**
	 * Método que retorna un mensaje al ser llamado. Donde imprime nombre, modelo, escudo y velocidad máxima de la nave.
	 * @return mensaje de regreso en forma de String
	 */
	public String desplegar() {
		return "La nave "+getNombre()+", modelo "+getModelo()+", se despliega con escudo "+getEscudo()+"% y velocidad máxima: "
		+getVelocidadMaxima()+" km/s." ;
	}
	
	/**
	 * Método para incrementar en uno las misiones completadas de una nave al ser llamado.
	 */
	public void registrarMision() {
		this.misionesCompletadas++;
	}



	@Override
	public String toString() {
		return "NaveEstelarFundacion [nombre=" + nombre + ", modelo=" + modelo + ", escudo=" + escudo
				+ ", velocidadMaxima=" + velocidadMaxima + ", misionesCompletadas=" + misionesCompletadas + "]";
	}
	
	
	
	
	
	
	
	
}
