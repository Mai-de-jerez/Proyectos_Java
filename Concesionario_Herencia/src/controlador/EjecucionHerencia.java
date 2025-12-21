package controlador;

import modelo.Camion;
import modelo.Propietario;
import modelo.Propulsion;
import modelo.Taxi;
import modelo.Tipo;



public class EjecucionHerencia {

	public static void main(String[] args) {
		
		Propietario juan = new Propietario("Juan", "Jiménez");
		Propietario eva = new Propietario("Eva", "Lunas");
		Camion cam1 = new Camion("kok","hok", "ert", juan, 700, Tipo.ABIERTO);
		Taxi taxi1 = new Taxi("kok","hok", "ert", eva, 4, 5, "taximar", Propulsion.ELECTRICO );
		
		
		
		System.out.println(taxi1);
		System.out.println(cam1); 
		
		
		
		
			
	}

}
