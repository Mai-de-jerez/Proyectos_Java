package Operadores;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("--- IDENTIFICADOR DE NÚMERO PAR/IMPAR ---");
        System.out.print("Ingresa un número entero: ");
        
        // 1. Leer el número entero
        int numero = lector.nextInt(); 
        
        // 2. Aplicar el MÓDULO (%)
        // El operador % devuelve el RESTO de la división.
        // Si (numero % 2) es 0, el número es divisible por 2, por lo tanto, PAR.
        int resto = numero % 2; 
        
        // 3. CONTROL DE FLUJO: Evaluar el resto con if-else
        
        // Si el resto de la división por 2 es EXACTAMENTE igual a 0
        if (resto == 0) { 
            System.out.println("El número " + numero + " es PAR.");
        } 
        // Si el resto no es 0, por descarte solo puede ser 1 (o -1 si es negativo)
        else {
            System.out.println("El número " + numero + " es IMPAR.");
        }
        
        lector.close();
    }
}