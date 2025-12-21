package Modelos;

public class Hechicero extends Aprendiz {

	// Atributos
	
	private int controlVarita;

	

	// Constructor
	
	/**
	 * @param nombre
	 * @param casa
	 * @param controlVarita
	 */
	public Hechicero(String nombre, Casa casa) {
		super(nombre, casa);
		this.setTorpeza(30); // me cargo la torpeza del aprendiz y le pongo 20
		this.setVida(this.vida + 10);
		this.setMana(this.mana + 10);
		this.setNivel(this.nivel + 1);
		this.controlVarita = 30;
	}
	
	
	// Getters y Setters
	
	/**
	 * @return el controlVarita
	 */
	public int getControlVarita() {
		return controlVarita;
	}



	/**
	 * @param controlVarita el controlVarita a establecer
	 */
	public void setControlVarita(int controlVarita) {
		this.controlVarita = controlVarita;
	}

	
	// Ficha
    public String ficha() {
    	return super.ficha() +
               "\nControl Varita: " + controlVarita;
    }
	
	// Otros métodos
	
	/**
	 * El hechicero estudia en la biblioteca, aumentando su nivel y control de varita 
	 * en 10 puntos cada uno.
	 * Se imprime un mensaje con el nivel y el control actual.
	 */
	public void estudiarEnBiblioteca() {
		this.setNivel(this.nivel + 1);
	    this.setControlVarita(this.controlVarita + 10);
	    System.out.println("El Mago "+getNombre()+" ha estudiado en la biblioteca. "
	    		+ "\nControl de varita actual: " + this.controlVarita
	    		+ "\nNivel actual: " + this.nivel);
	}
	
	
	/*
	 * Lanza un hechizo de combate, calculando el daño final basado en el hechizo, el control de varita y la torpeza.
	 * Valida nulls y que el nivel de vida no sea 0 y el mana sea mayor o igual que 10 por el gasto que conlleva
	 * Valida que el Hechicero no use hechizos que no conoce o no heredó
	 * @param hechizo: el hechizo a lanzar
	 * @return danio: el daño final del hechizo lanzado (num entero)
	 */       
	public int lanzarHechizo(String hechizo) {
		
		if (hechizo == null) {
			System.out.println("ERROR: El nombre del hechizo no puede ser nulo."); 
		    return 0;
			
		} else if (this.mana < 10 || this.vida <= 0) { 
	    	System.out.println("No puedes lanzar hechizos, ¡careces de vida o mana!");
	    	return 0;
		 	 
		} else if (hechizo.equalsIgnoreCase("Expelliarmus") || hechizo.equalsIgnoreCase("Stupefy")) {
	    	int danio =0;
	    	mana -= 10;
	    	if (this.getTorpeza() > 50) {
	    		System.out.println(getNombre() + " lanzó " + hechizo + " con algo de torpeza, el daño causado es moderado.");
	    		danio = 20 + this.controlVarita;
	    	} else if (this.getTorpeza() > 30) {
	    		System.out.println(getNombre() + " lanzó " + hechizo + " con agudeza aceptable, el daño causado es importante.");
	        	danio = 30 + this.controlVarita;
	    	} else  {
	        	System.out.println(getNombre() + " lanzó " + hechizo + " con agudeza increíble, el daño causado es irreparable.");
	        	danio = 40 + this.controlVarita;
	        }
	    	return danio;
	    
		} else {
			
	    	return super.lanzarHechizo(hechizo); 
	    }
	} 
	
	
	// Devuelve el detalle del Hechicero
	
	@Override
	public String toString() {
		return "Hechicero [Nombre=" + getNombre() + 
				", nivel=" + nivel +
				", vida=" + vida + 
				", mana=" + mana +
				", casa=" + casa + 
				", torpeza=" + getTorpeza() + 
				", controlVarita=" + controlVarita +"]";
	}

}
