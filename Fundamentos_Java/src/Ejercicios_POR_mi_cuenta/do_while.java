package Ejercicios_POR_mi_cuenta;

import java.util.Scanner;


public class do_while {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		
		System.out.println("--EJERCICIO: EL VALIDADOR DE CONTRASEÑAS--");
		String contraseña ="";
		boolean esValida = false;
	
		do {
			boolean contieneDigito=false;
			System.out.println("Introduzca una contraseña: ");
			contraseña = lector.nextLine();
			
			for (int i = 0; i < contraseña.length(); i++) { // recorrer el string contraseña caracter por caracter
			    char caracter = contraseña.charAt(i); // va extrayendo cada caracter del string en cada vuelta
			    if (Character.isDigit(caracter)) { // si el caracter extraido es un digito.....(numero)
			        contieneDigito = true; // si contiene el numero....
			        break;  // paramos la búsqueda               
			    }
			}
			
			if (contraseña.length()<8) { // si contraseña tiene menos de 8 caracteres
				System.out.println("La contraseña debe contener al menos 8 caracteres.");
			} else if (!contieneDigito) {
				System.out.println("La contraseña debe contener al menos un número.");
			} else if (contraseña.contains("secreto")) {
				System.out.println("La contraseña no debe contener la palabra secreto.");
			} else {
				esValida = true;
			}
			
		}
		while(!esValida); // mientras esValida sea true (!esValida o esto q es lo mismo)
		System.out.println("Contraseña creada.");
		
		lector.close(); // cerramos es lector del scanner
		
		System.out.println("\n--------------------------------------------------------------------------\n");

	}

}
