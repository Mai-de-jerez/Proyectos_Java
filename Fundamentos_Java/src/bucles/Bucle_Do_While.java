package bucles;

import java.util.Scanner;

public class Bucle_Do_While {

	public static void main(String[] args) {
		/*
		 * Inicialización; 
		 * 		do { 
		 * 			bloque_de_sentencias; 
		 * 			actualización; } 
		 *		while (condición);
		 */
		
		// Ejemplo 1: Suma de los números del 0 al 100
		int suma = 0, contador = 0;

		do {
			// A la suma se le añade el valor actual del contador
			suma += contador; 
			// Se incrementa el contador
			contador++; 
		} while (contador <= 100);
		
		// El resultado de la suma de los números del 0 al 100
		System.out.println("La suma de los números del 0 al 100 es: " + suma);
		
		
		// Ejemplo 2: Bucle do-while para mostrar un menú
		// Nota: Este código mostrará el menú continuamente
		// porque la variable 'opcion' nunca cambia su valor (siempre es 0), 
		// por lo que 'opcion != 4' siempre es verdadero.
		// Para que funcionara correctamente, habría que incluir un Scanner 
		// para leer la opción del usuario.
		
		/*
		 * int opcion = 0; // Inicialización de la variable de control
		 * 
		 * do { System.out.println("------------------------------------");
		 * System.out.println("- 1.- Introducir datos.            -");
		 * System.out.println("- 2.- Calcular datos.              -");
		 * System.out.println("- 3.- Listar los datos.            -");
		 * System.out.println("- 4.- Salir.                       -");
		 * System.out.println("------------------------------------");
		 * 
		 * 
		 * 
		 * } while (opcion != 4);
		 * 
		 * // Este mensaje se ejecuta cuando (si) el bucle termina.
		 * System.out.println("Adios!!!");
		 */
		
		// Ejemplo 3: ejemplo anterior corregido con Scanner para leer la opción del usuario.
		Scanner scanner = new Scanner(System.in);
		int opcion = 0; // Inicialización de la variable de control
		int number1=-1;
		int number2=-1;
		do {
			System.out.println("------------------------------------");
			System.out.println("- 1.- Introducir números.            -");
			System.out.println("- 2.- Ver mis números.              -");
			System.out.println("- 3.- Sumar mis números.            -");
			System.out.println("- 4.- Salir.                       -");
			System.out.println("------------------------------------");
			System.out.print("Seleccione una opción: ");
			
			// Leer la opción del usuario
			opcion = scanner.nextInt();
			if(opcion==1) {
				System.out.println("Introduzca número 1: ");
				number1 = scanner.nextInt();
				System.out.println("Introduzca número 2: ");
				number2 = scanner.nextInt();
			} else if (opcion==2) {
				if (number1!=-1 && number2!=-1) {
					System.out.println("Sus números son: "+number1+" y "+number2);
				} else { 
					System.out.println("No ha introducido ningún número.");
				}
			} else if (opcion==3){
				if (number1 != -1 && number2 != -1) {
			        int resultado= number1 + number2;
			        System.out.println("La suma de sus números es: " + resultado);
			    } else {
			        // Mostramos un mensaje de error si no ha introducido los números
			        System.out.println("ERROR: Primero debe introducir los números (Opción 1).");
			    }
			} else if (opcion == 4) {
			    // Si la opción es 4, confirmamos que salimos. 
			    System.out.println("Saliendo del programa...");
			} else {
				System.out.println("ERROR: Opción no válida. Por favor, escoja 1, 2, 3 o 4.");
			}
			
		} while (opcion != 4);
		
			        
	       
	        
	        System.out.println("--------------------------------------------------------------------------");
	        
	    // Do-While se ejecuta la primera vez aunque no se cumpla la condicion, luego ya solo se ejecuta mientras se cumpla.
	    
	    // Ejemplo do-while donde la condición no se cumple
		
 		int cont=5;
 		do {
 			cont++;
 			System.out.println("Me ejecuto al menos una vez aunque la condición no se cumpla.");
 			
 		}while(cont<5);
 		
 		System.out.println("\n--------------------------------------------------------------------------------------\n");
	 		
	        
	    // Otro ejemplo: pedirá una opción mientras la condición se cumpla pero si no se cumple, se ejecut una vez.
 		int option;
 		do {
 			System.out.println("Dame un número (SALIR 0): ");
 			option = scanner.nextInt();
 		}
 		while(option!=0);
 		
 		
 		
 		
 		scanner.close();
	}

}
