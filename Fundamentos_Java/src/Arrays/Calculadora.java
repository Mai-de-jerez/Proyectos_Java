package Arrays;

import java.util.Scanner;

public class Calculadora {

	public static int dameUnNumeroEntero(Scanner input) {
		System.out.println("Dame un numero");
		int numero = input.nextInt();
		
		return numero;
		
	}
	
	public static int suma(int n1, int n2) {
		
		int total = n1+n2;
		
		// return n1+n2
		return total; 
		
	}
	
	public static int resta(int n1, int n2) {
		
		int total = n1-n2;
		
		// return n1+n2
		return total; 
		
	}
	
	public static int mul(int n1, int n2) {
		
		int total = n1*n2;
		
		// return n1+n2
		return total; 
		
	}
	
	
	public static void total(int total) {
		
		System.out.println("El total es: " + total);
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero1 = dameUnNumeroEntero(sc);
		int numero2 = dameUnNumeroEntero(sc);
		
	    int total = resta(numero1,numero2);
	    total(total);
	}
	
}
