package Retos;

import java.util.Scanner;

public class Reto_3_1 {

	public static void main(String[] args) {
		// RETO 3 (PARTE 1): BUCLES
		
		// Ejercicio 1: Imprimir números del 0 al 10
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i<=10;i++) {	 
		System.out.println(i);		
		}
		 
		System.out.print("\n---------------------------------------------------------------------------\n");
		
		// Ejercicio 2: Cuenta del 100 al 0 de diez en diez hacia atrás.
		
		for (int i=100;i>=0;i-=10) {
		System.out.println(i);	
		}
		System.out.println("Máquina hackeada");
		
		System.out.print("\n---------------------------------------------------------------------------\n");
        
		// Ejercicio 3: Realiza un algoritmo que simule una caja registradora de un supermercado, 
		// donde va pidiendo cantidades y las va sumando, 
		// cada vez que pongamos una cantidad por la terminal saldra la suma acumulada del total.
		// El programa dejara de pedir las cantidades de compra cuando insertemos un 0. 
		// En ese momento mostrara el total de la compra y nos pedira que le indiquemos con cuanto dinero nos pagan 
		// e indicara el cambio que debemos devolver.
         System.out.println("\n--CAJA REGISTRADORA--");
		 float total = 0.0f;
		 float monto; 
		 float pago;
		 float cambio;

		 do {
			 System.out.print("\nIntroduce la cantidad (0 para finalizar): ");
		     monto = scanner.nextFloat();
		     while (monto < 0) {
                System.out.print("\nLos montos no pueden ser negativos. Vuelve a intentarlo: ");
                monto = scanner.nextFloat(); 		                   
            }

            if (monto != 0) {
                total += monto;
                System.out.printf("\nSuma acumulada: %.2f\n", total);
            }
		                  
	     } while (monto != 0);
		
		 if (total == 0.0f) {
		     System.out.println("\nCompra vacía. ¡Hasta pronto!");
		     
		 } else {
			 System.out.printf("\nTotal a pagar: %.2f\n", total); 
			 		
			 do {
			     System.out.print("\nIntroduce la cantidad con la que pagarás: ");
			     pago = scanner.nextFloat();
			
			     if (pago < total) {
			         System.out.printf("\n¡Pago insuficiente! La cantidad ingresada (%.2f) es menor que el total (%.2f).\n", pago, total);
			         System.out.println("\nVuelve a ingresar una cantidad válida.");
			     }
			
			     
			 } while (pago < total); 
			 
			 cambio = pago - total;
			 System.out.printf("\n✔️ Pago Aceptado.\n");
			 System.out.printf("\nCambio a devolver: %.2f\n", cambio);
	        }
			 
			 System.out.print("\n---------------------------------------------------------------------------\n");
			 
		 
		 
		// Ejercicio 4: Dibujar una piramide de asteriscos cuya cantidad de filas dependan del número dado por el usuario

	    System.out.print("Introduce un número entero POSITIVO para la altura de la pirámide: ");
	    int altura = scanner.nextInt();
	    
	    while (altura <= 0) { 
	    	System.out.print("La altura debe ser un número positivo mayor que 0. Inténtalo de nuevo: ");
	    	altura = scanner.nextInt();
	        }	
	    
	    System.out.println();

	    String asteriscos = ""; 
	    int x = 1; 
	    
	    while (x <= altura) {
	    	
	        asteriscos += "*"; 
	        System.out.println(asteriscos);
	        
	        x++; 
	    }
	   
	    System.out.print("\n---------------------------------------------------------------------------\n");
	  		
        
        // Ejercicio 5: Crea un programa en Java que muestre el siguiente patrón usando **dos bucles `for` anidados**:
        // 1. Crea una clase llamada `PatronDel5al1`.
        // 2. Dentro del método `main`, utiliza un primer bucle `for` para controlar las filas, que empiece en 5 y termine en 1.
        // 3. Dentro de ese bucle, usa otro `for` que empiece en el valor de la fila y baje hasta 1.
        // 4. Después del bucle interno, imprime un salto de línea (`System.out.println()`).
        int filas = 5;
        for (int i = filas; i >= 1; i--) {
            
        	for (int j = i; j >= 1; j--) {
                
        		System.out.print(j);
            }  
            System.out.println();
        }
        
        scanner.close();
	}

}
