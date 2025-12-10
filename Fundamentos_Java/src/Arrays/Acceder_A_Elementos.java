package Arrays;

public class Acceder_A_Elementos {

	public static void main(String[] args) {
		// Acceder a un elemento
		// Para acceder a un elemento del array es necesario indicar su índice.
		// System.out.printnln(array[indice]);
		// Ejemplo
		
		// 1. Crear el array
		int[] numbers = new int[3];

		// Llenar de elementos el array

		numbers[0] = 44;
		numbers[1] = 553;
		numbers[2] = 234;
	
		
		//Imprimir una posición.
		System.out.println("El elemento en la posición 1 es: "+numbers[1]);
		System.out.println("\n----------------------------------------------------------------\n");
		
		// SI TUVIERAMOS UN ARRAY DE ARRAYS:
		int[][] notasAlumnos = {
		        {5,6,9,7,8,5,0,8},
		        {8,6,4,7,5,5,2,8},  
		        {6,6,9,0,10,5,2,8},
		        {5,0,6,7,8,5,2,9}  
				 };
		
		// Accedemos al primer elemento de la primera fila
		System.out.println("Primer elemento de la primera fila: "+notasAlumnos[0][0]);
		// Accedemos al primer elemento de la segunda fila
		System.out.println("Primer elemento de la segunda fila: "+notasAlumnos[1][0]);
		// Accedemos al primer elemento de la tercera fila
		System.out.println("Primer elemento de la tercera fila: "+notasAlumnos[2][0]);
		// Accedemos al primer elemento de la cuarta fila
		System.out.println("Cuarto elemento de la cuarta fila: "+notasAlumnos[3][3]);
	
		
	}

}
