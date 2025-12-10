package Ejercicios_POR_mi_cuenta;
import java.util.Scanner;

public class Funciones {


		/*
		 * Ejercicio de Funciones en Java: Validador Modular de Contraseñas
		 * 🎯 Objetivo
		 * El objetivo es crear un programa que solicite al usuario una contraseña y la valide según tres criterios. 
		 * Deberás implementar una función (método) separada para cada uno de los criterios, haciendo el código principal 
		 * (main) limpio y modular.
		 * ⚙️ Especificaciones
		 * El programa debe verificar que la contraseña cumpla todos los siguientes requisitos:
		 * Longitud Mínima: Debe tener al menos 10 caracteres.
		 * Presencia de Dígito: Debe contener al menos un número (dígito del 0 al 9).
		 * Presencia de Mayúscula: Debe contener al menos una letra mayúscula.
		 * 🛠️ Estructura del Código
		 * Implementa la siguiente estructura modular:
		 * 1. Función Principal (main)
		 * Utiliza un bucle do-while para solicitar repetidamente la contraseña hasta que sea válida.
		 * Dentro del bucle, llama a las tres funciones de validación.
		 * Muestra al usuario qué requisito no se cumplió (si lo hubiera).
		 * 2. Función de Validación de Longitud
		 * 3. Función de Validación de Dígito
		 * 4. Función de Validación de Mayúscula
		 */
	
	public static boolean contieneNumero (String contraseña){ 
		
		for (int i = 0; i < contraseña.length(); i++) { // recorrer el string contraseña caracter por caracter
		    char caracter = contraseña.charAt(i); // va extrayendo cada caracter del string en cada vuelta
		    if (Character.isDigit(caracter)) { // si el caracter extraido es un digito.....(numero)
		        return true; // si contiene el numero retorna true
		    } 		    	
		}
		
		return false; 
	}
	
	public static boolean contieneMayuscula(String contraseña){

			for (int i = 0; i < contraseña.length(); i++) { // recorrer el string contraseña caracter por caracter
			    char caracter = contraseña.charAt(i); // va extrayendo cada caracter del string en cada vuelta
			    if (Character.isUpperCase(caracter)) { // si el caracter extraido es una mayuscula
			        return true; // si contiene la mayuscula retorna true

			    }
			}
			
			return false; 
		} 
	
	
	public static boolean minimo10Caracteres (String contraseña) {
		if (contraseña.length() < 10) { // si contraseña tiene menos de 10 caracteres
			return false;
		} 
		
		return true; 
	}
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("--EJERCICIO: EL VALIDADOR DE CONTRASEÑAS--");
	String contraseña ="";
	boolean esValida = false;
 
	do {
		
		System.out.println("------------------------------------------");
        System.out.println("Introduzca una contraseña: ");
        contraseña = scanner.nextLine();
        
        // Asumimos que es válida al inicio de cada intento
        esValida = true;
        
        // 1. Longitud (evaluación independiente)
        if (!minimo10Caracteres(contraseña)) {
            System.out.println("[ERROR] La contraseña debe contener al menos 10 caracteres.");
            esValida = false;
        }
        
        // 2. Dígito (evaluación independiente)
        if (!contieneNumero(contraseña)) {
            System.out.println("[ERROR] La contraseña debe contener al menos un número (dígito).");
            esValida = false;
        }
        
        // 3. Mayúscula (evaluación independiente)
        if (!contieneMayuscula(contraseña)) {
            System.out.println("[ERROR] La contraseña debe contener al menos una letra mayúscula.");
            esValida = false;
        }

    } while(!esValida); // Repetir mientras 'esValida' sea false
    
    System.out.println("\nContraseña creada correctamente.");
    
    scanner.close(); 
    
	}
}
