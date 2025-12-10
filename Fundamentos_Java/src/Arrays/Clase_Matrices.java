package Arrays;
import java.util.Random;

public class Clase_Matrices {

	public static void main(String[] args) {
		// EJEMPLO 1
		
		// Creamos el Array de int con capacidad para 10 elementos
		int[] notas= new int[10]; 
		// Creamos el nuevo objeto generador de valores aleatorios instanciando a la clase Random() 
		Random aleatorio = new Random();
		// Asignamos para cada elemento un valor aleatorio con un FOR y el objeto Random()
		for(int i=0;i<notas.length;i++) {
			
			notas[i] = aleatorio.nextInt(11);
		}
					
		// Ver nuestras notas:
		
		for(int i=0;i<notas.length;i++) {
			
			System.out.println("El elemento " + i + " es " + notas[i] );
		}
		
		
		// EJEMPLO 2: Declaramos un Array bidimensional
	
		int[][] notasAlumnos = {
		        {5,6,9,7,8,5,0,8},
		        {8,6,4,7,5,5,2,8},  
		        {6,6,9,0,10,5,2,8},
		        {5,0,6,7,8,5,2,9}  
				  };

		// Saber el número de filas de mi Array
		int numfilas = notasAlumnos.length;
		// Sbaer el numero de columnas
		int numcolumnas = notasAlumnos[0].length; // cogemos el indice de cualquiera de las cuatro filas, 0 por ejemplo
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		System.out.println(" La matriz tiene este numero de filas: " + numfilas);
		System.out.println(" La matriz tiene este numero de columnas: " + numcolumnas);
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		// Accedemos al primer elemento de la primera fila
		System.out.println("Primer elemento de la primera fila: "+notasAlumnos[0][0]);
		// Accedemos al primer elemento de la segunda fila
		System.out.println("Primer elemento de la segunda fila: "+notasAlumnos[1][0]);
		// Accedemos al primer elemento de la tercera fila
		System.out.println("Primer elemento de la tercera fila: "+notasAlumnos[2][0]);
		// Accedemos al primer elemento de la cuarta fila
		System.out.println("Primer elemento de la cuarta fila: "+notasAlumnos[3][0]);

		System.out.println("\n----------------------------------------------------------------\n");
		
		// EJEMPLO 3: 
		// Accedemos a todos los elementos de todas las filas con un FOR anidado
		
		for(int i=0;i<notasAlumnos.length;i++) {
			
			for(int j=0;j<notasAlumnos[i].length;j++ ) {
				
				System.out.print(notasAlumnos[i][j]);
			}

			System.out.println("");
		}
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		
		
		// EJEMPLO 4
		// Vamos a recorrer todas las filas del array (i) y todos los elementos de cada fila (j)
		// pero cada vez que llegue al valor 0 en una fila, paramos el bucle que recorre los elementos de la fila (j).
		
		int filas = 0;
		while(filas < notasAlumnos.length) {
		
			int elemento = 0;	
			while(elemento < notasAlumnos[filas].length && notasAlumnos[filas][elemento] != 0)  {
				 
				
				System.out.print(notasAlumnos[filas][elemento]);
				elemento++;
				
			}
			
			filas++;
			System.out.println("");

		}
		
		System.out.println("\n----------------------------------------------------------------\n");	
		
		// ---RECORRER UN ARRAY CON EL BUCLE FOR EACH---
		// Esto diria suponiendo que cada valor de mi Array notasAlumnos se llamara alumno, 
		// y que cada valor dentro de cada subArray se llamara nota, imprime todas las notas
		
		for(int[] alumno : notasAlumnos ) {
			
			for( int nota : alumno) {
				
				System.out.print("Nota: " + nota +" ");
			}
			
			System.out.println(); // para que haga salto de línea tras imprimir cada fila
		}

		System.out.println("\n----------------------------------------------------------------\n");	
		
		// EJEMPLO 2 FOR EACH
		// TAMBIÉN PODEMOS HACERLO CON UN ARRAY DE STRINGS DE UNA SOLA DIMENSION
		//  En este ejemplo imprimiremos los nombres pero además si encontramos a Juan, imprimiremos la palabra viva.
		
		String[]  nombres = {"Juan", "pepe", "Maria", "fran"};
		
		
		for(String nom : nombres ) {
			
			System.out.println(nom);
			
			if(nom.equals("Juan")) { // si encontramos a Juan....
				
				System.out.println("viva"); // ...imprimimos "viva"
				

			}
		}

	}

}
