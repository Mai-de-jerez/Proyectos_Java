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
		this.casa = casa;
		
		switch (casa) {
		case GRYFFINDOR:
			this.vida += 25;
			this.mana += 15;
			this.nivel += 1;
			break;
		case RAVENCLAW:
			this.vida += 35;
			this.mana += 10;
			this.nivel += 1;
			break;
		case HUFFLEPUFF:
			this.vida += 30;
			this.mana += 20;
			this.nivel += 1;
			break;	
		case SLYTHERIN:
			this.vida += 25;
			this.mana += 20;
			this.nivel += 1;
			break;
		default:
			break;
		}
		
		this.setNivel(this.nivel);
		this.setVida(this.vida);
		this.setMana(this.mana);
	}

	
	// Getters y Setters
	
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		if (nivel >= 1 && nivel <= 100) {
			this.nivel = nivel;
		} else {
			System.out.println("Valor de nivel no válido. Debe estar entre 1 y 100.");
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
		if (vida >= 0 && vida <= 100) {
			this.vida = vida;
		} else {
			System.out.println("Valor de vida no válido. Debe estar entre 0 y 100.");
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
		if (mana >= 0 && mana <= 100) {
			this.mana = mana;
		} else {
			System.out.println("Valor de mana no válido. Debe estar entre 0 y 100.");
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
	 * No permitimos que la vida o el mana bajen de 0 puntos. Imprimimos mensajes si alcanzan 0 puntos.
	 * Imprimimos un mensaje si se alcanza el nivel máximo de 100 puntos yno dejamos que suba más allá de ese valor.
	 */
	public void entrenar() {
		
		if (this.vida <= 5 || this.mana <= 5) {
	        System.out.println(getNombre() + " está demasiado débil para entrenar. ¡Necesita descansar!");
	        return;
	    }
		
		this.nivel += 5;
		this.vida -= 5;
		this.mana -= 5;
		
		if (this.vida <= 0) {
			this.vida = 0;
			System.out.println("Tu nivel ha bajado a " + this.nivel + ". Te has quedado sin vida.");
		}
		if (this.mana <= 0) {
			this.mana = 0;
			System.out.println("Tu mana ha bajado a " + this.mana + ". Te has quedado sin mana.");
		}
		if (this.nivel >= 100) {
			this.nivel = 100;
			System.out.println("¡Nivel máximo alcanzado!");
		}		
		System.out.println("Tu nivel ha aumentado a " + this.nivel + ", tu vida ahora es " + this.vida + " y tu mana es " + this.mana);
	}
	
	// El mago descansa, recuperando 5 puntos de vida y 5 puntos de mana.
	// No permitimos que la vida o el mana superen los 100 puntos.
	// Imprimimos mensajes si se alcanza el máximo de mana o vida, y también para informar por donde van las cantidades de mana y vidA.
	public void descansar() {
		this.vida += 5;
		this.mana += 5;
		if (this.vida >= 100) {
			this.vida = 100;
			System.out.println("¡Tu vida está al máximo!.");
		}
		if (this.mana >= 100) {
			this.mana = 100;
			System.out.println("¡Tu mana está al máximo!.");
		}
		
		System.out.println("Tu vida ha aumentado a " + this.vida + ", y tu mana ha aumentado a " + this.mana);
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
	 * Lanza un hechizo de combate retornando 5 puntos de daño.
	 * Valida nulls y que el nivel de vida no sea 0 y el mana sea mayor o igual que 20 por el gasto que conlleva
	 * Valida que el Mago no use hechizos que no conoce
	 * @param hechizo: el hechizo a lanzar
	 * @return danio: el daño final del hechizo lanzado (num entero)
	 */
	public int lanzarHechizo(String hechizo) {
		// Habrá que validar que no se pase un null o vacío
		if (hechizo == null || this.mana < 20 || this.vida <= 0) {
	    	System.out.println("El Mago " + getNombre() + " está demasiado agotado para lanzar magia o no eligió hechizo.");
	    	return 0;
	    }
		
		if (hechizo.equalsIgnoreCase("Alohomora") || hechizo.equalsIgnoreCase("Lumos") 
				|| hechizo.equalsIgnoreCase("Expelliarmus") || hechizo.equalsIgnoreCase("Stupefy") 
				|| hechizo.equalsIgnoreCase("Expecto Patronum") || hechizo.equalsIgnoreCase("Protego") 
				|| hechizo.equalsIgnoreCase("Vulnera Sanentur") || hechizo.equalsIgnoreCase("Piertotum Locomotor")){
	        System.out.println("El Mago " + getNombre() + " no tiene acceso a ese hechizo!.");
	        return 0;
		}
		
	    System.out.println(getNombre() + " ha lanzado el hechizo " + hechizo + " provocando pésimo daño.");
	    mana -= 20;
	    return 5; 
	}
	
	/*
	 * Método para que el mago reciba daño, restando el daño recibido a su vida.
	 * @param dano: el daño recibido lo pasamos como entero
	 */
	public void recibirDano(int dano) {
	    vida -= dano;
	    if (vida <= 0) {
	        vida = 0;
	        System.out.println(nombre + " ha recibido " + dano + " puntos de daño y ha caído en combate.");
	    }
	    System.out.println(nombre + " ha recibido " + dano + " puntos de daño. Vida restante: " + vida);
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
