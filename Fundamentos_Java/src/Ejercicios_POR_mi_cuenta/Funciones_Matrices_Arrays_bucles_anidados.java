package Ejercicios_POR_mi_cuenta;

import java.util.Scanner;

import java.util.Arrays;


public class Funciones_Matrices_Arrays_bucles_anidados {
	
	/*
	 * Ejercicio de Funciones en Java: Gestión de Temperaturas con Matrices
	 * 
	 * 🎯 Objetivo
	 * 
	 * El objetivo es crear un programa modular que use una MATRIZ (Array bidimensional) 
	 * para registrar y analizar temperaturas. 
	 * 
	 * ⚙️ Especificaciones
	 * 
	 * La matriz será de tipo 'double' y tendrá 7 FILAS (Días de la semana) y 4 COLUMNAS (Mediciones horarias).
	 * Esto representa un total de 28 mediciones.
	 * 
	 * 🛠️ Estructura del Código
	 * 
	 * Implementa la siguiente estructura modular:
	 * 
	 *   1. Función 'solicitarTemperaturas' (void):
	 *   	Usa BUCLES ANIDADOS FOR para recorrer la matriz (Filas y Columnas).
	 *   	Solicita al usuario las 28 temperaturas y las guarda en la matriz[i][j].
	 *   
	 *   2. Función 'calcularMediaSemanal' (double):
	 *   	Usa BUCLES ANIDADOS para recorrer la matriz y sumar todos los valores.
	 *   	Retorna la media total (Suma / 28).
	 *   
	 *   3. Función 'obtenerDiaMasCaluroso' (int):
	 * 		Usa BUCLES ANIDADOS y CONDICIONALES para encontrar la temperatura máxima general.
	 * 		Retorna el ÍNDICE de la FILA (0 a 6) donde se encontró esa temperatura máxima.
	 *   
	 *   4. Función 'contarMedicionesAltas' (int):
	 * 		Usa BUCLES ANIDADOS y un parámetro 'umbral' (ej. 25.0).
	 * 		Cuenta cuántas temperaturas en la matriz superan ese umbral y retorna el conteo.
	 *   
	 *   5. Función Principal (main):
	 * 		Define la matriz de 7x4.
	 * 		Llama a las funciones anteriores para rellenar, analizar y mostrar los resultados.
	 */
	
	/**
	 * Método para recoger las temperaturas de los 7 dias de la semana a 4 horas distintas
	 * @param temperaturas array bidimensional para guardar las temperaturas
	 * @param sc objeto scanner para leer las temperaturas
	 */
	public static void solicitarTemperaturas (double [][] temperaturas, Scanner sc) {
		
		double temperatura; 
		
		for (int i = 0; i<temperaturas.length; i++) {
			for (int j = 0; j < temperaturas[0].length; j++) {
				System.out.println("Introduce temperatura "+(j+1)+" de la fila "+(i+1)+": ");
				temperatura = sc.nextDouble();
				temperaturas[i][j] = temperatura; 
			}
			
		}		
		
	}
	
	/**
	 * Método que devuelve la temperatura media semanal de la matriz temperaturas
	 * @param temperaturas matriz 7x4 que alberga las temperaturas
	 * @return temperatura media
	 */
	public static double calcularMediaSemanal (double [][] temperaturas) {
		
		double suma = 0;
		double media ;
		
		for (double[]  fila : temperaturas) {
			for (double elemento : fila) {
				
				suma += elemento;
			}
		}
		 
		media = suma / (temperaturas.length * temperaturas[0].length);
		return media; 
	}
	
	/**
	 * Método que encuentra la temperatura más alta en la matriz 7x4 temperaturas
	 * @param temperaturas matriz con las temperaturas tipo double
	 * @return fila en la que encontró la temperatura más alta
	 */
	public static int obtenerDiaMasCaluroso (double [][] temperaturas) { 
			
		double maxima = temperaturas[0][0];
		double tempActual;
		int fila = 0;
			
			for (int i = 0; i<temperaturas.length; i++) {
				for (int j = 0; j<temperaturas[0].length; j++) {
					
					tempActual= temperaturas[i][j];	 
				
					if (tempActual > maxima) {
					maxima = tempActual; 
					fila = i; 
					}
				} 
			} 
			
			return (fila+1);  
		}
	
	
	/**
	 * Método que devuelve todas las temperaturas de la matriz temperaturas mayores que la variable umbral (25)
	 * @param temperaturas array bidimensional con las temperaturas
	 * @return recuento de temperaturas > 25
	 */
	public static int contarMedicionesAltas (double [][] temperaturas) { 
		
		int conteo = 0;
		double umbral = 25.0;
	
		for (int i = 0; i<temperaturas.length; i++) {
			for (int j = 0; j<temperaturas[0].length; j++) {
				if (temperaturas[i][j] > umbral) {
					conteo++;
				}				
			}
		}
		
		return conteo;	
	}
	
	/**
	 * Método que llama a las funciones de arriba para mostrar informacion acerca de la matriz temperaturas
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double [][] temperaturas = new double [7][4];
		
		solicitarTemperaturas(temperaturas, sc);
		
		System.out.println(Arrays.deepToString(temperaturas));
		
		System.out.println("\nMedia Semanal: "+calcularMediaSemanal(temperaturas));
		
		System.out.println("\nDia más caluroso encontrado en fila: "+obtenerDiaMasCaluroso(temperaturas));
		
		System.out.println("\nHay "+contarMedicionesAltas(temperaturas)+" temperaturas mayores de 25ºC.");
		
		sc.close();
	} 

}
