package ejercicios_clase;
import java.util.Arrays;


public class EjerciciosPropuestosArrays {

	public static void main(String[] args) {
		// EJERCICIO 1: Crear un bloque de código que pinte las vocales y solo las vocales que existen en un array de caracteres. 
		// El programa debe de ir comprobando, con un bucle, para determinar si cada carácter del array es o no una vocal.
		System.out.println("\n--EJERICIO 1: ENCONTRAR LAS VOCALES--\n");
		System.out.println("\n--FORMA 1--\n");
		char[] caracteres = {'a' ,'a', 'b', 'c', 'd', 'e','e', 'f', 'g', 'h', 'i', 'j','k','l','m','n','o'};
		char[] vocales = {'a','e','i','o','u'};
		for (int i=0; i<caracteres.length;i++) {
			boolean esVocal = false;
			for (int j=0; j<vocales.length; j++) {
								
			if (caracteres[i] == vocales[j]) {
				esVocal = true;			
				}
			}
			
			if (esVocal) {
		        System.out.print(caracteres[i] + " ");
		    }
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		// Otra forma
		System.out.println("\n--FORMA 2--\n");
		char letra;
		for(int i = 0; i<caracteres.length; i++){
            letra = caracteres[i];
            switch (letra){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(letra);
                    break;
            }
        }
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// Otra FORMA
		System.out.println("\n--FORMA 3--\n");
        for (char caracter : caracteres){
            for (char vocal : vocales){
                if (caracter == vocal){
                    System.out.print(caracter + " ");
                    break;
                }
            }
        }
        System.out.println("");
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// EJERCICIO 2: Crear un bloque de código que lea las componentes de un array de enteros y me pinte cuales son pares, 
		// cuales impares y cuales son múltiplos de tres.
		// Para este ejercicio utilizar un bucle que recorra el array y utilizar el operador %.
		System.out.println("EJERCICIO 2: PAR, IMPAR O MÚLTIPLO DE 3--\n");
		int[] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for (int i = 0; i < enteros.length; i++) {
	    int numero = enteros[i];
	    System.out.print(numero + " es ");
	    if (numero % 2 == 0) {
	        System.out.print("Par");
	    } else {
	        System.out.print("Impar");
	    }

	    if (numero % 3 == 0) {
	        System.out.print(" y Múltiplo de 3");
	    }

	    System.out.println(); 
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		// Otra forma con FOR-EACH
		System.out.println("--OTRA FORMA--\n");
		for (int numero : enteros){
            if (numero % 2 == 0){
                System.out.println("El numero " + numero+" es par");
            }else{
                System.out.println("El numero " + numero + " es impar");
            }

            if (numero % 3 == 0){
                System.out.println("El numero " + numero + " es divisible por 3");
            }
        }
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// EJERCICIO 3:
		// Crear un bucle que pinte por consola todas las componentes de un array en orden inverso a como están guardadas en el array
		System.out.println("--- EJERCICIO 3: ORDEN INVERSO--\n");
		char[] letras = {'a' ,'b', 'c', 'd', 'e','f', 'g', 'h', 'i', 'j','k'};
		for (int i=letras.length-1;i>=0;i--) {
		        System.out.print(letras[i] + " ");
		    }
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// EJERCICIO 4
		System.out.println("--- EJERCICIO 4 ---\n");
		// Crear un bloque de código que recorra los siguientes arrays y me cree otro que contenga las componentes de ambos dos. 
		// Los arrays son los siguientes:
		int[] array1 = new int[]{1,2,3,4,5};
		int[] array2 = new int[]{334,23,4}; 
		// El array resultado debe ser el siguiente:  int[] array3 = new int[]{1,2,3,4,5,334,23,4};
		int[] array3 = new int[array1.length + array2.length];
		// Recorrer array1
		System.out.println("--- Recorrido de Array 1 ---\n");
		for (int numero : array1) {
		    // Aquí haces lo que necesites con el número, como imprimirlo o sumarlo.
			System.out.print(numero+" ");
		}
		// Recorrer array2
		System.out.println("\n\n--- Recorrido de Array 2 ---\n");
		for (int numero : array2) {
			System.out.print(numero+" ");
		}		
	
		// Creación y Recorrido de Array 3
		System.out.println("\n\n--- Creación y Recorrido de Array 3 ---\n");
		System.arraycopy(array1, 0, array3,0,array1.length);
		System.arraycopy(array2, 0, array3,array1.length,array2.length);
		// Imprimir los valores del nuevo array
		for (int numero : array3){  
			System.out.print(numero+" ");
		}

		System.out.println();
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// Otra FORMA
		System.out.println("\n\n--- OTRA FORMA ---\n");
		int posicionArray3 = 0;

        for(int i = 0; i< array1.length; i++){
            array3[posicionArray3] = array1[i];
            posicionArray3++;
        }

        for(int i = 0; i< array2.length; i++){
            array3[posicionArray3] = array2[i];
            posicionArray3++;
        }

        for(int dato : array3){
            System.out.print(dato + " ");
        }
        System.out.println("");
        
        
	
        System.out.println("\n--------------------------------------------------------------------------------------\n");
        
        // EJERCICIO 5: Dado los siguientes arrays, hacer un bloque de código que construya un array de la siguiente manera:

		char[] cars1 = new char[]{'1','2','3','4','5','6'};		
		char[] cars2 = new char[]{'a','e','r','t','y','u'};
		
		// El array resultado que se debe de construir es el siguiente:		
		// char[] result = new char[]{'1','a','2','e','3','r','4','r','5','y','6','u'};
		char[] result = new char[cars1.length+cars2.length];
		int indicecars1 = 0; // Índice de 'result' (Avanza por 1, 2, 3...)
        int indicecars2 = 0;      // Índice de 'cars2' (Avanza por 1, 2, 3...)
        
        System.out.println("---EJERCICIO 5: UNIR DOS ARRAYS CON FOR ANIDADO---\n");
   
        for(int i = 0; i < cars1.length; i++){ 
            result[indicecars1] = cars1[i];
            indicecars1++;
            for(int j = 0; j < 1; j++){ 
                result[indicecars1] = cars2[indicecars2];
                indicecars1++;
                indicecars2++; 
            }
        }

        for (char c : result){  
            System.out.print(c + " "); 
        }
        
        System.out.println("\n--------------------------------------------------------------------------------------\n");
        
        // OTRA FORMA
        System.out.println("---UNIR DOS ARRAYS CON UN BUCLE WHILE---\n");
        int positionArray1 = 0;
        int positionArray2 = 0;
        int positionArray3 = 0;

        while (positionArray3 < result.length) {
            if (positionArray1 < cars1.length) {
                result[positionArray3] = cars1[positionArray1];
                positionArray1++;
                positionArray3++;
            }

            if (positionArray2 < cars2.length) {
                result[positionArray3] = cars2[positionArray2];
                positionArray2++;
                positionArray3++;
            }
        }


        System.out.println(Arrays.toString(result));
        
        System.out.println("\n--------------------------------------------------------------------------------------\n");

		// EJERCICIO 6
        // Dado el siguiente array, crear un bloque de código que pinte, SOLO, las consonantes que existan en dicho array
        System.out.println("---EJERCICIO 6: OBTENER SOLO CONSONANTES---\n");
        char[] letters = new char[]{'2','f','f','u','u','g','h','i','4'};
      
        char[] consonantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};

        for (char letter : letters){
            for (char consonante : consonantes){
                if (letter == consonante){
                    System.out.print(letter + " ");
                    break;
                }
            }
        }
        System.out.println("");
		
        System.out.println("\n--------------------------------------------------------------------------------------\n");
		
        // EJERCICIO 7: Dado el siguiente array crear un bloque de código que sume todas las componentes del array, 
        // para ello hacer uso de un bucle que vaya obteniendo todos los valores del array
        System.out.println("---EJERCICIO 7: SUMAR VALORES DEL ARRAY---\n");
        float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};
        float suma = 0;
        for (float valor : decimales){
                suma+=valor;
                }
        
        System.out.printf("La suma de todos los valores del array decimales es %.2f",suma);   
        
        System.out.println("\n--------------------------------------------------------------------------------------\n");
		
        // EJERCICIO 8: Dado el siguiente array de números, crear un bloque de código que sume:
        // por un lado solo los números pares y devuelva el resultado 
        // por otro solo los impares y también pinte el resultado
        
        System.out.println("---EJERCICIO 8: SUMAR VALORES PARES E IMPARES DEL ARRAY---\n");
        
        int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};
        int sumapares = 0;
        int sumaimpares = 0;
        for (int num : numeros){
        	if(num % 2==0) {
                sumapares+=num;
                }
        	else {
        		sumaimpares+=num;
        	}
        }
        
        System.out.println("La suma de todos los valores pares del array decimales es: " +sumapares);
        System.out.println("\nLa suma de todos los valores impares del array decimales es: " +sumaimpares);
		 
        System.out.println("\n--------------------------------------------------------------------------------------\n");
        
        // EJERCICIO 9: Dado los dos siguientes arrays: 
        
        int[][] matriz1 = new int[][]{ {1,2}, {0,5} };
        int[][] matriz2 = new int[][]{ {3,4}, {5,8} };
        
        // Crear un bloque de código que sume los elementos de ambos arrays de la siguiente manera:

        // Resultado Resultado (1+3)(2+4) —> 4 6 (0+5) (5+8) 5 13
      
        System.out.println("---EJERCICIO 9: SUMAS ENTRELAZADAS---\n");
        int[][] resultado = new int[2][2];

        for (int fila= 0; fila<matriz1.length; fila++){
            for (int columna = 0; columna < matriz1[fila].length; columna++){
                resultado[fila][columna] = matriz1[fila][columna] + matriz2[fila][columna];
            }
        }

        for (int [] fila : resultado){
            for (int dato : fila){
                System.out.print(dato + " ");
            }
            System.out.println("");
        }
        
        System.out.println("\n--------------------------------------------------------------------------------------\n");
        
        // EJERCICIO 10: Dado la siguiente matriz, crear un bloque de código que me pinte sus componentes de la siguiente manera:
        System.out.println("---EJERCICIO 10: IMPRIMIR MATRIZ---\n");
        // {3 4 5 78} {0 0 0 0} {1 1 1 1} {6 6 6 -1}

        // El array bidimensional es el siguiente: 
        int[][] numbers = new int[][]{{3, 4, 5, 78},
	    							  {0, 0, 0, 0}, 
	    							  {1, 1, 1, 1}, 
	    							  {6, 6, 6, -1} };
	    							  
	    for (int fila = 0;fila<numbers.length;fila++) {
	    	System.out.print("{");
	    	for (int columna = 0; columna < numbers[fila].length;columna++) {
	    		System.out.print(numbers[fila][columna]);
	    		
	    		if (columna < numbers[fila].length - 1) {
	                System.out.print(" ");
	            }
	        }

	        System.out.print("} ");
	        System.out.println();
	        
	    }
	    System.out.println("\n--------------------------------------------------------------------------------------\n");
		
	    // OTRA FORMA MAS FACIL
	    System.out.println("---OTRA FORMA MÁS FÁCIL DE IMPRIMIR UNA MATRIZ---\n");
	    for (int[] fila : numbers) {
            System.out.print("{");
            for (int dato : fila) {
                System.out.print(dato + " ");
            }
            System.out.println("}");
        }
	
		
	}

}

