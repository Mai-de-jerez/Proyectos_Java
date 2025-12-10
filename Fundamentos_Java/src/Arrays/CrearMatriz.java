package Arrays;

public class CrearMatriz {

	public static void main(String[] args) {
		// Los arrays de varias dimensiones solemos conocerlos con el nombre de matrices.
		// Para declarar matrices utilizamos tantos grupos de corchetes como dimensiones queremos en el array.
		// En el siguiente ejemplo declaramos dos matrices de dos dimensiones.
		// Declarar una variable de tipo array de dos dimensiones

		int [][] numeros;
		String [][] alumnos;
		
		// CREAR UNA MATRIZ:
		// MATRICES CUADRADAS: Una matriz cuadrada es aquella que contiene el mismo número de columnas para todas las filas.
		// En el siguiente ejemplo creamos la matriz números con 3 filas y 2 columnas y también creamos
		// la matriz alumnos con 2 filas y 2 columnas.
		numeros = new int[3][2];
		alumnos = new String[2][2];
		
		// MATRICES NO CUADRADAS: Una matriz no cuadrada es aquella que cada fila tiene un determinado número de columnas.
		// En el siguiente ejemplo creamos una matriz no cuadrada con 2 filas, 
		// la primera de ellas contendrá 3 columnas y la segunda contendrá 2 columnas.

		int [][] nums = new int[2][];
		nums[0] = new int[3];
		nums[1] = new int[2];
	
		// Siempre debemos especificar el número de filas para luego definir el numero de columnas de cada fila aparte.
		// Lo que no podemos hacer es definir el numero de columnas, o sea, definirlo al revés.
		
		// ALMACENAR ELEMENTOS EN UNA MATRIZ
		// Para almacenar elementos necesitamos acceder a sus índices fila y columna.

		numeros[0][0]=1;
		numeros[0][1]=2;
		numeros[1][0]=3;
		numeros[1][1]=4;
		numeros[2][0]=5;
		numeros[2][1]=6;
		
		nums[0][0]=10;
		nums[0][1]=20;
		nums[0][2]=30;
		nums[1][0]=40;
		nums[1][1]=50;
		
		alumnos[0][0]="Mario";
		alumnos[0][1]="Marta";
		alumnos[1][0]="Ana";
		alumnos[1][1]="Belén";
	
		// DECLARAR, CREAR Y ALMACENAR ELEMENTOS
		// De la misma forma que en los arrays de una dimensión podíamos unificar todas estas tareas en una sola instrucción 
		// también lo podemos hacer con las matrices. Veamos como:
		
		int numeros1[][] = {{5,1}, {9,2}};
		int numeros2[][] = {{5,1,3}, {9,2,8,5},  {3,7}};
;
		// En el primer ejemplo creamos una matriz cuadrada de 2 filas y 2 columnas. 
        // En el segundo ejemplo hemos creado un matriz no cuadrada de 3 filas: 
	    // la primer fila tiene 3 elementos, la segunda fila tiene 5 elementos y la tercera fila tiene 2 elementos.
		
		// ACCEDER A UN ELEMENTO
		// Para acceder a un elemento de una matriz es necesario especificar la fila y columna del elemento.
		System.out.println("\n--ACCEDER A ELEMENTOS--");
		System.out.println("\nEl primer elemento de la segunda fila del array numeros es: "+numeros[1][0]);
		System.out.println("El tercer elemento de la primera fila del array números2 es: "+numeros2[0][2]);
		System.out.println("El segundo elemento de la segunda fila del array numeros1 es: "+numeros1[1][1]);
		System.out.println("El segundo elemento de la segunda fila del array alumnos es: "+alumnos[1][1]);
		System.out.println("\n----------------------------------------------------------------\n");
		
		// RECORRER UNA MATRIZ CON BUCLE FOR:
	
		// Necesitamos de dos bucles anidados. El primero de ellos es el encargado de recorrer el array de las filas 
		// con el índice i mientras que el segundo es quien recorre el array de las columnas. 
		// Este código es válido para recorrer matrices cuadradas y no cuadradas.
		System.out.println("--IMPRIMIMOS LA MATRIZ NUMEROS--\n");

		// 1. Crear el array especificamos las filas y columnas 
		numeros = new int[3][2];		 
		// 2. Llenar de elementos el array	 
		numeros[0][0] = 6;
		numeros[0][1] = 2;
		numeros[1][0] = 4;
		numeros[1][1] = 3;
		numeros[2][0] = 9;
		numeros[2][1] = 8;		 
		// Recorrer un array con un FOR ANIDADO
		for(int fila=0; fila<numeros.length; fila++){
		    for(int col = 0; col<numeros[fila].length; col++){
		        System.out.print(numeros[fila][col] + " ");
		    }
		System.out.println();
		}
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		// Bucle for-each
		// Con el bucle for-each nuevamente necesitamos de dos bucles anidados. 
		// El primero nos devuelve los arrays de las columnas que recorremos en el bucle interno. 
		// El resultado que obtenemos es el que vemos a continuación.
		System.out.println("\n--IMPRIMIMOS LA MATRIZ NUMBER--\n");
		int number[][] = {{5,1,3}, {9,2}, {3,7,3,6,9,1}};
		 
		// Iteramos 
		for(int[] columnas : number){
		   for(int num : columnas){
		      System.out.print(num + " ");
		  }
		System.out.println();
		 
		}
		
		// BUCLE FOR EACH PARA IMPRIMIR MATRIZ DE STRINGS
		System.out.println("\n----------------------------------------------------------------\n");
		System.out.println("\n--IMPRIMIMOS LA MATRIZ ALUMNOS--\n");
		// Iteramos 
		for(String[] columnas : alumnos){
		   for(String alumno : columnas){
		      System.out.print("Alumno: "+alumno + " ");
		  }
		System.out.println();
		 
		}
		
		
	}

}
