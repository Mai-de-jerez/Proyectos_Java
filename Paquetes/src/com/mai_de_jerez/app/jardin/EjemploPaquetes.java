package com.mai_de_jerez.app.jardin;

import com.mai_de_jerez.app.hogar.*;

import static com.mai_de_jerez.app.hogar.Persona.*;
import static com.mai_de_jerez.app.hogar.ColorPelo.*;



public class EjemploPaquetes {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.setNombre("Andrés");
		p.setApellido("Guzmán");
		p.setColorPelo(CAFE);
		System.out.println(p.getNombre()+ " " +p.getApellido());

		// Gato g = new Gato(); <= ya no se puede usar porque es default no public
		Perro perro = new Perro();
		perro.nombre = "Tobby";
		perro.raza = "Bulldog" ;
		
		String jugando = perro.jugar(p);		
		System.out.println(jugando);		
		String saludo = saludar();	
		System.out.println(saludo);
		
		String generoMujer = GENERO_FEMENINO;
		System.out.println(generoMujer);
	
		String generoHombre = GENERO_MASCULINO;
		System.out.println(generoHombre);
	}

}
