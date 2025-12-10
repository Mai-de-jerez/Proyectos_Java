package ejercicios_clase;
import java.util.Scanner;
import java.util.Random;

public class EjerciciosOpcionalesWhile {

	public static void main(String[] args) {
		// Ejercicios opcionales while
		Random random = new Random(); 
		Scanner lector = new Scanner(System.in);
		// Ejercicio 1: pedir dos números y pedir el segundo en bucle hasta que lo den mayor que el primero
		
		System.out.print("Dame un número: ");
		int number1= lector.nextInt();
		System.out.print("Dame un número mayor que " + number1+": ");
		int number2= lector.nextInt();
		while (number2<=number1){
			System.out.print(number2 + " no es mayor que "+ number1 +" .Inténtelo de nuevo: " );
			number2= lector.nextInt();
			} 
		System.out.println("Sus números elegidos son "+number1 +" y "+number2);
		
		
		
		// Ejercicio 2: pedir un segundo número mientras sea mayor que el primero
		System.out.println("--Números Mayores--");
		System.out.print("Escriba un número: ");
		double numero1 = lector.nextDouble();
		System.out.print("Escriba un número mayor que " + numero1+": ");
		double numero2= lector.nextDouble();
		while (numero2>numero1){
			System.out.print("Escriba otro número mayor que "+ numero1 +": " );
			numero2 = lector.nextDouble();
			} 
		System.out.println(numero2 +" no es mayor que "+ numero1 + ".");
		
		
		
		// Ejercicio 3: pedir un segundo número mientras sea mayor que el número anterior
				System.out.println("--CADA VEZ MÁS GRANDES--");
				System.out.print("Escriba un número: ");
				int n1 = lector.nextInt();
				int n2;
				System.out.print("Escriba un número mayor que " + n1 + ": ");
				n2 = lector.nextInt();
				while (n2>n1){
					n1 = n2;
					System.out.print("Escriba un número mayor que "+ n1 +": " );
					n2 = lector.nextInt();
					} 
				System.out.println(n2 +" no es mayor que "+ n1 + ".");
				
				
			
		// Ejercicio 4: Escriba un programa que pida la cantidad de números positivos que 
		// se tienen que escribir y a continuación pida números hasta que se haya escrito 
		// la cantidad de números positivos indicada.
				
		System.out.println("--NÚMEROS POSITIVOS--");
		System.out.print("Escriba cuantos números introducirá (mayor que cero): ");
		int cantidad = lector.nextInt();
		while (cantidad<=0) {
			System.out.println("Esa cantidad debe ser superior a 0. Pruebe de nuevo: ");
			cantidad = lector.nextInt();
		}
		int positivos = 0;
		int totales = 0;
		while (totales<cantidad){
			System.out.print("Escriba un número: " );
			int number = lector.nextInt();
			totales++;
			if (number>=0) {
				positivos++;				
			}
		} 
		
		System.out.println("Ha escrito " + cantidad + " números "+ positivos + " de ellos positivos.");
		
		
		// Ejercicio 5: Escriba un programa que pida números mientras no se escriba un número negativo. 
		// El programa terminará escribiendo la suma de los números introducidos.
		
		System.out.println("--SUMA DE NÚMEROS--");	
		int total = 0;
		int numerito;	
		System.out.print("Escriba un número: ");
		numerito = lector.nextInt();
		while (numerito>=0){		
			total += numerito;
			System.out.print("Escriba un número: ");
			numerito = lector.nextInt();		
			} 
		System.out.println("La suma de los números positivos introducidos es "+ total);
		
		
		// Ejercicio 6: Escriba un programa que pida un valor límite positivo.
		// A continuación pida números hasta que la suma de los números introducidos supere el límite inicial. 
		System.out.println("--HASTA EL LÍMITE--");	
		System.out.print("Escriba un número límite: ");
		double limite = lector.nextDouble();
		while (limite<=0) {
			System.out.print("El límite debe ser mayor que 0. Inténtelo de nuevo: ");
			limite = lector.nextDouble();	
		}	
		double suma = 0.0;
		while (suma<=limite){		
			System.out.print("Escriba un número: ");
			double num = lector.nextDouble();	
			suma += num;
			} 
		System.out.println("Ha superado el límite. La suma de los números introducidos es "+ suma);
		
		
		// Ejercicio 7: Escriba un programa que pida primero dos números enteros (mínimo y máximo) 
		// y que después pida números enteros situados entre ellos. 
		// El programa terminará cuando se escriba un número que no esté comprendido entre los dos valores iniciales. 
		// El programa termina escribiendo la cantidad de números escritos.
		System.out.println("--ENTRE DOS VALORES--");
		int enRango = 0;
		System.out.print("Escriba un número: ");
		int minimo = lector.nextInt();
		System.out.print("Escriba un número mayor que "+ minimo+": ");
		int maximo = lector.nextInt();
		while (maximo<=minimo) {
			System.out.print(maximo + " no es mayor que "+ minimo + ". Inténtelo de nuevo: ");
			maximo = lector.nextInt();	
		}
		System.out.print("Escriba un número entre "+ minimo +" y "+ maximo+": ");
		int otronum = lector.nextInt();	
		while (minimo<=otronum && otronum<=maximo) {
			System.out.print("Escriba otro número entre "+ minimo+" y "+maximo+": ");
			otronum = lector.nextInt();	
			enRango++;
			} 
		System.out.println("Ha escrito "+enRango+" números entre "+minimo+" y "+maximo);
		
		
		
		
		// Ejercicios 8 y 9:
		// Escriba un programa que pida números pares mientras el usuario indique 
		// que quiere seguir introduciendo números. Para indicar que quiere seguir escribiendo números, 
	    // el usuario deberá contestar S o N a la pregunta.
		// Mejore la usabilidad del programa anterior haciendo que la pregunta 
		// se repita si el usuario no contesta S, s, N o n.
		System.out.println("--CUENTA PARES--");
		int contador = 0;
		char respuesta = 'S';
		while (respuesta == 'S' || respuesta == 's'){		    
		    System.out.print("Escriba un número par: ");
		    int numpar = lector.nextInt(); 
		    while (numpar % 2 != 0) {
		        System.out.println(numpar + " no es un número par. Inténtelo de nuevo: ");
		        numpar = lector.nextInt(); 
		    }
		    contador++;
		    System.out.print("¿Quiere escribir otro número par? (S/N):");
		    respuesta = lector.next().charAt(0);
		    while (!(respuesta == 'S' || respuesta == 's' || respuesta == 'N' || respuesta == 'n')) {
		        System.out.print("¿Quiere escribir otro número par? (S/N):");
		        respuesta = lector.next().charAt(0); // Se pide de nuevo
		    }
		    
	    }
		System.out.println("Ha escrito " + contador + " números pares.");

		
		// Ejercicio 10: Escriba un programa que calcule la descomposición en factores primos de un número.
		
		System.out.println("--DESCOMPOSICIÓN EN FACTORES PRIMOS--");
		System.out.print("Escriba el número entero a descomponer (mayor que 1): ");
		int numero = lector.nextInt(); 
		while (numero <= 1) {
		    System.out.println(numero + " no es mayor que 1. Inténtelo de nuevo: ");
		    System.out.print("Escriba el número entero a descomponer (mayor que 1): ");
		    numero = lector.nextInt();
		}

		System.out.print("La descomposición de " + numero + " es: ");
		int n = numero; 
		int factor = 2; 

		while (n > 1) {

		    while (n % factor == 0) {
		        System.out.print(factor);
		        
		
		        n = n / factor;
		       	
		        if (n > 1) {
		            System.out.print(" x ");
		        }
		    }
		    
		    // Pasamos al siguiente factor candidato
		    factor++;
		}

		System.out.println();
		
		// JUEGO DE LOS 20.
		// Ejercicios 11 al 15: 
		// Los dos jugadores tienen que tirar el dado hasta que ellos quieran
		// Pero el que se pase de 20 en la suma de tiradas pierde.
		// El programa debe declarar ganador al que tenga más puntos siempre que no pase de 20.
		// Si uno se pasa de 20 el juego termina automático y decir jugador tal ha ganado. 
		
		          	       
		System.out.println("LOS 20 (4)");
        

        String entradaUsuario1 = "";
        String entradaUsuario2 = "";
        int suma1 = 0;
        int suma2 = 0;

        System.out.println("\nPulse Intro para lanzar el dado. Pulse otra tecla e Intro para terminar:");

        do {
            int tirada1Actual = 0;
            int tirada2Actual = 0;
            boolean alguienTiroEnRonda = false;

            if (entradaUsuario1.isEmpty() && suma1 <= 20) {
                // Si J1 sigue activo, se pide la entrada
                System.out.print("\n\nJugador 1: "); 
                entradaUsuario1 = lector.nextLine();
                
                if (entradaUsuario1.isEmpty()) {            
                    tirada1Actual = random.nextInt(6) + 1; 
                    suma1 += tirada1Actual;
                    alguienTiroEnRonda = true;
                }
  
            }

            if (entradaUsuario2.isEmpty() && suma2 <= 20) {
                // Si J2 sigue activo, se pide la entrada
                System.out.print("\nJugador 2: "); // ⬅️ UN SALTO DE LÍNEA PARA SEPARAR DE J1
                entradaUsuario2 = lector.nextLine();   
                
                if (entradaUsuario2.isEmpty()) {            
                    tirada2Actual = random.nextInt(6) + 1;           
                    suma2 += tirada2Actual;
                    alguienTiroEnRonda = true;
                }

            }
 
            if (alguienTiroEnRonda) {
                
                if (tirada1Actual > 0) {
                    System.out.println("\nJugador 1 - Tirada: " + tirada1Actual + " - Suma: " + suma1 );
                } else {
           
                    System.out.println("\nJugador 1 - Suma: " + suma1 );
                }

                if (tirada2Actual > 0) {
                    System.out.println("Jugador 2 - Tirada: " + tirada2Actual + " - Suma: " + suma2 );
                } else {
                    System.out.println("Jugador 2 - Suma: " + suma2 );
                }
                
                if (suma1 > 20) {
                    System.out.println("\n¡Jugador 1 te has pasado! Suma total: " + suma1 + " (más de 20).");
                    System.out.println("\nJugador 2 gana.");
                    break; 
                } 
                if (suma2 > 20){
                    System.out.println("\n¡Jugador 2 te has pasado! Suma total: " + suma2 + " (más de 20).");
                    System.out.println("\nJugador 1 gana.");
                    break; 
                }
            }


        } while (entradaUsuario1.isEmpty() || entradaUsuario2.isEmpty()); 
     
        if (suma1 == 0 && suma2 == 0) {
        	System.out.println("\nJugador 1 - Suma: "+ suma1);
        	System.out.println("\nJugador 2 - Suma: "+ suma2);      	
        } 
  
        else {
            int resultado1 = (suma1 > 20) ? 0 : suma1;
            int resultado2 = (suma2 > 20) ? 0 : suma2;
            
            if (suma1 <= 20 && suma2 <= 20) {
                if (resultado1 == resultado2) {
                    System.out.println("\nEmpate."); 
                } else if (resultado1 > resultado2){
                    System.out.println("\nJugador 1 ha ganado."); 
                } else {
                    System.out.println("\nJugador 2 ha ganado."); 
                }
            } else {
            	// Nada
            }
        }
        
        System.out.println("\nPrograma terminado.");
    	System.out.println("\n-----------------------------------------------------\n");     
        
		
		// Ejercicio 16, 17, 18 y 19:
		// Escriba un programa que muestre tres números al azar del 1 al 6.
		// Amplíe el programa anterior, haciendo que el programa indique si hay dos o tres números iguales.
		// Amplíe el programa anterior, haciendo que el programa entregue premios y lleve la cuenta del resultado.
		// Inicialmente, el jugador empieza con una moneda.
		// En cada tirada, al jugador se le cobra una moneda.
		// En cada tirada, el programa muestra tres números al azar del 1 al 6.
		// Si los tres números son distintos, el jugador no gana nada (es decir, pierde la moneda que apostó).
        // Si salen dos números iguales, el jugador gana dos monedas (es decir, gana en total una moneda).
		// Si salen tres números iguales, el jugador gana cinco monedas (es decir, gana en total cuatro monedas).
 		// El número de monedas puede hacerse negativo.
		// Tras cada tirada, el jugador indica si quiere seguir jugando o no.
	
		String entradaUsuario = "";
		System.out.println("--TRAGAPERRAS--\n");
		System.out.println("En cada tirada se le cobrará una moneda.\n");
		System.out.print("¿Con cuántas monedas quiere empezar? ");
		int saldoInicial = lector.nextInt();
		lector.nextLine();
		System.out.println("\nEmpieza la partida con "+saldoInicial+" moneda(s).");
		            
    	int tirada1 = random.nextInt(6) + 1; 
    	int tirada2 = random.nextInt(6) + 1;
    	int tirada3 = random.nextInt(6) + 1;
    	int saldoMonedas = saldoInicial -1;
    	System.out.println("\nTirada: "+tirada1+" "+tirada2+" "+tirada3);
    	if (tirada1 == tirada2 && tirada2== tirada3) {
    		saldoMonedas += 5;
    		System.out.println("\nHa ganado 5 monedas, Ahora tiene "+saldoMonedas+" moneda(s).");
    	} else if (tirada1 == tirada2 || tirada1 == tirada3 || tirada2 == tirada3) {
    		saldoMonedas += 2;
    		System.out.println("\nHa ganado 2 monedas, Ahora tiene "+saldoMonedas+" moneda(s).");
    	} else {
    		System.out.println("\nNo ha ganado nada. Ahora tiene "+saldoMonedas+" moneda(s).");
    	}
    	
    	do {
    		if (saldoMonedas <= 0) {
                break; 
            }
    		System.out.print("\nPulse Intro para volver a jugar, u otra tecla para terminar: ");
    		entradaUsuario = lector.nextLine();
    		if (!entradaUsuario.isEmpty()) {
                break;
            }
        		tirada1 = random.nextInt(6) + 1; 
            	tirada2 = random.nextInt(6) + 1;
            	tirada3 = random.nextInt(6) + 1;
            	saldoMonedas--;
            	System.out.println("\nTirada: "+tirada1+" "+tirada2+" "+tirada3);
            	if (tirada1 == tirada2 && tirada2== tirada3) {
            		saldoMonedas += 5;
            		System.out.println("\nHa ganado 5 monedas, Ahora tiene "+saldoMonedas+" moneda(s).");
            	} else if ( (tirada1 == tirada2 && tirada1 != tirada3) || 
                        (tirada1 == tirada3 && tirada1 != tirada2) || 
                        (tirada2 == tirada3 && tirada2 != tirada1) ) {
            		saldoMonedas += 2;
            		System.out.println("\nHa ganado 2 monedas, Ahora tiene "+saldoMonedas+" moneda(s).");
            	} else {
            		System.out.println("\nNo ha ganado nada. Ahora tiene "+saldoMonedas+" moneda(s).");
            	}
    	} while (entradaUsuario.isEmpty()); 
    		  
    	System.out.println("\nHa acabado la partida con "+saldoMonedas+" moneda(s).");
    	int ganancia = saldoMonedas - saldoInicial;
    	if (ganancia == 0) {
    		System.out.println("\nNo ha ganado ni perdido monedas.");
    	} else if (ganancia < 0) {
    		ganancia = ganancia * -1;
    		System.out.println("\nHa perdido "+ ganancia+" moneda(s).");
    	} else {
    		System.out.println("\nHa ganado "+ ganancia+" moneda(s).");  		
    	}
    	
    	System.out.println("\nPrograma terminado.");
    	System.out.println("\n-----------------------------------------------------\n");
		
		// Ejercicio 20 y 21: Escriba un programa que proponga sumas de números positivos (entre 1 y 100) al usuario 
		// y compruebe la respuesta. El programa continuará hasta que se acierten cinco sumas.
		// Luego la proxima version debera pedir al usuario que elija el cuantas operaciones se deben acertar.
		// No permite elegir cero operaciones ni menos y debe informar al final el número de intentos y aciertos.
	 
		System.out.println("--OPERACIONES--");
		System.out.print("\n¿Cuántas operaciones correctas debe contestar para terminar el programa? ");
		int numRespuestas = lector.nextInt();
		while (numRespuestas <=0) {
			System.out.println("\nEl número de operaciones debe ser mayor que cero.");
			System.out.print("\n¿Cuántas operaciones correctas debe contestar para terminar el programa? ");
			numRespuestas = lector.nextInt();
		}
		int aciertos = 0;
		int intentos = 0;
		while (aciertos < numRespuestas) {
			int num1 = random.nextInt(100) + 1; 
			int num2 = random.nextInt(100) + 1;
			System.out.println("\nEscriba el resultado de las siguientes operaciones: ");
			System.out.print("\n"+num1 +" + "+ num2 +" = ");
			int resultado = lector.nextInt();
			intentos++;
			System.out.println();
			if (num1 + num2 == resultado) {
				System.out.println("Respuesta correcta! ");
				aciertos++;
			} else {
			System.out.println("Respuesta incorrecta! ");
			}
		}
		if (aciertos == 1) {
			System.out.println("\nHa acertado "+aciertos+" operación en " +intentos+" intento(s).");
		}else {
			System.out.println("\nHa acertado "+aciertos+" operaciones en " +intentos+" intento(s).");
		}
		System.out.println("\nPrograma terminado.");
		
	  
		lector.close();
        
        }
	}

		
        
        
        
        
        
                    
		
	

	   			
		
	

			
		
	
		


