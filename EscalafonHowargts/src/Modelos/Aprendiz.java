package Modelos;

public class Aprendiz extends Mago {

	// Atributos
	private int torpeza;

	
	// Constructor
	
	/**
	 * @param nombre
	 * @param casa
	 * @param torpeza
	 */
	public Aprendiz(String nombre, Casa casa) {
		super(nombre, casa); 
		this.torpeza = 60;
		this.setVida(this.vida + 20);
		this.setMana(this.mana + 20);
		this.setNivel(this.nivel + 1);
	}
	

	
	// Getters y Setters

	/**
	 * @return el torpeza
	 */
	public int getTorpeza() {
		return torpeza;
	}


	/**
	 * @param torpeza el torpeza a establecer
	 */
	
	public void setTorpeza(int torpeza) {
	    if (torpeza < 0) {
	        this.torpeza = 0;
	    } else {
	        this.torpeza = torpeza;
	    }
	}

	// Otros métodos
	
	/*
	 * Reduce la torpeza 5 puntos, no deja que baje más de 0, e imprime mensajes para saber por donde va la cosa.
	 */
	public void practicarBasico() {
		
	    this.setTorpeza(this.torpeza - 5);
	    
	    if (this.torpeza <= 0) {
	    	this.torpeza = 0;
	        System.out.println("¡Increíble! El aprendiz ya no tiene nada de torpeza.");
	    } else {
	        System.out.println("El aprendiz está practicando magia. Torpeza actual: " + this.torpeza);
	    }
	}
	
	
	
	/*
	 * Lanza un hechizo de combate, calculando el daño final basado en el hechizo  y la torpeza.
	 * Valida nulls y que el nivel de vida no sea 0 y el mana sea mayor o igual que 15 por el gasto que conlleva
	 * Valida que el Aprendiz no use hechizos que no conoce
	 * @param hechizo: el hechizo a lanzar
	 * @return danio: el daño final del hechizo lanzado (num entero)
	 */
	public int lanzarHechizo(String hechizo) {
	    
	    if (hechizo == null || this.mana < 15 || this.vida <= 0) {
	    	System.out.println("El aprendiz " + getNombre() + " está demasiado agotado para lanzar magia o no eligió hechizo.");
	    	return 0;
	    }	
	    int danioBase = 0;
		
	    if (hechizo.equalsIgnoreCase("Lumos") || hechizo.equalsIgnoreCase("Alohomora")) {
	    	
	    	if (this.torpeza > 50) {
	    		System.out.println("El aprendiz " + getNombre() + " lanzó " + hechizo + " con algo de torpeza, el daño causado es leve.");
	    		danioBase = 20;
	    	} else if (this.torpeza > 30) {
	    		System.out.println("El aprendiz " + getNombre() + " lanzó " + hechizo + " con agudeza aceptable, el daño causado es moderado.");
	        	danioBase = 30;
	    	} else  {
	        	System.out.println("El aprendiz " + getNombre() + " lanzó " + hechizo + " con agudeza increíble, el daño causado es importante.");
	        	danioBase = 40;
	        }
	    } else if (hechizo.equalsIgnoreCase("Expelliarmus") || hechizo.equalsIgnoreCase("Stupefy") || hechizo.equalsIgnoreCase("Expecto Patronum") 
	    		|| hechizo.equalsIgnoreCase("Protego") || hechizo.equalsIgnoreCase("Vulnera Sanentur") || hechizo.equalsIgnoreCase("Piertotum Locomotor")){
	        System.out.println("El aprendiz " + getNombre() + " no tiene acceso a ese hechizo!.");
	        return 0; 
	    } else {
	        System.out.println("El aprendiz " + getNombre() + " se equivocó de hechizo!.");
	        danioBase = 5; 
	    } 

	    this.mana -= 15;   
	    
	    return danioBase - (this.torpeza / 10);
	}
	
	
	// Ficha 
    public String ficha() {
        return super.ficha() +
               "\nTorpeza: " + torpeza;
    }

    // Devuelve el detalle del Aprendiz
    
	@Override
	public String toString() {
		return  "Aprendiz [Nombre=" + getNombre() + 
				", nivel=" + nivel + 
				", vida=" + vida + 
				", mana=" + mana + 
				", casa=" + casa +
				", torpeza=" + torpeza + "]";
	}

}
