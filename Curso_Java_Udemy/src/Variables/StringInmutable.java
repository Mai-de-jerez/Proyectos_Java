package Variables;

public class StringInmutable {

	public static void main(String[] args) {
		
		// Declaramos los String
		String curso = "Programación Java";
		String profesor = "Andrés Guzmán";
		
		// Concatenamos con cncat()
		String resultado = curso.concat(profesor); 
		
		// Imprimimos
		System.out.println("Curso: "+curso);
		
		System.out.println("Resultado concatenación: "+resultado);
		
		System.out.println("Curso es igual a programacion: "+(curso == resultado));
		
		// Ponemos a prueba la inmutabilidad
		curso.transform(c -> {
			return c +" con "+ profesor;
		});
		
		System.out.println("Curso: "+curso);// no ha cambiado
		
		// para que cambie tienes que asignarlo a una nueva variable
		String resultado2 = curso.transform(c -> {
			return c +" con "+ profesor;
		});
		
		System.out.println("Resultado: "+resultado2);
		
		// esto tampoco lo muta
		resultado2.replace("a", "A");
		System.out.println("Resultado: "+resultado2);
		
		// en cambio asi si puedes ver el resultado si lo asignas a una nueva 
		String resultado3 = resultado2.replace("a", "A");
		System.out.println("Resultado 3: "+resultado3);
	}

}
