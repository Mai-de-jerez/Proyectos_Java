package Funciones;

import java.util.Random;

public class metodos_de_clase {
	/**
	 * Metodo estatico del main que imprime un saludo por la terminal.
	 * @param nom <strong> Nombre tipo String para el saludo </strong>
	 */
	public static void Saludo(String nom) {
		// Esta función imprime hola y un nombre
		System.out.println("Hola, "+ nom);
		
	}
	
	/**
	 * Médtodo que mediante un aleatorio decide una ciudad
	 * @return retorna el nombre de la ciudad como String
	 */
	public static String dimeCiudad() {
			
			String ciudad = "";
			
			Random numero = new Random();
			
			int aleatorio = numero.nextInt(3)+1;
			
			if(aleatorio==1) {
				ciudad = "Vigo";
			} else {
				ciudad ="Madrid";
			}
			
			return ciudad;
				
		}
	
	/**
	 * Método que calcula el IVA
	 * @param pvp precio sin iva
	 * @return precio con iVA
	 */
	public static double calculoIva(double pvp) {
		double total= pvp * 1.21;
		return total;
		// return pvp * 1.21 <--es otra forma sin tener que definir total
	}
	
	/**
	 * Método para cobrar tartas 
	 * @param tartas numero de tartas
	 * @param precio precio unidad de tartas
	 * @return precio a cobrar sin iva
	 */
	
	public static double totalPrecio(int tartas, double precio) {
		// int <- double * int	<-- si lo convierto a entero pierdo precisión
		return tartas * precio;
	}
	
	// SOBRECARGA DE FUNCIONES: puedes usar el mismo nombre para varias funciones siempre que cabies la firma
	// la firma es la cantidad de parametros o el tipo de esos parametros
	
	/**
	 * Función que suma dos enteros.
	 * @param n1 primer int que pasamos como parametro
	 * @param n2 segundo int que pasamos como parametro
	 * @return la suma del primer entero más el segundo
	 */
	public static int suma(int n1, int n2) {
		
		return n1+n2;
	}
	
	
	/**
	 * Función que suma dos decimales doubles.
	 * @param n1 primer decimal.
	 * @param n2 segundo decimal.
	 * @return suma de ambos decimales.
	 */
	public static double suma(double n1, double n2) {
		return n1+n2;
	}
	
	/**
	 * Función que suma un decimal double y un entero int.
	 * @param n1 primer número decimal.
	 * @param n2 segundo número entero.
	 * @return suma de ambos números.
	 */
	public static double suma(double n1, int n2) {
		return n1+n2;
	}
	
	/**
	 * Función que imprime que edad tienes y como te llamas según los parámetros pasados.
	 * @param nombre almcena el nombre en tipo String
	 * @param edad almacena la edad en tipo int
	 */
	public static void imprimeTuEdad(String nombre, int edad) {
		System.out.println("Hola "+nombre+" tienes "+edad+" años.");
	}
	
	/**
	 * Función que imprime que edad tienes y como te llamas según los parámetros pasados.
	 * @param edad almacena la edad en tipo int
	 * @param nombre almcena el nombre en tipo String
	 */
	public static void imprimeTuEdad(int edad, String nombre) {
		System.out.println("Hola "+nombre+" tienes "+edad+" años.");
	}
	
	
	
	public static void main(String[] args) {
		/* Saludos */
		String nombre = "Antonio";
		Saludo(nombre); // pasamos la variable
		Saludo("Pepe"); // pasamos directamente el String
		System.out.println("-------------------------------------------------------------------------\n");
		System.out.println("Ciudades aleatorias: "+dimeCiudad()+" "+dimeCiudad()+" "+dimeCiudad()+" "+dimeCiudad()); // sino pones system.out.print no podrás verlo por la terminal
		System.out.println("Ciudad aleatoria: "+dimeCiudad());
		System.out.println("Ciudad aleatoria: "+dimeCiudad());
		System.out.println("\n-------------------------------------------------------------------------\n");
		double calculo = calculoIva(55.2);
		System.out.println("Precio con IVA: "+calculo);
		System.out.println("\n-------------------------------------------------------------------------\n");
		/* Programa para la tienda de tartas para mi abuela */
		int vendidas=5;
		double precio=15.9;
		double total =totalPrecio(vendidas, precio);
		System.out.println("Abuela cobra: "+total+" euros en la venta de tartas ayer.");
		System.out.println("Abuela cobra: "+totalPrecio(4, 2.3)+" euros en la venta de tartas hoy."); // pasamos directamente el precio y el numero de tartas
		/* Precio  de las tartas con IVA */
		double pvpConIva = calculoIva(total);
		System.out.println("No te olvides del iva: "+pvpConIva);
		/* Forma más eficiente (anidar una funcion en otra) */
		System.out.println("Precio total de la venta de tartas con IVA: "+calculoIva(totalPrecio(5, 5.75)));
		System.out.println("\n-------------------------------------------------------------------------\n");
		System.out.println("Suma usando la primera función: "+suma(5, 8)); // suma 5 y 8 usa la primera función suma
		System.out.println("Suma usando la segunda función: "+suma(5.8, 8.3)); // suma dos decimales usa la segunda función llamada suma
		System.out.println("Suma usando la tercera función: "+suma(8.9, 3)); // suma un decimal y un entero y usa la tercera función 
		// llamada suma que acepta un decimal como primer parametro y un entero como segundo parametro 
		System.out.println("Suma usando la segunda función: "+suma(10, 3.2)); // suma un entero y un decima usando  la segunda función 
		// llamada suma porque esa acepta enteros o decimales como parámetros, no puede usar la tercera porque el segundo valor tendrúa 
		// que ser un int, ni la primera porque tendría que ser los dos parametros int.
		System.out.println("\n-------------------------------------------------------------------------\n");
		String nombrecillo = "Ana";
		int edad = 40;
		imprimeTuEdad(nombrecillo, edad); // declarando primero las variables.
		imprimeTuEdad("Pepe", 16); // pasando directamente los parametros.
		imprimeTuEdad(87, "Luisa");
		
		
	}
}