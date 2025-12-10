package Retos;

import java.util.Scanner;

public class Reto_4_1 {

	public static void main(String[] args) {
		/* 
		EJERCICIO 1: 
		
		 La humanidad ha lanzado una gigantesca antena espacial para rastrear señales de radio en el universo.
		 El espacio se representa con una matriz de 15 x 15:
		  
		 • Cada posición de la matriz es un punto del espacio.
		  
		 • El valor 1 significa silencio cósmico (no hay señal). 
		 
		 • El valor 0 significa ¡señal de radio detectada! (posible vida extraterrestre ).
		 
		 Tu misión:
		
		  • El programa debe dejarte apuntar la antena indicando coordenadas (fila y columna) por teclado.
		  
		  	◦ Puedes usar filas y columnas de  1 a 15 para que sea más “humano”.
		  	
		  • Cada vez que el usuario apunte a una posición:
		  
		  ◦ Si hay un 1: mostrar un mensaje tipo
		  
		    --> Silencio cósmico en (fila, columna)...
		  
		  ◦ Si hay un 0: mostrar
		  
		  	--> ¡SEÑAL DETECTADA en (fila, columna)! 
		 
		 • El juego termina cuando:
		 
		  ◦ El usuario encuentre todas las señales (todos los 0)
		  
		*/
		
		int[][] espacio = {
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				 {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1},
				 {1,1,1,1,1,1,1,1,1,1,0,1,1,1,1},
				 {1,1,1,1,1,0,1,1,1,1,1,1,1,1,1},
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				 {1,1,1,1,1,1,1,1,0,1,1,1,1,1,1},
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				 {1,1,0,1,1,1,1,1,1,1,1,1,1,1,1},
				 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
				 };
		
		// Apuntar la antena:
		
		Scanner lector = new Scanner(System.in);
		int columna; 
		int fila; 
		int intentosTotales = 0;
		int intentosMaximos = 12;
		int encontradas = 0;
		boolean jugar = true;
		while (jugar) {
			System.out.println("\nIntroduce número de fila (1-15): ");
			fila = lector.nextInt();
			System.out.println("Introduce número de columna (1-15): ");
			columna = lector.nextInt();
			lector.nextLine();
			
			fila -= 1;
			columna -= 1; 
			
			if (espacio[fila][columna] == 1) {
				System.out.println("Silencio cósmico en ("+(fila + 1)+", "+(columna + 1)+")...");
			} else if (espacio[fila][columna] == 9) {
				System.out.println("!Ya habías detectado esta señal tonti, has perdido un intento!");
			} else {
				System.out.println("¡SEÑAL DETECTADA en ("+(fila + 1)+", "+(columna + 1)+")!");
				espacio[fila][columna] = 9;
				encontradas++;
			}
					
			
			boolean quedanCeros = false; 
		    for (int i = 0; i < espacio.length && !quedanCeros; i++) {
		        for (int j = 0; j < espacio[0].length && !quedanCeros; j++) {        
		            if (espacio[i][j] == 0) {
		                quedanCeros = true; 
		            }
		        }
		    }

		    intentosTotales++;
		    if (intentosTotales >= intentosMaximos) {
		        jugar = false; 
		        System.out.println("\n¡Has fallado la misión media torta! FIN DEL JUEGO.");
		        System.out.println("\nIntentos: "+intentosTotales);
		        System.out.println("\nAciertos: "+encontradas);
		    }
		    
		    if (!quedanCeros) {
		        jugar = false; 
		        System.out.println("\n¡Felicidades! has encontrado todas las señales y no has ganado nada (¡Zas en toda la boca!). FIN DEL JUEGO.");
		        System.out.println("\nIntentos: "+intentosTotales);
		        System.out.println("\nAciertos: "+encontradas);
		    }
		
		}
		
		System.out.println("\n--- Estas eran las señales (los 9 para las encontradas y los 0 para las no encontradas)  ---");
		
	    for (int i = 0; i < espacio.length; i++) {

	        for (int j = 0; j < espacio[0].length; j++) {
	           
	            System.out.print(espacio[i][j] + " "); 
	        }
	     
	        System.out.println(); 
	    }
		
		
		lector.close();
		
		System.out.println("----------------------------------------------------------");
		
		/*
		 * EJERCICIO 2:  Partiendo del ejercicio anterior, añadir:
		 * Llevar la cuenta de intentos totales.
		 * Llevar la cuenta de señales encontradas.
		 * Al acabar, mostrar la matriz completa para ver dónde estaban las señales. 
		 * Poner un límite de intentos y “fallar la misión” si no se encuentran a tiempo.
		 */		
		
	}
}


