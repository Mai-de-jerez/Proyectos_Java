package condicionales;

public class CondicionalTernario {

	public static void main(String[] args) {
		// condicion_logica ? valor_si_verdadero: valor_si_falso;
		
		// Ejemplo 1
		
		int numero = 10;
		String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";
		System.out.println(resultado);
		System.out.print("\n---------------------------------------------------------\n");
		// Ejemplo 2
		
		int edad=32;
		String texto;	 
		texto= edad>=18 ? "Mayor de edad" : "Menor de edad";	 
		System.out.print(texto);  // Salida: Mayor de edad porque es true

	}

}
