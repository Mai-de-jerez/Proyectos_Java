package Arrays;
import java.util.Scanner;

public class BarquitosYosiris {

	public static void main(String[] args) {
		// Ejemplo de juego de hundir la flota	
		
		int[][] tablero = {
			    {0,0,0,0,1,1,1,1,0,0},
			    {0,0,0,0,0,0,0,0,0,0},
			    {0,0,0,1,0,0,1,0,0,0},
			    {0,0,0,0,0,0,1,0,0,0},
			    {0,0,0,0,0,0,1,0,0,0},
			    {0,0,0,0,0,0,0,0,0,0},
			    {1,1,0,0,0,0,1,0,1,1},
			    {0,0,0,0,0,0,0,0,0,0},
			    {0,0,0,1,1,1,0,0,0,0},
			    {0,0,0,0,0,0,0,0,0,0},
			};
	
		int aciertos = 0;
		int casillasRestantes = 0;
        
        // Contar el total de unos que hay que tocar al inicio
        for(int[] fila : tablero) {
            for(int casilla : fila) {
                if (casilla == 1) {
                    casillasRestantes++;
                }
            }
            
        }
        
        Scanner sc = new Scanner(System.in);
        
		do {
			//Codigo que imprime la matriz
			
			for(int i=0;i<tablero.length;i++) {
				
				for(int j=0;j<tablero[i].length;j++) {
					
					if(tablero[i][j] == 0) {
						System.out.print(" ~"); // agua
						
					}else if(tablero[i][j] == 1){
						System.out.print(" B"); // barco tocado
						
					}else if(tablero[i][j] == -1) {
						System.out.print(" X"); // agua ya disparada
	
					}else {
						System.out.print(" *"); // barco ya tocado
	
					}
					
					
				}
				System.out.println("");
			}
			
			
			// Pedir coordenadas al usuario
			int fila;
            int columna;
            
            // --- Validación de Fila ---
            do {
                System.out.print("Introduce fila (0-9): ");
                fila = sc.nextInt();
                 
                if (fila < 0 || fila > 9) { 
                    System.out.println("Entrada no valida, pruebe de nuevo."); 
                }

            } while (fila < 0 || fila > 9);

            // --- Validación de Columna ---
            do {
                System.out.print("Introduce columna (0-9): ");
                columna = sc.nextInt();
                
                if (columna < 0 || columna > 9) { 
                    System.out.println("Entrada no valida, pruebe de nuevo."); 
                }
         
            } while (columna < 0 || columna > 9);
			
			if(tablero[fila][columna] == 0) {
				
				System.out.println("Agua");
				tablero[fila][columna] = -1;
	
				
			}else if(tablero[fila][columna] == 1) {
				
				System.out.println("Tocado");
				tablero[fila][columna] = 9;
				aciertos++;
				casillasRestantes--;
				
			}else if(tablero[fila][columna] == 9) {
				System.out.println("Deja de gastar municion que ya lo has tocado");
	
			}else {
				System.out.println("Ese tiro ya lo hiciste");
			}
		
	        
		
		}while(casillasRestantes > 0);
		
		sc.close();	
        System.out.println("\n=============================================");
        System.out.println("🎉 ¡ENHORABUENA! HAS HUNDIDO TODOS LOS BARCOS.");
        System.out.println("Has necesitado " + aciertos + " aciertos para lograrlo.");
        System.out.println("=============================================");
              
	}
			
}


