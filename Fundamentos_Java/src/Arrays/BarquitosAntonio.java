package Arrays;
import java.util.Scanner;
public class BarquitosAntonio {
	// En este juego se cuenta cada 1 como un barco independiente.
	// El jugador debe llegar al numero de casillas acertadas que tocan barco para ganar.
	
	/**
	 * Funcion que retorna un numero entero.
	 * @param sc
	 * @return
	 */
	public static int dameNumero(Scanner sc) {
		int res;
		boolean ok = false;
		do {
		res = sc.nextInt();
			if(res >= 0 && res <=9) {
				ok = true;
			} else {
				ok = false;
				System.out.println("⚠️ Error: El número debe estar entre 0 y 9.");
			}
		}while(!ok);
		
		return res;
		
	}

	public static void main(String[] args) {
		// creacion del tablero
		
		int[][] tablero = {
			    {0,0,0,0,1,1,1,1,0,0},
			    {0,0,0,0,0,0,0,0,0,0},
			    {0,0,0,1,0,0,1,0,0,0},
			    {0,0,0,0,0,0,1,0,0,0},
			    {0,0,0,0,0,0,1,0,0,0},
			    {0,0,0,0,0,0,0,0,0,0},
			    {0,0,0,0,0,0,1,0,1,0},
			    {0,0,0,0,0,0,0,0,0,0},
			    {0,0,0,0,0,0,0,0,0,0},
			    {0,0,0,0,0,0,0,0,0,0},
			};
		Scanner sc = new Scanner(System.in);
		
		int aciertos = 0;
		
		System.out.println("Cuantos barcos quieres hundir para ganar");
		int barcos = dameNumero(sc);
		
	
		
		do {
			//Codigo que imprime la matriz
			for(int i=0;i<tablero.length;i++) {
				
				for(int j=0;j<tablero[i].length;j++) {
					
					if(tablero[i][j] == 0) {
						System.out.print(" ~");
					}else if(tablero[i][j] == 1){
						
						System.out.print(" B");
					}else if(tablero[i][j] == -1) {
						System.out.print(" X");
	
					}else {
						System.out.print(" *");
	
					}
					
					
				}
				System.out.println("");
			}
			
			
			System.out.print("Introduce fila (0-9): ");
	         int fila = dameNumero(sc);
	         System.out.print("Introduce columna (0-9): ");
	         int columna = dameNumero(sc);
			
			if(tablero[fila][columna] == 0) {
				
				System.out.println(" Agua");
				tablero[fila][columna] = -1;
	
				
			}else if(tablero[fila][columna] == 1) {
				
				System.out.println(" tocado");
				tablero[fila][columna] = 9;
				aciertos++;
				
			}else if(tablero[fila][columna] == 9) {
				System.out.println(" Deja de gastar municion que ya le has daso");
	
			}else{
				System.out.println(" Ese tiro ya lo hiciste");
			}
	
		
		}while(aciertos < barcos);
		
	}

}
