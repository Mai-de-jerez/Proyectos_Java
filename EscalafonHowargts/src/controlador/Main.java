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
		Mago mago = new Mago("Avatar", Casa.HUFFLEPUFF);
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
		System.out.println(mago.lanzarHechizo(null));
		System.out.println(snape.lanzarHechizo(null));
		System.out.println(dumbledore.lanzarHechizo(null));
		
		System.out.println("\n--- Lanzamiento de hechizos prohibidos para un determinado mago ---\n");
		System.out.println(mago.lanzarHechizo("Lumos"));
		System.out.println(snape.lanzarHechizo("Expecto Patronum"));
		System.out.println(dumbledore.lanzarHechizo("Piertotum Locomotor"));
		System.out.println(ron.lanzarHechizo("Expelliarmus"));
		
		System.out.println("\n--- Usamos lanzarHechizo(), practicarBasico(), descansar() y recibirDano()) ---");
		System.out.println("\n--- Ron aniquila a Hermione ---\n");
		System.out.println(ron.lanzarHechizo("Lumos")); // devuelve de daño 14 por su torpeza
		ron.practicarBasico(); // Practicamos para reducir torpeza
		ron.practicarBasico();
		ron.practicarBasico(); // Torpeza ahora 45 en vez de 60
		System.out.println(ron.lanzarHechizo("Lumos")); // devuelve de daño 26 por su torpeza reducida
		ron.descansar();
		ron.descansar();
		ron.descansar(); // necesitamos mana para el siguiente hechizo
		int dañoCausado = ron.lanzarHechizo("Lumos");
		System.out.println("Vida de Hermione: "+ hermione.getVida()); // miramos la vida de Hermione antes del ataque
		hermione.recibirDano(dañoCausado); // Hermione recibe el daño causado por Ron
		hermione.recibirDano(dañoCausado); // nos cebamos con ella
		hermione.recibirDano(dañoCausado); // y la dejamos K.O.
		// Si ahora Hermione intenta lanzar un hechizo, no podrá porque está K.O.
		System.out.println(hermione.lanzarHechizo("Alohomora"));
		
		System.out.println("\n--- Venganza de Hermione (usamos entrenar() como novedad) ---\n");
		// Mejoramos a Hermiones su vida y mana para siguientes pruebas
		hermione.descansar();// descanso
		hermione.descansar();
		hermione.descansar();
		hermione.descansar();
		hermione.descansar();
		hermione.entrenar(); // entrenamiento
		hermione.entrenar();
		hermione.entrenar();
		hermione.descansar(); // más descanso
		hermione.descansar();
		hermione.descansar();
		// Ahora Hermione se vengará de Ron
		int venganza = hermione.lanzarHechizo("Alohomora");
		// como el daño causado es leve practicamos basico
		hermione.practicarBasico(); // Practicamos para reducir torpeza
		hermione.practicarBasico();
		hermione.practicarBasico();
		hermione.descansar(); // más descanso
		hermione.descansar();
		hermione.descansar();
		venganza = hermione.lanzarHechizo("Alohomora");
		// A por él!
		ron.recibirDano(venganza);
		ron.recibirDano(venganza);
		ron.recibirDano(venganza);
		ron.recibirDano(venganza);
	
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
		
		System.out.println(hermione.getVida()); // ojo la vida de hermione es mayor a 30
		
		System.out.println("¿Está arrestada Hermione?: " + nympha.arrestar(hermione));
		
		System.out.println("El Auror Nymphadora Tonks sigue teniendo "+ nympha.getArrestos() + " arrestos y su experiencia en combate sigue siendo de "+nympha.getExperienciaCombate());
	
		System.out.println("\n--- Uso métodos Profesores ---\n");
		
		System.out.println(snape.getAsignatura()); 
		snape.setAsignatura("Artes Oscuras"); // no me gusta la cambio
		System.out.println(snape.getAsignatura());
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
		harry.practicarBasico();
		harry.practicarBasico();
		harry.descansar();
		harry.descansar();
		harry.descansar();
		
		// Al ataque!!
		int ataqueHarry = harry.lanzarHechizo("Lumos");
		dumbledore.recibirDano(ataqueHarry);
		// Harry descansa porque se la ve venir
		harry.descansar();
		harry.descansar();
		harry.descansar();
		// Dumbledore responde!
		int ataqueDumble = dumbledore.lanzarHechizo("Stupefy");
		harry.recibirDano(ataqueDumble);
		// harry descansa y descansa
		harry.descansar();
		harry.descansar();
		// Ataca también a Ron y lo deja fuera de combate!
		ron.recibirDano(ataqueDumble);
		// Hermione se la ve venir y se pone a correr
		nympha.arrestar(hermione);
		// Tendrán que hacer un ataque conjunto para destruir a dumbledore
		harry.descansar();
		harry.descansar();
		harry.descansar();
		harry.descansar();
		hermione.descansar();
		hermione.descansar();
		hermione.descansar();
		hermione.practicarBasico();	
		hermione.practicarBasico();	
		hermione.practicarBasico();	
		int ataqueConjunto = harry.lanzarHechizo("Lumos") + hermione.lanzarHechizo("Alohomora");
		dumbledore.recibirDano(ataqueConjunto);
		
		System.out.println("\n--- HARRY Y HERMIONE GANAN LA BATALLA!! (YA SOLO HAY QUE BUSCAR QUIEN RESUCITARÁ A RON) ---\n");
		
	}

}
