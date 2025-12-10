package Variables;

public class CompararStrings {

	public static void main(String[] args) {
		// crear dos strings
		String curso = "Programación Java";
		String curso2 = "Programación Java";
		// los comparamos
		boolean esIgual = curso == curso2; // da true
		System.out.println("String curso es igual a String curso2 usando ==: "+esIgual+".Y el motivo es "
						+ "\nque si declaras dos variables asignando directamente la cadena, y las "
						+ "\ncadenas son idénticas para los dos objetos, no se crea un nuevo objeto de la "
						+ "\nclase string.\n"); 
		
		// en cambio al hacer esto:
		String idioma = "inglés";
		String idioma2 = new String("inglés");
		esIgual = idioma == idioma2; // da false
		System.out.println("String idioma es igual a String idioma2 usando ==: "+esIgual+". Y es porque"
				+ "\nhemos declarado distintos objetos al usar new String, y == compara objetos.\n");
		
		esIgual = idioma.equals(idioma2); // da true
		System.out.println("String idioma es igual a String idioma2 usando equals(): "+esIgual+". Y es porque"
				+ "\nhemos usado equals(), que compara cadenas no objetos.\n");
		// es true porque aqui se compara la cadena no el objeto
		// equals() discrimina entre mayusculas y minusculas y entre tildes y no tildes
		// para que ignore las mayusculas puedes usar IgnoreCase() 
		String uno = "Pepa";
		String dos = "pepa";
		
		// dira que no son iguales por la mayuscula
		esIgual = dos.equals(uno);
		System.out.println("String dos es igual a String uno si no usamos ignoreCase(): "+esIgual);
		
		// asi si da true gracias al uso de IgnoreCase()
		esIgual = dos.equalsIgnoreCase(uno);
		System.out.println("String dos es igual a String uno si usamos ignoreCase(): "+esIgual); 
		
		
	}

}
