package Operadores;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// Creamos el objeto scanner para leer entradas por consola.
		Scanner lector = new Scanner(System.in);
		
		// Ejemplo 1: calcular el salario neto de un empleado
		
		// 1. DECLARACIÓN DE VARIABLES (Valores iniciales)
        // Usamos 'double' para manejar los decimales del dinero.
        double salarioBruto = 2500.0; 
        
        // Usamos 'final double' para las constantes que no cambian (los porcentajes)
        final double TASA_IRPF = 0.15; // 15% de Impuesto
        final double TASA_SEGURIDAD_SOCIAL = 0.04; // 4% de Seguridad Social
        double bonoProductividad = 150.0; 

  
        System.out.println("--- CÁLCULO DE SALARIO NETO ---");
        System.out.println("Salario Bruto Inicial: " + salarioBruto + "€");
        System.out.println("Tasa IRPF: " + (TASA_IRPF * 100) + "%");
        System.out.println("Tasa Seguridad Social: " + (TASA_SEGURIDAD_SOCIAL * 100) + "%");
        System.out.println("Bono por Productividad: " + bonoProductividad + "€");
        System.out.println("----------------------------------------------");

        
        // Calculamos el monto de la retención del IRPF (2500 * 0.15)
        double retencionIRPF = salarioBruto * TASA_IRPF; 
        
        // Calculamos el monto de la retención de la Seguridad Social (2500 * 0.04)
        double descuentoSS = salarioBruto * TASA_SEGURIDAD_SOCIAL; 
        
        // Sumamos ambas retenciones para ver el descuento total
        double descuentoTotal = retencionIRPF + descuentoSS;
        
        
        // 3. APLICAR DESCUENTOS (Operador Aritmético: -)
        
        // Calculamos el salario después de aplicar los descuentos
        double salarioDescontado = salarioBruto - descuentoTotal;
        
        
        // 4. APLICAR EL BONO (Operador de Asignación: +=)
        
        // Sumamos el bono de productividad al salario que queda.
        // Esto es un atajo para: salarioDescontado = salarioDescontado + bonoProductividad;
        salarioDescontado += bonoProductividad; 
        
        
        // MOSTRAR RESULTADOS (Operador de Concatenación: +)
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("1. Descuento IRPF (-15%): -" + retencionIRPF + "€");
        System.out.println("2. Descuento SS (-4%): -" + descuentoSS + "€");
        System.out.println("3. Total Retenido: -" + descuentoTotal + "€");
        System.out.println("EL SALARIO NETO FINAL ES: " + salarioDescontado + "€");
        
        System.out.println("----------------------------------------------");
        
        // Ejemplo 2 : identificar si un número es par o impar
        
        System.out.println("--- IDENTIFICADOR DE NÚMERO PAR/IMPAR ---");
        System.out.print("\nIngresa un número entero: ");
        
        // Leer el número entero
        int numero = lector.nextInt(); 
        
        // Aplicar el operador MÓDULO (%)
        // El operador % devuelve el RESTO de la división.
        // Si (numero % 2) es 0, el número es divisible por 2, por lo tanto, PAR.
        int resto = numero % 2; 
        
        // Si el resto de la división por 2 es EXACTAMENTE igual a 0
        
        if (resto == 0) { // También puedes poner if ((numero % 2) == 0) y no tendría que definir una variable resto
            System.out.println("\nEl número " + numero + " es PAR.");
        } 
        // Si el resto no es 0, por descarte solo puede ser 1 (o -1 si es negativo)
        else {
            System.out.println("\nEl número " + numero + " es IMPAR.");
        }
        
        lector.close();
        System.out.println("----------------------------------------------");
        
        // Ejemplo 3: hallar el area y perimeto de un cuadrado cualesquiera.
        
        System.out.println("---AREA Y PERIMETRO DE UN CUADRADO---");
 		double lado = 5.0, area, perimetro;

 		area = lado * lado;

 		perimetro = lado + lado + lado + lado; // o bien 4 * lado;

 		 
 		// Usamos System.out.printf para un mejor formato (%.2f para 2 decimales)
 		System.out.printf("\nEl area es: %.2f%n", area); 
 		System.out.printf("\nEl perímetro es: %.2f%n", perimetro);
 		System.out.println("----------------------------------------------");
        
    }
}