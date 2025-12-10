package condicionales;

public class Condicional_if {

	public static void main(String[] args) {
		// Ejemplo if
		
		// El primer print se ejecuta solo si se cumple la condicion del if
		// El segundo print se ejecuta siempre
		int x = 10;		 
	    if (x>9){
	    	System.out.println("Has sacado muy buena nota.");
	    }
	    System.out.println("Espero que hayas obtenido buena nota");
	    
	    // Múltiplo de 3
	    int numero = 6;
	    if (numero % 3 == 0){
			System.out.println("Es multiplo de 3");
		}

	}

}
