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
		this.setVida(this.vida + 20);
		this.setMana(this.mana + 20);
		this.setNivel(this.nivel + 1);
		this.controlVarita = 40;
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
	 * en 10 puntos cada uno. Se imprime un mensaje con el nivel y el control actual.
	 */
	public void estudiarEnBiblioteca() {
		this.setNivel(this.nivel + 10);
	    this.setControlVarita(this.controlVarita + 10);
	    System.out.println("El Mago ha estudiado en la biblioteca. "
	    		+ "\nControl de varita actual: " + this.controlVarita
	    		+ "\nNivel actual: " + this.nivel);
	}
	
	
	/*
	 * Lanza un hechizo de combate, calculando el daño final basado en el hechizo, el control de varita y la torpeza.
	 * Valida nulls y que el nivel de vida no sea 0 y el mana sea mayor o igual que 10 por el gasto que conlleva
	 * Valida que el Hechicero no use hechizos que no conoce
	 * @param hechizo: el hechizo a lanzar
	 * @return danio: el daño final del hechizo lanzado (num entero)
	 */       
	public int lanzarHechizo(String hechizo) {
		if (hechizo == null || this.mana < 10 || this.vida <= 0) {
	    	System.out.println("El Hehcicero " + getNombre() + " está demasiado agotado para lanzar magia o no eligió hechizo.");
	    	return 0;
	    }

	    int danioBase = 0;
		

	    if (hechizo.equalsIgnoreCase("Expelliarmus") || hechizo.equalsIgnoreCase("Stupefy")) {
	        System.out.println("El Hechicero " + getNombre() + " lanza un hechizo que te dejó sin varita!.");
	        danioBase = 50;
	    }
	    
	    else if (hechizo.equalsIgnoreCase("Lumos") || hechizo.equalsIgnoreCase("Alohomora")) {
	        System.out.println("El Hechicero " + getNombre() + " realiza magia básica con efectividad impropia del hechizo.");
	        danioBase = 30;
	        
	    } else if (hechizo.equalsIgnoreCase("Expecto Patronum") || hechizo.equalsIgnoreCase("Protego") || 
	    		hechizo.equalsIgnoreCase("Vulnera Sanentur") || hechizo.equalsIgnoreCase("Piertotum Locomotor")){
	        System.out.println("El Hechicero " + getNombre() + " no tiene acceso a ese hechizo!.");
	        return 0;
	    } else {
	        System.out.println("El Hechicero " + getNombre() + " se equivocó de hechizo!.");
	        danioBase = 5; 
	    }

	    this.mana -= 10;  
	    
	    return danioBase + (this.controlVarita - this.getTorpeza()); 
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
