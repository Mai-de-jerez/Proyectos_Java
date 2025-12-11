package Operadores;

public class CalculoSalarioNeto {

	public static void main(String[] args) {
		// 1. DECLARACIÓN DE VARIABLES (Valores iniciales)
        // Usamos 'double' para manejar los decimales del dinero.
        double salarioBruto = 2500.0; 
        
        // Usamos 'final double' para las constantes que no cambian (los porcentajes)
        final double TASA_IRPF = 0.15; // 15% de Impuesto
        final double TASA_SEGURIDAD_SOCIAL = 0.04; // 4% de Seguridad Social
        double bonoProductividad = 150.0; 

        // -------------------------------------------------------------
        System.out.println("--- CÁLCULO DE SALARIO NETO ---");
        System.out.println("Salario Bruto Inicial: " + salarioBruto + "€");
        System.out.println("Tasa IRPF: " + (TASA_IRPF * 100) + "%");
        System.out.println("Tasa Seguridad Social: " + (TASA_SEGURIDAD_SOCIAL * 100) + "%");
        System.out.println("Bono por Productividad: " + bonoProductividad + "€");
        System.out.println("----------------------------------------------");
        
        
        // 2. CÁLCULO DE RETENCIONES (Operador Aritmético: *)
        
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
        
        
        // 5. MOSTRAR RESULTADOS (Operador de Concatenación: +)
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("1. Descuento IRPF (-15%): -" + retencionIRPF + "€");
        System.out.println("2. Descuento SS (-4%): -" + descuentoSS + "€");
        System.out.println("3. Total Retenido: -" + descuentoTotal + "€");
        System.out.println("----------------------------------------------");
        System.out.println("EL SALARIO NETO FINAL ES: " + salarioDescontado + "€");
    }
}

