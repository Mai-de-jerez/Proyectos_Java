package HolaMundo;

import java.util.Scanner;

public class Entrada_Salida_por_Consola {

	public static void main(String[] args) {
		/* System.out;  es  una  objeto  de  tipo  PrintStream.  Es  la  salida  estándar  para mostrar resultados por  consola.
		 * System.in; es un objeto de tipo InputStream. Es la entrada estándar para introducir datos por consola.
		 * System.err; es  un  objeto  de  tipo  PrintStream.  Es  la  salida  estándar  para mostrar errores.
		 */
    	
    	/* print(); Imprime un argumento.
         * println(); Imprime un argumento y añade un carácter de salto de línea («\n»).
         * printf(); Imprime con formato. Los diferentes formatos a utilizar los mostramos en la siguiente tabla:
         * 
         *  %d: Enteros (int, byte, short, long)
         *  %o: Números en base octal
         *  %x: Números en base hexadecimal
         *  %e: Números en notación científica
         *  %g: Números en formato general
         *  %a: Números en notación hexadecimal de punto flotante
         *  %h: Código hash de un objeto
         *  %n: Carácter de nueva línea específico de la plataforma
         *  %t: Formatos de fecha y hora
         *  %r: Representación de cadena de un objeto
         *  %f: Números de punto flotante (float, double)
         *  %c: Caracteres (char)
         *  %s: Cadenas de texto (String)
         *  %b: Booleanos (boolean)
         *  %%: Carácter de porcentaje (%)
         *  %<: Reutiliza el último argumento formateado
         */
    	
	    /* Ejemplo:
	     * 
	    *  System.out.printf("Nombre = %s %s ID = %d Nota Media = %.1f\n", 
	    *      s.getNombre(), s.getApellido(), s.alumnoID(), s.getMedia());   
	    */
    	
    	
        
        // PRINCIPALES METODOS DE LECTURA CLASE SCANNER
        
        // Método				Tipo de Retorno				Descripción
        // next()				String						Lee el siguiente token (palabra) de la entrada.
        // nextLine()			String						Lee toda la línea de texto hasta encontrar un salto de línea.
        // nextInt()			int							Lee el siguiente valor como un entero.
        // nextDouble()		 	double						Lee el siguiente valor como un número de punto flotante de doble precisión.
        // nextBoolean()		boolean						Lee el siguiente valor como un booleano (true o false).
        // nextByte()			byte						Lee el siguiente valor como un byte.
        // nextShort()			short						Lee el siguiente valor como un entero corto.
        // nextLong()			long						Lee el siguiente valor como un entero largo.
        // nextFloat()			float						Lee el siguiente valor como un número de punto flotante de precisión simple.
        
        
        //-------------------------------------------------------------------------------------------------------
        
        // PRINCIPALES METODOS DE LECTURA CLASE SCANNER
        
        // Método				Tipo de Retorno			Descripción
        // hasNext()			boolean					Comprueba si hay otro token (palabra) en la entrada.
        // hasNextLine()		boolean					Comprueba si hay otra línea en la entrada.
        // hasNextInt()			boolean					Comprueba si el siguiente token es un entero.
        // hasNextDouble()		boolean					Comprueba si el siguiente token es un double.
        // hasNextBoolean()		boolean					Comprueba si el siguiente token es un booleano.
        // hasNextByte()		boolean					Comprueba si el siguiente token es un byte.
        // hasNextShort()		boolean					Comprueba si el siguiente token es un short.
        // hasNextLong()		boolean					Comprueba si el siguiente token es un long.
        // hasNextFloat()		boolean					Comprueba si el siguiente token es un float.
        
        //----------------------------------------------------------------------------------------------------------
        
        // OTROS MÉTODOS IMPORTANTES
        
        // Método							Descripción
        
        // close()							Cierra este scanner y libera los recursos del flujo de entrada asociado (por ejemplo, System.in). 
        // 									Es una buena práctica cerrarlo siempre para evitar pérdidas de recursos.
        								
        // useDelimiter(String pattern)		Establece el patrón de delimitador que utiliza este scanner para separar sus tokens. 
        //									Por defecto es cualquier espacio en blanco.
        								
        // delimiter()						Devuelve el Pattern (patrón) que este scanner está utilizando actualmente para dividir su entrada.
        
        // skip(Pattern pattern)			Omite la entrada que coincide con el patrón especificado.
    	
    	// Ejemplo 1: 
    	System.out.println("--TU FACTURA--");
    	Scanner scanner = new Scanner(System.in);
    	 
        System.out.println("\nIngrese un nombre para la factura: ");
        String nombre = scanner.nextLine();
        
        System.out.println("\nIngrese un precio de producto: ");
        double precio1 = scanner.nextDouble();
        
        System.out.println("\nIngrese un segundo precio de producto: ");
        double precio2 = scanner.nextDouble();
 
        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;
 
        String detalle = "\nLa factura " + nombre + " asciende a " + totalBruto 
                + "€, aplicando el impuesto del 19% serían " + impuesto 
                + "€, y el importe total tras aplicarlo es de " + totalNeto;
        
        System.out.println(detalle);
        scanner.close();
               
        
    }
}
