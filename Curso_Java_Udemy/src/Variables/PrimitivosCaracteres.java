package Variables;

public class PrimitivosCaracteres {

	public static void main(String[] args) {
		// Tipos de caracteres (Character Type)

        // char (16 bits): Almacena un solo carácter UNICODE, entre comillas simples.
        char inicial = 'A'; // comillas dobles sería un string
        char simboloHEX = '\u0040';
        char simboloASCII = 64;
        var varHEX = '\u0040';
        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevalinea = '\n';
        char retornoCarro = '\r';
        
        System.out.println("Tamaño de un Character: "+ Character.BYTES);
        System.out.println("Tamaño de un Character en bits: " + Character.SIZE);
        // para ver los valores necesito convertirlo a int
        System.out.println("Tamaño mínimo de un Character: " + (int)Character.MIN_VALUE);
        System.out.println("Tamaño de un Character en bits: " + (int) Character.MAX_VALUE);
        
        System.out.println("char (Inicial): " + inicial);
        // cada caracter UNICODE tiene su punto de codigo unico en el codigo hexadecimal
        System.out.println("char (Inicial): " + simboloHEX); 
        // LOS PRIMEROS 128 caracteres UNICODE tienen su propio num en el codigo ASCII
        System.out.println("char (Inicial): " + simboloASCII); 
        // Comprobar que son lo mismo
        System.out.println(simboloHEX==simboloASCII);
        System.out.println(varHEX);
        System.out.println(varHEX==simboloASCII);
        System.out.println("Tamaño de un char en bytes: "+ espacio + Character.BYTES);
        System.out.println("Tamaño de un char en bytes: "+ retroceso + Character.BYTES);
        System.out.println("Tamaño de un char en \t bytes: "+ tabulador + Character.BYTES);
        System.out.println("Tamaño de un char en bytes: "+ nuevalinea + Character.BYTES);
        System.out.println("Tamaño de un char en bytes: "+ retornoCarro + retornoCarro + Character.BYTES);
        // Atajo para retorno de carro o nueva linea
        System.out.println("Espacio: "+ System.getProperty("line.separator") + "paso a una nueva línea");
        // También pasa a una nueva línea
        System.out.println("Espacio: "+ System.lineSeparator()+"Hola que pasa");
	}

}
