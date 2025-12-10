package Variables;

public class PrimitivosFloat {

	public static void main(String[] args) {
		// 2. Tipos de números en punto flotante o decimales (Floating-Point Types)

        // float (32 bits): Simple precisión (necesita el sufijo 'f').
        float temperatura = 25.5f;
        float realFloat = 1.5e4f; // sería 15000f en notación científica 
        float secondFloat = 1.5e-10f; // sería 0.00000000015f
        System.out.println("Tamaño de un float: "+ Float.BYTES);
        System.out.println("Tamaño de un float en bits: " + Float.SIZE);
        System.out.println("Tamaño mínimo de un float: " + Float.MIN_VALUE);
        System.out.println("Tamaño de un float en bits: " + Float.MAX_VALUE);

        // Double (64 bits): Doble precisión (el tipo decimal por defecto en Java).
        double pi = 3.1415926535;
        System.out.println("Tamaño de un double: "+ Double.BYTES);
        System.out.println("Tamaño de un double en bits: " + Double.SIZE);
        System.out.println("Tamaño mínimo de un double: " + Double.MIN_VALUE);
        System.out.println("Tamaño de un double en bits: " + Double.MAX_VALUE);
        
        // Variable var (es flexible puede ser lo que le des)
        var num = 20;
        var char1 ='A'; // comillas simples lo declara char
        var string1 ="A"; // comillas dobles lo declara string
        var string2 = "Hola Mundo";
        var flotante = 3.1416f;
        
        // Imprimir todos los valores para demostrar su uso:
        System.out.println("float (Temperatura): " + temperatura);
        System.out.println("Notación científica: "+ realFloat);
        System.out.println("Notación científica nº negativo: "+ secondFloat);
        System.out.println("double (Pi): " + pi);
        // imprimir que tipo de variables son las var
        System.out.println(num+num); // var num se comporta como int
        System.out.println(char1*num); // var caracter se comporta como int por ser un char
        System.out.println(string1+temperatura); // var se comporta como string
        System.out.println(string2+string1); // var se comporta como string (concatenación)
        System.out.println(flotante*num); // var se comporta como flotante
        // podemos declarar distintos tipos en una variable tipo var
        
       

	}

}
