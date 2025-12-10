package ejercicios_clase;

public class EjerciciosPropuestosCondicionales {

	public static void main(String[] args) {
		// Ejercicio 1: Devolver si un número es par o impar
		int numero = 7;
		if (numero % 2 == 0) {
			System.out.println(numero + " es un número par.");
		} else {
			System.out.println(numero + " es un número impar.");
		}
		
		// Ejercicio 2: Comparar dos números y decir cuál es el mayor
		int num1 = 10;
		int num2 = 20;
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		} else {
			System.out.println("Ambos números son iguales.");
		}
		
		// Ejercicio 3: Comparar tres números y decir cuál es el mayor
		int a = 15;
		int b = 25;
		int c = 20;
		if (a >= b && a >= c) {
			System.out.println(a + " es el mayor.");
		} else if (b >= a && b >= c) {
			System.out.println(b + " es el mayor.");
		} else {
			System.out.println(c + " es el mayor.");
		}
		
		// Ejercicio 4: Hallar una renta de C x r x t / 1200
		// Si el tiempo es <=24 meses –> 5% Si el tiempo es <=60 meses –> 8% 
		// Si el tiempo es >60 meses –> 10%
		

        double C = 10000.0;
        int t = 36; 		
        double r;          
        
        if (t <= 24) {
            r = 5.0;
        } else if (t <= 60) {
            r = 8.0; 
        } else {
            r = 10.0;
        }
   
        double renta = (C * r * t) / 1200.0;
        double totalAPagar = C + renta;

		System.out.println("La renta es: " + totalAPagar);
		
		// Ejercicio 5: Ver si un número es par y múltiplo de 3 y que saque mensajes del tipo: 
		// Es par y múltiplo de 3
		// Es impar y múltiplo de 3
		// No es múltiplo de 3 pero es par No es ni par ni múltiplo de 3
		
		int numero2 = 18;
		if (numero2 % 3 == 0) {
			if (numero2 % 2 == 0) {
				System.out.println(numero2 + " es par y múltiplo de 3.");
			} else {
				System.out.println(numero2 + " es impar y múltiplo de 3.");
			}
		} else {
			if (numero2 % 2 == 0) {
				System.out.println(numero2 + " no es múltiplo de 3 pero es par.");
			} else {
				System.out.println(numero2 + " no es ni par ni múltiplo de 3.");
			}
		}
		
		// Ejercicio 6:
		// Se va a subir el sueldo a los empleados de la siguiente manera: 
		// Los que cobren < 15000 se les aumenta el 15%
		// Los que cobren >= 15000 aumento del 12%
		// además:
		// Si son mujeres tienen un 2% adicional
		// Si tienen hijos tienen un 1% adicional por hijo
		
		double sueldo = 14000.0;
		String genero = "M"; // "F" para femenino
		int numeroHijos = 0;
		double aumento;
		
		if (sueldo < 15000 && genero.equals("F")) {
			aumento = 15.0 + 2.0 + numeroHijos;
		}
		else if (sueldo >= 15000 && genero.equals("F")) {
			aumento = 12.0 + 2.0 + numeroHijos;
		} 
		else if (sueldo < 15000) {
			aumento = 15.0 + numeroHijos;
		}
	
		else {
			aumento = 12.0 + numeroHijos;
		}
		
		double nuevoSueldo = sueldo + (sueldo * aumento / 100);
		System.out.println("El nuevo sueldo es: " + nuevoSueldo);
		
		
		// Con Switch case
		
		// Ejercicio 1: Con un número del 1 al 7 decir a que día de la semana corresponde
		
		int dia = 3;
		switch (dia) {
			case 1:
				System.out.println("Lunes");
				break;
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
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Número inválido. Debe ser entre 1 y 7.");
		}
		
		// Ejercicio 2: Con una nota calificarlo de suspenso, aprobado, …etc.
		int nota = 85;
		switch (nota / 10) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Suspenso");
				break;
			case 5:
				System.out.println("Aprobado");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Nota inválida.");
		}
		
		
		// Ejercicio 3: Con varias estructuras switch … case ver si un número es divisible por 2,3 o por 5
		int numero3 = 30;
		switch (numero3 % 2) {
			case 0:
				System.out.println(numero3 + " es divisible por 2.");
				break;
			default:
				System.out.println(numero3 + " no es divisible por 2.");
		}
		switch (numero3 % 3) {
			case 0:
				System.out.println(numero3 + " es divisible por 3.");
				break;
			default:
				System.out.println(numero3 + " no es divisible por 3.");
		}
		switch (numero3 % 5) {
			case 0:
				System.out.println(numero3 + " es divisible por 5.");
				break;
			default:
				System.out.println(numero3 + " no es divisible por 5.");
		}
		
		
		// Ejercicio 4: Con una letra que contiene la variable estado decir el estado civil de la persona
		
		char estado = 'C'; // S: Soltero, C: Casado, D: Divorciado, V: Viudo
		switch (estado) {
			case 'S':
				System.out.println("Soltero");
				break;
			case 'C':
				System.out.println("Casado");
				break;
			case 'D':
				System.out.println("Divorciado");
				break;
			case 'V':
				System.out.println("Viudo");
				break;
			default:
				System.out.println("Estado civil inválido.");
		}
		
		
		// Ejercicio 5: Con una letra que contiene un numero romano:
		// I, V, X, L, C, D, M (incluso minúsculas) Decir a que numero corresponde
		
		char numeroRomano = 'x';
		switch (Character.toUpperCase(numeroRomano)) {
			case 'I':
				System.out.println("1");
				break;
			case 'V':
				System.out.println("5");
				break;
			case 'X':
				System.out.println("10");
				break;
			case 'L':
				System.out.println("50");
				break;
			case 'C':
				System.out.println("100");
				break;
			case 'D':
				System.out.println("500");
				break;
			case 'M':
				System.out.println("1000");
				break;
			default:
				System.out.println("Número romano inválido.");
		}

	}

}
