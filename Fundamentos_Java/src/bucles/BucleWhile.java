package bucles;

import java.util.Random;
import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		
		/*
		 * Estructura del bucle while 
		 * Inicialización; 
		 * while (condición) {
		 * bloque_de_sentencias; 
		 * actualización; }
		 */
		
		System.out.println("\n-----------------------------------------------------------------------\n");
	
		// Ejemplo 1: imprime del 1 al 50 de dos en dos
        int numero=0; // inicialización
        while (numero<=50) { // condición          
        	System.out.println(numero);
        	numero+=2; //incremento
        }
        
        System.out.println("\n-----------------------------------------------------------------------\n");
        
        // Ejemplo 2: si metes un número menor de cero(negativo) finaliza
		Scanner lector = new Scanner(System.in);		 
		int num=0;
		while (num>=0){
			System.out.println("Dame un numero: ");
			num= lector.nextInt();
			System.out.println("Ahora tu número elegido es: "+num);
			} 
		
		// Bucle infinito por si va sumando 1 a number inicializada en uno, nunca será cero
		
		/*
		 * int number=1; 
		 * while (number!=0){ 
		 * System.out.println("Numero: "+number);
		 * number++; }
		 */
		
		System.out.println("\n-----------------------------------------------------------------------\n");

		// Ejemplo 3: no se ejecuta porque la condición nunca llega a ser cierta ni lo es al principio	
		int x = 8;		
		while(x <= 5){
			System.out.println("Hola " + x);
			x++;
		}
		System.out.println("Hola no se ha ejecutado el bucle, la condición era false");
		
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		// Ejemplo 4: imprimir "Hola" desde el 8 hasta el 25 (sí se ejecuta porque la condición es true)
		int numero3 = 8;	
		while(numero3 <= 25){
			System.out.println("Hola " + numero3);
			numero3++;
		}
		
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		// Ejemplo 5: imprimir esto:
		
		//		1 2 3 4 5
		//		6 7 8 9 
		//		10 11 12 
		//		13 14 
		//		15
		
		int marcador = 0; 
        int filas = 5;      
        while (filas >= 1) { 
            int j = 1;            
            while (j <= filas) {          
                marcador++; 
                System.out.print(marcador + " "); 
                
                j++; 
            }
            
            System.out.println();
            
            filas--; 
        }
        
        System.out.println("\n-----------------------------------------------------------------------\n");
        
        // Ejemplo 6: RoboTech quiere presumir de calidad y necesita fabricar un robot perfecto (calidad 100).
		
 		Random generadorAleatoiro = new Random();
 		
 		int calidad=0; 
 		int iteraciones = 0;
 		
 		while(calidad != 100) {
 			
 			calidad = generadorAleatoiro.nextInt(101);
 			iteraciones++;
 			System.out.println("Frabricado en el intento  " + iteraciones + " robot con calidad " + calidad);
 		}
 		
 		
 		System.out.println("Ha tardado " + iteraciones + " iteraciones");
 		
 		System.out.println("\n-----------------------------------------------------------------------\n");
 		
 		/*
		 * EJEMPLO 7: “Recuento del lote de robots”
		RoboTech fabrica 1000 robots en un día.
		Cada robot tiene una calidad entre 0 y 100 (número aleatorio).	
		FutureCorp solo acepta robots con calidad mayor o igual que 85.	
		Simula la fabricación de los 1000 robots.
		Cuenta: cuántos cumplen la calidad mínima, Robots totales y Robots válidos para FutureCorp.
		 * 
		 * */
		
		
		Random aleatorio2 = new Random();
		int robotsBuenos=0;
		int robotsCalidad;
		int malos;
		System.out.println("Dime el numero total para fabricar:");
		int total= lector.nextInt();
	
		for(int i=0;i<total;i++) {
			
			    
				robotsCalidad = aleatorio2.nextInt(101);
				
				if(robotsCalidad >= 85 ) {
					robotsBuenos++;
				}			
		}
		
		malos = total-robotsBuenos;
		
		System.out.println("Robots totales: " + total);
		System.out.println("Robots de calidad mínima requerida: "  + malos);
		System.out.println("Robots válidos para FutureCorp: " + robotsBuenos);

		lector.close(); 
		
	}

}
