package condicionales;
import java.util.Scanner;

public class Condicional_if_else {

	public static void main(String[] args) {
		// Ejemplo de if-else if-else
		// Ejemplo 1: comparar números
		
		System.out.println("\n--¿ES MAYOR, MENOR O IGUAL QUE?--");
		int numero = 10;
		
		
		// Estructura condicional simple con operadores de comparación
		if (numero > 10) {
			System.out.println("El número es mayor que 10");
		} else if (numero >= 18) {
			System.out.println("El número es mayor o igual que 18");
		} else {
			System.out.println("El número es menor o igual que 10");
		}
		
		System.out.println("\n---------------------------------------------\n");
		
		// Ejemplo 2: if + else if o elif + else
		// Clasificación de calificaciones
		
		System.out.println("\n--SABER NOTA--");
		int calificacion = 8;
		if (calificacion < 5) {
			System.out.println("Insuficiente");
		} else if (calificacion >= 5 && calificacion < 7) {
			System.out.println("Aprobado");
		} else if (calificacion >= 7 && calificacion < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
		
		System.out.println("\n---------------------------------------------\n");
		
		// Ejemplo 3:  if-else
		// El primer print se ejecuta si se cumple la condicion del if
	    // El segundo print se ejecuta si no se cumple la condicion del if
		System.out.println("\n--SABER NOTA OTRA VEZ--");
		int nota = 6;
		if (nota >= 5) {
			System.out.println("Has aprobado el examen.");
		} else {
			System.out.println("No has aprobado el examen.");
		}
		
		System.out.println("\n---------------------------------------------\n");
				
				
		// Ejemplo 4
		// Estructura condicional simple con operadores lógicos
		System.out.println("\n--¿PUEDES ENTRAR?--");
		boolean acompañante = true;
		int edad = 17;
		if (edad >= 18 && edad <=50 || acompañante==true ) {
			System.out.println("Puedes entrar al concierto");
		} else {
			System.out.println("No puedes entrar al concierto");
		}
		
		System.out.println("\n---------------------------------------------\n");
		
		// Ejemplo 5
		System.out.println("\n--COMPROBAR BOOLEANAS--");
		// confirmar como true o false una variable:
		// afirmamos
		boolean isTrue = true;
		
		if (isTrue) { 
			System.out.println("La variable es verdadera");
		} else {
			System.out.println("La variable es falsa");
		}
		
		// negamos con el operador ! (NOT)
		if (!isTrue) {
			System.out.println("La variable es falsa");
		} else {
			System.out.println("La variable es verdadera");
		}
		
		System.out.println("\n---------------------------------------------\n");
		
		// Ejemplo 6: es par?
		// par o impar con if, else
		System.out.println("\n--¿ES PAR O IMPAR?--");
		System.out.println("Dame un numero y te dire si es par o impar:");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El numero " + num + " es par.");
		} else {
			System.out.println("El numero " + num + " es impar."); 
		}
		
		System.out.println("\n---------------------------------------------\n");
		
		// EJEMPLO 7: ¿APROBADO?
		
		// pasar de nota numérica a nota cualitativa con if, else if
		System.out.println("\n--¿APROBADO?--");
		System.out.println("Dame una nota numerica (0-10) y te diré su equivalente cualitativo:");
		int notaExamen = sc.nextInt();
		// validamos que la nota esté entre 0 y 10
		if (notaExamen < 0 || notaExamen > 10) {
			System.out.println("Nota no valida.");
		}else if (notaExamen >= 0 && notaExamen < 5) {
			System.out.println("Insuficiente");
		} else if (notaExamen >= 5 && notaExamen < 6) {
			System.out.println("Suficiente");
		} else if (notaExamen >= 6 && notaExamen < 7) {
			System.out.println("Bien");
		} else if (notaExamen >= 7 && notaExamen < 9) {
			System.out.println("Notable");
		} else if (notaExamen >= 9 && notaExamen <= 10) {
			System.out.println("Sobresaliente");
		}
		
		System.out.println("\n---------------------------------------------\n");
		// Ejemplo 8: Cálculo de la renta
		
		float c = 1000F; //capital
        float r = 0; // redito
        int t = 50; // tiempo

        if (t <= 24) {
            r = 5;
        } else if (t <= 60 && t > 24) {
            r = 8;
        } else {
            r = 10;
        }
        System.out.println("La renta es: " + (c + (c * r * t / 1200)));
        System.out.println("\n---------------------------------------------\n");
        
        
        // Ejemplo 9: múltiplo de 3 y par o impar
        int number = 15;
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("Es par y multiplo de 3");
        } else if (number % 2 == 1 && number % 3 == 0) {
            System.out.println("Es impar y multiplo de 3");
        } else if (number % 3 == 1 && number % 2 == 1) {
            System.out.println("Ni es par ni multiplo de 3");
        }
        
        System.out.println("\n---------------------------------------------\n");
        // Ejemplo 10: Cálculo de sueldo con incrementos
        int sueldo_antiguo = 1500;
        String sexo = "mujer";
        int hijos = 5;
        int sueldo = 0;
        if (sueldo < 15000) {
            sueldo = sueldo_antiguo + (sueldo_antiguo * 15) / 100;
            System.out.println("Sueldo antiguo: " + sueldo_antiguo + " Sueldo nuevo, es un 15% mas: " + sueldo);
            if ("mujer".equals(sexo)) {
                sueldo = sueldo + (sueldo * 2) / 100;
                System.out.println("Tiene mas subida por ser mujer: " + sueldo);
                if (hijos > 0) {
                    sueldo = sueldo + (sueldo * hijos) / 100;
                    System.out.println("Tiene mas subida por tener " + hijos + " hijos: " + sueldo);
                }
            }
        } else {
            sueldo = sueldo_antiguo + (sueldo_antiguo * 12) / 100;
            System.out.println("Sueldo antiguo: " + sueldo_antiguo + " Sueldo nuevo, es un 12% mas: " + sueldo);
            if ("mujer".equals(sexo)) {
                sueldo = sueldo + (sueldo * 2) / 100;
                System.out.println("Tiene mas subida por ser mujer: " + sueldo);
                if (hijos > 0) {
                    sueldo = sueldo + (sueldo * hijos) / 100;
                    System.out.println("Tiene mas subida por tener " + hijos + " hijos: " + sueldo);
                }
            }
        }
        
        
		sc.close();

	}

}
