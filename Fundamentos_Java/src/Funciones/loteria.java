package Funciones;

import java.util.Random;
import java.util.Scanner;

public class loteria {
	
	/**
	 * Muestra el menú de la aplicación de la Lotería Primitiva al usuario y le pide que elija una opción.
	 * @param sc El objeto Scanner que se utiliza para leer la entrada del usuario desde la consola.
	 * @return El número de la opción elegida por el usuario (un entero del 1 al 4).
	 */
	public static int menu(Scanner sc) {

		System.out.println("\n===== Lotería Primitiva =====");
        System.out.println("1. Generar sorteo");
        System.out.println("2. Participar (introducir mi apuesta)");
        System.out.println("3. Jugar (comprobar aciertos)");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        
        return sc.nextInt();
	
	}
	 
	/**
	 * Con un bucle for y un do-while rellena el array sorteo con un número aleatorio generado con Random hasta completarlo.
	 * @param sorteo recibe como parametro el array de tipo int llamado sorteo
	 */
	public static void generarSorteo(int[] sorteo) {		
		
		Random aleatorio = new Random();
		int num;
		for(int i= 0; i< sorteo.length; i++) {
			
			
			do {
				num = aleatorio.nextInt(49)+1;

			}while(repetido(sorteo, num));
			
			sorteo[i] = num;
			
		}
	
	}
	/**
	 * Verifica si un número dado ya existe dentro de un array de enteros. 
	 * Esta función es útil para asegurar que los números generados sean únicos en el sorteo de lotería 
	 * @param sorteo El array de números enteros donde se realiza la búsqueda.
	 * @param num El número entero que se quiere comprobar si ya está presente en el array.
	 * @return true si el número (num) se encuentra al menos una vez en el array (sorteo). 
	 * Retorna false si el número no está en el array, indicando que no está repetido.
	 */
	public static boolean repetido(int[] sorteo,int num) {
		
		boolean ok = false;
		for(int i = 0; i<sorteo.length; i++ ) {
			
			if(sorteo[i] == num){
				ok = true;
			}
			
		}
		
		return ok;
	}

	
	/**
	 * Imprime por consola los números contenidos en el array del sorteo o de la jugada.
	 * @param sorteo El array de tipo int cuyos elementos serán mostrados.
	 */
	public static void imprimeSorteo(int[] sorteo) {
		
		for(int i=0; i<sorteo.length;i++) {
			
			System.out.print(sorteo[i]+" ");
		}
		
		System.out.println("");
		
	}
	
	/**
	 * Pide al usuario que introduzca los números de su apuesta, validando que estén en el rango (1-49) y que no estén repetidos.
	 * @param sc El objeto Scanner para la entrada de datos.
	 * @param jugada El array de enteros donde se guardará la apuesta del usuario.
	 */
	public static void introducirApuesta(Scanner sc, int[] jugada) { 

		int numero;
		for(int i= 0; i< jugada.length; i++) { 
			
			do {
				System.out.print("Introduzca un número válido (1-49): ");
				numero = sc.nextInt();

			} while (numero < 1 || numero > 49 || repetido(jugada, numero, i));
			
			jugada[i] = numero;   
		
		}
  
	} 
	
	/**
	 * Verifica si un número ya existe en la porción inicial de un array (hasta un límite de índice).
	 * Es utilizado en la introducción de la apuesta para comprobar que el usuario no repita números antes de completar la jugada.
	 * @param jugada El array de números (apuesta del usuario) donde se busca.
	 * @param num El número que se está comprobando.
	 * @param limite El índice hasta el cual debe realizarse la búsqueda (solo la parte ya rellenada del array).
	 * @return true si el número se encuentra antes del límite; false si es un número nuevo.
	 */
	public static boolean repetido(int[] jugada, int num, int limite) {  
	    for (int i = 0; i < limite; i++) {
	        if (jugada[i] == num) return true; 
	    }
	    return false;
	}
	
	/**
	 * Compara la jugada del usuario con los números del sorteo utilizando un bucle anidado.
	 * Calcula el número de aciertos y, basándose en el resultado, imprime el mensaje de premio correspondiente.
	 * @param sorteo Array con los números ganadores del sorteo.
	 * @param jugada Array con los números jugados por el usuario.
	 */
	public static void compararAciertos (int[] sorteo, int[] jugada) {
		int aciertos = 0;
		for (int i = 0; i<sorteo.length; i++) {
			for (int j = 0; j < jugada.length; j++) {
				if (sorteo[i]==jugada[j]) {
					aciertos++;
				}
			}
		}
		
		if(aciertos < 3) {
			System.out.println("Tienes "+aciertos+" aciertos, por lo tanto no tienes premio.");
		} else if (aciertos == 3) {
			System.out.println("Tienes "+aciertos+" aciertos, has ganado el quinto premio, 8 € (o el coste de la apuesta).");
		} else if (aciertos == 4) {
			System.out.println("Tienes "+aciertos+" aciertos, has ganado el cuarto premio, 100 €.");
		} else if (aciertos == 5) {
			System.out.println("Tienes "+aciertos+" aciertos, has ganado el tercer premio, buen pellizco.");
		} else if (aciertos == 6) {
			System.out.println("Tienes "+aciertos+" aciertos, has ganado el segundo premio, ¡Gran Premio!");
		} else {
			System.out.println("Tienes "+aciertos+" aciertos, has ganado el primer premio, ¡PREMIO GORDO!");
		}
		
	}
	
	
	/**
	 * Punto de entrada principal de la aplicación.
	 * Inicializa los arrays de sorteo y jugada, y gestiona el flujo de control del programa
	 * a través de un bucle do-while y una estructura switch que llama a las funciones del menú.
	 * @param args Argumentos de la línea de comandos (no utilizados).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] sorteo = new int[7];
		int[] jugada = new int[7];
		
		
		 int opcion;
		do {
			
         opcion = menu(sc);
         
         switch (opcion) {
		case 1:		
			generarSorteo(sorteo);
			imprimeSorteo(sorteo);
			break;
		case 2:
			introducirApuesta(sc, jugada);
			break;
		case 3:
			compararAciertos(sorteo, jugada);
		default:
			break;
		} 
         	
		}while(opcion != 4);
        
        System.out.println("Fin del programa");
        
        
	}
		

}
