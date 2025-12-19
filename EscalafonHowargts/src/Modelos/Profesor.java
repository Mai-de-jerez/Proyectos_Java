package Modelos;

public class Profesor extends Hechicero {

	// Atributos
	private String asignatura;
	private int prestigio;
	
	
	// Constructor
	
	/**
	 * @param nombre
	 * @param casa
	 * @param asignatura
	 */
	public Profesor(String nombre, Casa casa) {
		super(nombre, casa);
		this.asignatura = "Docente";
		this.prestigio = 10;
		this.setVida(this.vida + 20);
		this.setMana(this.mana + 20);
		this.setNivel(this.nivel + 1);
		this.setTorpeza(10); 
		this.setControlVarita(80); 
		
	}


	// Getters y Setters
	
	/**
	 * @return el asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}


	/**
	 * @param asignatura el asignatura a establecer
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}


	/**
	 * @return el prestigio
	 */
	public int getPrestigio() {
		return prestigio;
	}


	/**
	 * @param prestigio el prestigio a establecer
	 */
	public void setPrestigio(int prestigio) {
		this.prestigio = prestigio;
	}
	
	// Otros métodos
	
	/**
	 * Método que mejora el nivel y reduce la torpeza de un aprendiz al ser invocado y pasar al aprendiz como parámetro
	 * reduce a 5 su torpeza y aumenta en 1 su nivel actual
	 * controla que nunca supere 100 el nivel ni baje de 0 la torpeza
	 * @param alumno: objeto de la clase Aprendiz
	 */
	public void enseñar(Aprendiz alumno) {
		
		alumno.setTorpeza(alumno.getTorpeza() - 5);
		if (alumno.getTorpeza() <= 0) {
			alumno.setTorpeza(0);
			System.out.println("\n¡Increíble! La torpeza del aprendiz es ahora nula.");
		}
		alumno.setNivel(alumno.getNivel() + 1);
		if (alumno.getNivel() >= 100) {
			alumno.setNivel(100);
			System.out.println("\nEl aprendiz ha alcanzado el nivel máximo (100).");
		}
		
	    System.out.println("\nEl profesor ha enseñado al aprendiz. "
	    		+ "\nTorpeza del aprendiz actual: " + alumno.getTorpeza() +
	    		  "\nNivel del aprendiz actual: " + alumno.getNivel());
	}
	
	public void evaluar() {
		this.prestigio += 5;
		System.out.println("El profesor ha evaluado a un alumno. Prestigio actual: " + this.prestigio);
	}
	
	
	
	
	// Ficha
	@Override
	public String ficha() {
		return super.ficha() +
			   "\nAsignatura: " + asignatura +
			   "\nPrestigio: " + prestigio;
	}
	
	/*
	 * Lanza un hechizo de combate, calculando el daño final basado en el hechizo, el control y la torpeza.
	 * Valida nulls y que el nivel de vida no sea 0 y el mana sea mayor o igual que 2 por el gasto que conlleva
	 * Valida que el Profesor no use hechizos que no conoce
	 * @param hechizo: el hechizo a lanzar
	 * @return danio: el daño final del hechizo lanzado (num entero)
	 */
	public int lanzarHechizo(String hechizo) {
		if (hechizo == null || this.mana < 2 || this.vida <= 0) {
	    	System.out.println("El Profesor " + getNombre() + " está demasiado agotado para lanzar magia o no eligió hechizo.");
	    	return 0;
	    }

	    int danioBase = 0;

	    if (hechizo.equalsIgnoreCase("Vulnera Sanentur")) {
	        System.out.println("El Profesor " + getNombre() + " usó su control para un hechizo maestro que ha cerrado todas sus heridas.");
	        danioBase = 80;  
	        
	    } else if (hechizo.equalsIgnoreCase("Piertotum Locomotor")) {
	        System.out.println("El Profesor " +getNombre() + " lanzó un hechizo que te ha convertido en piedra.");
	        danioBase = 70;
	    } else if (hechizo.equalsIgnoreCase("Expelliarmus") || hechizo.equalsIgnoreCase("Stupefy")) {
	        System.out.println(getNombre() + " lanza un hechizo de combate con control total.");
	        danioBase = 50;
	    } else if (hechizo.equalsIgnoreCase("Lumos") || hechizo.equalsIgnoreCase("Alohomora")) {
	        System.out.println(getNombre() + " realiza magia básica con elegancia docente.");
	        danioBase = 30;
	    } else if (hechizo.equalsIgnoreCase("Expecto Patronum") || hechizo.equalsIgnoreCase("Protego")){
	        System.out.println("El Profesor " + getNombre() + " no tiene acceso a ese hechizo!.");
	        return 0;
	    } else {
	        System.out.println(getNombre() + " intenta un hechizo desconocido.");
	        danioBase = 5; 
	    }

	    this.mana -= 2; 
	    
	    return danioBase + (this.getControlVarita() - this.getTorpeza());
	}


	@Override
	public String toString() {
		return "Profesor [Nombre=" + getNombre() + 
				", nivel=" + nivel +
				", vida=" + vida + 
				", mana=" + mana + 
				", casa=" + casa +
				", torpeza=" + getTorpeza() +
				", control varita=" + getControlVarita() +
				", asignatura=" + asignatura + 
				", prestigio=" + prestigio + "]";
	}

}
