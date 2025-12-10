package controlador;

import modelo.PsicoHistoriador;
import modelo.NaveEstelarFundacion;

public class Ejecucion {

	public static void main(String[] args) {
		
		// crear nuevo objeto historiador
		PsicoHistoriador historiador1 = new PsicoHistoriador("Lloyd deMause", 66); 
	
		// realizamos e imprimimos las predicciones
		System.out.println("\n--- PREDICCIONES ---");
		System.out.println(historiador1.realizarPrediccion()); 
		System.out.println(historiador1.realizarPrediccion());
		System.out.println(historiador1.realizarPrediccion());
		System.out.println(historiador1.realizarPrediccion());
		
		// llama al metodo evaluarRiesgoImperial() e imprimimos el mensaje
		System.out.println("\n--- EVALUACIÓN DE RIESGO ---");
		System.out.println(historiador1.evaluarRiesgoImperial());
		
		System.out.println("\n-----------------------------------------------------");
		
		// crear nueva nave (bueno 3)
		NaveEstelarFundacion nave1 = new NaveEstelarFundacion();
		NaveEstelarFundacion nave2 = new NaveEstelarFundacion("USS Entreprise","NCC-1701");
		NaveEstelarFundacion nave3 = new NaveEstelarFundacion("Nostromo", "CM-88B", 30, 3000, 25);
		
		// llamamos al metodo desplegar que imprime los mensajes
		System.out.println("\n--DESPLEGANDO NAVES--");
		
		System.out.println(nave1.desplegar());
		System.out.println(nave2.desplegar());
		System.out.println(nave3.desplegar()); 
		
		// vamos a ver el número de misiones completadas ahora aunque no lo pida el ejercicio
		System.out.println("\n--MISIONES COMPLETADAS--");
		
		System.out.println("Nave 1: "+nave1.getMisionesCompletadas());
		System.out.println("Nave 2: "+nave2.getMisionesCompletadas());
		System.out.println("Nave 3: "+nave3.getMisionesCompletadas());
		
		// vamos a registrar varias misiones para cada nave
		// para la nave 1
		nave1.registrarMision();
		nave1.registrarMision();
		nave1.registrarMision();
		nave1.registrarMision();
		nave1.registrarMision(); 
		// nave 2
		nave2.registrarMision();
		nave2.registrarMision();
		nave2.registrarMision();
		// nave 3
		nave3.registrarMision();
		nave3.registrarMision();
		
		// comprobamos que han aumentado el numero de misiones completadas tras registrar las que han ocurrido
		System.out.println("\n-- MISIONES COMPLETADAS TRAS REGISTROS NUEVOS --");
		
		System.out.println("Nave 1: "+nave1.getMisionesCompletadas());
		System.out.println("Nave 2: "+nave2.getMisionesCompletadas());
		System.out.println("Nave 3: "+nave3.getMisionesCompletadas());
		
		System.out.println("\n-----------------------------------------------------");
		
		
			
	} 

}
