package Ejercicios_POR_mi_cuenta;

import java.util.Random;

public class tableroBinario {
	/*
	 * Ejercicio 1: El Tablero de Códigos Binarios (Matrices y while Anidado)
	 * Crea una función llamada generarTableroBinario que:
	 * Reciba dos parámetros: el número de filas y el número de columnas.
	 * Cree y rellene una matriz (array 2D) de enteros (int[][]) con ese tamaño.
	 * Utilice bucles while anidados para recorrer la matriz.
	 * Rellene cada celda con un valor binario aleatorio: 0 o 1.
	 * La función debe devolver esta matriz.
	 * En el método main, llama a la función e imprime el tablero resultante.
	 * Objetivo: repasar bucles while y for anidados y funciones.
	 */
	
	
	
	/**
	 * Método que recibe dos parametros tipo int para imprimir una matriz de binarios usando Random()
	 * @param filas numero de filas de la matriz
	 * @param columnas numero de columnas de la matriz
	 * @return la matriz de tipo int
	 */
	public static int[][] generarTableroBinario(int filas, int columnas){
		Random random = new Random();
		int i = 0; 		
		int [][] matriz = new int [filas][columnas];
		while (i < filas ){
			int j = 0;
			while (j < columnas){
				int elemento = random.nextInt(2);
				matriz[i][j]=elemento;
				j++;
			}
			
			i++;
		}
		
		return matriz; 
	}
	
	
	/**
	 * Método para imprimir una matriz usando un bucle for anidado
	 * @param matriz es el parámetro que recibe que es una matriz de tipo int
	 */
	public static void imprimirMatriz (int matriz[][]) {
		for(int i =0; i<matriz.length; i++) {
			for(int j =0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" "); 
			}
			
			System.out.println();
		}
		
		
	}

	
	/**
	 * Método que llama a las funciones generarTableroBinario() y imprimirMatriz() y que define los parametros de la 
	 * función generarTableroBinario()
	 * @param args
	 */
	public static void main(String[] args) {
		
		int filas = 5;
		int columnas = 8;
		int[][] matriz = generarTableroBinario(filas, columnas);
		System.out.println("\nSu matriz, gracias: ");
		imprimirMatriz(matriz); 

	}

}
