package Arrays;
import java.util.Scanner;

public class BarquitosGemini {
	
	// =========================================================================
	// 1. ESTRUCTURAS DE DATOS (Inteligencia Oculta)
	// =========================================================================
	
	public static final int NUM_TOTAL_BARCOS = 9;

	// MAPA DE ID OCULTO (Correcto para los 9 barcos de la plantilla)
	// Indica qué barco (ID 1-9) está en cada casilla '1' del tablero.
	public static final int[][] BARCO_ID_MAP = {
	    {0,0,0,0,1,1,1,1,0,0}, 
	    {0,0,0,0,0,0,0,0,0,0},
	    {0,0,2,2,0,0,3,0,0,0}, 
	    {0,0,0,0,0,4,0,0,0,0}, 
	    {0,0,0,0,5,0,0,0,0,0}, 
	    {0,0,0,6,0,0,0,0,0,7}, 
	    {0,0,0,0,8,8,8,8,0,7}, 
	    {0,0,0,0,0,0,0,0,0,7}, 
	    {0,0,0,0,0,0,0,0,0,7}, 
	    {9,9,0,0,0,0,0,0,0,7}, 
	};
	
	// ESTADO DE BARCOS: [Tamaño Total, Casillas Tocadas]
	// El índice corresponde al ID del barco (1 a 9).
	public static final int[][] ESTADO_BARCOS = {
	    {0, 0}, // Índice 0 (No usado)
	    {4, 0}, // Barco 1 (F0)
	    {2, 0}, // Barco 2 (F2)
	    {1, 0}, // Barco 3 (F2)
	    {1, 0}, // Barco 4 (F3)
	    {1, 0}, // Barco 5 (F4)
	    {1, 0}, // Barco 6 (F5)
	    {5, 0}, // Barco 7 (Vertical)
	    {4, 0}, // Barco 8 (F6)
	    {2, 0}  // Barco 9 (F9)
	};
	
	// =========================================================================
	// 2. FUNCIÓN DE ENTRADA ROBUSTA
	// =========================================================================
	
	// Función que retorna un número entero (0-9) validado.
	// @param sc El objeto Scanner para la entrada.
	// @return El número entero válido.
	 		
	public static int dameNumero(Scanner sc) {
	    int res;
	    boolean ok = false;
	    
	    do {
	    	// Protección contra texto: Bucle para forzar que sea un entero
	    	while (!sc.hasNextInt()) { 
                System.out.print("❌ ERROR: Introduce SÓLO números enteros (0-9). Vuelve a intentar: ");
                sc.next(); 
            }
	    	
	        res = sc.nextInt(); 

	        // Validación de rango (0-9)
	        if(res >= 0 && res <= 9) {
	            ok = true; 
	        } else {
	            System.out.println("⚠️ ¡Error! El número " + res + " no es válido. Debe ser un número entre 0 y 9. Inténtalo de nuevo:");
	        }		
	    } while(!ok); 
	    
	    return res;
	}
	
	// =========================================================================
	// 3. MÉTODO PRINCIPAL
	// =========================================================================
	
	public static void main(String[] args) {
		
		// Tablero visible para el jugador
		int[][] tablero = {
			    {0,0,0,0,1,1,1,1,0,0},
			    {0,0,0,0,0,0,0,0,0,0},
			    {0,0,1,1,0,0,1,0,0,0},
			    {0,0,0,0,0,1,0,0,0,0},
			    {0,0,0,0,1,0,0,0,0,0},
			    {0,0,0,1,0,0,0,0,0,1},
			    {0,0,0,0,1,1,1,1,0,1},
			    {0,0,0,0,0,0,0,0,0,1},
			    {0,0,0,0,0,0,0,0,0,1},
			    {1,1,0,0,0,0,0,0,0,1},
			};
		
		Scanner sc = new Scanner(System.in);
		
		int barcosHundidos = 0; 
		int objetivoBarcos = 0;
		
		// Copia mutable del estado de barcos
        int[][] estadoBarcosJuego = new int[ESTADO_BARCOS.length][ESTADO_BARCOS[0].length];
        for(int i = 0; i < ESTADO_BARCOS.length; i++) {
            System.arraycopy(ESTADO_BARCOS[i], 0, estadoBarcosJuego[i], 0, ESTADO_BARCOS[0].length);
        }
		
		// Validación de Objetivo
        do {
            System.out.print("¿Cuántos BARCOS quieres hundir para ganar? (Máximo " + NUM_TOTAL_BARCOS + "): ");
            
            while (!sc.hasNextInt()) { 
                System.out.print("❌ ERROR: Introduce SÓLO números enteros. Vuelve a intentar: ");
                sc.next(); 
            }
            objetivoBarcos = sc.nextInt();

            if (objetivoBarcos >= 1 && objetivoBarcos <= NUM_TOTAL_BARCOS) {
                break; 
            } else {
                System.out.println("⚠️ ERROR: El objetivo debe ser entre 1 y " + NUM_TOTAL_BARCOS + ".");
            }
        } while (true); 
        
        System.out.println("\n--- ¡Empieza el juego! Objetivo: Hundir " + objetivoBarcos + " barcos. ---");
	
		
		do {
		// Imprimir la matriz (Ocultando el barco '1', mostrando '~', 'X', '*')
		System.out.println("\n   0 1 2 3 4 5 6 7 8 9");
		System.out.println("  --------------------");
		for(int i=0;i<tablero.length;i++) {
			System.out.print(i + " |");
			for(int j=0;j<tablero[i].length;j++) {
				
				int valor = tablero[i][j];
				
				if(valor == 0 || valor == 1) { // 0=Agua, 1=Barco (oculto)
					System.out.print(" ~");
					
				}else if(valor == -1) {
					System.out.print(" X"); // Agua fallada

				}else { // Si es 9 (tocado)
					System.out.print(" *");

				}
			}
			System.out.println("");
		}
		
		
		System.out.print("\nIntroduce fila (0-9): ");
         int fila = dameNumero(sc);
         System.out.print("Introduce columna (0-9): ");
         int columna = dameNumero(sc);
		
         // Lógica de Hundimiento por Unidad de Barco
         if(tablero[fila][columna] == 0) {
			
			System.out.println("💧 ¡Agua!");
			tablero[fila][columna] = -1; // Marcar como agua fallada

			
		}else if(tablero[fila][columna] == 1) { // ¡Es un barco vivo!
			
			int idBarco = BARCO_ID_MAP[fila][columna]; // Obtenemos el ID del barco real
			
			// 1. Marcar la casilla como tocada
			tablero[fila][columna] = 9; 
			
			// 2. Registrar el impacto en el estado OCULTO del barco
			estadoBarcosJuego[idBarco][1]++; 
			
			int tocadas = estadoBarcosJuego[idBarco][1];
            int tamano = estadoBarcosJuego[idBarco][0];

			// 3. COMPROBAR HUNDIDO O TOCADO
            if (tocadas == tamano) {
                barcosHundidos++;
                System.out.println("💥 ¡BARCO HUNDIDO! (Barco " + idBarco + ") Totalmente destruido.");
            } else {
                System.out.println("🎯 ¡Tocado!");
            }
			
		}else if(tablero[fila][columna] == 9) {
			System.out.println("🚫 Deja de gastar munición, ¡ya le has dado a ese punto!");

		}else{ // Caso -1
			System.out.println("🌊 Ese tiro ya lo hiciste (al agua).");
		}
	
	
		System.out.println("\nBarcos Hundidos: " + barcosHundidos + " / " + objetivoBarcos);
		
		// Condición de victoria: se repite MIENTRAS queden barcos por hundir
		}while(barcosHundidos < objetivoBarcos); 
		
		// Mensaje de Victoria
        System.out.println("\n=============================================");
        System.out.println("🎉 ¡ENHORABUENA! HAS GANADO AL HUNDIR " + barcosHundidos + " BARCOS.");
        System.out.println("=============================================");
		
		sc.close();
		
		
	
    }
}
	


