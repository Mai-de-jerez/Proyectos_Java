package Arrays;

public class Recorrer_Arrays {

	public static void main(String[] args) {
		
		// Inicializar e instanciar un Array 
		
		// Forma 1: doy los valores directamente y por ende la longitud del array
		String[] Nombres= new String[] {"Juana","Fernando","Lucas", "Mai", "Ana", "Pepe"}; 
		// o también asi directamente:
		// String[] Nombres= {"Juana","Fernando","Lucas", "Mai", "Ana", "Pepe"};
		
		// Forma 2: defino el nombre y la cantidad y luego defino cada indice uno por uno
		String[] Ciudades= new String[6];
		Ciudades[0]= "Madrid";
		Ciudades[1]= "Burgos";
		Ciudades[2]= "Sevilla";
		Ciudades[3]= "Zaragoza";
		Ciudades[4]= "Salamanca";
		Ciudades[5]= "Barcelona";
		
		// RECORREMOS LOS ARRAYS
		
		System.out.println("Las Ciudades son:");
		for (int i=0;i<Ciudades.length;i++) {
			System.out.println(Ciudades[i]);
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		System.out.println("Los Nombres son:");
		for (int i=0;i<Nombres.length;i++) {
			System.out.println(Nombres[i]);
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");

		// Entonces cuando no sabemos la longitud exacta de un Array, podemos usar NombreArray.lenght
		// Ejemplo
		System.out.println("Los Nombres son:");
		for (int i=0;i<Nombres.length;i++) {
			System.out.println(Nombres[i]);
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		
		//Array con tipos primitivos

		// Tipo int
		int[] caramelos= {10,65,5,66,45,5,5,1,2,8};
		// Tipo boolean
		boolean[] casado= {true, false, true};
		
		for (int i=0;i<casado.length;i++) {
			if (casado[i]==true) {
				System.out.println("¿La pareja número "  +(i+1)+" está casada?: "+casado[i]);
			} else {
				System.out.println("¿La pareja número "  +(i+1)+" está casada?: "+casado[i]);
			}
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
	
		// Encontrar la posición de un elemento en el Array
		for (int i=0;i<Nombres.length;i++) {
			if (Nombres[i].equals("Mai")) {
				System.out.println("Mai está en la posición: "+i);
			}
			if (Nombres[i].equals("Lucas")) {
				System.out.println("Lucas está en la posición: "+i);			
			}
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// Otra forma usando metodo equals
		for (int i=0;i<Nombres.length;i++) {
			System.out.println("Leyendo posición: "+i);
			if (Nombres[i].equals("Juana")) {
				System.out.println("Juana está en la posición: "+i);
			}
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// CORTAR UN BUCLE AL ENCONTRAR EL VALOR
		// FORMA 1: PECADO MORTAL !!!
		for (int i=0;i<Nombres.length;i++) {
			System.out.println("Leyendo posición: "+i);
			if (Nombres[i].equals("Mai")) {
				System.out.println("Mai está en la posición: "+i);
				System.out.println("Salimos del cucle con break pero esto es mala práctica.");
				break; // Esto es muy mala práctica, aunque va a salir del bulce al encontrar a Mai, está mal visto!!
			}
		}
		
		// Si queremos cortar el bucle FOR cambiamos la condición:
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		boolean encontrado = false;
		for (int j = 0; j < Nombres.length && !encontrado; j++) {
		    System.out.println("Leyendo posición: " + j);
			if (Nombres[j].equals("Mai")) {
				System.out.println("Mai está en la posición: " + j);
				System.out.println("Salimos del bucle gracias a que la condición se volvió true.");
				encontrado = true;
			}
		}
				
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// Con While busar la posición de Pepe y recorrer todo el Array
		int i=0;
		while (i<Nombres.length) {
			System.out.println("Leyendo posición: "+i);
			if (Nombres[i].equals("Lucas")) {
				System.out.println("Lucas está en la posición: "+i);
			}
			
			i++;
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// Si queremos cortar el  While cuando se encuentre el valor cambiamos la condición
		int z=0;
		while (z<Nombres.length && !Nombres[z].equals("Lucas")) {
			System.out.println("Leyendo posición: "+z);
			z++; 
		} 
		
		if (z < Nombres.length) {
		    System.out.println("Lucas está en la posición: " + z+", por lo tanto, el bucle para.");
		} else {
		    System.out.println("Lucas no fue encontrado en el array.");
		}
		
		System.out.println("\n----------------------------------------------------------------\n");	
		
		int conta = 0;
		while(conta<Nombres.length && !Nombres[conta].equals("Pepe")) {		
			conta++;
		}
		
		System.out.println("La posición de " +Nombres[conta]+" es "+conta);
			
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// Recorrer el Array y encontrar a Pepe con While y Equals()
		int cont=0;
		while (cont<Nombres.length) {
			if (Nombres[cont].equals("Pepe")) {  //Nunca usamos:  if(Nombres[cont]==("Pepe")... porque == no sirve.
			System.out.println("Con un While la posición de Pepe es: "+cont);
			} 
			cont++;
			
		}
	 
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// Buscar con FOR cuantos caramelos tengo en total en: int[] caramelos= {10,65,5,66,45,5,5,1,2,8};
		int total =0;
		for (int j=0;j<caramelos.length;j++) {
			total+=caramelos[j];
		}
		System.out.println("Tengo "+total+" caramelos en total.");
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// Sumar con WHILE cuantas gominolas tengo en total en el array "gominolas", si llega a cero, se corta la suma
		
		int[] gominolas= {10,65,5,66,0,45,5,5,1,2,8};
		
		int suma =0;
		int x=0;
		while(x<gominolas.length && gominolas[x]!=0) {
			suma += gominolas[x];
			x++;
		}
		System.out.println("Tengo "+suma+" gominolas en total.");
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		// Ejemplo : Recorrer Array
		String[] frutas= {"Manzanas", "Fresas", "Naranjas"};
		
		int contador =0;
		while(contador<frutas.length) {
			System.out.println(frutas[contador]);
			contador++;		
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		// Ejemplo : Recorrer Array y parar si encuentra Fresas e imprimir su índice
		
		int contador2 =0;
		while(contador2<frutas.length && !frutas[contador2].equals("Fresas")) {
			contador2++;
		}
		
		if(frutas[contador2].equals("Fresas")){
			System.out.println("Fruta 'Fresas' encontrada en el índice: " +contador2);
		} else if (frutas.length==contador2) {
			System.out.println("Fruta no encontrada."); 
		}
		
		System.out.println("\n--------------------------------------------------------------------------------------\n");
		
		
		// ---RECORRER UN ARRAY CON EL BUCLE FOR EACH---
		// Esto diria suponiendo que cada valor de mi Array notasAlumnos se llamara alumno, 
		// y que cada valor dentro de cada subArray se llamara nota, imprime todas las notas
		
		// Si tenemos el Array de arrays:
		int[][] notasAlumnos = {
		        {5,6,9,7,8,5,0,8},
		        {8,6,4,7,5,5,2,8},  
		        {6,6,9,0,10,5,2,8},
		        {5,0,6,7,8,5,2,9}  
				  };
		
		
		for(int[] alumno : notasAlumnos ) {
			
			for( int nota : alumno) {
				
				System.out.print("Nota: " + nota +" ");
			}
			
			System.out.println(); // para que haga salto de línea tras imprimir cada fila
		}

		System.out.println("\n----------------------------------------------------------------\n");	
		
		// EJEMPLO 2 FOR EACH
		// TAMBIÉN PODEMOS HACERLO CON UN ARRAY DE STRINGS DE UNA SOLA DIMENSION
		//  En este ejemplo imprimiremos los nombres pero además si encontramos a Juan, imprimiremos la palabra viva.
		
		String[]  nombres = {"Juan", "pepe", "Maria", "fran"};
		
		
		for(String nom : nombres ) {
			
			System.out.println(nom);
			
			if(nom.equals("Juan")) { // si encontramos a Juan....
				
				System.out.println("viva"); // ...imprimimos "viva"
				

			}
		}
		
		System.out.println("\n----------------------------------------------------------------\n");	
		
		// EJEMPLO 3 FOR EACH

		int numeros2[] = {5,1,3,9,2};		
		
		
		for(int num : numeros2){
		     System.out.print(num + " ");
		}
		
		System.out.println();
		
		
	
	}

}
