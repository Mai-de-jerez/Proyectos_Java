package ejercicios_clase;

public class EjerciciosPropuestosBucles {

	public static void main(String[] args) {
		// Ejercicios con WHILE
		
		// Ejercicio 1: Calcular el factorial de 25 con un bucle while
		
		double factorial = 1; 
		int ini = 1; 
		while (ini <= 25) { 
			factorial *= ini; 
		    ini++; 
		}
		System.out.println("El factorial de 25 es: " + factorial);
		
		System.out.println("\n---------------------------------------------------------\n");
			
					        
	        
        // Ejercicio 2: Calcular la potencia de 2 elevado a 8
        int base = 2;
        int exponente = 8;
        int resultado = 1;
        int contador = exponente; 
        while (contador > 0) { 
            resultado *= base; 
            contador--; 
        }
	        
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
        System.out.println("\n---------------------------------------------------------\n");	
				
        // Ejercicio 3: Calcular los 25 primeros números primos
        int contadorPrimos = 0;
        int numero6 = 2; 

        while (contadorPrimos < 25) {
            boolean esPrimo = true;
            
            for (int i = 2; i < numero6; i++) { 
                if (numero6 % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            
            if (esPrimo) {
                System.out.println(numero6);
                contadorPrimos++;
            }
            
            numero6++;
        }
        System.out.println("\n---------------------------------------------------------\n");
	        
		// Ejercicio 4: Encontrar el primer número primo a partir de 198
		int y = 198;
		while (true) {
		    boolean esPrimo = true;
		    for (int i = 2; i <= Math.sqrt(y); i++) {
		        if (y % i == 0) {
		            esPrimo = false;
		            break;
		        }
		    }
		    if (esPrimo) {
		        System.out.println("El primer número primo a partir de 198 es: " + y);
		        break;
		    }
		    y++;
		}
		
		System.out.println("\n---------------------------------------------------------\n");
					
		// Ejercicio 5: Un numero es perfecto cuando todos sus divisores sumados dan el mismo numero 
		// Ejemplo: 6 = 1 + 2 + 3; luego 6 es un numero perfecto
		// Mostrar los números perfectos hasta el 100
		
		System.out.println("\n--NÚMEROS PERFECTOS--\n");
        int n = 1;  
        while (n <= 100) {         
            int sumaDivisores = 0;          
            int i = 1; 
            while (i < n) {           
                if (n % i == 0) {
                    sumaDivisores += i;
                }
                
                i++; 
            }

            if (sumaDivisores == n) {
                System.out.println(n + " es un número perfecto.");
            }
            
            n++; 
        }
        
        System.out.println("\n---------------------------------------------------------\n");
					
		// Ejercicio 6: Calcular los n primeros términos de la serie de Fibonacci
        int number = 10; 
        int a = 0, b = 1;
        System.out.println("Serie de Fibonacci hasta " + number + " términos:");

        int i = 1; 
        while (i <= number) { 

            System.out.print(a + " ");

            int siguiente = a + b;
            a = b;
            b = siguiente;
            i++; 
        }
        
        
        System.out.println("\n---------------------------------------------------------\n");
        // Ejercicios con DO-WHILE
			  
		 // Ejercicio 1: Resolver la potencia de 2 elevado a 8 con do-while
		 int base2 = 2;
		 int exponente2 = 8;
		 int resultado2 = 1;
		 int j = 0;
		 do {
			 resultado2 *= base2;
			 j++;
		 } while (j < exponente2);
		 System.out.println("2 elevado a " + exponente2 + " es: " + resultado2);
		 
		 System.out.println("\n---------------------------------------------------------\n");
		 
		 // Ejercicio 2: Resolver la serie de Fibonacci con do-while
		 int n1 = 0, n2 = 1, n3, numTerminos = 10, contadorFibo = 2;
		 System.out.print("Serie de Fibonacci hasta " + numTerminos + " términos: " + n1 + " " + n2 + " ");
		 do {
			 n3 = n1 + n2;
			 System.out.print(n3 + " ");
			 n1 = n2;
			 n2 = n3;
			 contadorFibo++;
		 } while (contadorFibo < numTerminos);
		 System.out.println();
		 System.out.println("\n---------------------------------------------------------\n");
		 
		 // Ejercicio 3: Calcular la suma de los números pares comprendidos entre 10 y 50
		 int sumaPares = 0, numero = 10;
		 do {
			 if (numero % 2 == 0) {
				 sumaPares += numero;
			 }
			 numero++;
		 } while (numero <= 50);
		 System.out.println("La suma de los números pares entre 10 y 50 es: " + sumaPares);
		 System.out.println("\n---------------------------------------------------------\n");
		 
		// Ejercicios con BUCLE FOR
		 
		// Ejercicio 1: Escribir los 10 primeros números (ascendente y descendente)
		 
	    System.out.println("Números ascendentes:");
	    for (int m=1;m<=10;m++) {
	    	System.out.println(m);
	    		} 
	    System.out.println("Números descendentes:");
	    for (int k=10;k>=1;k--) {
	    	System.out.println(k);    		
	    	}
	    
	    System.out.println("\n---------------------------------------------------------\n");
	  
	    // Ejercicio 2: Escribir «Feliz Navidad 1990» hasta 2007
	    
	    for (int year=1990;year<=2007;year++) {
	    	System.out.println("Feliz Navidad " + year);
	    		}
	    System.out.println("\n---------------------------------------------------------\n");
	    
	    // Ejercicio 3: Escribir la tabla de multiplicar del 5
	    
	    System.out.println("Tabla de multiplicar del 5:");
	    for (int g=1;g<=10;g++) {
	    	System.out.println("5 x " + g + " = " + (5*g));
	    		}
	    
	    System.out.println("\n---------------------------------------------------------\n");
	    
	    // Ejercicio 4: Escribir el factorial del numero 15
	    double factorial2 = 1;
	    for (double q=1;q<=15;q++) {
	    	factorial2 = factorial2 * q;
	    		}
	    System.out.println("El factorial de 15 es: " + factorial2);
	    
	    System.out.println("\n---------------------------------------------------------\n");
	    
	    // Ejercicio 5: Hallar 2 elevado a 8 con for
	    double resultado3 = 1;
	    for (int r=1;r<=8;r++) {
	    	resultado3 = resultado3 * 2;
	    		}
	    System.out.println("2 elevado a 8 es: " + resultado3);
	    
	    System.out.println("\n---------------------------------------------------------\n");
	    
	    // Ejercicio 6: Hallar los números impares menores de 30 y que aparezcan en orden descendente
	    System.out.println("Números impares menores de 30 en orden descendente:");
	    for (int s=29;s>0;s=s-2) {
	    	System.out.println(s);
	    		}
	    
	    System.out.println("\n---------------------------------------------------------\n");
	    
	    // Ejercicio 7: Hallar todas las tablas de multiplicar con for anidados
	    System.out.println("Tablas de multiplicar del 1 al 10:");
	    for (int d=1;d<=10;d++) {
	    	System.out.println("\nTabla del " + d + ":\n");
	    	for (int e=1;e<=10;e++) {
	    		System.out.println(d + " x " + e + " = " + (d*e));
	    			}
	    		}
	    
	    System.out.println("\n---------------------------------------------------------\n");
	    
	    // Ejercicio 8: Con los 20 primeros números decir con cada uno por cual es divisible: 
	    // ejemplo: 1 –> es divisible por 1
	    //          2 –> es divisible por 1 es divisible por 2 …
	    System.out.println("Divisibilidad de los 20 primeros números:");
	    for (int z=1;z<=20;z++) {
	    	System.out.print(z + " -> es divisible por: ");
	    	for (int p=1;p<=z;p++) {
	    		if (z%p==0) {
	    			System.out.print(p + "   ");
	    				}
	    			}
	    	System.out.println();
	    		}
	    
	    System.out.println("\n---------------------------------------------------------\n");
	    
	    // Ejercicio 9: Hallar la lista de los números primos hasta el 100
	   
		System.out.println("Lista de números primos hasta el 100:");

		        for (int x = 1; x <= 100; x++) {
		            int contador2 = 0; 
		            for (int c = 2; c < x; c++) {
		                if (x % c == 0) {
		                    contador2 = 1; 
		                    break;    
		                }
		            } 
	
		            if (x > 1 && contador2 == 0) { 
		                System.out.print(x + " "); 
		            }
		        } 
        
        System.out.println("\n---------------------------------------------------------\n");

			 
	       

	}

}
