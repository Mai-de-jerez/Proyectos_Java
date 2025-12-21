package controlador;

import Modelos.Aprendiz;
import Modelos.Auror;
import Modelos.Casa;
import Modelos.Hechicero;
import Modelos.Mago;
import Modelos.Profesor;

public class Main {

	public static void main(String[] args) { 
		
		// Vamos a crear varios objetos de las diferentes clases
		Mago mago = new Mago("Mago de pacotilla", Casa.HUFFLEPUFF);
		Aprendiz harry = new Aprendiz("Harry Potter", Casa.GRYFFINDOR);
		Aprendiz ron = new Aprendiz("Ron Weasley", Casa.GRYFFINDOR);
		Aprendiz hermione = new Aprendiz("Hermione Granger", Casa.GRYFFINDOR);
		Hechicero dumbledore = new Hechicero("Albus Dumbledore", Casa.GRYFFINDOR);
		Hechicero garrick = new Hechicero("Garrik Ollivander", Casa.RAVENCLAW);
		Auror nympha = new Auror("Nymphadora Tonks", Casa.HUFFLEPUFF);
		Profesor snape = new Profesor("Severus Snape", Casa.SLYTHERIN);
		
		// Mostramos las fichas de cada uno
		System.out.println("\n--- Fichas de personaje (usamos ficha())---");
		System.out.println(mago.ficha());
		System.out.println(harry.ficha());
		System.out.println(ron.ficha());
		System.out.println(hermione.ficha()); 
		System.out.println(dumbledore.ficha());
		System.out.println(garrick.ficha());
		System.out.println(nympha.ficha());
		System.out.println(snape.ficha());
		
		// Mostramos como lucen en el toString()
		System.out.println();
		System.out.println(mago);
		System.out.println(harry);
		System.out.println(ron);
		System.out.println(hermione);
		System.out.println(garrick);
		System.out.println(dumbledore);
		System.out.println(nympha);
		System.out.println(snape);
		
		// Vamos a probar a que los distintios magos usen hechizos nulos
		System.out.println("\n--- Lanzamiento de hechizos nulos ---\n");
		mago.lanzarHechizo(null);
		snape.lanzarHechizo(null);
		dumbledore.lanzarHechizo(null);
		harry.lanzarHechizo(null);
		ron.lanzarHechizo(null);
		
		// Vamos a probar a que los distintios magos usen hechizos que no deberian conocer
		System.out.println("\n--- Lanzamiento de hechizos que el mago no conoce ---\n");
		mago.lanzarHechizo("Lumos");
		dumbledore.lanzarHechizo("Expecto Patronum");
		snape.lanzarHechizo("Abracadabra");
		harry.lanzarHechizo("Stupefy");
		nympha.lanzarHechizo("Piertotum Locomotor");
		
		// Vamos a probar a que los distintios magos usen hechizos que no deberian conocer
		System.out.println("\n--- Lanzamiento de hechizos que el mago conoce porque hereda---\n");
		
		nympha.lanzarHechizo("Expelliarmus");
		snape.lanzarHechizo("Lumos");
		dumbledore.lanzarHechizo("alohomora");
		
		// Vamos a probar a que los distintios magos usen hechizos que conocen porque son de su clase
		System.out.println("\n--- Lanzamiento de hechizos que el mago conoce porque son de su clase ---\n");
		
		harry.lanzarHechizo("Lumos");
		dumbledore.lanzarHechizo("Expelliarmus");
		nympha.lanzarHechizo("protego");
		snape.lanzarHechizo("Piertotum Locomotor");
		
		
		System.out.println("\n--- Ron aniquila a Hermione ---\n");
		System.out.println(ron.lanzarHechizo("Lumos")); // devuelve de daño 20 por su torpeza
		ron.practicarBasico(); // Practicamos para reducir torpeza
		ron.practicarBasico();
		ron.practicarBasico(); // Torpeza ahora 30 en vez de 60
		System.out.println(ron.lanzarHechizo("Lumos")); // devuelve de daño 40 por su torpeza reducida
		ron.descansar();
		int dañoCausado = ron.lanzarHechizo("Lumos");
		hermione.recibirDano(dañoCausado); // Hermione recibe el daño causado por Ron
		hermione.recibirDano(dañoCausado); // otro ataque y la dejamos K.O.
		// Si ahora Hermione intenta lanzar un hechizo, no podrá porque está K.O.
		System.out.print("Mensaje para Hermione => "); hermione.lanzarHechizo("Alohomora");
		
		System.out.println("\n--- Venganza de Hermione ---\n");
		// Mejoramos a Hermiones su vida y mana para siguientes pruebas
		hermione.descansar();// descanso para recuperarse

		// Ahora Hermione se vengará de Ron
		int venganza = hermione.lanzarHechizo("Alohomora");
		// como el daño causado es leve practicamos basico
		hermione.practicarBasico(); // Practicamos para reducir torpeza
		hermione.practicarBasico();
		hermione.practicarBasico();
		
		venganza = hermione.lanzarHechizo("Alohomora");
		// A por él!
		ron.recibirDano(venganza);
		ron.recibirDano(venganza);
		ron.recibirDano(venganza);
		System.out.print("Mensaje para Ron => "); ron.lanzarHechizo("Alohomora");
	
		System.out.println("\n--- Usamos métodos de Hechiceros ---\n");
	
		dumbledore.estudiarEnBiblioteca();
		snape.estudiarEnBiblioteca();
		nympha.estudiarEnBiblioteca();
		nympha.estudiarEnBiblioteca();
		
		System.out.println("\n--- Uso métodos Aurores ---\n");
		// Patrullar para ganar el sueldo
		nympha.patrullar();
		nympha.patrullar();
		
		//Aarrestemos a algun motherfucker
		System.out.println("El Auror Nymphadora Tonks tiene "+ nympha.getArrestos() + " arrestos y su experiencia en combate es de "+nympha.getExperienciaCombate());
		
		System.out.println("¿Está arrestado Ron Weasleyha?: " + nympha.arrestar(ron));
		
		System.out.println("El Auror Nymphadora Tonks tiene "+ nympha.getArrestos() + " arrestos y su experiencia en combate es de "+nympha.getExperienciaCombate());
		
		System.out.println("Vida actual de Hermione: "+ hermione.getVida()); // ojo la vida de hermione es mayor a 30
		
		System.out.println("¿Está arrestada Hermione?: " + nympha.arrestar(hermione));
		
		System.out.println("El Auror Nymphadora Tonks sigue teniendo "+ nympha.getArrestos() + " arrestos y su experiencia en combate sigue siendo de "+nympha.getExperienciaCombate());
	
		System.out.println("\n--- Uso métodos Profesores ---\n");
		
		System.out.println("Asignatura que da Snape actualmente: "+ snape.getAsignatura()); 
		snape.setAsignatura("Artes Oscuras"); // no me gusta la cambio
		System.out.println("Asignatura que da Snape ahora: "+snape.getAsignatura());
		// Evaluar para ganar el sueldo y ganar prestigio
		snape.evaluar();
		snape.evaluar();
		System.out.println("\nTorpeza de ron: " + ron.getTorpeza()); // miramos la torpeza de ron
		System.out.println("Nivel de ron: " + ron.getNivel()); // miramos su nivel
		snape.enseñar(ron);
		
		System.out.println("\nTorpeza de hermione: " + hermione.getTorpeza()); // miramos la torpeza de ron
		System.out.println("Nivel de hermione: " + hermione.getNivel()); // miramos su nivel
		snape.enseñar(hermione);
		
		System.out.println("\n--- LA GRAN BATALLA DE HOWARGTS: Aprendices VS Dumbledore ---\n");
		
		harry.lanzarHechizo("Lumos");
		harry.practicarBasico();
		harry.practicarBasico();
		harry.practicarBasico();
		harry.practicarBasico();
		
		harry.descansar();
		
		
		// Al ataque!!
		int ataqueHarry = harry.lanzarHechizo("Lumos");
		dumbledore.recibirDano(ataqueHarry);
		// Harry descansa porque se la ve venir
		harry.descansar();
		
		// Dumbledore responde!
		int ataqueDumble = dumbledore.lanzarHechizo("Stupefy");
		harry.recibirDano(ataqueDumble);
		// harry descansa y descansa
		harry.descansar();
		// Ataca también a Ron y lo deja fuera de combate!
		ron.recibirDano(ataqueDumble);
		// Hermione se la ve venir y se pone a correr
		nympha.arrestar(hermione);
		// Tendrán que hacer un ataque conjunto para destruir a dumbledore
		// Hermione se prepara
		hermione.descansar();	
		hermione.practicarBasico();	
		hermione.practicarBasico();	
		hermione.practicarBasico();	
		int ataqueConjunto = harry.lanzarHechizo("Lumos") + hermione.lanzarHechizo("Alohomora");
		dumbledore.recibirDano(ataqueConjunto);
		
		System.out.println("\n--- HARRY Y HERMIONE GANAN LA BATALLA!! (YA SOLO HAY QUE BUSCAR QUIEN RESUCITARÁ A RON) ---\n");
		
		
		
	}

}
