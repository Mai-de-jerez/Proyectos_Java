package Ejercicios_POR_mi_cuenta;
import java.util.ArrayList; 
import java.util.List;

public class EjercicioMatrix {

	/*
	 * Ejercicio 2: El Filtro de Agentes (Arrays y Función con while)
	 * 
	 * Crea una función llamada filtrarNombresAgentes que simule la búsqueda de la Resistencia:
	 * Reciba un array de cadenas (String[]) que contiene nombres de agentes.
	 * Reciba una letra inicial como parámetro (char).
	 * Utilice un bucle while para iterar sobre el array de nombres.
	 * Si un nombre comienza con la letra inicial dada, añádelo a un nuevo array de cadenas 
	   (o a una ArrayList si quieres practicar objetos, aunque un array estático sería un buen desafío).
	 * La función debe devolver el nuevo array (o ArrayList) con los nombres filtrados.
	 * En el método main, prueba la función con un array de nombres de agentes 
	   (por ejemplo: Neo, Trinity, Morpheus, Smith, Apoc) y la letra 'T'.
	 */
	
	
	
	public static List<String> filtrarNombresAgentes( String[] agentes, char inicial) {
	    
	    List<String> coincidentes = new ArrayList<>(); 
	    
	    int i = 0; 
	    
	    while (i < agentes.length) {
	        
	        if (Character.toUpperCase(agentes[i].charAt(0)) == Character.toUpperCase(inicial)) {
	            coincidentes.add(agentes[i]); 
	        } 
	            
	        i++; 
	    }

	    return coincidentes; 
	}
	
	
	
	public static void main(String[] args) {
		String[] agentes = {"Neo", "Trinity", "Switch", "Smith", "Apoc"};
		char inicial = 'S';
		
		List<String> coincidentes = filtrarNombresAgentes(agentes, inicial);
		
		System.out.println("Agentes Coincidentes: " + coincidentes);
		
	}

}
