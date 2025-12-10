package Variables;

public class ValidarString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declaramos nulo es string
		String curso = null;
		
		boolean esNulo = curso == null;
		
		System.out.println("Es nulo: "+ esNulo);
		
		if(esNulo) {
			curso = " ";//"Programación Java";			
		}
		
		// Como validar si un String está vacío
		// con == y length()
		boolean esVacio = curso.length() == 0;
		
		
		System.out.println("esVacio= "+esVacio);
		
		boolean esVacio2 = curso.isEmpty();
		System.out.println("esVacio2= "+esVacio2);
		
		// Con isBlank()
		boolean esBlanco = curso.isBlank();
		System.out.println("esBlanco= "+esBlanco);
		
		// con isEmpty()
		/*
		 * if(curso.isEmpty()==false) { 
		 * System.out.println(curso.toUpperCase());
		 * System.out.println("Bienvenido al curso " + curso); }
		 */
		
		if(esBlanco==false) { 
			 System.out.println(curso.toUpperCase());
			 System.out.println("Bienvenido al curso " + curso); }
		
		
		
			
		
	}

}
