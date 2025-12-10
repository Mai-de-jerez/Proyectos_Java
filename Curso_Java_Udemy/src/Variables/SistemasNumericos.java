package Variables;
// Importamos la clase JOptionPane para la entrada y salida de datos de la API Swing
import javax.swing.*;


public class SistemasNumericos {

	public static void main(String[] args) {
		
		System.out.println("Sistemas Numericos en Java");
		System.out.println("--------------------------------------------------");
		System.out.println("EJEMPLO 1");
		// declaramos un numero
		int numeroDecimal = 500;
		// vemos cual es su numero en binario de 500 con el metodo toBinaryString de la clase Integer
		System.out.println("numeroDecimal: "+ numeroDecimal);
		System.out.println("numero binario de "+ numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
		// para transformar de binario a decimal usamos el prefijo 0b
		int numeroBinario = 0b111110100;
		System.out.println("numeroBinario: "+ numeroBinario);
		// vemos cual es su numero en octal de 500 con el metodo toOctalString de la clase Integer
		System.out.println("numero octal de "+ numeroBinario + " = " + Integer.toOctalString(numeroBinario));
		// para transformar de octal a decimal usamos el prefijo 0
		int numeroOctal = 0764;
		System.out.println("numeroOctal: "+ numeroOctal);
		// numero hexadecimal de 500 con el metodo toHexString de la clase Integer
		System.out.println("numero hexadecimal de "+ numeroOctal + " = " + Integer.toHexString(numeroOctal));
		// para transformar de hexadecimal a decimal usamos el prefijo 0x
		int numeroHexadecimal = 0x1f4; // tb vale 0X1F4
		System.out.println("numeroHexadecimal: "+ numeroHexadecimal);
		
		System.out.println("--------------------------------------------------");
		System.out.println("EJEMPLO 2");
		// declaramos un numero
		int numeroDecimal2 = 30;
		// vemos cual es su numero en binario de 500 con el metodo toBinaryString de la clase Integer
		System.out.println("numeroDecimal2: "+ numeroDecimal2);
		System.out.println("numero binario de "+ numeroDecimal2 + " = " + Integer.toBinaryString(numeroDecimal2));
		// para transformar de binario a decimal usamos el prefijo 0b
		int numeroBinario2 = 0b11110;
		System.out.println("numeroBinario2: "+ numeroBinario2);
		// vemos cual es su numero en octal de 500 con el metodo toOctalString de la clase Integer
		System.out.println("numero octal de "+ numeroBinario2 + " = " + Integer.toOctalString(numeroBinario2));
		// para transformar de octal a decimal usamos el prefijo 0
		int numeroOctal2 = 036;
		System.out.println("numeroOctal: "+ numeroOctal2);
		// numero hexadecimal de 500 con el metodo toHexString de la clase Integer
		System.out.println("numero hexadecimal de "+ numeroOctal2 + " = " + Integer.toHexString(numeroOctal2));
		// para transformar de hexadecimal a decimal usamos el prefijo 0x
		int numeroHexadecimal2 = 0x1e; // tb vale 0X1F4
		System.out.println("numeroHexadecimal2: "+ numeroHexadecimal2);
		
		System.out.println("--------------------------------------------------");
		System.out.println("EJEMPLO 3: Entrada/Salida de datos");
		// Declaramos una variable String para capturar el numero ingresado por el usuario
		String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
		int numeroDecimal3 = 0;
		// Validamos que el usuario haya ingresado un numero entero valido
		try {
			// Convertimos el String a entero para trabajar con él
			numeroDecimal3 = Integer.parseInt(numeroStr);
		} catch (NumberFormatException e) {
			// Si el usuario no ingresa un numero entero valido, mostramos un mensaje de error 
			JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero valido.");
			main(args); // Reiniciamos el programa
			System.exit(0); // Salimos del programa actual
		}
		
	
		// Mostramos los diferentes sistemas numericos del numero ingresado
		System.out.println("numeroDecimal3: "+ numeroDecimal3);
		// mMstramos los diferentes sistemas numericos usando JOptionPane
		String resultadoBinario = "Numero binario de " + numeroDecimal3 +  " = " + Integer.toBinaryString(numeroDecimal3);
		System.out.println(resultadoBinario);
		// Hallamos el número octal 
		String resultadoOctal = "Numero Octal de " + numeroDecimal3 +  " = " + Integer.toOctalString(numeroDecimal3);
		System.out.println(resultadoOctal);
		//Hallamos el número hexadecimal
		String resultadoHexadecimal = "Numero Hexadecimal de " + numeroDecimal3 +  " = " + Integer.toHexString(numeroDecimal3);
		System.out.println(resultadoHexadecimal);
		// Mostramos los resultados en un solo mensaje
		String mensaje = resultadoBinario;
		mensaje += "\n" + resultadoOctal;
		mensaje += "\n" + resultadoHexadecimal;
		JOptionPane.showMessageDialog(null, mensaje);
	
		
	}

}
