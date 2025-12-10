package Retos;

import java.util.Scanner;

public class Reto_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// RETO 2: CONDICIONALES
        
        // Ejercicio 1: 
        
 		System.out.println("Dime una edad entre 0 y 100 :");
 		int edad = scanner.nextInt();
 		int resto = 100 - edad;
 		if (edad<18) {
 			System.out.println("Eres menor de edad, te faltan " + resto + " años para llegar al siglo.");
 		}else{
 			System.out.println("Eres mayor de edad, te faltan " + resto + " años para llegar al siglo.");
 		}
 		
 		System.out.print("\n---------------------------------------------------------------------------\n");
 		
 		// Ejercicio 2:
 		
		System.out.println("Dime los bits de la consola :");
		int bits = scanner.nextInt();
		if (bits == 1) {
			System.out.println("Ese tipo de consolas se crearón entre 1972 y 1983.");
		} else if (bits == 4){
			System.out.println("Ese tipo de consolas se crearón entre 1976 y 1992.");
		} else if (bits == 8){
			System.out.println("Ese tipo de consolas se crearón entre 1983 y 1988.");
		} else if (bits == 16){
			System.out.println("Ese tipo de consolas se crearón entre 1987 y 2003.");
		} else if (bits == 32){
			System.out.println("Ese tipo de consolas se crearón entre 1993 y 2006.");
		} else if (bits == 128){
			System.out.println("Ese tipo de consolas se crearón entre 1998 hasta el dia de hoy");
	    } else {
	    	System.out.println("No existen consolas de "+ bits + " bits.");
	    }
		
		System.out.print("\n---------------------------------------------------------------------------\n");
		
		// Ejercicio 3: (usar switch case)	
		
		System.out.println("¿En qué año nació o nacerá? :");
		int nacimiento = scanner.nextInt();
		switch (nacimiento) {
	    // Caso de la Rata 
	    case 1984:
	    case 1996:
	    case 2008:
	    case 2020:
	        System.out.println("Tu signo es una Rata.");
	        break; 
	        
	    // Caso del Buey
	    case 1985:
	    case 1997:
	    case 2009:
	    case 2021:
	        System.out.println("Tu signo es un Buey.");
	        break;
	        
	    // Caso del Tigre
	    case 1986:
	    case 1998:
	    case 2010:
	    case 2022:
	        System.out.println("Tu signo es un Tigre.");
	        break;
	        
	    // Caso del Buey
	    case 1987:
	    case 1999:
	    case 2011:
	    case 2023:
	        System.out.println("Tu signo es un conejo.");
	        break;
	    
	        
	    // Caso del Dragón
	    case 1988:
	    case 2000:
	    case 2012:
	    case 2024:
	        System.out.println("Tu signo es un dragón.");
	        break;
	    
	        
	    // Caso de la Serpiente
	    case 1989:
	    case 2001:
	    case 2013:
	    case 2025:
	        System.out.println("Tu signo es una serpiente.");
	        break;
	        
	    // Caso del caballo
	    case 1990:
	    case 2002:
	    case 2014:
	    case 2026:
	        System.out.println("Tu signo es un caballo.");
	        break;
	        
	    // Caso de la cabra
	    case 1991:
	    case 2003:
	    case 2015:
	    case 2027:
	        System.out.println("Tu signo es una cabra.");
	        break;
	        
        // Caso del Mono
   	    case 1992:
   	    case 2004:
   	    case 2016:
   	    case 2028:
   	        System.out.println("Tu signo es un mono.");
   	        break;
   	        
		// Caso del Gallo
	    case 1993:
	    case 2005:
	    case 2017:
	    case 2029:
	        System.out.println("Tu signo es un gallo.");
	        break;
	        
	     // Caso del Perro
   	    case 1994:
   	    case 2006:
   	    case 2018:
   	    case 2030:
   	        System.out.println("Tu signo es un perro.");
   	        break;
   	        
   	    // Caso del Cerdo
   	    case 1995:
   	    case 2007:
   	    case 2019:
   	    case 2031:
   	        System.out.println("Tu signo es un cerdo.");
   	        break;        
    
	    default:
	        System.out.println("Año no listado o fuera de rango.");
	        break;
		}
		
		scanner.close();

	}

}
