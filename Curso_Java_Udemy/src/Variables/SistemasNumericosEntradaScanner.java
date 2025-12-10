package Variables;
// Importamos la clase Scanner para la entrada de datos por consola de la API java.util
import java.util.Scanner;
import java.util.InputMismatchException;

public class SistemasNumericosEntradaScanner {

	public static void main(String[] args) {
		System.out.println("Entrada/Salida de datos con Scanner");
		System.out.println("--------------------------------------------------");
		// Creamos un objeto Scanner para la entrada de datos por consola
		Scanner scanner = new Scanner(System.in);
		// Pedimos al usuario que ingrese un numero entero
		System.out.println("Ingrese un numero entero: ");
		// Con la siguiente línea capturaríamos el numero ingresado por el usuario como un String
		// String numeroStr = scanner.nextLine();
		// Inicializamos la variable numeroDecimal3 en 0
		int numeroDecimal3 = 0;
		// Validamos que el usuario haya ingresado un numero entero valido
		try {
			// así convertiríamos el String a entero para trabajar con él:
			// numeroDecimal3 = Integer.parseInt(numeroStr);
			numeroDecimal3 = scanner.nextInt(); // O leemos el numero entero directamente
		} catch (InputMismatchException e) { // catch (Exception e) { manejaría errores generales
			// Si el usuario no ingresa un numero entero valido, mostramos un mensaje de error 
			System.out.println("Error: Debe ingresar un numero entero valido.");
			main(args); // Reiniciamos el programa
			System.exit(0); // Salimos del programa actual
		}
		
	
		// Mostramos los diferentes sistemas numericos del numero ingresado
		System.out.println("numeroDecimal3: "+ numeroDecimal3);
		// mMstramos los diferentes sistemas numericos usando JOptionPane
		String resultadoBinario = "Numero binario de " + numeroDecimal3 +  " = " + Integer.toBinaryString(numeroDecimal3);
		// Hallamos el número octal 
		String resultadoOctal = "Numero Octal de " + numeroDecimal3 +  " = " + Integer.toOctalString(numeroDecimal3);	
		//Hallamos el número hexadecimal
		String resultadoHexadecimal = "Numero Hexadecimal de " + numeroDecimal3 +  " = " + Integer.toHexString(numeroDecimal3);
		// Mostramos los resultados en un solo mensaje
		String mensaje = resultadoBinario;
		mensaje += "\n" + resultadoOctal;
		mensaje += "\n" + resultadoHexadecimal;
		System.out.println(mensaje);
		scanner.close();
	}

}
