package Arrays;
import java.util.Arrays;

public class CaracteristicasArrays {

	public static void main(String[] args) {
		// Un array es una estructura de datos que permite almacenar varios elementos. 
		// Cada elemento se almacena en una posición del array y, para acceder a él, lo hacemos a través de un índice.
		// Se debe definir el tamaño del array al inicio. El tamaño es el número de elementos máximo que puede almacenar.
		// Todos los elementos han de ser del mismo tipo de datos.
		// Son estructuras estáticas, una vez que hemos fijado el tamaño del array, este no se puede redimensionar.
		// Los hay estáticos y dinámicos.
		
		// Podemos definir arrays de una o varias dimensiones:

		//Array de objetos
		// Esto supone que tenemos una clase llamada Alumnos
		// class Alumno{} // la creamos temporalmente como ejemplo 
		// Alumno alumnos[];
		
		
		//Array de datos tipo primitivos
		int[] cifras = {1,2,3,4,5};
		double[] decimales = {1.5, 2.4, 3.45};		
		boolean[] booleanos = {true, false, true};
		//Array de datos tipo referencia
		String[] alumnas = {"Ana", "Julia", "Sara", "Marta"};

		
		// Como declarar un Array
		int [] numero1; // estoy declarando un array
		int numero2 []; // pero así estoy declarando un array también
		// IMPORTANTE!!: 
		int numero3[], numero4; // estoy declarando un array y luego una variable tipo int por la posición d elos corchetes
		int[] num1, num2; // estoy declarando dos arrays por la posición d elos corchetes
		
		// Inicializar e instanciar un Array 
		
		// Forma 1: doy los valores directamente y por ende la longitud del array
		String[] Nombres= new String[] {"Juana","Fernando","Lucas", "Mai", "Ana", "Pepe"}; 
		// o también asi directamente:
		// String[] Nombres= {"Juana","Fernando","Lucas", "Mai", "Ana", "Pepe"};
		
		// Forma 2: defino el nombre y la cantidad y luego defino cada indice uno por uno
		String[] Ciudades= new String[6];
		Ciudades[0]= "Madrid";
		Ciudades[1]= "Burgos";
		Ciudades[2]= "Sevilla";
		Ciudades[3]= "Zaragoza";
		Ciudades[4]= "Salamanca";
		Ciudades[5]= "Barcelona";
		
		
		// Inicializamos la variable numero4:
		numero4 = 6;
		System.out.println("\nYo soy una variable de valor "+numero4+" porque no me pusieron los corchetes delante.\n" );
		// Dar tamaño a los Arrays:
		numero1 = new int[5];	
		numero2 = new int[4];
		numero3 = new int[5];
	
		// alumnos = new Alumno[3]; 
		
		// Almacenar los elementos en el Array
		numero1[0]=10;
		numero1[1]=20;
		numero1[2]=30;
		numero1[3]=40;
		numero1[4]=50;
		
		numero2[0]=2;
		numero2[1]=5;	
		numero2[2]=3;
		numero2[3]=4;
		
		
		numero3[0]=10;
		numero3[1]=20;
		numero3[2]=30;
		numero3[3]=40;
		numero3[4]=50;
		
		// Otra forma de inicializar los Arrays
		num1 = new int[] {3,4,5,6};
		num2 = new int[] {3,4,5,6};
		
		// Si tuvieramos la clase Alumno:
		// alumnos[0] = new Alumno (1, "Juan", "Martín", 9.3f);
		// alumnos[1] = new Alumno (2, "Jose", "Luna", 6.7f);
		// alumnos[2] = new Alumno (3, "Julia", "Sol", 5.3f);
		
		// METODOS DEL ARRAY
		
		// Método Length() = Longitud del Array;
		// El primer indice siempre es 0, y el último Ciudades.length -1
		int longitud = numero1.length;
		System.out.println("La longitud del Array numero1 es:"+longitud);
		int longitud2 = numero2.length;
		System.out.println("La longitud del Array numero2 es:"+longitud2);
		int longitud3 = alumnas.length;
		System.out.println("La longitud del Array alumnas es:"+longitud3);
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Método Arrays.toString() = Leer como cadena de texto legible el Array:
		
		System.out.println("Las cifras son: "+Arrays.toString(cifras));
		System.out.println("\n---------------------------------------------------------------\n");
		System.out.println("Los decimales son: "+Arrays.toString(decimales));
		System.out.println("\n---------------------------------------------------------------\n");
		System.out.println("Los booleanos son: "+Arrays.toString(booleanos));
		System.out.println("\n---------------------------------------------------------------\n");
		System.out.println("Las alumnas son: "+Arrays.toString(alumnas));
		System.out.println("\n---------------------------------------------------------------\n");
			
		// Método Arrays.sort() = ordenar un Array
		// Método Arrays.sort() = ordenar un Array
		System.out.println("El array numero2 sin ordenar es: "+Arrays.toString(numero2));
		Arrays.sort(numero2);
		System.out.println("\nEl array numero2 ordenado es: "+Arrays.toString(numero2));
		// Con Arrays de string
		System.out.println("\nEl array numero2 sin ordenar es: "+Arrays.toString(alumnas));
		Arrays.sort(alumnas);
		System.out.println("\nEl array numero2 ordenado es: "+Arrays.toString(alumnas));
		System.out.println("\n---------------------------------------------------------------\n");
	
		// Método Equals(); = comprarar si dos arrays son exactamente iguales
		System.out.println("El array num1 es idéntico al array num2: "+Arrays.equals(num1, num2));
		System.out.println("\nEl array numero1 es idéntico al array numero2: "+Arrays.equals(numero1, numero2));
		// Con Arrays de String
		System.out.println("\nEl array Nombres es idéntico al array alumnas: "+Arrays.equals(Nombres, alumnas));
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Método Arrays.binarySearch(); = Busca un elemento en un array ordenado de forma muy rápida y devuelve su índice.
		System.out.println("Marta está dentro del array alumnas en la posición: "+Arrays.binarySearch(alumnas, "Marta"));
		System.out.println("\nEl número 20 está dentro del array número1 en la posición: "+Arrays.binarySearch(numero1, 20));
		System.out.println("\n---------------------------------------------------------------\n");
		
		// Método Arrays.fill(); = Asigna un mismo valor a todos los elementos del array.
		System.out.println("\nEl array numero2 es: "+Arrays.toString(numero2));
		Arrays.fill(numero2, 3);
		System.out.println("\nEl array numero2 tras asignarle un valor de 3 con Arrays.fill() es: "+Arrays.toString(numero2));
				
		
		
	}
		
}
