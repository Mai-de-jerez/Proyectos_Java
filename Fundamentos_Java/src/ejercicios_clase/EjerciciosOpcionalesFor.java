package ejercicios_clase;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosOpcionalesFor {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Random random = new Random(); 
		
		
		// Ejercicio 1: Escriba un programa que pida dos números enteros y escriba qué números son pares 	
		// y cuáles impares desde el primero hasta el segundo.
		System.out.println("--PARES E IMPARES--");
		System.out.print("\nEscriba un número entero: ");
		int entrada1 = lector.nextInt();
		System.out.print("\nEscriba un número entero mayor o igual que "+ entrada1+": ");
		int entrada2 = lector.nextInt();
		if (entrada2 < entrada1) {
			System.out.print("\n¡Le he pedido un número entero mayor o igual que "+entrada1+"!");
		} else {
			for (int i=entrada1 ;i<=entrada2;i++) {
				if (i % 2 == 0) {
					System.out.println("\nEl número "+ i +" es par.");
				} else {
					System.out.println("\nEl número "+ i +" es impar.");
				}
			}
			
		}
		
		System.out.println("\n---------------------------------------------------\n");
		
		
		// Ejercicio 2: Escriba un programa que pida un número entero mayor que cero y que escriba sus divisores.
		System.out.println("--DIVISORES--");
		System.out.print("\nEscriba un número entero mayor que cero: ");
		int input = lector.nextInt();
		if (input <= 0) {
			System.out.print("¡Le he pedido un número entero mayor que cero!");
		} else {
			System.out.print("\nLos divisores de "+input+" son: ");
			for (int i=1 ;i<=input;i++) {
				if (input % i == 0) {
					System.out.print(i+"  ");
				}
			}			
		}
		
		System.out.println("\n---------------------------------------------------\n");
		
		
		// Ejercicio 3: Escriba un programa que pregunte cuántos números se van a introducir, 
		// pida esos números, y muestre un mensaje cada vez que un número no sea mayor que el primero.
		System.out.println("--MAYORES QUE EL PRIMERO--");
		System.out.print("\n¿Cuántos valores va a introducir? ");
		int cantidadnum = lector.nextInt();
		if (cantidadnum <= 0) {
			System.out.println("\n¡Imposible!");
		} else {
			System.out.print("\nEscriba un número: ");
			int numanterior = lector.nextInt();			
			for (int i=1 ;i<cantidadnum;i++) {				
					System.out.print("\nEscriba un número mayor que "+numanterior+": ");
					int numsiguiente = lector.nextInt();	
					if (numsiguiente <= numanterior) {
						System.out.print("\n¡"+numsiguiente+" no es mayor que "+numanterior+"!\n");
					}
					
			}
			
		}
		System.out.print("\nGracias por su colaboración.");
		System.out.println("\n---------------------------------------------------\n");
		
		
		// Ejercicio 4: Escriba un programa que pregunte cuántos números se van a introducir, 
		// pida esos números, y muestre un mensaje cada vez que un número no sea mayor que el anterior.
				System.out.println("--MAYORES QUE EL ANTERIOR--");
				System.out.print("\n¿Cuántos valores va a introducir? ");
				int numeros = lector.nextInt();
				if (numeros <= 0) {
					System.out.println("\n¡Imposible!");
				} else {
					System.out.print("\nEscriba un número: ");
					int number1 = lector.nextInt();	
					for (int i=1 ;i<numeros;i++) {	
						System.out.print("\nEscriba un número mayor que "+number1+": ");
						int number2 = lector.nextInt();	
						if (number2 <= number1) {
							System.out.print("\n¡"+number2+" no es mayor que "+number1+"!\n");
						}
						number1 = number2;
						
							
					}
					
				}
				
				System.out.print("\nGracias por su colaboración.");	
				System.out.println("\n---------------------------------------------------\n");
				
				
		// Ejercicio 5: Escriba un programa que pregunte cuántos números se van a introducir, 
		// pida esos números y escriba cuántos negativos ha introducido.
		System.out.println("--NÚMEROS NEGATIVOS--");
		System.out.print("\n¿Cuántos valores va a introducir? ");
		int cuantosvalores = lector.nextInt();
		int medidor = 0;
		if (cuantosvalores < 0) {
			System.out.println("\n¡Imposible!");
		} else if (cuantosvalores == 0){
			System.out.println("\nNo ha escrito ningún número negativo.");
		} else {
			for (int i=1 ;i<=cuantosvalores;i++) {	
				System.out.print("\nEscriba el número "+i+": ");
				int numeroX = lector.nextInt();	
				if (numeroX < 0) {
					medidor++;
				}
					
			}
			System.out.print("\nHa escrito "+medidor+" número(s) negativos.");	
		}
		
		System.out.println("\n---------------------------------------------------\n");
		
		
		// Ejercicio 6: Escriba un programa que pregunte cuántos números se van a introducir, 
		// pida esos números, y diga al final cuántos han sido pares y cuántos impares.
		System.out.println("--CONTADOR DE PARES E IMPARES--");
		System.out.print("\n¿Cuántos valores va a introducir? ");
		int cantidad = lector.nextInt();
		int contadorpares = 0;
		int contadorimpares = 0;
		if (cantidad < 0) {
			System.out.println("\n¡Imposible!");
		} else if (cantidad == 0){
			System.out.println("\nNo ha escrito ningún número.");
		} else {
			for (int i=1 ;i<=cantidad;i++) {	
				System.out.print("\nEscriba el valor "+i+": ");
				int valor = lector.nextInt();	
				if (valor % 2 == 0) {
					contadorpares++;
				}else {
					contadorimpares++;
				}
			}
			System.out.println("\nHa escrito "+contadorpares+" número(s) par(es) y "+contadorimpares+" número(s) impar(es).");
			System.out.println("\nGracias por su colaboración.");
			}
			
		System.out.println("\n---------------------------------------------------\n");
		
		// Ejercicio 7: Escriba un programa que pida un número entero mayor que 1 y diga si el número es un número primo o no.
		System.out.println("--NÚMEROS PRIMOS--");
		System.out.print("\nEscriba un número mayor que uno: ");
		int numero = lector.nextInt();
		int contadorPrimos = 0;
		if (numero <= 1) {
			System.out.println("\n¡Le he pedido un número entero mayor que 1!");
		} else {
			for (int i=2 ;i<numero;i++) {	
				if (numero % i == 0) {
					contadorPrimos++;
				}
			}
			
			if (contadorPrimos == 0) {
				System.out.println("\n"+numero+" es primo.");	
			} else {
				System.out.println("\n"+numero+" no es primo.");
			}
				
		}
		
		System.out.println("\n---------------------------------------------------\n");
		
		
		// Ejercicio 8: Escriba un programa que pregunte cuantos números se van a introducir, 
		// pida esos números (que puedan ser decimales) y calcule su suma.
		System.out.println("--SUMA DE VALORES--");
		System.out.print("\n¿Cuántos valores va a introducir? ");
		int numvalores = lector.nextInt();
		double total = 0;
		if (numvalores < 1) {
			System.out.println("\n¡Imposible!");
		} else {
			for (int i=1 ;i<=numvalores;i++) {	
				System.out.print("\nEscriba el número "+i+": ");
				
				double number = lector.nextDouble();	
				total += number;
			}
			System.out.println("\nLa suma de los números que ha escrito es "+total);
			}
		
		System.out.println("\n---------------------------------------------------\n");
		
		
		// Ejercicio 9 y 10: Escriba un programa que pida dos números enteros y escriba la suma de 
		// todos los enteros desde el primer número hasta el segundo.
		// Mejore el programa anterior haciendo que el programa escriba la suma realizada
		System.out.println("--SUMA ENTRE VALORES--");
		System.out.print("\nEscriba un número entero positivo: ");
		int valor1 = lector.nextInt();
		int contador = 0;
		if (valor1 < 0) {
			System.out.println("\n¡Le he pedido un número entero positivo!");
		} else {
			System.out.print("\nEscriba un número entero mayor que "+valor1+": ");
			int valor2 = lector.nextInt();
			System.out.println();
			if (valor2 <= valor1) {
			System.out.println("\n¡Le he pedido un número entero mayor que "+valor1+"!");
			} else {
				for (int i = valor1; i<=valor2;i++) {
					contador += i;
					}
				System.out.println("La suma desde "+valor1+" hasta "+valor2+" es "+contador+"\n");
				for (int j = valor1; j<=valor2; j++) {
					System.out.print(j);
				if (j<valor2) {
					System.out.print(" + ");
                } else { 
                	System.out.print(" = "+contador);
					
                		}				
                	}
                }
			}
		
		System.out.println("\n---------------------------------------------------\n");
			
		
		// Ejercicio 11: Escriba un programa que pregunte cuántos números se van a introducir, 
		// pida esos números, y escriba el mayor, el menor y la media aritmética.
        // Se recuerda que la media aritmética de un conjunto de valores es la suma de esos valores dividida 
		// por la cantidad de valores.
		System.out.println("--MAYOR, MENOR Y MEDIA ARITMÉTICA--");
		System.out.print("\n¿Cuántos valores va a introducir? ");
		int valores = lector.nextInt();
		double suma = 0;
		double mayor = 0;
		double menor = 0;
		if (valores < 1) {
			System.out.println("\n¡Imposible!");
		} else {
			System.out.print("\nEscriba el número 1: ");
            double num = lector.nextDouble();    
            
            // 2. Inicializar mayor y menor con el primer número real
            mayor = num;
            menor = num;
            suma = num; // La suma comienza con el primer número
			for (int i=2 ;i<=valores;i++) {	
				System.out.print("\nEscriba el número "+i+": ");
				num = lector.nextDouble();
				suma += num;
				if (num > mayor) {
					mayor = num;
				}
		
                if (num < menor) {
                    menor = num;
                }
			}   
			double media = suma / valores;
			System.out.printf("\nEl número más pequeño de los introducidos es %.2f", menor);
			System.out.printf("\nEl número más grande de los introducidos es %.2f", mayor);
			System.out.printf("\nLa media de los números introducidos es %.2f", media);
			}
		
		System.out.println("\n---------------------------------------------------\n");
			
		
		// Ejercicio 12: Escriba un programa que pida un número entero mayor que cero y calcule su factorial.		
		System.out.println("--FACTORIAL--");
		System.out.print("\nEscriba un número entero mayor que cero: ");
		int entrada = lector.nextInt();
		long factorial_resultado = 1; 
        
		if (entrada < 1) {
			System.out.println("\n¡Le he pedido un número entero mayor que cero!");
		} else {
            factorial_resultado = 1; 
			for (int i = 1; i <= entrada; i++) {
				factorial_resultado *= i; 
            }
            
			System.out.println("\nEl factorial de " + entrada + " es " + factorial_resultado);
		}
		
		System.out.println("\n---------------------------------------------------\n");
        
        
        // Ejercicio 13 y 14 y 15: Escriba un programa que genere una multiplicación de dos números del 2 al 10 al azar, 
		// pregunte por el resultado y diga si se ha dado la respuesta correcta.
		// Amplíe el programa anterior haciendo que el programa pida primero al usuario cuántas 
        // multiplicaciones se van a plantear.
        // Amplíe el programa anterior haciendo que el programa lleve la cuenta de las respuestas correctas 
		// e incorrectas e indique la nota correspondiente.
		// Si la nota es igual o mayor que 9, el programa felicitará al usuario por el resultado.
		
		System.out.println("--TABLAS DE MULTIPLICAR--");
		System.out.print("\nNúmero de preguntas: ");
		int numpreguntas = lector.nextInt();
		double aciertos = 0;
		if (numpreguntas < 1) {
			System.out.println("\nEl número de preguntas debe ser al menos 1.");
		} else {
			for (int i = 1; i<= numpreguntas; i++) {
				int numero1 = random.nextInt(9) + 2;
			    int numero2 = random.nextInt(9) + 2;     
			    System.out.print("\n¿Cuánto es "+numero1+" x "+numero2+"? ");
			    int respuesta = lector.nextInt();
			    if (respuesta == numero1 * numero2) {
			    	System.out.println("\n¡Respuesta correcta!");
			    	aciertos++;
			    } else {
			    	System.out.println("\n¡Respuesta incorrecta!");
			    }
			}
			double nota = (aciertos * 10)/numpreguntas;
			if (aciertos == 1) {
			System.out.println("\nHa contestado correctamente "+aciertos+" pregunta.");
			} else if (aciertos > 1) {
				System.out.println("\nHa contestado correctamente "+aciertos+" preguntas.");				
			} else {
				System.out.println("\nNo ha contestado correctamente ninguna pregunta.");	
			}
			
			System.out.println("\nLe corresponde una nota de "+nota);
			if (nota >= 9) {
			System.out.println("\n¡Enhorabuena!");
			}
		}
		
		System.out.println("\n---------------------------------------------------\n");
		
		// Ejercicios 16, 17 y 18: 
		// Escriba un programa que genere una multiplicación de dos números del 11 al 99 al azar, 
		// pregunte por el resultado y diga si se ha dado la respuesta correcta, si está a menos del 10% del valor correcta o a menos del 30%.
		// Amplíe el programa anterior haciendo que el programa pida primero al usuario cuántas multiplicaciones se van a plantear.
		// Amplíe el programa anterior haciendo que el programa lleve la cuenta de las respuestas correctas e incorrectas e indique la nota correspondiente. 
		// Si la nota es igual o mayor que 9, el programa felicitará al usuario por el resultado.
		// Si se acierta la respuesta, se contabilizará como 1
		// Si se acerca menos del 10% a la respuesta correcta, se contabilizará como 0.66.
		// Si se acerca entre el 10% y el 30% a la respuesta correcta, se contabilizará como 0.33.
		// Si se aleja más del 30% de la respuesta correcta, se contabilizará como 0.
		System.out.println("--CÁLCULO ESTIMADO--");
		System.out.print("\nNúmero de preguntas: ");
		int numpreg = lector.nextInt();
		double correctas = 0;
		if (numpreg < 1) {
			System.out.println("\nEl número de preguntas debe ser al menos 1.");
		} else {
			for (int i = 1; i<= numpreg; i++) {
				int num1 = random.nextInt(89) + 11;
		        int num2 = random.nextInt(89) + 11;  
		        double respuestaReal = num1*num2;
			    System.out.print("\n¿Cuánto es "+num1+" x "+num2+"? ");
			    double resultado = lector.nextDouble();
			    double error = respuestaReal - resultado;
			    if (error < 0) {
			    	error *= -1;
			    }
			    
			    
			    if (resultado == respuestaReal) {
			    	System.out.println("\n¡Respuesta correcta!");
			    	correctas++;
			    } else if (error<=respuestaReal*0.1){
			    	System.out.println("\n¡Has fallado por menos del 10%! La respuesta correcta era "+respuestaReal);
			    	correctas+=0.66;
			    } else if (error<=respuestaReal*0.3){
			    	System.out.println("\n¡Has fallado por menos del 30%! La respuesta correcta era "+respuestaReal);
			    	correctas+=0.33;
			    } else {
			    	System.out.println("\n¡Has fallado por más del 30%! La respuesta correcta era "+respuestaReal);
			    	}
			    
				}
			double notamedia = (correctas * 10.0)/numpreg;
			System.out.printf("\nLe corresponde una nota de %.2f\n", notamedia);
			if (notamedia >= 9) {
			System.out.println("\n¡Enhorabuena!");
			}
		}
	
		System.out.println("\n---------------------------------------------------\n");
		
		lector.close();
		
	}		
	
}


