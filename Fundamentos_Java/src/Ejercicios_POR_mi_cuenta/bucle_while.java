package Ejercicios_POR_mi_cuenta;
import java.util.Scanner;


public class bucle_while {
	public static void main(String[] args) {
		
		System.out.println("--REPASO ARRAYS, CONDICIONALES, BUCLES, MATRICES.....--");
		
		Scanner lector = new Scanner(System.in);
		
		// Ejercicio 1
		System.out.println("--EJERCICIO: PARES O IMPARES--");
		// defino variables
		int pares =0;
		int impares=0;
		int vueltas = 0;
		while (vueltas < 5) { // mientras vueltas sea menor que 5
			System.out.println("Introduzca nuevo número: ");
			if (lector.hasNextInt()) { // comprueba si el num introducido es un int
	            int num = lector.nextInt(); 
	            lector.nextLine(); // limpiar el buffer para consumir la tela intro pulsada y no haya restos
            	if (num % 2==0) { // si al dividir entre 2 da de resto cero
            		pares++;
            	}else {
            		impares++;
            	}
            	vueltas++;
	             
			} else {
				System.out.println("¡El número debe ser entero! Inténtelo de nuevo.");
		        lector.nextLine();
            }
	
		}
		
		System.out.println("Hay "+pares+" números pares y "+impares+" números impares.");
		System.out.println("\n--------------------------------------------------------------------------\n");
		
		
        
		lector.close(); // cerramos lector
	}
}


