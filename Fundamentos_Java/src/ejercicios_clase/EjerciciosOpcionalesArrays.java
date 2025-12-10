package ejercicios_clase;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class EjerciciosOpcionalesArrays {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Random generador = new Random();
		
		// EJERCICIO 1: Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros, 
		// a continuación lo inicialice con valores aleatorios (del 1 al 10) 
		// y posteriormente muestre en pantalla cada elemento del vector junto con su cuadrado y su cubo.
		System.out.println("\n--EJERICIO 1: CUADRADO Y CUBO--\n");
		int[] vector_numeros = new int[10]; 
		for (int i=0; i<vector_numeros.length; i++) {
			vector_numeros[i]= generador.nextInt(10)+1;
			System.out.println("Elemento: "+vector_numeros[i]+
							   " - Cuadrado: "+(vector_numeros[i]*vector_numeros[i])+
							   " - Cubo: "+(vector_numeros[i]*vector_numeros[i]*vector_numeros[i]));
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// EJERICIO 2: Crear un vector de 5 elementos de cadenas de caracteres
		// inicializa el vector con datos leídos por el teclado.
		// Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la pantalla.
		System.out.println("\n--EJERICIO 2: VECTOR INVERSO--\n");
		String[] vector_caracteres = new String[5]; 
		String[] vector_caracteres_inverso = new String[5]; 
		for (int i=0; i<vector_caracteres.length; i++) {
			System.out.print("Introduce la cadena "+(i+1)+": ");
			String valor = lector.nextLine(); 
			vector_caracteres[i]=valor;
        } 
		System.out.println();
		for (int i=0; i<vector_caracteres_inverso.length; i++) {		 
			vector_caracteres_inverso[i] = vector_caracteres[vector_caracteres.length-i-1];  
			System.out.print(vector_caracteres_inverso[i]+" ");
			}
	
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// EJERCICIO 3: Realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (notas entre 0 y 10). 
		// A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.
		System.out.println("\n--EJERICIO 3: MEDIA, MÁXIMA Y MÍNIMA--\n");
		int[] notas = new int[5]; 
		double suma =0;
		int nota_max = 0; 
        int nota_min = 10;
		
		for (int i=0; i<notas.length; i++) {
			System.out.print("Introduce la nota "+(i+1)+": ");
			int nota = lector.nextInt(); 
			
			while (nota < 0 || nota > 10) {
				System.out.println("Nota inválida, la nota debe ser un valor entre 0 y10.");
				System.out.print("Introduce la nota "+(i+1)+": ");
				nota = lector.nextInt();
			}
			
			notas[i]=nota;	
			suma+=notas[i];
			nota_max = Math.max(notas[i],nota_max);
			nota_min = Math.min(notas[i],nota_min);
			
        } 
		
		lector.nextLine();
		System.out.println();
		for (int cifra : notas) {
			System.out.print(cifra+" ");
		}
		
		System.out.println();
		double media=suma/notas.length;
		System.out.println("\nNota más baja: "+nota_min);
		System.out.println("\nNota más alta: "+nota_max);
		System.out.println("\nNota media: "+media);
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		
		// EJERICIO 4: Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta 
		// que se llene el vector o se introduzca un número negativo. Entonces se debe imprimir el vector 
		// (sólo los elementos introducidos).
		System.out.println("\n--EJERCICIO 4: DAME POSITIVOS--\n");
		int[] elementos = new int[10]; 
		int indice = 0;
		int elemento = 0;
		while (indice<elementos.length && elemento >= 0  ) {
			System.out.print("Introduce el elemento "+(indice+1)+": ");
			elemento = lector.nextInt(); 
			elementos[indice] = elemento;
		    indice++; 
		    
		}
		System.out.println();
		for (int num : elementos) {
			System.out.print(num +" ");
		}
		
				
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		System.out.println("\n--EJERCICIO 5: DE MENOR A MAYOR--\n");
		// Ejercicio 5: Hacer un programa que inicialice un vector de números con valores aleatorios, 
		// y posteriormente ordene los elementos de menor a mayor.
		int[] vector = new int[15]; 
		for (int i=0; i<vector.length; i++) {
			vector[i]= generador.nextInt(20);
		}
					
		System.out.println("El array sin ordenar es: "+Arrays.toString(vector));
		Arrays.sort(vector);
		System.out.println("\nEl array ordenado es: "+Arrays.toString(vector));
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		System.out.println("\n--EJERCICIO 6: DIME UN NUMERO Y TE DIGO MES--\n");
		// EJERCICIO 6: Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) 
		// y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector. 
		// Para simplificarlo vamos a suponer que febrero tiene 28 días.
		///
		 
		int[] dias_mes = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre","Diciembre"};
		
		System.out.print("Introduce el número del mes (1-12): ");
		int num_mes = lector.nextInt();
		lector.nextLine();
		if (num_mes >= 1 && num_mes <= 12) { 
				
		    int index = num_mes - 1;  
		    System.out.print("El mes "+mes[index]+" tiene "+dias_mes[index]+" días.");
		    
		} else {
		    System.out.println("Error: Número de mes inválido. Debe estar entre 1 y 12.");
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		System.out.println("\n--EJERCICIO 7: EL TERCERO EN DISCORDIA--\n");
		//EJERCICIO 7: Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ de cinco enteros cada uno, 
		// pida valores para ‘vector1’ y ‘vector2’ y calcule vector3=vector1+vector2.
		int[] vector1 = new int[5];
		int[] vector2 = new int[5];
		int[] vector3 = new int[5];
	
	
		for (int i=0; i<5; i++) {
			System.out.print("Introduzca el valor "+(i+1)+" para vector1: ");
			int valor_vector1 = lector.nextInt();
			vector1[i]=valor_vector1;
			System.out.print("Introduzca el valor "+(i+1)+" para vector2: ");
			int valor_vector2 = lector.nextInt(); 
			vector2[i]=valor_vector2;
			vector3[i]=valor_vector1+valor_vector2;
		}
		
		lector.nextLine();
		
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));
		System.out.println(Arrays.toString(vector3));
	
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		System.out.println("\n--EJERCICIO 8: QUIENES SON LOS VIEJOS--\n");
		//EJERCICIO 8: Queremos guardar los nombres y la edades de los alumnos de un curso. 
		// Realiza un programa que introduzca el nombre y la edad de cada alumno. 
		// El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (*) 
		// Al finalizar se mostrará los siguientes datos:
		// Todos lo alumnos mayores de edad.
		// Los alumnos mayores (los que tienen más edad)
		ArrayList<String> nombres = new ArrayList<>();
		ArrayList<Integer> edades = new ArrayList<>();
		String nombre = "";
		while (!nombre.equals("*")) {
			System.out.print("Introduzca el nombre del alumno (o * para salir): ");
			nombre = lector.nextLine();
			if (!nombre.equals("*")) {
		        nombres.add(nombre);
		        
		        System.out.print("Introduzca la edad del alumno: ");
		        int edad = lector.nextInt(); 
		        edades.add(edad);
		        lector.nextLine(); 
			}
		}	
	
		
		if (nombres.isEmpty()) {
            System.out.println("No se ha introducido ningún alumno.");
            
        } else {
        			
			boolean hayMayores = false;
	        for (int i = 0; i < nombres.size(); i++) {
	            if (edades.get(i) >= 18) {
	                System.out.println("  - " + nombres.get(i) + " (" + edades.get(i) + " años), es mayor de edad.");
	                hayMayores = true;
	            }
	        }
	        if (!hayMayores) {
	            System.out.println("No hay alumnos mayores de edad.");
	        }
	        
	        int edad_maxima = Collections.max(edades);
	        for (int i = 0; i < nombres.size(); i++) {
	            if (edades.get(i) == edad_maxima) {
	                System.out.println("  - 🏆 " + nombres.get(i) + " tiene la edad más alta con "+edades.get(i)+" años.");
	            }
	        }
        }
        
        System.out.println("\n--------------------------------------------------------------------------------------\n");
		System.out.println("\n--EJERCICIO 9: TEMPERATURAS COMPLICADAS--\n");
		//EJERCICIO 9: Queremos guardar la temperatura mínima y máxima de 5 días. 
		// Realiza un programa que de la siguiente información:
		// La temperatura media de cada día
		// Los días con menos temperatura
		// Se lee una temperatura por teclado y se muestran los días cuya temperatura máxima coincide con ella. 
		// Si no existe ningún día se muestra un mensaje de información.
		String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
		int[][] temperaturas = {
				{12,24},
				{15,19},
				{17,30},
				{14,32},
				{12, 35}
				
		};
		
		System.out.println("\n--MEDIAS--");
		
		int minima=temperaturas[0][0];
		double media_temp;
		
		for (int i = 0; i<temperaturas.length; i++) {
			double suma_temps =0;
			for (int j= 0; j<temperaturas[i].length;j++) { 
				suma_temps+=temperaturas[i][j];
				
						
			}
				minima = Math.min(temperaturas[i][0],minima);
				media_temp = suma_temps /temperaturas[i].length;	
				System.out.println("\nLa temperatura media del " + dias[i] + " es: " + media_temp + "ºC");		
		}
		
		
		System.out.println("\n--MNIMAS MAS BAJAS--");
		for (int i = 0; i<temperaturas.length; i++) {	
			if (minima == temperaturas[i][0]) {
				System.out.println("\nEl " + dias[i] + " tuvo la mínima más baja y fue de " + minima + "ºC");
			}
		}
		
		System.out.println("\n--MAXIMAS COINCIDENTES--");
		
		System.out.println("\nIntroduzca una temperatura: ");
		
		boolean encontrado = false;
		
		if (lector.hasNextInt()) { 
            int tempBuscada = lector.nextInt(); 
            lector.nextLine();
            for (int i=0; i<temperaturas.length;i++) {
            	if (temperaturas[i][temperaturas[i].length - 1]==tempBuscada) {
            		System.out.println("\nEl dia "+dias[i]+" registró esa temperatura máxima.");
            		encontrado = true;
            	} 
            } 
            
            if (!encontrado) { 
                System.out.println("No existe ningún día con esa temperatura máxima.");
            }
            
		} else {
		    System.out.println("Entrada no válida. Debe introducir un número entero.");
		    lector.nextLine(); 
		}
		
		lector.close();
			
		
	}

}
