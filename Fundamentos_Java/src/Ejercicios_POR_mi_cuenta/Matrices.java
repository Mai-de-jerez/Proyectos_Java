package Ejercicios_POR_mi_cuenta;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("--EJERCICIO: SUMA DE MATRICES--");
		/*
		 * Debes sumar los elementos de la matrizA a cada elemento de la matrizB
		 */
		
		// declaramos las matrices:
		int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
		int[][] matrizB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		int[][] matrizSuma = new int[3][3]; // matriz suma vacía por ahora
		for (int i=0; i<matrizA.length; i++) { // para recorrer una por una las filas de la matriz empezando en 0 hasta el final
			for (int j=0; j<matrizA[0].length; j++) { // para recorrer cada elemento de la fila
				matrizSuma[i][j]=matrizA[i][j]+matrizB[i][j]; // sumamos cada elemnto de la matriz A con cada elemento de la matriz B
			}
		}
		
		System.out.println(Arrays.deepToString(matrizSuma));
		System.out.println("\n--------------------------------------------------------------------------\n");
		
		
		System.out.println("--EJERCICIO: cálculo productos Almacén--");
		
		/*
		 * Gestión de Stock en un Almacén: Cálculo de Productos en un Almacén de Distribución
		 * 🎯 Objetivo
		 * Implementar un programa en Java que simule y calcule el inventario de productos almacenados en una pequeña 
		 * sección de un almacén. Los datos del stock se deben gestionar mediante una matriz bidimensional.
		 * 🏭 Especificaciones
		 * Estructura del Almacén:
		 * El almacén está organizado en 3 Pisos (que representarán las filas de la matriz).
		 * Cada piso tiene 4 Estanterías (que representarán las columnas de la matriz).
		 * La matriz debe ser de tipo int y llamarse stockAlmacen (de $3 \times 4$).
		 * Inicialización de Datos:
		 * Utiliza un doble bucle for anidado para recorrer todos los pisos y estanterías.
		 * Dentro del bucle, asigna un valor de stock aleatorio a cada posición de la matriz. 
		 * El stock de cada estantería debe estar comprendido entre 10 y 50 unidades (ambos inclusive).
		 * Cálculos Requeridos:
		 * Mientras rellenas la matriz, el programa debe calcular y almacenar tres totales distintos:
		 * stockTotal: La suma de todas las unidades en todo el almacén.
		 * stockPisoCentral: La suma de todas las unidades almacenadas solo en el Piso 2 (el que corresponde al índice i = 1).
		 * stockEstanteria3: La suma de todas las unidades almacenadas en la tercera estantería (la que corresponde al índice j = 2), a lo largo de todos los pisos.
		 * Salida (Output):
		 * Muestra por consola la matriz generada para visualizar el stock en cada posición.
		 * Finalmente, imprime de forma clara el valor de los tres cálculos de stock solicitados.
		 */
		
		// Declaración de la matriz 3x4 (Pisos x Estanterías)
        int[][] stockAlmacen = new int[3][4];
        int stockTotal = 0;
        int stockPisoCentral = 0;
        int stockEstanteria3 = 0;
        // Rellenar la matriz y calcular el stock total
        for (int i = 0; i < 3; i++) { // Bucle para los pisos (filas)
            for (int j = 0; j < 4; j++) { // Bucle para las estanterías (columnas)
  
                // Rellenar con stock aleatorio (entre 10 y 50)
                stockAlmacen[i][j] = (int) (Math.random() * 41 + 10); 
                stockTotal += stockAlmacen[i][j];
                if (i == 1) {
                	stockPisoCentral += stockAlmacen[i][j];
				}
                if (j == 2) {
					stockEstanteria3 += stockAlmacen[i][j];	
                }
            }

        }
        
        // Mostrar stock total
        System.out.println("--- Informe de Inventario ---");
        System.out.println("Stock Total en el almacén: " + stockTotal + " unidades.");
        System.out.println("Stock Total en el piso central: " + stockPisoCentral + " unidades.");
        System.out.println("Stock Total en la estantería 3: " + stockEstanteria3 + " unidades.");
        
		System.out.println("\n--------------------------------------------------------------------------\n");
		
		
		System.out.println("--EJERCICIO: MAYORES QUE 10--");
		/*
		 * Recorrer esta matriz para contar cuantos valores son mayoresq ue diez.
		 */
		int [][] matriz = {{5, 12, 8}, {15, 3, 20}, {7, 10, 18}};
		int contadorMayoresDiez = 0;
		for (int i=0; i<matriz.length; i++) { // recorre cada fila
			for (int j=0; j<matriz[0].length; j++) { // recorre cada elemento de fila antes de ir a la próxima fila
				if (matriz[i][j]>10) { // si el elemento es mayor que 10
					contadorMayoresDiez++; // contador suma 1
				}
			}
		}
		System.out.println("Hay "+contadorMayoresDiez+" valores mayores que 10.");
		System.out.println("\n--------------------------------------------------------------------------\n");
		
		lector.close();
        
	}

}
