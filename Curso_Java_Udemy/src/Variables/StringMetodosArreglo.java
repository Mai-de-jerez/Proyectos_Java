package Variables;

import java.util.Arrays;

public class StringMetodosArreglo {

	public static void main(String[] args) {
		
		String trabalenguas = "trabalenguas";
		// Esto no nos sirve
		// System.out.println("Trabalenguas: "+trabalenguas.toCharArray());
		
		// lo debemos guardar en una variable tipo Array
		char[] arreglo = trabalenguas.toCharArray();

		
		// Si iteramos en el Array creado para imprimir cada término veremos la palabra trabalenguas
		for (int i= 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]);
			
		}
		
		System.out.println();
		// Mira como se ha convertido en un Array
		System.out.println("Nuestro nuevo Array: "+Arrays.toString(arreglo)); 
		
		// Con split podemos dividir la cadena cortando cada vez que este la letra a sin contar la a
		System.out.println("Trabalenguas: "+trabalenguas.split("a"));
		
		// convertimos a string dicha cadena
		String[] arreglo2 = trabalenguas.split("a");
		
		// imprimimos para ver como queda
		for (int j= 0; j < arreglo2.length; j++) {
			System.out.println(arreglo2[j]);
			
		}
		
		// Podemos ver el Array asi:
		System.out.println("Nuestro nuevo Array: "+Arrays.toString(arreglo2)); 
		
		// Podemos usarlo también para obtener la extensión de un archivo
		String archivo = "imagen.archivo.pdf";
		String[] archivoArray = archivo.split("\\."); // hay que usarlo asi o asi[.],
		// no puedes poner un punto literal
		
		System.out.println();
		// imprimimos para ver como queda
		for (int m = 0; m < archivoArray.length; m++) {
			System.out.println(archivoArray[m]);
			
		}
		
		System.out.println();
		
		// Si queremos saber la extension del archivo
		System.out.println("Extensión:"+archivoArray[archivoArray.length-1]);
		
		
		
		
	}

}
