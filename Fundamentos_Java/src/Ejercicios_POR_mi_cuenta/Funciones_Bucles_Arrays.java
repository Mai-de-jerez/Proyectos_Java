package Ejercicios_POR_mi_cuenta;

import java.util.Scanner;

public class Funciones_Bucles_Arrays {
	
	/* Ejercicio de Funciones en Java: Análisis Modular de Notas
	 * 
	 * 🎯 Objetivo
	 * 
	 * El objetivo es crear un programa modular que registre las notas de un grupo de alumnos (usando un Array de tipo double)
	 * y utilice funciones separadas para realizar cálculos estadísticos clave sobre esas notas.
	 * 
	 * ⚙️ Especificaciones
	 * 
	 * El programa debe trabajar con un Array (vector) de 5 notas de tipo 'double'.
	 * Todas las notas deben ser validadas para asegurar que están en el rango de 0.0 a 10.0, ambos inclusive.
	 * 
	 * 🛠️ Estructura del Código
	 * 
	 * 	Implementa la siguiente estructura modular:
	 * 
	 * 	1. Función 'solicitarNotas' (void):
	 * 		Recorre el Array.
	 * 		Solicita cada nota al usuario (usa un bucle do-while dentro para validar que la nota sea >= 0.0 y <= 10.0).
	 *  2. Función 'calcularMedia' (double):
	 * 		Recorre el Array y suma todas las notas.
	 * 		Retorna el promedio (suma / número de notas).
	 *  3. Función 'contarAprobados' (int):
	 * 		Recorre el Array.
	 * 		Cuenta y retorna cuántas notas son iguales o superiores a 5.0.
	 *  4. Función 'obtenerNotaMaxima' (double):
	 * 		Recorre el Array comparando cada nota.
	 * 		Retorna la nota más alta encontrada.
	 *  5. Función Principal (main):
	 * 		Define el Array de 5 notas.
	 * 		Llama a las funciones anteriores para rellenar, analizar y mostrar los resultados.
	 */
	
	
	
	/**
	 * Método que solicita por consola las notas de los alumnos con Scanner y valida que las notas estén entre 0 y 10.
	 * @param notas array para guardar las notas
	 * @param sc el scanner para leer las notas
	 */
	public static void solicitarNotas (double [] notas, Scanner sc) {
		
		int i = 0;
		double nota;
		
		do {
			System.out.println("Introduce la nota "+(i + 1)+": ");
			nota = sc.nextDouble();
			if (nota >= 0.0 && nota <= 10.0) {
			notas[i] = nota;
			i++;
			} else {
				System.out.println("Nota no válida, la nota debe estar entre 0 y 10.");
			}
			
		} while(i < notas.length);
		
	}
	
	/**
	 * Función que recibe un array de notas deciamles y saca la nota media
	 * @param notas array con las notas de los alumnos que son tipo decimal
	 * @return nota media
	 */
	public static double calcularMedia(double [] notas) {
		
		double suma = 0;
		double media = 0;
		
		for (double nota : notas) {
			suma += nota;
		}
		
		media = suma / notas.length;
				
		return media;
	}
	
	/**
	 * Método que cuenta cuantas notas del array notas son igual o mayor que 5.
	 * @param notas array con las notas tipo double
	 * @return numero de notas aprobadas
	 */
	public static int contarAprobados (double [] notas) {
		
		int aprobados = 0;
		
		for (double nota : notas) {
			if (nota >= 5.0) {
				aprobados++;
			}
		}
		
		return aprobados;
	}
	
	/**
	 * Método que devuelve la nota máxima del array notas
	 * @param notas array con las notas tipo double
	 * @return nota maxima
	 */
	public static double obtenerNotaMaxima (double [] notas) {
		
		double maxima = -1.0;
		
		for (double nota : notas) {
			if (nota > maxima) {
				maxima = nota;
			}
		}
		
		return maxima; 
	}
	
	
		
	/**
	 * Método que llama a los métodos de arriba para rellenar el array notas con Scanner, y sacar la nota media
	 * la nota más alta, y el número de notas aprobadas
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double [] notas = new double [5];
		
		solicitarNotas(notas, sc);
		
		System.out.println("\nEsta es tu nota media: "+calcularMedia(notas));
		
		System.out.println("\nEste es el número de aprobados: "+contarAprobados(notas));
		
		System.out.println("\nEsta es tu nota más alta: "+obtenerNotaMaxima(notas));
		
		sc.close();
		 

	}

}
