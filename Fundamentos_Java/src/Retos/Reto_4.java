package Retos;

import java.util.Scanner;

public class Reto_4 {

	public static void main(String[] args) {
		// EJERCICIO 1: Representa en JAVA la siguiente matriz con los datos y posicionados según la imagen.
		
		String [][] matriz = {
				{" ", " ", " ", " ", " ", " ", " ", "DAW", " ", " "},
				{" ", " ", " ", "DAW", " ", " ", "DAW", " ", " ", " "},
				{" ", "DAM", " ", " ", "DAM", " ", " ", " ", "DAM", " "},
				{"DAW", " ", " ", " ", " ", " ", "DAM", " ", " ", " "},
				{" ", "DAM", " ", " ", "DAW", " ", " ", " ", " ", " "},
				{" ", "DAW", "DAW", " ", " ", " ", "DAM", " ", " ", "DAW"},
				{" ", " ", "DAW", " ", " ", " ", " ", " ", " ", " "},
				{" ", " ", " ", "DAM", " ", "DAM", " ", "DAM", " ", " "},
				{" ", "DAM", " ", " ", " ", " ", " ", " ", "DAW", " "},
		};
		
		
		// EJERCICIO 2: Saca por la terminal el número de elementos con DAM y DAW que existen en la matriz.
		int contadorDAM = 0;
		int contadorDAW = 0;
		
		for (int i = 0; i< matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j].equals("DAM")) { 
					contadorDAM++;					
				} else if (matriz[i][j].equals("DAW")) {
					contadorDAW++;
				}
			}
		}
		
		System.out.println("\nEl número de elementos DAM es: "+contadorDAM);
		System.out.println("\nEl número de elementos DAW es: "+contadorDAW);
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		// EJERCICIO 3: Imprime todos los datos de la matriz
		
		for (int i = 0; i< matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		// EJERCICIO 4: Remplaza los textos DAM por el texto Multiplataforma y los DAW por WEB
		
		for (int i = 0; i< matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j].equals("DAM")) { 
					matriz[i][j] = "DAW";					
				} else if (matriz[i][j].equals("DAW")) {
					matriz[i][j] = "DAM";
				}
			}
		}
		
		
		// EJERCICIO 5:  Vuelve a imprimir los datos de la matriz
		
		for (int i = 0; i< matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		// EJERCICIO 6: Pide por la terminal un numero de fila y un numero de columna, luego el texto que quieres incluir.
		// Pedirá nuevas inserciones hasta que pongamos salir. Ejemplo: 
		//    Columna: 0
		//    Fila: 3
		//    Texto: Hola.
		// Si ya existe algún texto en la Matriz indicará si queremos remplazar el texto (poniendo cual contiene por el nuevo).
		// Ejemplo: Deseas cambiar el texto DAM por Hola? (S/N)
		Scanner lector = new Scanner(System.in);
		String nombre; 
		int columna; 
		int fila; 
		boolean salir = false;
		String opcion = "";
		
		while (!salir) {
			
			System.out.println("\nIntroduce número de fila (0-8): ");
			fila = lector.nextInt();
			System.out.println("Introduce número de columna (0-9): ");
			columna = lector.nextInt();
			lector.nextLine();
			System.out.println("Introduce el nombre del texto: ");
			nombre = lector.nextLine(); 
		
			
			String elemento = matriz[fila][columna];
			if (elemento.equals(" ")) {
				matriz[fila][columna] = nombre;
				System.out.println("Operación realizada con éxito.");
			} else {
				System.out.println("Deseas cambiar el texto "+matriz[fila][columna]+" por "+nombre+"? (S/N) ");
				char respuesta = lector.next().charAt(0);
				lector.nextLine();
				if (respuesta == 'S' || respuesta == 's' ) {
					matriz[fila][columna] = nombre;
					
					System.out.println("Operación realizada con éxito.");
					} else {
						
					System.out.println("Operación de reemplazo cancelada.");
					
					}
			}
			
			 System.out.print("\nIntroduce 'salir' para terminar, o pulsa una tecla para continuar: ");
			    opcion = lector.nextLine();
			    if (opcion.equalsIgnoreCase("salir")) {
			    	salir = true;
			    } 
			
		} 	
							
		lector.close();
		
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		// EJERCICIO 7:  Imprime el resultado final de la matriz.
		
		for (int i = 0; i< matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
