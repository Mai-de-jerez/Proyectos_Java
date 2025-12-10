package Variables;

public class PrimitivosEnteros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Tipos de números enteros (positivos, negativos y cero)

        // byte (8 bits): Para números muy pequeños. Rango: -128 a 127.
        byte edad = 30;
        System.out.println("Tamaño de un byte: "+ Byte.BYTES);
        System.out.println("Tamaño de un byte en bits: " + Byte.SIZE);
        System.out.println("Tamaño mínimo de un byte: " + Byte.MIN_VALUE);
        System.out.println("Tamaño de un byte en bits: " + Byte.MAX_VALUE);

        // short (16 bits): Para números pequeños. Rango: -32,768 a 32,767.
        short poblacionPueblo = 15000;
        System.out.println("Tamaño de un short: "+ Short.BYTES);
        System.out.println("Tamaño de un short en bits: " + Short.SIZE);
        System.out.println("Tamaño mínimo de un short: " + Short.MIN_VALUE);
        System.out.println("Tamaño de un short en bits: " + Short.MAX_VALUE);

        // int (32 bits): El tipo de entero más común.
        int distanciaAlSol = 149600000; 
        System.out.println("Tamaño de un int: "+ Integer.BYTES);
        System.out.println("Tamaño de un int en bits: " + Integer.SIZE);
        System.out.println("Tamaño mínimo de un int: " + Integer.MIN_VALUE);
        System.out.println("Tamaño de un int en bits: " + Integer.MAX_VALUE);

        // long (64 bits): Para números muy grandes (necesita el sufijo 'L').
        long habitantesMundo = 8000000000L;  
        System.out.println("Tamaño de un long: "+ Long.BYTES);
        System.out.println("Tamaño de un long en bits: " + Long.SIZE);
        System.out.println("Tamaño mínimo de un long: " + Long.MIN_VALUE);
        System.out.println("Tamaño de un long en bits: " + Long.MAX_VALUE);
       

        
        
        // Palabras reservadas que no se puede usar para declarar variables: void, if, else,
        // class, var int.....
        // no pueden comenzar tampoco con un número pero si contenerlo, puede empezar por
        // signo dolar $, _ guion bajo o letra
        // nombre de clase comienza con mayúscula
        // nombre de variable camelCase: nombreApellido (primero minuscula segunda mayuscula)
        // puedo usar ñ pero no se recomienda
        // puedo usar acentos
        
        

        // Imprimir todos los valores para demostrar su uso:
        System.out.println("\n--- DEMOSTRACIÓN DE TIPOS PRIMITIVOS ---");
        System.out.println("byte (Edad): " + edad);
        System.out.println("short (Población): " + poblacionPueblo);
        System.out.println("int (Distancia): " + distanciaAlSol);
        System.out.println("long (Habitantes): " + habitantesMundo);       
        
    }
}

