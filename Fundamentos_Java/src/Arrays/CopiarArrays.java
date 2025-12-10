package Arrays;
import java.util.Arrays;


public class CopiarArrays {

	public static void main(String[] args) {
		// COPIAR MAL LOS ARRAYS
		System.out.println("--COPIAR MAL UN ARRAY--");
		int[] arrayOriginal = {1, 2, 3};
		int[] arrayCopia = arrayOriginal; // NO COPIA los elementos, solo la referencia, es decir, son el mismo.
		System.out.println("\nmyArray es: "+Arrays.toString(arrayOriginal));
		System.out.println("myArrayCopia es: "+Arrays.toString(arrayCopia));
		arrayCopia[0] = 99;
		// Ahora arrayOriginal es {99, 2, 3} porque ambos apuntan al MISMO array en memoria, y al cambiar uno se cambia el otro.
		System.out.println("Tras alterar arrayOriginal su nuevo contenido es: "+Arrays.toString(arrayOriginal));
		System.out.println("Pero arrayCopia no se ha mantenido igual porque eran el mismo: "+Arrays.toString(arrayCopia));
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		// HACERLO BIEN con el método copyOf();
		System.out.println("--COPIAR BIEN LOS ARRAYS CON EL MÉTODO CopyOf()--");
		int[] myArray = {1, 2, 3};
		int[] myArrayCopia = Arrays.copyOf(myArray, myArray.length);
		// arrayCopia es {1, 2, 3}.
		// arrayOriginal NO se modifica si cambias arrayCopia.	
		System.out.println("\nmyArray es: "+Arrays.toString(myArray));
		System.out.println("myArrayCopia es: "+Arrays.toString(myArrayCopia));
		myArrayCopia[1]=99;
		System.out.println("Tras alterar myArrayCopia su nuevo contenido es: "+Arrays.toString(myArrayCopia));
		System.out.println("Pero myArray sigue igual: "+Arrays.toString(myArray));
		System.out.println("\n----------------------------------------------------------------\n");
		
		
		// HACERLO BIEN usando el MÉTODO clone() la clase Object;
		System.out.println("--COPIAR BIEN LOS ARRAYS usando el MÉTODO clone() la clase Object--");
		// Todos los arrays en Java tienen un método clone() heredado de Object que funciona correctamente para arrays.
		int[] Original = {1, 2, 3};
		int[] Copia = Original.clone();
		// arrayCopia es {1, 2, 3}.
		System.out.println("\nMi array Original es: "+Arrays.toString(Original));
		System.out.println("Mi array Copia es: "+Arrays.toString(Copia));
		Copia[1]=53;
		System.out.println("Tras alterar Copia su nuevo contenido es: "+Arrays.toString(Copia));
		System.out.println("Pero my array Original sigue igual: "+Arrays.toString(Original));
		System.out.println("\n----------------------------------------------------------------\n");
		
		
		// HACERLO BIEN usando el MÉTODO arraycopy() la clase System;
		System.out.println("--COPIAR BIEN LOS ARRAYS usando el MÉTODO arraycopy() la clase System--");
		int[] array = {1, 2, 3};
		int[] copia = new int[array.length]; // ¡Hay que crear el destino primero!
		System.arraycopy(array, 0, copia, 0, array.length);
		// arrayCopia es {1, 2, 3}.
		System.out.println("\nMi array es: "+Arrays.toString(array));
		System.out.println("La copia es: "+Arrays.toString(copia));
		copia[1]=99;
		System.out.println("Tras alterar copia su nuevo contenido es: "+Arrays.toString(copia));
		System.out.println("Pero my array sigue igual: "+Arrays.toString(array));
		System.out.println("\n----------------------------------------------------------------\n");		
		
		// EJEMPLO 2 CLASE SYSTEM
		System.out.println("--EJEMPLO 2 CLASE SYSTEM--\n");
				
		// 1. inicializamos los arrays
		int[] numeros = new int[] {3,4,5,6};
		int[] numeros2 = new int[] {7,8,9,0};
		// 2. Copiar un array en otro
		System.arraycopy(numeros, 0, numeros2, 0, numeros.length);
		
		//	--Parámetro--                          --Valor Usado--	      --Significado--
		
		//	src (Fuente)	                     |  numeros	            |  El array del que vamos a copiar los datos.
		//	srcPos (Pos. de inicio en Fuente)    |  0	                |  Empezamos a copiar desde el índice 0 de numeros.
		//	dest (Destino)	                     |  numeros2	        |  El array donde vamos a pegar los datos.
		//	destPos (Pos. de inicio en Destino)  |  0	                |  Empezamos a pegar desde el índice 0 de numeros2.
		//	length (Cantidad)	                 |  numeros.length (4)  |  Copiamos 4 elementos (la longitud total de numeros).

		// con un bucle FOR imprimimos cada nuevo elemento de numeros2
		for(int i=0; i<numeros2.length; i++){  
		       System.out.print(numeros2[i] + " ");
		}

		System.out.println();
		System.out.println("\n----------------------------------------------------------------\n");	
		 
		// Vamos a ver un ejemplo en el cual copiamos 3 elementos del array nums comenzando
		// en el índice 2 y los pegamos en el array nnums2 a partir de la posición con índice 1.
		int[] nums = new int[] {0,1,2,3,4};
		int[] nums2 = new int[] {5,6,7,8,9};
		System.out.println("\nnums es: "+Arrays.toString(nums));
		System.out.println("nums2 es: "+Arrays.toString(nums2));
		System.arraycopy(nums, 2, nums2, 1, 3);
		System.out.println("\nTras la operación nums es: "+Arrays.toString(nums));
		System.out.println("Tras la operación nums2 es: "+Arrays.toString(nums2));
		System.out.println("Hemos copiado el array nums desde el indice 2, y hemos sustituido con él el tramo que va desde el indice 1 de nums2, hasta el indice 3.");
	}

}
