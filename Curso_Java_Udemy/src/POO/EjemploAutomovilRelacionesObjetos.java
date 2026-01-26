package POO;

public class EjemploAutomovilRelacionesObjetos {

	public static void main(String[] args) {

		// Creamos los  conductores de tipo Persona
		Persona luci = new Persona("Luci", "Martínez");
		Persona pato = new Persona("Pato", "Rodríguez");
		Persona maria = new Persona("María", "Jiménez");
		Persona bea = new Persona("Bea", "González");
				
		// nuevo objeto de la clase Automovil
		Automovil subaru = new Automovil("Subaru", "Impreza");
		subaru.setColor(Color.BLANCO); 
		Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
		subaru.setMotor(motorSubaru); 
		subaru.setColor(Color.AZUL);
		subaru.setEstanque(new Estanque());
		
		// objeto numero 2
		Automovil mazda = new Automovil("Mazda","BT-50", Color.AZUL, new Motor(3.0, TipoMotor.DIESEL)); 
		mazda.setEstanque(new Estanque(45));
		// objetos numero 3 y 4
		Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
		Automovil opel = new Automovil("Opel", "Vectra");
		opel.setMotor(new Motor(4.0, TipoMotor.DIESEL));
		opel.setEstanque(new Estanque());
		
		
		// Asignar el conductor al vehiculo subaru
		subaru.setConductor(luci);
		mazda.setConductor(pato);
		nissan.setConductor(bea);
		opel.setConductor(maria);
		
		// Creacion de ruedas para los vehiculos
		Rueda[] ruedasSubaru = new Rueda[5];
		for(int i = 0; i < ruedasSubaru.length; i++) {
			subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
		}	
		
		Rueda[] ruedasMazda = new Rueda[5];
		for(int i = 0; i < ruedasSubaru.length; i++) {
			mazda.addRueda(new Rueda("Michelin", 18, 10.5));
		}		
		
		
		/*
		 * Rueda[] ruedasNissan = new Rueda[5]; 
		 * for(int i = 0; i < ruedasSubaru.length;i++) { 
		 * 		nissan.addRueda(new Rueda("Pirelli", 20, 11.5)); }
		 */
		
		// Alternativa con addRueda
		nissan.setTipo(TipoAutomovil.PICKUP);
		nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
				.addRueda(new Rueda("Pirelli", 20, 11.5))
				.addRueda(new Rueda("Pirelli", 20, 11.5))
				.addRueda(new Rueda("Pirelli", 20, 11.5))
				.addRueda(new Rueda("Pirelli", 20, 11.5));
		
		/*
		 * Rueda[] ruedasOpel = new Rueda[5]; 
		 * for(int i = 0; i < ruedasSubaru.length;
		 * i++) { opel.addRueda(new Rueda("Firestone", 18, 9.5)); }
		 */ 
	
		
		// Asignacion de ruedas a vehiculos
		/*
		 * subaru.setRuedas(ruedasSubaru); 
		 * mazda.setRuedas(ruedasMazda);
		 * nissan.setRuedas(ruedasNissan); 
		 * opel.setRuedas(ruedasOpel);
		 */
	
		
		// Vemos el resultado
		System.out.println("\n--- Características de cada auto: ---");
		System.out.println(subaru.verDetalle());
		System.out.println(mazda.verDetalle());
		System.out.println(nissan.verDetalle());
		System.out.println(opel.verDetalle());

		System.out.println("\n--- Conductores: ---");
		System.out.println("Conductor Subaru: "+subaru.getConductor());
		System.out.println("Conductor Mazda: "+mazda.getConductor());
		System.out.println("Conductor Nissan: "+nissan.getConductor());
		System.out.println("Conductor Opel: "+opel.getConductor());
		
		System.out.println("\n--- Ruedas Subaru: ---");
		for (Rueda r: subaru.getRuedas()) {
			System.out.println(r.getFabricante() + ", aro " + r.getAro() + ", ancho " + r.getAncho());
		}
		
		
	}

}
