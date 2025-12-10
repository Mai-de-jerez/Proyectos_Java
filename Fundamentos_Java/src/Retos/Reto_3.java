package Retos;
import java.util.Random;
import java.util.Scanner;

public class Reto_3 {

	public static void main(String[] args) {
		// EJERCICIO 1: Recuento del lote de robots
		// RoboTech fabrica 1000 robots en un día. Cada robot tiene una calidad entre 0 y 100 (número aleatorio).
		// FutureCorp solo acepta robots con calidad mayor o igual que 85.
		int totalRobots = 1000;
		int robotsAceptados = 0;
		Random random = new Random();
		for (int i = 0; i < totalRobots; i++) {
			int calidad = random.nextInt(101); // Calidad entre 0 y 100
			if (calidad >= 85) {
				robotsAceptados++;
			}
		}
		System.out.println("\nRobots aceptados por FutureCorp: " + robotsAceptados);
		System.out.println("\n----------------------------------------------------------------------\n");
		
		// EJERCICIO 2: ## Hasta conseguir un robot PERFECTO
		// RoboTech quiere presumir de calidad y necesita fabricar un robot perfecto (calidad 100).
		int intentos = 0;
		int calidadRobot;
		do {
			calidadRobot = random.nextInt(101); // Calidad entre 0 y 100
			intentos++;
		} while (calidadRobot < 100);
		
		System.out.println("Se han necesitado " + intentos + " intentos para fabricar un robot PERFECTO (calidad 100).");		
		System.out.println("\n----------------------------------------------------------------------\n");
		
		// Ejercicio 3: ## Producción hasta 500 robots buenos
		// RoboTech tiene un contrato: entregar 500 robots buenos (calidad ≥ 85). 
		// No se sabe cuántos robots habrá que fabricar en total.
		
		int Necesarios = 500;
		int Buenos = 0;
		int totalFabricados = 0;
		while (Buenos < Necesarios) {
			int calidad = random.nextInt(101); // Calidad entre 0 y 100
			totalFabricados++;
			if (calidad >= 85) {
				Buenos++;
			}
		}
		
 		System.out.println("Para conseguir " + Necesarios + " robots buenos, se han fabricado un total de " + totalFabricados + " robots.");
 		System.out.println("\n----------------------------------------------------------------------\n");
 		
 		// EJERCICIO 4: ## Análisis por lotes de producción
 		// La fábrica divide el trabajo en 10  lotes de 100 robots cada uno. 
 		// Se quiere saber cuántos robots buenos (calidad ≥ 85) hay en cada lote.
 		int lotes = 10;
 		int robotsPorLote = 100;
 		for (int lote = 1; lote <= lotes; lote++) {
 			int buenosEnLote = 0;
 			for (int j = 0; j < robotsPorLote; j++) {
 				int calidad = random.nextInt(101); // Calidad entre 0 y 100
 				if (calidad >= 85) {
 					buenosEnLote++;
 				}
 			}
 			
 			System.out.println("Lote " + lote + ": Robots buenos = " + buenosEnLote);
 		}
 		System.out.println("\n----------------------------------------------------------------------\n");
 		
 		// EJERCICIO 5:## Promedio de calidad de la jornada
		// Durante una jornada se fabrican 1000 ROBOTS.
		// Interesa conocer la calidad media del total producido.
 		
 		int sumaCalidad = 0;
 		for (int i = 0; i < totalRobots; i++) {
 			int calidad = random.nextInt(101); // Calidad entre 0 y 100
 			sumaCalidad += calidad;
 		}
 		double calidadMedia = (double) sumaCalidad / totalRobots;
 		System.out.printf("\nCalidad media de la jornada: %.2f\n", calidadMedia);
 		System.out.println("\n----------------------------------------------------------------------\n");
 		
 		
 		/*
		EJEMPLO 1: “Recuento del lote de robots”
		RoboTech fabrica 1000 robots en un día.
		
		Cada robot tiene una calidad entre 0 y 100 (número aleatorio).
		
		FutureCorp solo acepta robots con calidad mayor o igual que 85.
		
		Simula la fabricación de los 1000 robots.
		Cuenta cuántos cumplen la calidad mínima.


		Robots totales
		
		Robots válidos para FutureCorp
		*/
				
		
		Scanner sc = new  Scanner(System.in);
		
		Random aleatorio = new Random();
		int ok=0;
		int calidad;
		int malos;
		System.out.println("Dime el numero total para fabricar:");
		int total= sc.nextInt();
	
		for(int i=0;i<total;i++) {
			
			    
				calidad = aleatorio.nextInt(101);
				
				if(calidad >= 85 ) {
					ok++;
				}			
		}
		
		malos = total-ok;
		
		System.out.println("Malos: "+malos+"\nBuenos: "+ok+"\nRobots totales fabricados: "+total);
 		 
		sc.close();

	}

}
