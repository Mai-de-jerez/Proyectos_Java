package Operadores;

import javax.swing.JOptionPane;

public class OperadorAritmetico {

	public static void main(String[] args) {
		
		// Declaramos 3 variables, i, j y suma
		int i = 5, j = 4, suma = i + j;
		
		System.out.println("Suma: "+suma);
		// ojo si pones esto		
		System.out.println("Suma: "+ i + j + " (está concatenando no sumando!!)");
		// o mira esto
		System.out.println(i + j + "suma");
		// correcto
		System.out.println("Resta: "+ (i + j) + " (correcto gracias al uso del paréntesis)"); 
		// Esto daria error porque no se puede restar a un string
		// System.out.println("Suma: "+ i - j);		
		// Forma correcta
		System.out.println("Resta: "+ (i - j));
		
		// Multiplicación
		int multi = i*j;
		System.out.println("Producto de i*j: "+multi);
		
		// División
		int div = i/j;
		// resto
		int resto = i%j;
		System.out.println("División de i / j con int: "+div+", resto: "+resto);
		System.out.println("No te hace la división exacta cuando es un int.");
		
		float divi = i/j;
		System.out.println("División de i / j con float: "+divi);
		
		divi = (float)i/j; // o asi -> divi = (float)i/(float)j;
		System.out.println("División de i / j con float y con cast para uno de los int: "+divi);
		
		// ejemplo de usar %
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
		
		if (numero % 2 == 0) {
			System.out.println("Número es par.");
		} else {
			System.out.println("Número es impar.");
		}
	}

}
