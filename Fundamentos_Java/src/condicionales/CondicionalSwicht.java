package condicionales;

import java.util.Scanner;

public class CondicionalSwicht {

	public static void main(String[] args) {
		// Estructura switch
	 
		//		switch (expresion){
		//				case valor1: 	{
		//							bloque_de_sentencias_1;
		//							break;
		//					         	}
		//		        case valor2: 	{
		//							bloque_de_sentencias_2;
		//							break;
		//					         	}
		//				…
		//		        case valorN: 	{
		//							bloque_de_sentencias_N;
		//							break;
		//					         	}
		//				default:	{
		//							bloque_de_sentencias_default;
		//							break;
		//						}
		//				}
		
		// Ejemplo 1: ESTAS APROBADO O NO.
		
		int nota = 7;		
		switch (nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4 : {
			System.out.println("Suspenso");
			break;
		}
		case 5: {
			System.out.println("Aprobado");
			break;
		}
		case 6: {
		System.out.println("Bien");
				break;
		}
		case 7:
		case 8: {
		System.out.println("Notable");
				break;
		}
		case 9: {
		System.out.println("Sobresaliente");
				break;
		}
		case 10: {
		System.out.println("Matricula de Honor");
				break;
		}
		default:{
		System.out.println("El alumno no se ha presentado");
				break;
		}
		    }
		
		// Ejemplo 2: DIME NÚMERO DEL 1-7 Y TE DIGO DIA DE LA SEMANA
		
		int numero = 5;
		switch (numero) {
		case 1:
			System.out.println("Es lunes");
			break;
 
		case 2:
			System.out.println("Es martes");
			break;
 
		case 3:
			System.out.println("Es miércoles");
			break;
 
		case 4:
			System.out.println("Es jueves");
			break;
 
		case 5:
			System.out.println("Es viernes");
			break;
 
		case 6:
			System.out.println("Es sábado");
			break;
 
		case 7:
			System.out.println("Es domingo");
			break;
 
		
		default:
			System.out.println("No es un día válido");
			break;
		}
		
		// EJEMPLO 3: COMO EL 2 PERO CON SCANNER
		
		System.out.println("Dame un numero del 1 al 7 y te diré el dia de la semana correspondiente:");
		Scanner sc = new Scanner(System.in);
		int dia = sc.nextInt();
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break; // si no puso break, sigue ejecutando los siguientes casos 
				   // e imprimiría todos hasta que no encontrara un break
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
			// agrupando casos
		case 6: // si metes un 6 como no hay nada pasa al caso 7 e imprime lo que diga ahí
		case 7:
			System.out.println("Es fin de semana");
			break;
		default:
			System.out.println("Ese día solo existe en Plutón");
			
		}
		
		
  
        // Ejemplo 4: mi primera calculadora
        
        System.out.println("--- MI PRIMERA CALCULADORA JAVA CON MENÚ ---");
        double resultado = 0.0;
        System.out.println("Ingresa el primer número:");
        // 2. Leer el número ingresado por el usuario y guardarlo
        double num1 = sc.nextDouble(); 
        
        System.out.println("Ingresa el segundo número:");
        // 3. Leer el número ingresado por el usuario y guardarlo
        double num2 = sc.nextDouble(); 
        
        // 2. Mostrar y Pedir la Opción del Menú
        System.out.println("\n--- MENÚ DE OPERACIONES ---");
        System.out.println("1. Sumar (+)");
        System.out.println("2. Restar (-)");
        System.out.println("3. Dividir (/)");
        System.out.println("4. Multiplicar (*)");
        System.out.println("5. Módulo (%) (Resto de la división)");
        System.out.print("Elige una opción (1-5): ");
        
        // Guardamos la elección del usuario como un entero
        int opcion = sc.nextInt();
        
        // 3. CONTROL DE FLUJO: Ejecutar la operación con SWITCH
        
        switch (opcion) {
            case 1: // Sumar
                resultado = num1 + num2;
                break;
                
            case 2: // Restar
                resultado = num1 - num2;
                break;
                
            case 3: // Dividir
                // Controlamos la división por cero
                if (num2 != 0) { 
                    resultado = num1 / num2;
                } else {
                    System.out.println("ERROR: No se puede dividir por cero.");
                    sc.close();
                    return; 
                }
                break;
                
            case 4: // Multiplicar
                resultado = num1 * num2;
                break;

            case 5: // Módulo (Resto)
                // Controlamos la división por cero para el módulo también
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("ERROR: No se puede calcular el módulo por cero.");
                    sc.close();
                    return; 
                }
                break;
                
            default:
                System.out.println("ERROR: Opción no válida. Debes elegir entre 1 y 5.");
                sc.close();
                return;
        }
        
        // 4. Mostrar el Resultado final
        System.out.println("\n--- RESULTADO ---");
        System.out.println("El resultado de la operación es: " + resultado);
        
        
        // Ejemplo 5: DADO UN NÚMERO DECIR SI ES DIVISIBLE POR 2, 3, 5, 7
        int num = 274;

        switch (num % 2) {
            case 0:
                System.out.println("Divisible por 2");
                break;

            default:
                System.out.println("No divisible por 2");
                break;
        }

        switch (num % 3) {
            case 0:
                System.out.println("Divisible por 3");
                break;

            default:
                System.out.println("No divisible por 3");
                break;
        }

        switch (num % 5) {
            case 0:
                System.out.println("Divisible por 5");
                break;

            default:
                System.out.println("No divisible por 5");
                break;
        }

        switch (num % 7) {
            case 0:
                System.out.println("Divisible por 7");
                break;

            default:
                System.out.println("No divisible por 7");
                break;
        }
        
        // Ejemplo 6 : ESTADO CIVIL
        char estado = 's';

        switch (estado) {
            case 's':
                System.out.println("Soltero");
                break;

            case 'd':
                System.out.println("Divorciado");
                break;

            case 'v':
                System.out.println("Viudo");
                break;

            case 'c':
                System.out.println("Casado");
                break;
        }
        
        // Ejemplo 7 : NÚMEROS ROMANOS
        
        char estado_civil = 'm';

        switch (estado_civil) {
            case 'I':
            case 'i':
                System.out.println("Uno");
                break;

            case 'V':
            case 'v':
                System.out.println("Cinco");
                break;

            case 'X':
            case 'x':
                System.out.println("Diez");
                break;

            case 'L':
            case 'l':
                System.out.println("Cincuenta");
                break;

            case 'C':
            case 'c':
                System.out.println("Cien");
                break;

            case 'D':
            case 'd':
                System.out.println("Quinientos");
                break;

            case 'M':
            case 'm':
                System.out.println("Mil");
                break;
        }
        
        sc.close();
		
	}

}
