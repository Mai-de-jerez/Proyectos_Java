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
		this.setVida(this.vida + 10);
		this.setMana(this.mana + 10);
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
	 * Reduce la torpeza 10 puntos, e imprime mensajes para saber el valor de torpeza actual o 
	 * si la la torpeza ya es nula.
	 */
	public void practicarBasico() {
		
	    this.setTorpeza(this.torpeza - 10);
	    
	    if (this.torpeza == 0) {
	    	
	        System.out.println("¡Increíble! El aprendiz ya no tiene nada de torpeza.");
	    } else {
	        System.out.println("El aprendiz está practicando magia. Torpeza actual: " + this.torpeza);
	    }
	}
	
		
	/*
	 * Lanza un hechizo de combate, calculando el daño final basado en el hechizo  y la torpeza.
	 * Valida nulls y que el nivel de vida no sea 0 y el mana sea mayor o igual que 15 por el gasto que conlleva
	 * Valida que el Aprendiz no use hechizos que no conoce o no heredó
	 * @param hechizo: el hechizo a lanzar
	 * @return danio: el daño final del hechizo lanzado (num entero)
	 */
	
	public int lanzarHechizo(String hechizo) {
		
		if (hechizo == null) {
			System.out.println("ERROR: El nombre del hechizo no puede ser nulo."); 
		    return 0;
			
		} else if (this.mana < 15 || this.vida <= 0) { 
	    	System.out.println("No puedes lanzar hechizos, ¡careces de vida o mana!");
	    	return 0;
	    	
	    } else if (hechizo.equalsIgnoreCase("Lumos") || hechizo.equalsIgnoreCase("Alohomora")) {
	    	
	    	this.mana -= 15; 
	    	
	    	if (this.torpeza > 50) {
	    		System.out.println(getNombre() + " tu torpeza te hizo fallar y la varita te reventó en la cara.");
	    		return 0; 
	    	} else if (this.torpeza > 30) {
	    		System.out.println(getNombre() + " lanzó " + hechizo + " con agudeza aceptable, el daño causado es moderado.");
	        	return 20; 
	    	} else  {
	        	System.out.println(getNombre() + " lanzó " + hechizo + " con agudeza increíble, el daño causado es importante.");
	        	return 40; 	
	        }
	    	
	    } else {
	    	
	    	return super.lanzarHechizo(hechizo); 
	    }
		
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
