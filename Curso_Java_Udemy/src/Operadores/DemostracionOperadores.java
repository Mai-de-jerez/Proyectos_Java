package Operadores;

public class DemostracionOperadores {

	public static void main(String[] args) {
		int a = 10;
        int b = 5;
        int c = 3;
        boolean x = true;
        boolean y = false;
        
        // -------------------------------------------------------------
        System.out.println("--- 1. OPERADORES ARITMÉTICOS/MATEMÁTICOS ---");
        // Los operadores aritméticos realizan cálculos matemáticos.
        
        int suma = a + b;           // Suma
        int resta = a - b;          // Resta
        int multiplicacion = a * b; // Multiplicación
        int division = a / b;       // División entera
        int modulo = a % c;         // Módulo (resto de la división)

        System.out.println("Suma (a + b): " + suma);
        System.out.println("Resta (a - b): " + resta);
        System.out.println("Multiplicación (a * b): " + multiplicacion);
        System.out.println("División (a / b): " + division);
        System.out.println("Módulo (a % c -> 10 % 3): " + modulo);
        
        System.out.println("-------------------------------------------------");
        
        // -------------------------------------------------------------
        System.out.println("--- 2. OPERADORES UNARIOS(INCREMENTO Y DECREMENTO) ---");
        // Operan sobre un solo operando.
        
        int negacion = -a;      // Negación unaria
        a++;                    // Incremento (post-incremento: usa A, luego suma 1)
        --b;                    // Decremento (pre-decremento: resta 1, luego usa B)
        boolean negacionLogica = !x; // Negación lógica (invierte el booleano)

        System.out.println("Negación (-a): " + negacion);
        System.out.println("a++ (A vale 10, ahora vale): " + a); 
        System.out.println("--b (B vale 5, ahora vale): " + b); 
        System.out.println("Negación lógica (!x): " + negacionLogica); 
        
        System.out.println("-------------------------------------------------");

        // -------------------------------------------------------------
        System.out.println("--- 3. OPERADORES DE RELACIÓN (COMPARACIÓN) ---");
        // Comparan dos valores y devuelven un booleano (true o false).
        
        boolean igual = (a == 11);     // Igual a
        boolean noIgual = (b != 4);    // Diferente de
        boolean mayor = (a > b);       // Mayor que
        boolean menorIgual = (c <= 3); // Menor o igual que

        System.out.println("a es igual a 11 (a == 11): " + igual);
        System.out.println("b es diferente de 4 (b != 4): " + noIgual);
        System.out.println("a es mayor que b (a > b): " + mayor);
        System.out.println("c es menor o igual a 3 (c <= 3): " + menorIgual);
        
        System.out.println("-------------------------------------------------");

        // -------------------------------------------------------------
        System.out.println("--- 4. OPERADORES LÓGICOS ---");
        // Combinan expresiones booleanas.
        
        // AND lógico (ambas deben ser true)
        boolean resultadoAND = x && y; 
        
        // OR lógico (al menos una debe ser true)
        boolean resultadoOR = x || y; 
        
        System.out.println("AND (x && y): " + resultadoAND);
        System.out.println("OR (x || y): " + resultadoOR);
        
        System.out.println("-------------------------------------------------");

        // -------------------------------------------------------------
        System.out.println("--- 5. OPERADORES DE ASIGNACIÓN ---");
        // Asignan un valor a una variable.
        
        int d = 20;     // Asignación simple (=)
        d += 5;         // Asignación de suma (d = d + 5)
        a *= 2;         // Asignación de multiplicación (a = a * 2)

        System.out.println("Asignación simple (d = 20): " + 20);
        System.out.println("Asignación de suma (d += 5, ahora d vale): " + d);
        System.out.println("Asignación de multiplicación (a *= 2, ahora a vale): " + a);
        
        System.out.println("-------------------------------------------------");

        // -------------------------------------------------------------
        System.out.println("--- 6. OPERADOR CONDICIONAL (TERNARIO) ---");
        // Es un atajo para un bloque if-else simple: (condición) ? valor_si_true : valor_si_false;
        
        String estado = (a > 20) ? "Mayor de 20" : "Menor o igual a 20";

        System.out.println("Resultado Ternario (a > 20): " + estado);
        
        System.out.println("-------------------------------------------------");

        // -------------------------------------------------------------
        System.out.println("--- 7. OPERADOR DE CONCATENACIÓN (TEXTO) ---");
        // El operador '+' no solo suma, también une cadenas de texto (Strings).
        
        String nombre = "Gemini";
        String mensaje = "Hola, mi nombre es " + nombre + " y estoy en el año " + 2025; 
        
        System.out.println(mensaje);
        
        // -------------------------------------------------------------
        
        System.out.println("--- 6. OPERADORES DE DESPLAZAMIENTO (SHIFT) ---");
        // Operan a nivel de bits (útiles para optimización o manejo de banderas).
        
        // 1. Desplazamiento a la Izquierda (<<)
        // a << 1: Mueve los bits de 'a' una posición a la izquierda.
        // Equivale a multiplicar por 2^n (10 * 2^1 = 20)
        int desplazamientoIzquierda = a << 1; 
        
        // 2. Desplazamiento a la Derecha con Signo (>>)
        // a >> 1: Mueve los bits de 'a' una posición a la derecha. 
        // Equivale a dividir por 2^n (10 / 2^1 = 5).
        // Mantiene el bit de signo (más a la izquierda).
        int desplazamientoDerechaSigno = a >> 1; 

        // 3. Desplazamiento a la Derecha sin Signo (>>>)
        // a >>> 1: Mueve los bits de 'a' una posición a la derecha. 
        // Rellena el espacio más a la izquierda SIEMPRE con un 0 (ignora el signo).
        // Se nota la diferencia principalmente con números negativos.
        int negativo = -10; // Binario: 1111 ... 0110
        int desplazamientoDerechaSinSigno = negativo >>> 2; 

        System.out.println("a (10) en binario: 0000 1010");
        System.out.println("Desplazamiento a la Izquierda (a << 1): " + desplazamientoIzquierda + " (Binario: 0001 0100)");
        System.out.println("Desplazamiento a la Derecha con Signo (a >> 1): " + desplazamientoDerechaSigno + " (Binario: 0000 0101)");
        System.out.println("Desplazamiento de Negativo sin Signo (-10 >>> 2): " + desplazamientoDerechaSinSigno);
        
        System.out.println("-------------------------------------------------");
    }
}

	
