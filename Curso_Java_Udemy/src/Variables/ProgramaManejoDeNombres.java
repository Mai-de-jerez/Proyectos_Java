package Variables;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca nombre de familiar 1: ");
		String nombre1 = sc.nextLine();
		System.out.println("Introduzca nombre de familiar 2: ");
		String nombre2 = sc.nextLine();
		System.out.println("Introduzca nombre de familiar 3: ");
		String nombre3 = sc.nextLine();
		
		
		nombre1 = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
		nombre2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
		nombre3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);
		
		System.out.println(nombre1+"_"+nombre2+"_"+nombre3);
		
		sc.close();

	}

}
