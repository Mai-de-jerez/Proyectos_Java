package Modelos;

public class Mago {
	
	// Atributos
	private String nombre;
	protected int nivel;
	protected int vida;
	protected int mana;
	protected Casa casa;
	
	// Constructor
	
	/**
	 * @param nombre
	 * @param nivel
	 * @param vida
	 * @param mana
	 * @param casa
	 * Asignamos los valores iniciales de nivel, vida y mana según la casa del mago
	 */
	public Mago(String nombre, Casa casa) {
		this.nombre = nombre;		
		this.nivel=1;
		this.vida=20;
		this.mana=30;
		this.casa = casa;
		
		if (casa == Casa.GRYFFINDOR) {			
			
			this.vida += 20;
			this.mana += 15;
			
		} else if(casa == Casa.RAVENCLAW) {
			
			this.vida += 25;
			this.mana += 10;	
			
		} else if(casa == Casa.HUFFLEPUFF) {
			
			this.vida += 15;
			this.mana += 20;
			
		} else {
			
			this.vida += 10;
			this.mana += 25;
		}
			
	}

	
	// Getters y Setters
	
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return el nivel
	 */
	public int getNivel() {
		return nivel;
	}

	/**
	 * @param nivel el nivel a establecer
	 */
	
	public void setNivel(int nivel) {
	    if (nivel > 100) {
	        this.nivel = 100;
	    } else if (nivel < 1) {
	        this.nivel = 1;
	    } else {
	        this.nivel = nivel;
	    }
	}
	
	/**
	 * @return el vida
	 */
	public int getVida() {
		return vida;
	}
	
	/**
	 * @param vida el vida a establecer
	 */
	public void setVida(int vida) {
	    if (vida > 100) {
	        this.vida = 100;
	    } else if (vida < 0) {
	        this.vida = 0;
	    } else {
	        this.vida = vida;
	    }
	}
	
	/**
	 * @return el mana
	 */
	public int getMana() {
		return mana;
	}

	/**
	 * @param mana el mana a establecer
	 */
	
	public void setMana(int mana) {
	    if (mana > 100) {
	        this.mana = 100;
	    } else if (mana < 0) {
	        this.mana = 0;
	    } else {
	        this.mana = mana;
	    }
	}


	/**
	 * @return casa
	 */
	public Casa getCasa() {
		return casa;
	}

	/**
	 * @param casa
	 */
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	
	// Otros métodos
	
	/**
	 * El mago entrena, aumentando su nivel en 5 puntos, pero perdiendo 5 puntos de vida y 5 puntos de mana.
	 * Imprimimos un mensaje si se está demasiado debil para entrenar.
	 */
	public void entrenar() {
		
		if (this.vida < 5 || this.mana < 5) {
	        System.out.println(getNombre() + " está demasiado débil para entrenar. ¡Necesita descansar!");
	        return;
	    } else {
	    	setNivel(this.nivel + 1);
			setVida(this.vida - 5);
			setMana(this.mana - 5);
			System.out.println("Tu nivel ha aumentado a " + this.nivel + ", tu vida ahora es " + this.vida + " y tu mana es " + this.mana);
	    }
				
	}
	
	/*
	 * Recarga mana y vida a tope
	 */
	public void descansar() {
		setVida(100);
	    setMana(100);	
		System.out.println("Tu vida y tu mana están ahora al 100%.");
	}
	
	// Su ficha
	public String ficha() {
		return "\nNombre: " + nombre + 
				"\nNivel: " + nivel + 
				"\nVida: " + vida + 
				"\nMana: " + mana + 
				"\nCasa: " + casa;
	} 
	
	
	/*
	 * Intento de lanzar hechizo.
	 * Valida que no sea null el hechizo
	 * @param hechizo: el hechizo a lanzar
	 * @return danio: 0
	 */
	public int lanzarHechizo(String hechizo) {
		// Habrá que validar que no se pase un null
		if (hechizo == null) {
			System.out.println("ERROR: El nombre del hechizo no puede ser nulo.");
		    return 0;
		} else {
			System.out.println("\nEse hechizo no lo conoces "+getNombre());
			return 0; 
		}
	    
	}
	
	
	/*
	 * Método para que el mago reciba daño, restando el daño recibido a su vida.
	 * Imprime un mensaje si la vida es 0 y otro que informa por donde va la vida sino es 0
	 * @param dano: el daño recibido lo pasamos como entero
	 */
	public void recibirDano(int dano) {
		setVida(this.vida - dano);
		if (this.vida == 0) {
	        System.out.println(nombre + " ha caído en combate.");
	    } else {
	        System.out.println(nombre + " tiene " + this.vida + " puntos de vida restante.");
	    }
	}
	
	// Devuelve el detalle del mago

	@Override
	public String toString() {
		return "Mago [Nombre=" + nombre + 
				", nivel=" + nivel + 
				", vida=" + vida + 
				", mana=" + mana + 
				", casa=" + casa + "]";
	}
		

}
