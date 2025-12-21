package Modelos;

public class Auror extends Hechicero {

	// Atributos	
	private int experienciaCombate;
	private int arrestos;
	
	
	// Constructor
	
	/*
	 * @param nombre (hereda de Hechicero)
	 * @param casa (hereda de Hechicero)
	 * @param experienciaCombate
	 * @param arrestos
	 */
	public Auror(String nombre, Casa casa) {
		super(nombre, casa);
		this.setVida(this.vida + 10);
		this.setMana(this.mana + 10);
		this.setNivel(this.nivel + 1);
		this.setTorpeza(10); // me cargo la torpeza del hechicero y le pongo 10
		this.setControlVarita(60); // me cargo el control de varita del hechicero y le pongo 60
		this.experienciaCombate = 40; // Ponemos 40 porque es un auror inicial y no va empezar en 0.
		this.arrestos = 0; // partimos de 0 arrestos
	}

	
	// Getters y Setters
	
	/*
	 * @return el experienciaCombate
	 */
	public int getExperienciaCombate() {
		return experienciaCombate;
	}


	/**
	 * @param experienciaCombate el experienciaCombate a establecer
	 */
	public void setExperienciaCombate(int experienciaCombate) {
		this.experienciaCombate = experienciaCombate;
	}


	/**
	 * @return el num de arrestos
	 */
	public int getArrestos() {
		return arrestos;
	}


	/**
	 * @param arrestos el arrestos a establecer
	 */
	public void setArrestos(int arrestos) {
		this.arrestos = arrestos;
	}
	
	
	// Otros métodos
	
	// Su ficha
    public String ficha() {
        return super.ficha() +
               "\nExperiencia en Combate: " + experienciaCombate + 
               "\nArrestos: " + arrestos;
    }
	
	
	/*
	 * En este método, el auror patrulla, aumentando su experiencia en combate en 5 puntos cada vez.
	 * Se imprime un mensaje para ver su experiencia actual.
	 */
	public void patrullar() {
		this.experienciaCombate += 5;
		System.out.println("El auror " + getNombre() + " ha entrenado en combate. Experiencia actual: " + this.experienciaCombate);
	}
	
	/*
	 * El auror intenta arrestar a un aprendiz. Si la vida del aprendiz es menor a 30, lo consigue, si no, se escapa
	 * aumenta su experiencia en combate en 10 y el número de arrestos en 1.
	 * @param aprendiz: el aprendiz a arrestar
	 * @return esArrestado: true si el arresto fue exitoso, false en caso contrario
	 */
	public boolean arrestar(Aprendiz aprendiz) {
	    boolean esArrestado = false;
	    
		if (aprendiz.getVida() <30) {
			esArrestado = true;
			this.experienciaCombate += 10;
			this.arrestos += 1;
			System.out.println("El aprendiz " + aprendiz.getNombre() + "ha sido arrestado con éxito.");
		} else {
			System.out.println("El aprendiz " + aprendiz.getNombre() + "tiene demasiada vida y se ha escapado de tu arresto.");
		}	
		return esArrestado; 		
	}
	
	
	/*
	 * Lanza un hechizo de combate, calculando el daño final basado en el hechizo, la experiencia y la torpeza.
	 * Valida nulls y que el nivel de vida no sea 0 y el mana sea mayor o igual que 5 por el gasto que conlleva
	 * Valida que el Auror no use hechizos que no conoce
	 * @param hechizo: el hechizo a lanzar
	 * @return danio: el daño final del hechizo lanzado (num entero)
	 */
	public int lanzarHechizo(String hechizo) {
		
		if (hechizo == null) {
			System.out.println("ERROR: El nombre del hechizo no puede ser nulo."); 
		    return 0;
			
		} else if (this.mana < 5 || this.vida <= 0) { 
	    	System.out.println("No puedes lanzar hechizos, ¡careces de vida o mana!");
	    	return 0;
	
		} else if (hechizo.equalsIgnoreCase("Expecto Patronum") || hechizo.equalsIgnoreCase("Protego")) {
	    	int danio = 0;
	    	this.mana -= 5;
	    	if (this.experienciaCombate >= 40) {
	        	System.out.println(getNombre() + " lanza un hechizo de protección y ahora tu magia no puede dañarle.");
	        	danio = 40 + this.experienciaCombate;
	        	this.vida = 100;
	        } else {
	        	System.out.println(getNombre() + " lanza un hechizo de protección y es casi intocable.");
	        	danio = 30 + this.experienciaCombate;
	        	this.vida = 70; 
	        }	        
	        return danio;   
	    } else {
	    	return super.lanzarHechizo(hechizo);  
	    }
	} 
	
	
	
	// Devuelve el detalle del Auror
	
	@Override
	public String toString() {
		return "Auror [Nombre=" + getNombre() + 
				", nivel=" + nivel +
				", vida=" + vida + 
				", mana=" + mana + 
				", casa=" + casa +
				", torpeza=" + getTorpeza() +
				", Control varita=" + getControlVarita() +
				", arrestos=" + arrestos + 
				", experienciaCombate=" + experienciaCombate + "]";
	}
	

}
