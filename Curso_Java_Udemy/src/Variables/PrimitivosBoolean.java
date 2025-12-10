package Variables;

public class PrimitivosBoolean {

	public static void main(String[] args) {
		// declarar boolean (en minúsculas para q sesa primitivo y no de referencia)
		boolean booleano = true;
		boolean booleano1 = Boolean.FALSE; // ES MÁS PRÁCTICO PONER FALSE
		boolean booleano2 = Boolean.TRUE.booleanValue(); // ES MEJOR PONER TRUE
		// Imprimimos
		System.out.println("Dato tipo boolean: " + booleano +' '+ booleano1 +' '+ booleano2);
		
		// los booleanos se usan para evaluar condiciones
		float d = 98765.43e-3f;
		double f = 1.23455e2f;
		
		booleano = d > f;
		System.out.println("d > f: "+booleano);
		booleano = d < f;
		System.out.println("d < f: "+booleano);
		
		boolean esIgual = (3<2);
		System.out.println("3 < 2: "+esIgual);
		
		
	}

}
