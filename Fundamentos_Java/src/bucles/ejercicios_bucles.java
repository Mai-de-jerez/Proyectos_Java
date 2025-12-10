package bucles;

public class ejercicios_bucles {

	public static void main(String[] args) {
		//Ejercicio 1: Imprimir los números primos del 1 al 100
		int cont;
        cont = 0;
        for (int i = 1; i <= 100; i = i + 1) {
            for (int j = 2; j <= (i - 1); j = j + 1) {
                if (i % j == 0) {
                    cont = 1;
                }

            }
            if (cont == 0) {
                System.out.println(i);
            }
            cont = 0;
        }

        //Ejercicio 2: Calcular 2 elevado a la 8 usando un bucle
        int exp = 1;
        int cont2 = 0;
        while (cont2 != 8) {
            exp = exp * 2;
            cont2 = cont2 + 1;
        }
        
        System.out.println(exp);
        
        //Ejercicio 3: Imprimir los 25 primeros números primos
        int cont3;
        cont3 = 0;
        int i = 0;
        int primo = 1;
        while (primo != 26) {
            i = i + 1;
            for (int j = 2; j <= (i - 1); j = j + 1) {
                if (i % j == 0) {
                    cont3 = 1; 
                }
            }
            if (cont3 == 0) {
                System.out.println("Primo " + primo + " -> " + i);
                primo = primo + 1;
            }
            cont3 = 0;
        }
        
        //Ejercicio 4: Imprimir el primer número primo mayor que 198
        int cont4;
        cont4 = 0;
        int x = 198;
        int primo2 = 0;
        while (primo2 != 1) {
            x = x + 1;
            for (int j = 2; j <= (x - 1); j++) {
                if (x % j == 0) {
                    cont4 = 1;
                }
            }
            if (cont4 == 0) { 
                System.out.println(x);
                primo2 = 1;
            }
            cont4 = 0;
        }
        
        //Ejercicio 5: Imprimir los números perfectos entre 1 y 100
        int suma = 0;
        for (int y = 1; y <= 100; y++) {
            for (int j = 1; j < y; j++) {
                if (y % j == 0) {
                    suma = suma + j;
                }
            }
            if (y == suma) {
                System.out.println("Numero perfecto: " + y);
            }
            suma = 0;
        }
        
        // Ejercicio 6: Imprimir los 20 primeros números de la serie Fibonacci
        int a = 1;
        int b = 1;
        int c = 0;
        int n = 20;
        System.out.println(a);
        System.out.println(b);
        while (n != 0) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            n = n - 1;
        }
        
	}

}
