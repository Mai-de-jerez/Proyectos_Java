package Operadores;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        //Ejemplo 1: verificación de acceso
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
        
        // Ejemplo 2: Clasificar notas de estudiantes
        
        Scanner lector = new Scanner(System.in);
        System.out.println("--- CLASIFICADOR DE NOTAS ---");
        System.out.print("Ingresa la nota (0 a 10): ");
        double nota = lector.nextDouble();
        
        String clasificacion; // Variable para guardar el texto de la clasificación
        
        // 1. Validar la nota (opcional, pero buena práctica)
        if (nota < 0 || nota > 10) { // Usa el operador OR Lógico (||)
            clasificacion = "ERROR: La nota debe estar entre 0 y 10.";
        }
        
        // 2. Evaluaciones de Rangos (De mayor a menor, es más limpio)
        else if (nota >= 9.0) { // ¿Mayor o igual a 9.0?
            clasificacion = "Sobresaliente";
        }
        
        // El programa solo llega aquí si la nota es MENOR que 9.0.
        else if (nota >= 7.0) { // ¿Mayor o igual a 7.0?
            // Aquí la nota está entre 7.0 y 8.999...
            clasificacion = "Notable";
        }
        
        // El programa solo llega aquí si la nota es MENOR que 7.0.
        else if (nota >= 5.0) { // Condición para APROBADO (Mayor o igual a 5.0)
            clasificacion = "Aprobado";
        }
        
        // El programa solo llega aquí si la nota es MENOR que 5.0.
        else {
            clasificacion = "Suspenso";
        }
        
        // 3. Mostrar Resultado
        System.out.println("La clasificación de la nota " + nota + " es: " + clasificacion);
        
        lector.close();
    }
}
