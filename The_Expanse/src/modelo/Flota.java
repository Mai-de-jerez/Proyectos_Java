package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Flota {
	
	// atributo privado
	
	private ArrayList<Nave> naves;
	
	
	// Constructor sin parámetros
	
	public Flota() {
		
		naves = new ArrayList<Nave>();
		
	}
	
	
	// Métodos
	
	/**
	 * Agrega una nave al arraylist de naves con add()
	 * @param nave
	 */
	public void agregarNave(Nave nave) {
		
		this.naves.add(nave); 
	}
	
	
	/**
	 * Pide por consola con Scanner el nombre, la faccion, el numero de misiles y si la nave necesita reparación
	 * y lo almacena en variables, luego usa esas variables para crear un nuevo objeto nave de la clase Nave()
	 * posteriormente agrega dicha nave a la lista de la flota con el método agregarNave()
	 * @param sc requiere un objeto scanner como parametro
	 */
	public void crearNaveDesdeTeclado(Scanner sc) {
		
		System.out.println("\n--- NUEVA NAVE ---");
		
		Nave nave = new Nave();  
		
		System.out.println("Dime el nombre: ");
		nave.setNombre(sc.nextLine());
		
		Faccion faccion = null;     
	    while (faccion == null) {        
	        System.out.println("Dime la facción (Tierra, Marte o Cinturon): ");
	       
	        String entrada = sc.nextLine().trim().toUpperCase();
	        
	        // Compruebo la cadena manualmente
	        if (entrada.equals("TIERRA")) {
	            faccion = Faccion.TIERRA;
	        } else if (entrada.equals("MARTE")) {
	            faccion = Faccion.MARTE;
	        } else if (entrada.equals("CINTURON")) {
	            faccion = Faccion.CINTURON;
	        } else {
	            // Si no coincide lanzo error y vuelvo a pedir
	            System.err.println("¡ERROR! Facción '" + entrada + "' no válida. Debe ser Tierra, Marte o Cinturon. Inténtalo de nuevo.");
	        }
	    }
	   
	    nave.setFaccion(faccion);
		
			
		System.out.println("Dime el número de misiles: ");
		nave.setMisiles(sc.nextInt());
		sc.nextLine();
		
		System.out.println("¿Necesita reparación (S/N)?: ");
		char decision = sc.nextLine().toUpperCase().charAt(0);

		if (decision == 'S') {
		    nave.setNecesitaReparacion(true);
		} else {
		    nave.setNecesitaReparacion(false);
		}		
		
		this.agregarNave(nave);
		
		System.out.println("\n¡Nave " + nave.getNombre() + " creada y añadida a la flota!");
		
	}
		
	/**
	 * Con el método size() mide el tamaño de la lista naves
	 * @return tamaño de la lista
	 */
	public int getNumeroNaves() {
	    return this.naves.size(); 
	}
	
	/*
	 * Recorre con un bucle foreach la lista naves y las imprime con toString()
	 * Si no hay naves, retorna un mensaje de que así es.
	 */
	
	public void listarTodas() {
		
		System.out.println("\n--- LISTADO COMPLETO DE NAVES ---");
		if (naves.isEmpty()) {
			System.out.println("La flota está vacía.");
			return;
		}
		
		for (Nave nave : naves) {
			System.out.println(nave); 
		}
	
	}
	
	
	/*
	 * Recorre la lista naves e imprime solo aquellas que necesitan reparacion
	 * comprobando con un if si el metodo isNecesitaReparacion() es true
	 */
	public void listarNavesParaReparar() {
		
		System.out.println("\n--- NAVES QUE REQUIEREN MANTENIMIENTO ---");
		
		for (Nave nave : naves) {
			
			if (nave.isNecesitaReparacion()) {
				
				System.out.println(nave.toString());
			
			}						
		}		
	}
	
	/**
	 * Recorre la lista naves y obtiene el número de misiles de cada nave y los va sumando
	 * a una variable totalMisiles
	 * @return numero total de misiles de todas las naves
	 */
	public int getTotalMisiles() {
		
		int totalMisiles = 0;
		
		for (Nave nave : naves) {
			
			totalMisiles += nave.getMisiles();						
		}	
		
		return totalMisiles;
	}
	
	
	/**
     * Método auxiliar que comprueba si la cadena introducida por el usuario coincide con alguna
     * de las constantes de la enumeración Faccion (Tierra, Marte o Cinturon).
     * Elimina espacios y convierte a mayúsculas la cadena antes de la validación.
     * @param faccion La cadena (String) introducida por el usuario. 
     * @return la faccion correspondiente a la cadena si es válida, o null si no existe.
     */
	public static Faccion validarFaccion(String faccion) {
        
		String limpia = faccion.trim().toUpperCase();
        
        if (limpia.equals("TIERRA")) {
            return Faccion.TIERRA;
        } else if (limpia.equals("MARTE")) {
            return Faccion.MARTE;
        } else if (limpia.equals("CINTURON")) {
            return Faccion.CINTURON;
        } else {
            return null; 
        }
    }
	

	/**
	 * Método que pasádole un string comprueba si pertenece a alguna faccion válida de la enum Facción
	 * y si es así imprime las naves que pertencen a dicha faccion, si la faccion no existe se imprime un mensaje
	 * @param faccion string para pasar la faccion elegida
	 */
	public void listarPorFaccion(String faccion) {
	    
	   
	    Faccion faccionBuscada = Flota.validarFaccion(faccion);
	
	    
	    if (faccionBuscada == null) {
	        System.out.println("\nNo se encontraron naves con ese nombre de facción: '" + faccion + "'.");
	        return; 
	    }

	    System.out.println("\n--- NAVES DE ESA FACCIÓN: ---");
	    
	    boolean encontradas = false;
	    
	    for (Nave nave : naves) {
	        if (nave.getFaccion() == faccionBuscada) {
	            System.out.println(nave);
	            encontradas = true;
	        }
	    }

	    if (!encontradas) {
	        System.out.println("No se encontraron naves para la facción " + faccionBuscada.getNombreVisible() + ".");
	    }
	    
	}
	
	/**
	 * Método que cuenta cuantas naves pertenecen a la faccion que se pasa en el parametro
	 * @param faccion string que define la faccion
	 * @return un entero cuyo valor corresponde al número de naves presentes en dicha faccion
	 */
	public int contarPorFaccion(String faccion) {
	    
		Faccion faccionBuscada = Flota.validarFaccion(faccion);
	    
	    if (faccionBuscada == null) {
	        return 0; 
	    }

	    int contador = 0;
	    for (Nave nave : naves) {
	        if (nave.getFaccion() == faccionBuscada) {
	            contador++;
	        }
	    }
	    return contador;
	}
		
	
	
	
}
