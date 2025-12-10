package Ejercicios_POR_mi_cuenta;

public class Contador_Celdas_Negativas {
	/*
	 * Ejercicio 3: El Contador de Celdas Negativas (Funciones, Matrices y while Anidado)
	 * Crea una función llamada contarNegativosEnMatriz que trabaje con números negativos 
	 * (una analogía de datos corruptos):
	 * Reciba una matriz de enteros (int[][]).
	 * Utilice bucles while anidados para recorrer todos los elementos.
	 * La función debe contar cuántos números en la matriz son negativos (menores que cero).
	 * La función debe devolver el número total de celdas negativas encontradas.
	 * En el método main, crea una matriz de ejemplo (con números positivos y negativos) y prueba la función.
	 */
	
	
	/**
	 * Método que cuenta el números de elementos negativos que alberga una matriz de arrays
	 * @param matriz recibe una matriz como parametro
	 * @return el contador que cuenta los negativos y devuelve la cifra como int
	 */
	public static int contarNegativosEnMatriz(int[][] matriz) {
		int contador = 0;
		int i =0;
		while (i < matriz.length) {
			int j = 0;
			while (j < matriz[0].length) {
				if (matriz[i][j] < 0) {
					contador++;
				}
				j++;
			}
			
			i++;
		} 
			
		return contador;
	}
	
	
	
	/**
	 * declara una matriz de arrays y llama a método contarNegativosEnMatriz() para contar sus elementos engativos.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [][] matriz = {
				{1,2,3,4,5,6},
				{0,-4,-5,-8,9,7},
				{1,-1,-3,-2,4,6},
				{3,-5,-6,-3,4,6}
		};
		
		System.out.println("La matriz tiene: "+contarNegativosEnMatriz(matriz)+" elementos negativos.");

	}

}
