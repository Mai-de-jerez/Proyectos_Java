package Operadores;

public class VerificacionAcceso {

    public static void main(String[] args) {
        
        // --- Persona 1 ---
        int edad1 = 19;
        boolean tieneID1 = true;
        boolean pagoSuscripcion1 = false;
        
        // 1. EVALUACIÓN DE REGLAS para Persona 1
        
        // Regla 3: Acceso Total = (Edad >= 18) AND (Tiene ID) AND (Pagó Suscripción)
        boolean accesoTotal1 = (edad1 >= 18) && tieneID1 && pagoSuscripcion1;
        
        // Regla 4: Acceso Básico = (Edad >= 18) AND (Tiene ID) AND NOT (Pagó Suscripción)
        boolean accesoBasico1 = (edad1 >= 18) && tieneID1 && !pagoSuscripcion1;

        
        // --- Persona 2 ---
        int edad2 = 25;
        boolean tieneID2 = false;
        boolean pagoSuscripcion2 = true;
        
        // 2. EVALUACIÓN DE REGLAS para Persona 2
        
        // Regla 3: Acceso Total
        boolean accesoTotal2 = (edad2 >= 18) && tieneID2 && pagoSuscripcion2;
        
        // Regla 4: Acceso Básico
        boolean accesoBasico2 = (edad2 >= 18) && tieneID2 && !pagoSuscripcion2;
        
        
        // 3. MOSTRAR RESULTADOS
        System.out.println("--- RESULTADOS PERSONA 1 ---");
        System.out.println("¿Edad suficiente y tiene ID? " + ((edad1 >= 18) && tieneID1)); 
        System.out.println("Acceso TOTAL (Regla 3): " + accesoTotal1); 
        System.out.println("Acceso BÁSICO (Regla 4): " + accesoBasico1); 
        
        System.out.println("\n--- RESULTADOS PERSONA 2 ---");
        System.out.println("¿Edad suficiente y tiene ID? " + ((edad2 >= 18) && tieneID2));
        System.out.println("Acceso TOTAL (Regla 3): " + accesoTotal2); 
        System.out.println("Acceso BÁSICO (Regla 4): " + accesoBasico2); 
    }
}
