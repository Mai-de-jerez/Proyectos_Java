package bucles;

public class BucleFor {

	public static void main(String[] args) {
		// Estructura for
		// for (inicialización; condición; actualización) {
		//     // bloque de sentencias a ejecutar
		// }
	
		// FOR SIMPLES:
		
		// Ejemplo 1: Sumar los valores desde 1 hasta 25 y mostrar la suma
		System.out.println("--EJEMPLO 1--");
		int suma=0;		
		for (int i = 1; i<=25; i++){
		    suma += i;
		    System.out.print(i);
		    if (i<25) {
		    System.out.print(" + ");
		    }
		}
		System.out.print(" = "+suma);
		
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		
		// Ejemplo 2: imprimir un triangulo de 6 filas con asteriscos
		System.out.println("--EJEMPLO 2--");
	    String asteriscos = "";
	    for(int i=0;i<6;i++) {
	    	asteriscos += "*"; // como no son números, los concatena, a las letras haría los mismo
	    	System.out.println(asteriscos);
	    }
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 3: Escribe un programa que use un bucle for para iterar desde el número 1 hasta el 50.
	    // Dentro del bucle, usa una estructura if para determinar si el número actual es par o impar.
	    // Cuenta cuántos números pares hay y cuántos impares e imprime el total de pares y el total de impares.
	    System.out.println("--EJEMPLO 3--");
	    int pares = 0;
	    int impares = 0;
	    for (int i=1;i<=50;i++) {
	    	if (i % 2 == 0) {
	    		pares++;
	    	} else {
	    		impares++;
	    	}
	    }
	    System.out.println("Total de pares: "+pares);
	    System.out.println("Total de impares: "+impares);
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    
	    // Ejemplo 4: imprimir las diez primeras potencias de 2:
	    System.out.println("--EJEMPLO 4--");
	    int potencia = 1; 
	    int base = 2;
	    for (int i = 1; i <= 10; i++) {
	        potencia = potencia * base; 
	        System.out.print(potencia + "  ");
	    }
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
		// FOR ANIDADOS:
		
		// Ejemplo 1: For anidado para imprimir los números primos que hay entre 1 y 100
	    System.out.println("--EJEMPLO 1--");
	    int cont = 0; 
	    for (int i = 2; i <= 100; i++) {
	    	for (int j = 2; j <= (i - 1); j++) {
	    		if (i % j == 0) {
	    			cont = 1;
	                }	 
	            } 
	            if (cont == 0) {	 
	                System.out.print(i + " "); 
	            }
	 
	            cont = 0;	 
	        }
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 2: primos del 1 al 100 a mi forma
	    System.out.println("--EJEMPLO 2--");
	    int contador=0;
	    for (int i=2; i<=100; i++) {
	    	for (int j=2; j<i; j++) {
	    		if (i%j==0) {
	    			contador++; 
	    		}    		
	    	}
	    	if (contador==0) {
    			System.out.print(i+" ");
    		}
	    	contador = 0;
	    }
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 3: imprimir un triangulo con asteriscos
	    System.out.println("--EJEMPLO 3--");
	    int altura = 6;
	    for(int i=1; i<=altura; i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 4: encontrar todas las parejas posibles de combinaciones de números desde el 1 hasta el 3.
	    System.out.println("--EJEMPLO 4--");
	    for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
  
                System.out.println("(" + i + ", " + j + ")");
            }
        }
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 5: para ver que ocurre en cada vuelta, por cada vuelta del bucle externo se ejecuta el interno
	    // todas las veces que se cumpla antes de pasar a la segunda vuelta del externo
	    System.out.println("--EJEMPLO 5--");
	    for (int i = 1; i <= 3; i++) {
	    	System.out.println("\nVuelta "+i+":\n");
            for (int j = 1; j <= 3; j++) {
  
                System.out.println("Repetición " + j);
            }
        }
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 6: imprimir esto:
	    
	    //  1
	    //  12
	    //  123
	    //  1234
	    System.out.println("--EJEMPLO 6--");
	    for (int i=1; i<=4; i++) {
	    	for (int j=1; j<=i; j++) {
	    		System.out.print(j);
	    	}
	    	System.out.println();
	    }
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 7: imprimir un cuadrado de asteriscos de cinco lineas y 5 asteriscos por línea
	    System.out.println("--EJEMPLO 7--");
	    for (int i=1; i<=5;i++) {
	    	for (int j=1; j<=5; j++) {
	    		System.out.print("*");
	    		
	    	}
	    	
	    	System.out.println();		
	    }
	    
	    
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 8: imprimir esto
	    // A
	    // AB
	    // ABC
	    // ABCD
	    System.out.println("--EJEMPLO 8--");
	    char letra = 'A';
	    for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < i; j++) {   
                System.out.print(letra);
                letra++;
            }
            letra ='A'; // volvemos a partir de A
            System.out.println(); 
        }
	    
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Como concatenar letras
	    String letras = "-";
	    letras += "a";
	    letras += "b";
	    letras += "c";
	    System.out.print(letras);
	    System.out.println();
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");

	    // Ejemplo 9: imprimir esto: 
	    
		//	    *****
		//	    * *
		//	    * *
		//	    * *
		//	    *****
	    System.out.println("--EJEMPLO 9--\n");
	    for (int i=1; i<=5;i++) {
	    	for (int j=1; j<=5; j++) {
	    		if (i==1 || i==5) {
	    		System.out.print("*");
	    		} else {
	    			if ( j==1 || j==3 ) {
	    				System.out.print("*");
	    			} else {
	    				System.out.print(" ");
	    			}
	    		}
	    	}
	    	
	    	System.out.println();		
	    }
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 10: imprimir esto: 
	    
 		//	    *****
 		//	     ***
 		//	      *
 		//	     ***
 		//	    *****
 	    System.out.println("--EJEMPLO 10--\n");
 	    for (int i=1; i<=5;i++) {
 	    	for (int j=1; j<=5; j++) {
 	    		if (i==2 || i==4) {
 	    			if (j==1 || j==5) {
 	    				System.out.print(" ");
 	    			} else {
 	    				System.out.print("*");
 	    			}
 	    		} else if (i==3) {
 	    			if (j==3){
 	    				System.out.print("*");
 	    			} else {
 	    				System.out.print(" ");
 	    			}	 	    			
 	    		} else {
 	    			System.out.print("*");
 	    		}	 	    			
    			
    		}
 	    	
 	    	System.out.println();
    	}
	 	    
	 	System.out.println("\n-----------------------------------------------------------------------\n");
	
 	   	// Ejemplo 11: imprimir esto: 
	    
		//	 	   	 1
		//		 	 22
		//		 	 333
		//		 	 4444
		//		 	 55555
 	    System.out.println("--EJEMPLO 11--");
 	   
	    for (int i=0; i<=4;i++) {
	    	for (int j=0; j<=i; j++) {		    
	    		System.out.print(i+1);		    		
	    		}
	    	System.out.println();
	    	}
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
		    
	    // Ejemplo 12: imprimir esto: 
	    
		//		    1
		//		    2 3
		//		    4 5 6
		//		    7 8 9 10
		//		    11 12 13 14 15
	    
	    System.out.println("--EJEMPLO 12--\n");
	    int marcador = 0;
	    for (int i=1; i<=5;i++) {
	    	for (int j=1; j<=i; j++) {	    	
	    		marcador++;
	    		System.out.print(marcador);    		 
	    		}
	    	System.out.println();
	    	}
	    
	    System.out.println("\n-----------------------------------------------------------------------\n");
	    
	    // Ejemplo 13: imprimir esto: Tablero de ajedrez
	    
		//		    E I E I E I E I
		//		    I E I E I E I E
		//		    E I E I E I E I
		//		    I E I E I E I E
		//		    E I E I E I E I
		//		    I E I E I E I E
	    //			E I E I E I E I
		//		    I E I E I E I E
	    
	    System.out.println("--EJEMPLO 13--\n");
	  
	    for (int i=1; i<=8;i++) {
	    	for (int j=1; j<=8; j++) {
	    		if (i % 2 == 0 && j % 2 == 0) {
	    			System.out.print("E ");    			
	    		} else if (i % 2 != 0 && j % 2 != 0) {
	    			System.out.print("E "); 
	    		} else {
	    			System.out.print("I "); 
	    		}
	    	}
	    	System.out.println(); 
	    }		
	    		   	    		 
	    	
		    	
		    
	 
	    
	}

}
