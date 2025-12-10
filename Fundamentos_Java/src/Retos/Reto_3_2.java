package Retos;

import java.util.Random;

public class Reto_3_2 {

	public static void main(String[] args) {
// RETO 3 (PARTE 2): BUCLES
        
        // Ejercicio 1: EL RECUENTO DEL LOTE
        // Walter White y Jesse Pinkman han cocinado **1000 pastillas de "mentaanfetamienta"** en su caravana.
        // Cada pastilla tiene una **calidad aleatoria entre 0 y 100**.
        // El “señor del pollo” (Gus Fring) solo acepta aquellas con **calidad mayor o igual que 90**.
        // Calcular cuántas pastillas tienen una calidad superior a 90.
        // Usa `Random` para generar números del 0 al 100.
        // Usa un `for` para simular las 1000 pastillas.
        // Usa un contador para las “buenas”.
        
		
		Random random = new Random();
		
        int pastillas =1000;
        int pastillasValidas = 0;
        for (int i = 1; i<= pastillas; i++) {
        	int calidad = random.nextInt(101);
        	if (calidad > 90) {
        		pastillasValidas++;
        	}
        }
        
        System.out.println("Pastillas totales: "+pastillas);
        System.out.println("De calidad superior: "+pastillasValidas);
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        
        // Ejercicio 2: HASTA LOGRAR LA RECETA PERFECTA
        // Walter repite la cocción hasta que consiga **una pastilla con calidad 100**.
        // Genera números aleatorios entre 0 y 100.
        // Detén el bucle cuando salga 100.
        // Muestra cuántos intentos necesitó.
        
        int calidad = 0;
        int numintentos = 0;
        while (calidad != 100) {
        	calidad = random.nextInt(101);
        	numintentos++;     	
        }
        
        System.out.println("¡Perfecta! Calidad 100 obtenida tras "+numintentos+" intentos."); 
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        // Ejercicio 3: LA PRODUCCIÓN NOCTURNA
        // Walter y Jesse producen pastillas hasta llegar a **1000 unidades buenas (≥90)**.
        // Muestra cuántas totales han hecho (incluyendo las malas).
        int pastillasbuenas = 0;
        int pastillastotales = 0;
        while (pastillasbuenas < 1000) {
        	pastillastotales++;
        	int calidadPastilla = random.nextInt(101);
        	if (calidadPastilla >= 90) {
        		pastillasbuenas++;
        	}
        }
        
        System.out.println("\nPara conseguir 1000 pastillas buenas, produjeron un total de "+pastillastotales);
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        // Ejercicio 4: EL ANÁLISIS POR LOTES
        // Dividir la producción en 10 lotes de 100 pastillas y mostrar cuántas buenas hay en cada lote.
        int numLotes = 10;
        int pastillasPorLote = 100;
        System.out.println("--- ANÁLISIS POR LOTES ---");
        for (int i = 1; i <= numLotes; i++) {
        	int pastillasbuenasporlote = 0;
        	for (int j= 1; j<=pastillasPorLote; j++) {
        		int buenas = random.nextInt(101);
        		if (buenas >= 90) {
            		pastillasbuenasporlote++;
            	}  		     		
        	}
        	
        	System.out.println("\nLote " +i+ "-> "+pastillasbuenasporlote+" pastillas buenas."); 
        }
        
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        
        // Ejercicio 5: PROMEDIO DE CALIDAD
        
        // Calcular el promedio total de calidad de las 1000 pastillas.
        
        int pastis =1000;
        double sumapromedios = 0.0;
        for (int i = 1; i<= pastis; i++) {
        	int calidades = random.nextInt(101);
        	sumapromedios += calidades;
        	
        }
        
        double calidadPromedio = sumapromedios /1000;
        System.out.printf("\nPromedio de calidad general: %.2f\n",calidadPromedio);
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        // Ejercicio 6: LA INSPECCIÓN DE GUS FRING
        //  Genera pastillas hasta tener 500 buenas, pero cada vez que salgan 50 malas seguidas, muestra:
        // 🔥 Gus Fring sospecha del laboratorio...
        
        int pastisbuenas = 0;
        int pastistotales = 0;
        int malasConsecutivas = 0;
        
   
        while (pastisbuenas < 500) {
            pastistotales++; 
            int calidadPastis = random.nextInt(101);
            
            if (calidadPastis >= 90) {
                pastisbuenas++;
                malasConsecutivas = 0; // Reiniciamos porque significa que no llegó nunca a 50 la racha.
                
            } else {
                malasConsecutivas++; 
     
                if (malasConsecutivas == 50) {
                    System.out.println("\n🔥 Gus Fring sospecha del laboratorio... (Pastillas totales: " + pastistotales + ")");
       
                    malasConsecutivas = 0; // Otra vez se reinicia para volver a contar racha de malas consecutivas.
                }
            }
        }
  
        System.out.println("\n--- OBJETIVO CUMPLIDO ---");
        System.out.println("Total de pastillas buenas conseguidas: " + pastisbuenas);
        System.out.println("Total de pastillas producidas (buenas y malas): " + pastistotales);

	}

}
