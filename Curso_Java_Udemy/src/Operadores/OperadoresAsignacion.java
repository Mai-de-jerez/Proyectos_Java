package Operadores;

public class OperadoresAsignacion {

	public static void main(String[] args) {
		
		// Operador de asignacion =
		int i = 5;
		int j = i + 4;
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		// De incremento, decremento
		i += 2;
		System.out.println("i += 2 sería "+i);
		i -= 2;
		System.out.println("i -= 2 sería "+i);
		j *= 2;
		System.out.println("j *= 2 sería "+j);
		j *= 3;
		System.out.println("j *= 3 sería "+j);
		j /= 3;
		System.out.println("j /= 3 sería "+j);
		j /= 3;
		System.out.println("j /= 3 sería "+j);
		
		// Concatenar string con operadores de incremento
		String sqlString = "select * from clientes as c";
		sqlString += " where c.nombre='Andrés'";
		sqlString += " and c.activo=1;";
		// Observa como todo se concatenó (tb funciona con strings)
		System.out.println("SQLString: "+sqlString);
		
		
		
		
	}

}
