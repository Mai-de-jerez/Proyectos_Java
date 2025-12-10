package TipoString_Cadenas;

public class EjemploString {

	public static void main(String[] args) {
		// Todo String en Java es un objeto de la clase String del tipo referencia
		// Un String es un objeto inmutable (no se puede modificar)
		// Se crean con comillas dobles ""
		// Ejmplo crear variable String: 
		String texto = "Hola"; 
		// Ejemplo con el operador new: 
		String texto2 = new String("Hola");
		
		// Loa caracteres de un String se codifican en Unicode (UTF-16)
		
		// Concatenar Strings con el operador +
		String saludo = texto +" "+ texto2;
		System.out.println(saludo);
		
		// Comparar Strings con el operador == por referencia (si son el mismo objeto)
		boolean esIgual2 = texto == texto2;
		System.out.println("¿Los textos son objetos iguales? " + esIgual2); // Salida false diferentes objetos
		System.out.println("\n------------------------- Métodos de la clase String --------------------------------\n");
		
		// Comparar Strings con el método equals() por valor (contenido)
		boolean esIgual = texto.equals(texto2); // distingue entre mayúsculas y minúsculas y acentos
		System.out.println("¿Los textos son iguales en contenido? " + esIgual); // Salida true mismo contenido
		// Comparar con equalsIgnoreCase()
		boolean esIgualIgnoreCase = texto.equalsIgnoreCase("hola"); // Ignora mayúsculas/minúsculas
		System.out.println("¿Los textos son iguales ignorando mayúsculas? " + esIgualIgnoreCase); // Salida true
		// Comparar con compareTo()
		int comparacion = texto.compareTo(texto2); // Devuelve 0 si son iguales, <0 si texto<texto2, >0 si texto>texto2
		System.out.println("Resultado de la comparación con compareTo(): " + comparacion);
		// Método length() para obtener la longitud del String
		int longitud = saludo.length(); 
		System.out.println("Longitud del saludo: " + longitud);
		
		// Método trim() elimina espacios en blanco al inicio y final
		String saludoConEspacios = "   " + saludo + "    ";
		System.out.println("Saludo con espacios: '" + saludoConEspacios + "'");
		String saludoTrim = saludoConEspacios.trim();
		System.out.println("Saludo sin espacios gracias a trim(): '" + saludoTrim + "'");
		
		// chartAT() obtiene el carácter en la posición indicada (empezando en 0)
		char primeraLetra = saludo.charAt(0);
		System.out.println("Primera letra del saludo: " + primeraLetra);
		char ultimaLetra = saludo.charAt(saludo.length() - 1);
		System.out.println("Última letra del saludo: " + ultimaLetra);
		
		// toUpperCase() y toLowerCase() convierten a mayúsculas o minúsculas
		String saludoMayusculas = saludo.toUpperCase(); // toUpperCase() convierte a mayúsculas	
		System.out.println("Saludo en mayúsculas: " + saludoMayusculas);
		String saludoMinusculas = saludo.toLowerCase(); // toLowerCase() convierte a minúsculas	
		System.out.println("Saludo en minúsculas: " + saludoMinusculas);
		
		// substring(int a, int b) obtiene una subcadena desde el índice a hasta b-1
		String subcadena = saludo.substring(5, 9); // Desde el índice 5 hasta el 8
		System.out.println("Subcadena del saludo (índices 5 a 8): " + subcadena);
		
		// substring(int a) obtiene una subcadena desde el índice a hasta el final
		String subcadenaDesde = saludo.substring(7); // Desde el índice 5 hasta el final
		System.out.println("Subcadena del saludo desde el índice 7: " + subcadenaDesde);
		
		
		// toCharArray() convierte el String a un array de caracteres
		char[] caracteres = saludo.toCharArray();
		System.out.println("Array de caracteres del saludo:");
		for (char c : caracteres) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// replace() reemplaza caracteres o subcadenas
		String saludoReemplazado = saludo.replace("Hola", "Hello");
		System.out.println("Saludo con reemplazo: " + saludoReemplazado);
		
		// indexOf(String cadena) busca la posición de un carácter o subcadena
		int indiceDe = saludo.indexOf("H");
		System.out.println("Índice de la subcadena 'H' en el saludo: " + indiceDe);
		
		// indexOf(char c) busca la posición de un carácter
		int indiceH = saludo.indexOf('x');
		System.out.println("Índice del carácter 'x' en el saludo: " + indiceH); // Salida -1 no encontrado
		
		// lastIndexOf(String cadena) busca la última posición de una subcadena
		int ultimaOcurrencia = saludo.lastIndexOf("o"); // Última vez que se encuentra el caracter 'o' en el string
		System.out.println("Última ocurrencia de la subcadena 'o' en el saludo: " + ultimaOcurrencia);
		
		// split(String regex) divide el String en un array usando el separador indicado
		String frase = "Java es un lenguaje de programación";
		String[] palabras = frase.split(" "); // Divide por espacios
		System.out.println("Palabras en la frase:");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		
		// startsWith() y endsWith() para verificar prefijos y sufijos	
		boolean empiezaConJava = frase.startsWith("Java");
		System.out.println("¿La frase empieza con 'Java'? " + empiezaConJava);
		boolean terminaConPunto = frase.endsWith(".");
		System.out.println("¿La frase termina con '.'? " + terminaConPunto);
		
		
		
		
		
		
		
		
		
		
	}

}
