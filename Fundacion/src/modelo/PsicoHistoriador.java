package modelo;

public class PsicoHistoriador {

	// atributos que tendrá el objeto
	private String nombre;
	private int nivelMatematico; // puede ir de 0 a 100
	private boolean lealtadFundacion;
	private int prediccionesRealizadas;
		
	/*
	 * constructor donde solo tendrás que pasar luego 2 parametros porque ponemos lealtad y preddicciones realozadas 
	 * un valor por defecto
	 */
	public PsicoHistoriador(String nombre, int nivelMatematico) {
		this.nombre = nombre;
		setNivelMatematico(nivelMatematico);
		lealtadFundacion = true;
		prediccionesRealizadas = 0;
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


	public int getNivelMatematico() {
		return nivelMatematico;
	}


	
	public void setNivelMatematico(int nivelMatematico) {
	    this.nivelMatematico = validarNivelMatematico(nivelMatematico);
	}


	public boolean isLealtadFundacion() {
		return lealtadFundacion;
	}


	public void setLealtadFundacion(boolean lealtadFundacion) {
		this.lealtadFundacion = lealtadFundacion;
	}


	public int getPrediccionesRealizadas() {
		return prediccionesRealizadas;
	}


	public void setPrediccionesRealizadas(int prediccionesRealizadas) {
		this.prediccionesRealizadas = prediccionesRealizadas;
	}
	
	
	/**
	 * Este método incrementa el contador interno de predicciones realizadas e imprime un mensaje
	 * * @return un string con el mensaje que incluye nombre del historiador, probabilidad del colapso
	 * y el número de predicciones que lleva realizadas
	 */
	public String realizarPrediccion() {	
		prediccionesRealizadas++;
		return "\nEl psico-historiador "+getNombre()+" calcula una probabilidad de colapso del Imperio del "+getNivelMatematico()
				+ " %. \nNúmero de predicciones realizadas por este psicohistoriador: "+ getPrediccionesRealizadas(); 
	}
	
	/**
	 * Método que devuelve un mensaje en función del nivel matemático regisytrado en el objeto psicohistoriador
	 * @return el mensaje en función del porcentaje de probabilidad que se mide con el nivel matemático
	 */
	public String evaluarRiesgoImperial() {
		
		String mensaje;
	    int nivel = this.nivelMatematico; 
	    
	    if (nivel > 80) {
	        mensaje = "Riesgo alto: el Imperio se derrumbará pronto.";			
	    } else if (nivel >= 50) { 
	        mensaje = "Riesgo moderado: el Plan Seldon sigue estable.";
	    } else {
	        mensaje = "Riesgo bajo: estabilidad aparente, pero no te fíes.";
	    }
		
		return mensaje;
		
	} 
	
	// Método auxiliar para que siempre estén entre 0 y 100 los valores introducidos
	
	/**
	 * Función que valida que el nivel matemático no se salga del rango 0-100.
	 * @param nivel recibe un int que es el nivel matemático que lo obtiene del introducido
	 * @return solo regresa el nivel una vez lo ha metido por c*** en rango
	 */
    private int validarNivelMatematico(int nivel) {
        if (nivel < 0) {
            return 0; 
        }
        if (nivel > 100) {
            return 100; 
        }
        return nivel; 
    }


	@Override
	public String toString() {
		return "PsicoHistoriador [nombre=" + nombre + ", nivelMatematico=" + nivelMatematico + ", lealtadFundacion="
				+ lealtadFundacion + ", prediccionesRealizadas=" + prediccionesRealizadas + "]";
	} 	
	
}
