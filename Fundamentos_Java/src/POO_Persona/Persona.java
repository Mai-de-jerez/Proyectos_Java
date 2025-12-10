package POO_Persona;

public class Persona {
	
	
	// Constantes
	
	private final static char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	public static final int BAJO_PESO = -1; 
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;
	private static final char SEXO_DEFECTO = 'H';
	
	// Atributos
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private int altura;
	
	// Constructores
	
	// Primero valores POR defecto
	public Persona() { 
		this.nombre= "";
		this.edad = 0;
		this.dni = generaDNI();
		this.sexo = SEXO_DEFECTO;
		this.peso = 0.0;
		this.altura = 0;
	}
	
	// De tres parametros
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.sexo = comprobarSexo(sexo);
		this.peso = 0.0;
		this.altura = 0;
	}

	// Con todos los parámetros
	public Persona(String nombre, int edad, String dni, char sexo, double peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.sexo = comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	} 
	
	
	// Métodos
	
	public int calcularIMC () {
	    
	    double alturaM = (double)this.altura / 100.0;

	    double imc = peso / (Math.pow(alturaM, 2));
	    
	    if (imc < 20) {
	        return BAJO_PESO; 
	    } else if (imc >= 20 && imc <= 25){
	        return PESO_IDEAL; 	
	    } else {
	        return SOBREPESO;
	    }
	}

	
	
	public boolean esMayorDeEdad() {
	    return edad >= 18; 
	}
	
	private char comprobarSexo(char sexo) {
	    
	    char sexoMayus = Character.toUpperCase(sexo);
	    
	    if (sexoMayus == 'H' || sexoMayus == 'M') {
	        return sexoMayus;
	    } else {
	        return 'H';
	    }
	}
	
	private String generaDNI() {
		double aleatorio = Math.random(); 
	    int numero = (int) (aleatorio * 90000000 + 10000000);
	    int indice = numero % 23; 
	    char letra = LETRAS_DNI[indice];
	    String numeroString = Integer.toString(numero);
	    String dniCompleto = numeroString + letra;
	    return dniCompleto;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	
	 
	
	
}
