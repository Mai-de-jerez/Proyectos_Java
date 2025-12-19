package POO;

public class EjemploAutomovilEstatico {

	public static void main(String[] args) {
		
		// Vemos detalle
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
		opel.setMotor(new Motor(4.0, TipoMotor.DIESEL));
		opel.setEstanque(new Estanque());
		
		// Vemos el resultado para ver que todos tienen colorPatente en Naranja
		
		System.out.println("\n--- Características ---");
	
		System.out.println(subaru.verDetalle());
		System.out.println(mazda.verDetalle());
		System.out.println(nissan.verDetalle());
		System.out.println(opel.verDetalle());
	
		// si ponemos esto:
		Automovil.setColorPatente(Color.ROJO); // forma correcta de establecer el valor del colorPatente
		// porque afecta a toda la clase automovil luego se usa el nombre de la clase
		System.out.println("\n--- Color Patente ---");
		System.out.println(Automovil.getColorPatente());
		
		System.out.println("\n--- Nuevas Características ---");
		// Comprobamos que hemos cambiado el colorPatente de todos los automoviles a verde
		System.out.println(subaru.verDetalle());
		System.out.println(mazda.verDetalle());
		System.out.println(nissan.verDetalle());
		System.out.println(opel.verDetalle());
		
		System.out.println("\n--- Capacidad del Estanque de cada vehículo ---");
		// Comprobamos que hemos cambiado el colorPatente de todos los automoviles a verde
		System.out.println(subaru.calcularConsumo(88, 70));
		System.out.println(mazda.calcularConsumo(88, 70));
		System.out.println(nissan.calcularConsumo(88, 70));
		System.out.println(opel.calcularConsumo(88, 70));
		
		System.out.println("\n--- Capacidad del Estanque Estática (mismo para todos los vehículos) ---");
		// para el consumo estático como es el mismo para todos, no se llama desde el nombre del objeto,
		// sino desde el nombre d ela clase
		System.out.println(Automovil.calcularConsumoEstatico(88, 70));
		/*
		 * Si pusiera esto:
		 * System.out.println(nissan.calcularConsumoEstatico(88, 70));
		 * System.out.println(mazda.calcularConsumoEstatico(88, 70));
		 * System.out.println(subaru.calcularConsumoEstatico(88, 70));
		 * System.out.println(opel.calcularConsumoEstatico(88, 70));
		 * imprimiria lo mismo para todos
		 */
		
		// Así vemos el Id de un auto
		System.out.println("\n--- Ver Ids ---");
		System.out.println("Id nissan: "+ nissan.getId());
		System.out.println("Id opel: "+ opel.getId());
		System.out.println("Id subaru: "+ subaru.getId());
		
		// Ver las constantes de VELOCIDAD MAX en ciudad y carretera
		System.out.println("\n--- Velocidades fijas en todos los autos ---");
		System.out.println("Vel_max_ciudad: "+Automovil.VELOCIDAD_MAX_CIUDAD+" km/h");
		System.out.println("Vel_max_carretera: "+Automovil.VELOCIDAD_MAX_CARRETERA+" km/h");
		
		// Asignar colores a través del enum
		System.out.println("\n--- Ver Nuevos colores asgnados ---");
		// Así asignamos colores
		subaru.setColor(Color.NARANJA);
		nissan.setColor(Color.AMARILLO);
		mazda.setColor(Color.AZUL);
		// Ahora los imprimimos
		System.out.println("Nuevo color de Nissan: "+ nissan.getColor());
		System.out.println("Nuevo color de Subaru: "+ subaru.getColor());
		System.out.println("Nuevo color de Mazda: "+ mazda.getColor());
		
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
				
				
	}
}
