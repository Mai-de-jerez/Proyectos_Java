package ejercicios_clase;

import java.util.Scanner;

public class EjerciciosOpcionalesCondicionales {

	public static void main(String[] args) {
		// Ejercicio 1: Escriba un programa que pida primero un número par y luego un número impar (positivos o negativos). 
		// En caso de que uno o los dos valores no sea correcto, se mostrará un único aviso.
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("--PAR E IMPAR--");
		System.out.print("Ingrese un número par + o -: ");
		int numeroPar = scanner.nextInt();
		System.out.print("Ingrese un número impar + o -: ");
		int numeroImpar = scanner.nextInt();
		if (numeroPar % 2 == 0 && numeroImpar % 2 != 0) {
			System.out.println("¡Gracias por su colaboración!");
		} else {
			System.out.println("Uno o más de los valores que ha escrito no son correctos.");
			System.out.println("\nEjecute de nuevo el programa para volver a intentarlo.");
		}
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicio 2: Escriba un programa que pida primero un número par (positivo o negativo) y si el valor no es correcto, muestre un aviso. 
		// Si el valor es correcto, pedirá un número impar (positivo o negativo) y si el valor no es correcto, mostrará un aviso.
		System.out.println("--PAR E IMPAR(2)--");
		System.out.print("Ingrese un número par + o -: ");
		int numeroPar2 = scanner.nextInt();
		if (numeroPar2 % 2 == 0) {
			System.out.print("Ingrese un número impar + o -: ");
			int numeroImpar2 = scanner.nextInt();
			if (numeroImpar2 % 2 != 0) {
				System.out.println("¡Gracias por su colaboración!");
			} else {
				System.out.println("\nNo ha escrito un número impar.");
			}
		} else {
			System.out.println("\nNo ha escrito un número par.");
			System.out.println("\nEjecute de nuevo el programa para volver a intentarlo.");
		}
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicio 3: Escriba un programa que pida primero un número par y a continuación un numero impar (positivos o negativos). 
		// En caso de que uno o los dos valores no sean correctos, se mostrarán uno o dos avisos.
		System.out.println("--PAR E IMPAR(3)--");
		System.out.print("\nIngrese un número par + o -: ");
		int numeroPar3 = scanner.nextInt();
		System.out.print("\nIngrese un número impar + o -: ");
		int numeroImpar3 = scanner.nextInt();
		boolean esPar = numeroPar3 % 2 == 0;
		boolean esImpar = numeroImpar3 % 2 != 0;
		if (esPar && esImpar) {
			System.out.println("\n¡Gracias por su colaboración!");
		} else {
			if (!esPar) {
				System.out.println("\nNo ha escrito un número par.");
			}
			if (!esImpar) {
				System.out.println("\nNo ha escrito un número impar.");
			}
			
			System.out.println("\nEjecute de nuevo el programa para volver a intentarlo.");
		}
			
		
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicio 4: Escriba un programa que pida primero un número par y a continuación un numero impar (positivos o negativos). 
		// En cada petición, si el valor no es correcto se mostrará un aviso.
		System.out.println("--PAR E IMPAR(4)--");
		System.out.print("Ingrese un número par + o -: ");
		int numeroPar4 = scanner.nextInt();
		if (numeroPar4 % 2 != 0) {
			System.out.println("No ha escrito un número par.");
			System.out.print("Escriba un número impar + o -: ");
			int numeroImpar4 = scanner.nextInt();
			if (numeroImpar4 % 2 == 0) {
				System.out.println("No ha escrito un número impar.\nEjecute de nuevo el programa para volver a intentarlo.");
			} else {
				System.out.println("Ejecute de nuevo el programa para volver a intentarlo.");
			}
		
		} else {
			System.out.print("Escriba un número impar + o -: ");
			int numeroImpar4 = scanner.nextInt();
			if (numeroImpar4 % 2 != 0) {
				System.out.println("Gracias por su colaboración!");
			} else {
				System.out.println("No ha escrito un número impar.\nEjecute de nuevo el programa para volver a intentarlo.");
			}
		}
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicios 5 y 6: 
		// Escriba un programa que pida dos números enteros y que calcule su división
		// Escribiendo si la división es exacta o no.
		// Mejore el programa anterior haciendo que tenga en cuenta que no se puede dividir por cero.
		System.out.println("--DIVISOR DE NÚMEROS--");
		System.out.print("\nEscriba el dividendo: ");
		int dividendo = scanner.nextInt();
		System.out.print("\nEscriba el divisor: ");
		int divisor = scanner.nextInt();
		if (divisor != 0) {
			int cociente = dividendo / divisor;
			int resto = dividendo % divisor;
			if (resto == 0) {
				System.out.println("\nLa división es exacta. Cociente: " + cociente);
			} else {
				System.out.println("\nLa división no es exacta. Cociente: " + cociente + ", Resto: " + resto);
			}
		} else {
			System.out.println("\nNo se puede dividir por cero.");
		}
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicio 7: Escriba un programa que pida dos números y que conteste cuál es el menor y cuál el mayor 
		// o que escriba que son iguales.
		System.out.println("--COMPARADOR DE NÚMEROS--");
		System.out.print("\nIngrese el primer número: ");
		double numeroA = scanner.nextDouble();
		System.out.print("\nIngrese el segundo número: ");
		double numeroB = scanner.nextDouble();
		if (numeroA < numeroB) {
			System.out.println("\n"+numeroA + " es el menor y " + numeroB + " es el mayor.");
		} else if (numeroA > numeroB) {
			System.out.println("\n"+numeroB + " es el menor y " + numeroA + " es el mayor.");
		} else {
			System.out.println("\nAmbos números son iguales.");
		}
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicios 8 y 9: 
		// Escriba un programa que pida el año actual y un año cualquiera y que escriba 
		// cuántos años han pasado desde ese año o cuántos años faltan para llegar a ese año.
		// Mejore el programa haciendo que cuando la diferencia sea exactamente un año, escriba la frase en singular.
		
		System.out.println("--COMPARADOR DE AÑOS--");
		System.out.print("\nIngrese el año actual: ");
		int anioActual = scanner.nextInt();
		System.out.print("\nIngrese un año cualquiera: ");
		int anioCualquiera = scanner.nextInt();
		if (anioCualquiera < anioActual) {
			int añosPasados = anioActual - anioCualquiera;
			System.out.println("\nHan pasado " + añosPasados + " años desde " + anioCualquiera + ".");
		} else if (anioCualquiera > anioActual) {
			int añosFaltantes = anioCualquiera - anioActual;
			if (añosFaltantes == 1) {
				System.out.println("\nFalta " + añosFaltantes + " año para llegar al año " + anioCualquiera + ".");
			} else {
				System.out.println("\nFaltan " + añosFaltantes + " años para llegar al año " + anioCualquiera + ".");
			}
		} else {
			System.out.println("\n¡Son el mismo año!");
		}
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicio 10 y 11: Escriba un programa que pida dos números enteros y que escriba si el mayor es múltiplo del menor.
		// Mejore el programa anterior haciendo que el programa avise cuando se escriben valores negativos o nulos.
		
		System.out.println("--COMPARADOR DE MÚLTIPLOS--");
		System.out.print("\nIngrese el primer número entero: ");
		int numeroEntero1 = scanner.nextInt();
		System.out.print("\nIngrese el segundo número entero: ");
		int numeroEntero2 = scanner.nextInt();
		if (numeroEntero1 == 0 || numeroEntero2 == 0) {
			System.out.println("\nNo se pueden meter valores nulos.");
		} else if (numeroEntero1 < 0 || numeroEntero2 < 0) {
				System.out.println("\nNo se puede determinar múltiplos números negativos.");
		} else {
			if ( numeroEntero1 <= numeroEntero2) {
				if (numeroEntero2 % numeroEntero1 == 0) {
					System.out.println("\n"+numeroEntero2 + " es múltiplo de " + numeroEntero1 + ".");
				} else {
					System.out.println("\n"+numeroEntero2 + " no es múltiplo de " + numeroEntero1 + ".");
				}		
			} else {
				if (numeroEntero1 % numeroEntero2 == 0) { 
					System.out.println("\n"+numeroEntero1 + " es múltiplo de " + numeroEntero2 + ".");
				} else {
					System.out.println("\n"+numeroEntero1 + " no es múltiplo de " + numeroEntero2 + ".");
				}
			}  
		}
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicio 12: Escriba un programa que pida tres números y que escriba:
		// si son los tres iguales, si hay dos iguales o si son los tres distintos.
		System.out.println("--COMPARADOR DE TRES NÚMEROS--");
		System.out.print("\nEscriba un número: ");
		double numA = scanner.nextDouble();
		System.out.print("\nEscriba otro número: ");		
		double numB = scanner.nextDouble();
		System.out.print("\nEscriba otro número más: ");
		double numC = scanner.nextDouble();
		if (numA == numB && numA == numC) {
			System.out.println("\nHa escrito tres veces el mismo número.");
		} else if (numA == numB || numA == numC || numB == numC) {
			System.out.println("\nHa escrito uno de los números dos veces.");
		} else {
			System.out.println("\nLos tres números que ha escrito son distintos..");
		}
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicio 13: Escriba un programa que pida un año y que escriba si es bisiesto o no.

		// Se recuerda que los años bisiestos son múltiplos de 4, pero los múltiplos de 100 no lo son, aunque los múltiplos de 400 sí.
		System.out.println("--COMPARADOR DE AÑOS BISIESTOS--");
		System.out.print("\nEscriba un año y le diré si es bisiesto: ");
		int anio = scanner.nextInt();
		if (anio % 4 == 0 && anio % 100 != 0) {
			System.out.println("\nEl "+ anio + " es un año bisiesto porque es múltiplo de 4 y sin ser múltiplo de 100.");
		} else if (anio % 100 == 0 && anio % 400 != 0) {
			System.out.println("\nEl " + anio + " no es un año bisiesto porque es múltiplo de 100 sin ser múltiplo de 400.");
		} else if (anio % 400 == 0) {
			System.out.println("\nEl "+ anio + " es un año bisiesto porque es múltiplo de 400.");
		} else {
			System.out.println("\nEl " + anio + " no es un año bisiesto.");
		}
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicio 14: Escriba un programa que pida los coeficientes de una ecuación de primer grado (a x + b = 0) y escriba la solución.
		// Se recuerda que una ecuación de primer grado puede no tener solución, tener una solución única, o que todos los números sean solución. 
		// Se recuerda que la fórmula de las soluciones es x = -b / a
		System.out.println("--ECUACIÓN A X + B = 0--");
		System.out.print("\nIngrese el coeficiente a: ");
		double coefA = scanner.nextDouble();
		System.out.print("\nIngrese el coeficiente b: ");
		double coefB = scanner.nextDouble();
		if (coefA == 0 && coefB != 0) {
			System.out.println("\nLa ecuación no tiene solución.");
		} else if (coefA == 0 && coefB == 0) {
			System.out.println("\nTodos los números son solución.");
		} else {
			double solucion = -coefB / coefA;
			System.out.println("\nLa ecuación tiene una solución: " + solucion);
		}
		
		System.out.println("\n----------------------------------------------------------\n");
		
		// Ejercicio 15: Escriba un programa que pregunte primero si se quiere calcular el área de un triángulo o la de un círculo. 
		// Si se contesta que se quiere calcular el área de un triángulo (escribiendo T o t), el programa tiene que pedir entonces la base y la altura y escribir el área.
		// Si se contesta que se quiere calcular el área de un círculo (escribiendo C o c), el programa tiene que pedir entonces el radio y escribir el área.
		// Se recuerda que el área de un triángulo es base por altura dividido por 2 y que el área de un círculo es Pi (aproximadamente 3,141592) por el radio al cuadrado.
		// Nota: Utilice como valor de pi el valor 3.141592.
		System.out.println("--CÁLCULO DE ÁREAS--");
		System.out.print("\n¿Qué área desea calcular? (T/t para triángulo, C/c para círculo): ");
		char opcion = scanner.next().charAt(0);
		if (opcion == 'T' || opcion == 't') {
			System.out.print("\nIngrese la base del triángulo: ");
			double base = scanner.nextDouble();
			System.out.print("\nIngrese la altura del triángulo: ");
			double altura = scanner.nextDouble();
			if (base <= 0 || altura <= 0) {
				System.out.println("\nLa base y/o la altura no pueden ser nulas o negativas.");
			}else {
				double areaTriangulo = (base * altura) / 2.0;
				System.out.println("\nEl área del triángulo es: " + areaTriangulo);
			}			
		} else if (opcion == 'C' || opcion == 'c') {
			System.out.print("\nIngrese el radio del círculo: ");
			double radio = scanner.nextDouble();
			if (radio <= 0) {
				System.out.println("\nEl radio no puede ser nulo o negativo.");
			}else {
				double areaCirculo = 3.141592 * radio * radio;
				System.out.println("\nEl área del círculo es: " + areaCirculo);
			}
		} else {
			System.out.println("\nOpción inválida. Por favor, elija T/t para triángulo o C/c para círculo.");
				}
		
		System.out.println("\n----------------------------------------------------------\n");
				
		scanner.close();
				

	}

}
