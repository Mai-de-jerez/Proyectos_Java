package Retos;

import java.util.Scanner;

public class Reto_5 {
	 
	/**
	 * Método que retorna un valor para la variable puntos en función del hechizo que pasas como parámetro
	 * @param hechizo variable de tipo String que recoge el nombre del hechizo como parámetro
	 * @return retorna el número de puntos en función del parámetro hechizo 
	 */
	public static int calcularPuntosHechizo(String hechizo) {
	
		int puntos;
		
		if (hechizo.toLowerCase().equals("expelliarmus")) {
			puntos = 10;
		} else if (hechizo.toLowerCase().equals("stupefy")) {
			puntos = 12;
		} else if (hechizo.toLowerCase().equals("lumos")){
			puntos = 5;	
		} else if (esHechizoProhibido(hechizo)){
			puntos = -50;				
		} else {
			puntos = 0;
		}  
		
		return puntos;     
	}
	
	/**
	 * Método que devuelve el número de puntos como int en función de el hechizo y la intensidad elegidos
	 * @param hechizo parametro de tipo string
	 * @param intensidad parametro de tipo int
	 * @return puntos_finales multiplicando la intensidad por el valor que retorna la funcion calcularPuntosHechizo
	 */
	public static int calcularPuntosHechizo(String hechizo, int intensidad) {
		int puntos_finales = calcularPuntosHechizo(hechizo) * intensidad;
		return puntos_finales;
	}
	
	
	
	
	/**
	 * Método que comprueba si la variable hechizo coincide con el nombre del hechizo prohibido
	 * @param hechizo variable tipo string que pasamos como parametro
	 * @return retorna true o false en función de si coincide con el string "avada kedavra"
	 */
	public static boolean esHechizoProhibido(String hechizo) {
		boolean isProhibido = false;
		if (hechizo.toLowerCase().equals("avada kedavra")) {
			isProhibido = true;
		} else {
			isProhibido = false;
		}
		
		return isProhibido;
	}
	
	/**
	 * Método que imprime un mensaje con el número de puntos obtenidos según tu hechizo sin y con intensidad aplicada
	 * @param hechizo variable tipo string
	 * @param intensidad variable tipo int
	 */
	public static void mostrarResultado(String hechizo, int intensidad) {
		System.out.println("Has lanzado "+hechizo.toUpperCase()+" y has conseguido "+ calcularPuntosHechizo(hechizo)+" puntos.");
		System.out.println("Has lanzado "+hechizo.toUpperCase()+" con intensidad "+intensidad+ " y has conseguido "+ calcularPuntosHechizo(hechizo, intensidad));
	}
	
	/**
	 * Método principal (entry point) que ejecuta el programa.
	 * Solicita al usuario el nombre del hechizo y la intensidad,
	 * y luego muestra los resultados del cálculo gracias al método mostrarResultados().
	 * * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--CALCULADORA DE HECHIZOS DE HOGWARTS--");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un hechizo: ");
		String hechizo = sc.nextLine();
		System.out.println("Introduce la intensidad: ");
		int intensidad = sc.nextInt();
		mostrarResultado(hechizo, intensidad);
		
		sc.close();

	}

}

