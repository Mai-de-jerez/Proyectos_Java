package Retos;

import java.util.Scanner;

public class Reto_3_3 {

	public static void main(String[] args) {
        
        // RETO 3 (PARTE 3): BUCLES Y ARRAYS
        // EJERCICIO 1: Elliot vs Evil Corp
		Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Elliot vs Evil Corp ---\n");
        
        // Elliot ha interceptado una lista con los balances de *Evil Corp*.
        // Con el siguiente array: int[] balances = {12000, -50, 5000, 15000, 0, -300, 800, 22000, 9999, 100};
        // Muestra:
		//        	- Cuántas cuentas tienen saldo negativo.
		//        	- Cuántas tienen saldo superior a 10 000 $.
		//        	- El saldo medio.
        
        int[] balances = {12000, -50, 5000, 15000, 0, -300, 800, 22000, 9999, 100};
        int contadornegativos=0;
        int contadorSuperiores=0;
        double sumaTotal=0;
        for (int i=0;i<balances.length;i++) {
        	sumaTotal+=balances[i];
        	  
        	
        	if (balances[i] < 0) {
                contadornegativos++;
            } else if (balances[i] > 10000) { 
                contadorSuperiores++;
            } 

        }
        
        double media = sumaTotal/balances.length;
        System.out.println("Hay en total: "+contadornegativos+" saldos negativos y "+contadorSuperiores+" saldos superiores a 10000 $.");
        System.out.println("El sueldo medio es:  "+media);
        System.out.println("\n-------------------------------------------------------------\n");
        
        // EJERCICIO 2: Backdoor Scanner
        
        System.out.println("\n--- Backdoor Scanner ---\n");
        // Darlene analiza si los servidores de Evil Corp están vulnerables.
        // Usa el siguiente array:  boolean[] vulnerables = {false, true, false, false, true, false, true, false};
        // Muestra: Cuántos servidores son vulnerables (`true`) Y en qué posiciones están.
        boolean[] vulnerables = {false, true, false, false, true, false, true, false};
        int contadorVulnerables=0;
        
        for (int i=0;i<vulnerables.length;i++) {
        	if(vulnerables[i] == true) {
        		contadorVulnerables++;
        		System.out.println("En la posición: "+i); 
        		
        	}
     
        }
        System.out.println("\nHay "+contadorVulnerables+" servidores vulnerables");	
  
        System.out.println("\n-------------------------------------------------------------\n");
        
        // EJERCICIO 3: Password Audit
        System.out.println("\n--Password Audit--\n");
        // Elliot encuentra las siguientes contraseñas antiguas de Evil Corp:
        // String[] passwords = {"admin123", "e@mpl3", "supersecure99", "pass", "root@2020"};
        // Cuántas contienen el carácter `@`.
        // Cuántas tienen más de 8 caracteres.
        // Cuántas terminan en un número.
        // Cuál es la más larga.	
        String[] passwords = {"admin123", "e@mpl3", "supersecure99", "pass", "root@2020"};
        int sumarrobas =0;
        int sumalargas=0;
        int sumanumeros=0;
        String masLarga = passwords[0]; // admin123 la más larga de momento
        
        for (int i=0; i<passwords.length;i++) {
        	if (passwords[i].contains("@")) {
        		sumarrobas++;
        	}
        	if (passwords[i].length() > 8) {
        		sumalargas++;
        	}
        	
        	int ultimoIndice = passwords[i].length() - 1;
        	
        	if (Character.isDigit(passwords[i].charAt(ultimoIndice))) {
        		sumanumeros++;
        	}
        	
        	if (passwords[i].length() > masLarga.length()) {
                masLarga = passwords[i];
            }
        	
        }
        System.out.println("Hay "+sumarrobas+ " contraseñas que contienen arrobas, "+sumalargas+" que contienen más de 8 caracteres, y "
        +sumanumeros+" que acaban en un número. \nLa contraseña más larga es: "+masLarga);
        scanner.close();
        
        System.out.println("\n-------------------------------------------------------------\n");
        
        // EJERCICIO 4: Hack the Gibson
        System.out.println("\n--Hack the Gibson--\n");
        // Simula los niveles de éxito de los ataques de Elliot con el siguiente array:
        int[] intentos = {82, 13, 45, 79, 90, 5, 33, 72, 18, 65, 40, 100, 29, 10, 67, 55, 88, 60, 14, 3};
        // Muestra: 
        // - El valor máximo y el mínimo.
        // - Cuántos intentos fueron “exitosos” (más de 70).
        // - Si todos son menores de 30, muestra “Mr Robot sospecha que estás desconectado”.
  
        int maximo = intentos[0]; 
        int minimo = intentos[0];
        int exitosos = 0;
        int contadormenoresde30 = 0;
		for(int i = 0; i<intentos.length;i++) {
			maximo = Math.max(intentos[i],maximo);
			minimo = Math.min(intentos[i],minimo);
			if (intentos[i] > 70) {
				exitosos++;			
			} 
		    if (intentos[i] < 30) {
				contadormenoresde30++;
			}
		}
		
		
		System.out.println("\nEl máximo de intentos fueron "+maximo+" intentos, y el mínimo de intentos fueron "+minimo+" intentos.");
		System.out.println("\nEl número de intentos exitosos fueron: "+exitosos);
		if (contadormenoresde30==intentos.length) {
	    	System.out.println("\nMr Robot sospecha que estás desconectado.");
	    }
		
		System.out.println("\n-------------------------------------------------------------\n");
		
		// EJERCICIO 5: Logs del Servidor
		System.out.println("\n--Logs del Servidor--\n");
		// Angela revisa los registros de acceso de un servidor:
		String[] logs = {"OK", "ERROR", "OK", "OK", "ERROR", "OK", "ERROR", "ERROR", "OK", "OK"};
		// Cuenta:
		// - Cuántos accesos fueron `"OK"`.
		// - Cuántos `"ERROR"`.
		// - Si hay más errores que accesos correctos, muestra “Servidor en peligro”.
		int sumaOK = 0;
		int sumaERROR = 0;
		for(int i=0; i < logs.length;i++) {
			if (logs[i].equals("ERROR")) {
				sumaERROR++;
			} else {
				sumaOK++;
			}	
		}
		
		System.out.println("Hay "+sumaERROR+ " accesos fallidos y "+sumaOK+" accesos exitosos.");
		
		if(sumaERROR>sumaOK) {
			System.out.println("Servidor en peligro.");
		}
		System.out.println("\n-------------------------------------------------------------\n");
		
        
		// EJERCICIO 6: Temperaturas del Servidor
		System.out.println("\n--Temperaturas del Servidor--\n");
		// Durante un ataque, Elliot monitoriza las temperaturas del servidor:
		int[] temperaturas = {45, 49, 52, 57, 60, 59, 55, 48, 46, 50};
		// Calcula:
		// - La temperatura media.
		// - Cuántas mediciones superan los 55 °C.
		// - Si todas las temperaturas están por debajo de 60 °C, muestra “Sistema estable”; si alguna es 60 o más, 
		// muestra “¡Sobrecalentamiento detectado!”.
		double sumatemperaturas = 0;
		int masDe55 = 0;
		boolean sobrecalentamientoDetectado = false;
		
		for (int temperatura : temperaturas) { 
		    
		    sumatemperaturas += temperatura; 
		    
		    // 2. Conteo > 55 (Siempre se comprueba)
		    if (temperatura > 55) {
		        masDe55++;  
		    }
		
		    if (temperatura >= 60) {
		        sobrecalentamientoDetectado = true; 
		    }
		} 
		
		double mediatemperaturas = sumatemperaturas/temperaturas.length;
		System.out.println("\nLa temperatura media es: "+mediatemperaturas);
		System.out.println("\nHay "+masDe55+ " mediciones que superan los 55 grados."); 
		// Usa el flag para la comprobación final
		if (!sobrecalentamientoDetectado) {
			System.out.println("\nSistema estable.");
		} else {
			System.out.println("\n¡Sobrecalentamiento detectado!");
		}
		
		System.out.println("\n-------------------------------------------------------------\n");
		
		
        
        // EJERCICIO 7: DDoS Simulator
        System.out.println("\n--DDoS Simulator--");
        // Durante un ataque DDoS, se registran los siguientes tiempos de respuesta (en ms):
        int[] tiempos = {200, 540, 720, 150, 950, 330, 480, 510, 870, 610};
        // Muestra:
        // - La media, el máximo y el mínimo.
        // - Si más del 60 % supera los 500 ms, muestra “Servidor saturado”.
        // - Si menos del 10 % supera los 200 ms, muestra “Ataque fallido”.
        double totales =0;
        int max = tiempos[0]; 
        int min = tiempos[0];
        double sesentaPorCiento = tiempos.length * 0.6;
        double diezPorCiento = tiempos.length * 0.1;
        int masde500 = 0;
        int masde200 = 0;
        
        for (int i=0; i<tiempos.length;i++) {
        	totales += tiempos[i];
        	max = Math.max(tiempos[i],max);
			min = Math.min(tiempos[i],min);
			 
			if (tiempos[i]>500) {
				masde500++;
			}
			if (tiempos[i]>200) {
				masde200++;
			}
        	     	
        }
        
        if (masde200<diezPorCiento) {
        	System.out.println("\nAtaque fallido");
        }
        
        if (masde500>sesentaPorCiento) {
        	System.out.println("\nServidor saturado");
        }
        
        double mediatiempos = totales/tiempos.length;
        System.out.println("\nMedia: "+mediatiempos+"\nMínimo: "+min+"\nMáxima: "+max);
        

	}

}
