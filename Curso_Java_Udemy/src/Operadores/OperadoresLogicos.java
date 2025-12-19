package Operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int i =3;
		byte j=3;
		float k=127e-7f;
		double l=2.1413e3;
		boolean m= false;
		
		System.out.println("\n--- VARIABLES ---");
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		System.out.println("k= "+k);
		System.out.println("l= "+l);
		System.out.println("m= "+m);
		
		System.out.println("\n--- COMPARACIONES ---");
		
		boolean b1 = i==j && k > l; // true && false
		System.out.println("i==j && k > l: "+b1);
		// false && false = false;
		// false && true = false;
		// true && false = false;
		// true && true = true;
		
		// && = AND;
		boolean b2 = i==j && k < l; // true && true
		System.out.println("i==j && k < l: "+b2);
		
		boolean b3 = i==j && k < l && m==true; // true && true && false
		System.out.println("i==j && k < l && m==true: "+b3);
		
		boolean b4 = i==j && k < l && m==false; // true && true && false
		System.out.println("i==j && k < l && m==false: "+b4);
		
		
		// || = OR;
		boolean b5 = i==j || k > l; // true && false
		System.out.println("i==j || k > l: "+b5);
		// se debe cumplir al menos una de las que haya
		
		// Uso de paréntesis
		
		boolean b6 = i!=j || k > l || m==true; // false || false || false
		System.out.println("i!=j && k > l || m==true: "+b6);
		boolean b7 = i!=j || (k > l || m==false); // false || false || false
		System.out.println("i!=j && (k > l || m==true): "+b7);
		// no se cumple ninguna de las 3 es false
		
		boolean b8 = i!=j || k > l || m==false; // false || false || truee
		System.out.println("i!=j && k > l || m==true: "+b8);
		// se cumple una de las 3 es true
		
		boolean b9 = i!=j || k < l;
		System.out.println("i!=j || k < l : "+b9);
		
	 
		
		
		
		
		
	}

}
