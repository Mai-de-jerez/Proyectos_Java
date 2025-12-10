package Retos;

import java.util.Scanner;

public class Reto_1 {

	public static void main(String[] args) {
	
		// RETO 1: ENTRADA-SALIDA DATOS POR CONSOLA
		
				// Ejercicio único
				
		        Scanner scanner = new Scanner(System.in);
		      
		        
		        System.out.println("Dime tu nombre:");
		        String nombre = scanner.nextLine();
		        System.out.println("En que año estamos:"); 
		        int anio = scanner.nextInt();
		        scanner.nextLine(); // vaciar el buffer
		        System.out.println("Dime tu lenguaje de programación preferido:");
		        String lenguaje = scanner.nextLine();
		        System.out.println("Hola " + nombre + " en este año " + anio + " serás un/a gran programador/a en " + lenguaje);
		       
		        scanner.close();
						 		
			
	}

}
