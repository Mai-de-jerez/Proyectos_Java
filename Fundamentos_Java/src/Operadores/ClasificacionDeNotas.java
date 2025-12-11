package Operadores;

import java.util.Scanner;

public class ClasificacionDeNotas {

    public static void main(String[] args) {
        
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
