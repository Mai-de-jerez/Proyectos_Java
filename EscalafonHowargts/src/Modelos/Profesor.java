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
		this.setVida(this.vida + 10);
		this.setMana(this.mana + 10);
		this.setNivel(this.nivel + 1);
		this.setTorpeza(0); 
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
	 * imprime mensajes cuando se alcanza el máximo de nivel o el mínimo de torpeza
	 * @param alumno: objeto de la clase Aprendiz
	 */
	public void enseñar(Aprendiz alumno) {
		
		alumno.setTorpeza(alumno.getTorpeza() - 5);
		
		if (alumno.getTorpeza() == 0) {
			System.out.println("\n¡Increíble! La torpeza del aprendiz es ahora nula.");
		}
		
		alumno.setNivel(alumno.getNivel() + 1);
		if (alumno.getNivel() == 100) {
			System.out.println("\nEl aprendiz ha alcanzado el nivel máximo (100).");
		}
		
	    System.out.println("\nEl profesor ha enseñado al aprendiz "+ alumno.getNombre()
	    		+ "\nTorpeza actual del aprendiz: " + alumno.getTorpeza() +
	    		  "\nNivel actual del aprendiz: " + alumno.getNivel());
	}
	
	/*
	 * Método que se llama y suma 5 puntos de prestigio al profesor e imprime un mensaje para saber
	 * como va su prestigio.
	 */
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
	 * Lanza un hechizo de combate, calculando el daño final basado en el hechizo y el control.
	 * Valida nulls y que el nivel de vida no sea 0 y el mana sea mayor o igual que 3 por el gasto que conlleva
	 * Valida que el Profesor no use hechizos que no conoce o no hereda
	 * @param hechizo a lanzar (string)
	 * @return danio final del hechizo lanzado (int)
	 */
	public int lanzarHechizo(String hechizo) {
		
		if (hechizo == null) {
			System.out.println("ERROR: El nombre del hechizo no puede ser nulo."); 
		    return 0;
			
		} else if (this.mana < 3 || this.vida <= 0) { 
	    	System.out.println("No puedes lanzar hechizos, ¡careces de vida o mana!");
	    	return 0;

		} else if ( hechizo.equalsIgnoreCase("Piertotum Locomotor")) {
	        this.mana -= 3;
	    	System.out.println(getNombre() + " usó su control para un hechizo maestro que ha revivido a 3 gárgolas de piedra!."); 
	        return 40 + this.getControlVarita(); 
	        
	    } else if (hechizo.equalsIgnoreCase("Duro")) {
	    	this.mana -= 3;
	    	System.out.println(getNombre() + " usó su control para un hechizo maestro que te convirtió en piedra!."); 
	        return 50 + this.getControlVarita();  
	    } else {
	    	return super.lanzarHechizo(hechizo); 
	    }
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
