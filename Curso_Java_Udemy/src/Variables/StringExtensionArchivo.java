package Variables;

public class StringExtensionArchivo {

	public static void main(String[] args) {
		/*
		 * Vamos a extrar la extenxsion de un arhivo gracias a indexOf() y a substring()
		 */
		String archivo = "alguna_imagen.jpeg";
		String archivo2 = "archivo.cosa.pdf";
		int i = archivo.indexOf(".");
		// usamos lastIndexOf() porque como hay dos puntos nosotros solo queremos la última ocurrencia
		int j = archivo2.lastIndexOf(".");
		// Lomgitud de los archivos
		System.out.println("Longitud del archivo: "+archivo.length());
		System.out.println("Longitud del archivo2: "+archivo2.length());
		// Accedemos a extraer a partir del punto y para que no meta el punto ponemos i+1
		System.out.println("Extraer la cadena jpeg con substring(): "+archivo.substring(i+1));
		System.out.println("Extraer la cadena png con substring(): "+archivo2.substring(j+1));
		
		
	}

}
