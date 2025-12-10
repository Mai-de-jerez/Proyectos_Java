package Retos;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Reto_5_1 {
	/*
	 * El programa mostrará un  menú por consola
		 1. Generar preguntas del torneo con estas opciones:
		 Se crea un array de 7 números aleatorios entre 1 y 99.
		 Cada número representa la respuesta correcta de una pregunta tipo test que “Sheldon ha hecho”.
		 No deben repetirse porque “eso sería intelectualmente fraudulento”.
		 
		 2. Participar en el torneo
		 El usuario introducirá 7 respuestas (7 números).
		 También sin repetir, porque Sheldon no tolera redundancias.
		 
		 3. Comprobar aciertos
		 Se comparan las 7 respuestas del usuario con las 7 correctas del torneo.
		 Se muestra el número total de aciertos y un comentario según el resultado:
			 • 0–2 → “Howard creía que era ingeniero aeroespacial… tú ni eso.”
 			 • 3–4 → “Penny estaría orgullosa.”
 			 • 5–6 → “¡Leonard aprueba tu examen!”
 			 • 7 → “Sheldon te nombra Amigo del Trono de la Ciencia.”
			 
			 4. Salir
			 
			 Requisitos:
			     • Arrays (crear, recorrer, comparar) 
			     • Bucles for cuando el tamaño es conocido
		     • Bucles while cuando deban validar datos o repetir el menú
		     • Funciones para estructurar el programa 
		     • Validación de entrada 
		     • Comparación de arrays (aciertos)
		     • El menú debe usar while (repetir hasta que el usuario elija salir)

	 */
	
	
	 
	public static int menu(Scanner sc) {

		System.out.println("\n===== El Torneo de Física Teórica de Sheldon Cooper =====");
        System.out.println("1. Generar preguntas del torneo");
        System.out.println("2. Participar en el torneo");
        System.out.println("3. Comprobar aciertos");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        
        return sc.nextInt();
	
	}
	
	public static void generarPreguntas(int[] preguntas) {	 	
		
		Random aleatorio = new Random();
		int num;
		for(int i= 0; i< preguntas.length; i++) {
					
			do {
				num = aleatorio.nextInt(99)+1;

			}while(repetido(preguntas, num));
			
			preguntas[i] = num;
			
		}
	 
	}
	
	public static boolean repetido(int[] preguntas, int num) {  
		
		boolean ok = false;
		for(int i = 0; i < preguntas.length; i++ ) {
			
			if(preguntas[i] == num){ 
				ok = true;
			}
			
		}
		
		return ok;
	}
	
	public static boolean repetido(int[] respuestas, int num, int limite) {
	    for (int i = 0; i < limite; i++) {
	        if (respuestas[i] == num) return true; 
	    }
	    return false;
	}
	
	public static void generarRespuestas(Scanner sc, int[] respuestas) {

		int numero;
		for(int i= 0; i< respuestas.length; i++) { 
			
			do {
				System.out.print("Introduzca una entrada válida (1-99): ");
				numero = sc.nextInt();

			}while (numero < 1 || numero > 99 || repetido(respuestas, numero, i));
			
			respuestas[i] = numero;   
		
		}
  
	
	} 
	
	public static void compararAciertos (int[] preguntas, int[] respuestas) {
		int aciertos = 0;
		for (int i = 0; i<preguntas.length; i++) {
			if (preguntas[i]==respuestas[i]) {
				aciertos++;
			}
		}
		
		if (aciertos <= 2 ) {
			System.out.println("Howard creía que era ingeniero aeroespacial… tú ni eso.");			
		} else if (aciertos <= 4) {
			System.out.println("Penny estaría orgullosa.");
		} else if (aciertos <= 6) {
			System.out.println("¡Leonard aprueba tu examen!");
		} else {
			System.out.println("Sheldon te nombra Amigo del Trono de la Ciencia.");					
		}
		
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] preguntas = new int [7];
		int[] respuestas = new int[7];
		
		 int opcion;
			do {
				opcion = menu(sc);
				
		        switch (opcion) {
				case 1:
					generarPreguntas(preguntas);
					System.out.println("Las preguntas son: " + Arrays.toString(preguntas)); // asi puedes ver más claro cuantas quieres acertar
					break;
				case 2:
					generarRespuestas(sc, respuestas);
					break;
				case 3:
					compararAciertos(preguntas, respuestas);
					break;
				default:
					break;  
				}
	         			
			}while(opcion != 4);
	        
	        System.out.println("Fin del programa");
		
		
	}

}
