package POO;

public class EjemploAutomovilEnum {

	public static void main(String[] args) {
	
		// nuevo objeto de la clase Automovil
		
		// nuevo objeto de la clase Automovil
		Automovil subaru = new Automovil("Subaru", "Impreza");
		subaru.setColor(Color.BLANCO); 
		Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
		subaru.setMotor(motorSubaru); 
		subaru.setColor(Color.BLANCO);
		subaru.setEstanque(new Estanque());
		
		// objeto numero 2
		Automovil mazda = new Automovil("Mazda","BT-50", Color.AZUL, new Motor(3.0, TipoMotor.DIESEL)); 
		mazda.setEstanque(new Estanque(45));
		// objetos numero 3 y 4
		Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
		Automovil opel = new Automovil("Opel", "Vectra");

	
		// Asignamos el tipo de Automovil ahora que tenemos el enum
		subaru.setTipo(TipoAutomovil.HATCHBACK);
		mazda.setTipo(TipoAutomovil.COUPE);
		nissan.setTipo(TipoAutomovil.PICKUP);
		opel.setTipo(TipoAutomovil.FURGON);
		
		System.out.println("\n--- Tipo Automóvil Subaru ---");
		TipoAutomovil tipoSubaru = subaru.getTipo();
		System.out.println("Nombre: "+tipoSubaru.getNombre());
		System.out.println("Descripción: "+tipoSubaru.getDescripcion());
		System.out.println("Número de puertas: "+tipoSubaru.getNumPuertas());

		// Comparar
		
		switch(tipoSubaru) {
			case CONVERTIBLE:
				System.out.println("El automóvil es deportivo y descapotable de dos puertas.");
				break;
			case COUPE:
				System.out.println("El automóvil es pequeño, deportivo y de dos puertas.");
				break;
			case FURGON:
				System.out.println("El automóvil es utilitario de transporte, de empresas.");
				break;
			case HATCHBACK:
				System.out.println("El automóvil es mediano compacto, aspecto deportivo.");
				break;
			case PICKUP:
				System.out.println("El automóvil de doble cabina o camioneta.");
				break;
			case SEDAN:
				System.out.println("El automóvil es mediano.");
				break;
			case STATION_WAGON:
				System.out.println("El automóvil más grande, con maleta grande...");
				break;
				
		}	
		
		System.out.println("\n--- Tipo Automóvil ---");
		
		TipoAutomovil[] tipos = TipoAutomovil.values();	
		for (TipoAutomovil ta:tipos) {
			System.out.print(ta + "=>" + ta.name() + ", " +
				ta.getNombre() + ", " +
				ta.getDescripcion() + ", " +
				ta.getNumPuertas());
		System.out.println();	
		
				
		}
	}

}
