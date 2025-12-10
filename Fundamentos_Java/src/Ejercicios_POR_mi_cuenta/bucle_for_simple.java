package Ejercicios_POR_mi_cuenta;

import java.util.Scanner;

public class bucle_for_simple {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("--EJERCICIO: TEMPERATURA MEDIA--");
		
		/*
		 * Registro y Promedio de Temperaturas Semanales
		 * 🎯 Objetivo
		 * Desarrollar un programa en Java que solicite al usuario las temperaturas registradas durante una semana completa.
		 * El programa debe almacenar estos valores, calcular la temperatura media semanal y, 
		 * muy importante, validar la entrada de datos para asegurar que solo se ingresen números.
		 * ⚙️ Especificaciones
		 * Estructura de Datos:
		 * Declarar un array de números decimales (double[]) llamado temperaturas con capacidad para 7 elementos 
		 * (correspondientes a los 7 días de la semana).
		 * Recolección de Datos (Bucle y Validación):
		 * Utilizar un bucle for para iterar 7 veces, pidiendo al usuario que ingrese la temperatura para cada día.
		 * Validación de Entrada: 
		 * Antes de leer el valor, se debe usar lector.hasNextDouble() para comprobar si el dato introducido es un número decimal válido.
		 * Si es válido: Leer la temperatura con lector.nextDouble(), almacenarla en el array en la posición correcta e ir sumándola a una variable suma. No olvides limpiar el buffer con lector.nextLine() después de leer el número.
		 * Si NO es válido: Informar al usuario del error y usar lector.nextLine() para limpiar el buffer antes de continuar con la siguiente iteración.
		 * Cálculo:
		 * Una vez que se han recogido todas las temperaturas, calcular la temperaturaMedia dividiendo la suma total 
		 * entre el número de días (la longitud del array).
		 * Salida (Output):
		 * Mostrar por consola el resultado final: la temperatura media calculada para la semana.
		 */
		
		double[] temperaturas = new double[7];
		double suma=0;
		for(int i=0; i<7; i++) {
			System.out.println("Introduzca nueva temperatura: ");
			if (lector.hasNextDouble()) { 
	            double cifra = lector.nextDouble(); 
	            lector.nextLine();        	
	            temperaturas[i]=cifra;
	            suma+=temperaturas[i];
			} else {
				System.out.println("¡Error! Introduzca un valor válido.");
		        lector.nextLine();
			}
		}
		
		double temperaturaMedia = suma/temperaturas.length;
		System.out.println("\nLa temperatura media es: "+temperaturaMedia);
		
		lector.close();
		
		System.out.println("\n--------------------------------------------------------------------------\n");
	}

}
