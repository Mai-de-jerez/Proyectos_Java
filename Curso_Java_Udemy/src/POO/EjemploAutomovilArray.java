package POO;

import java.util.Arrays;

public class EjemploAutomovilArray {

	public static void main(String[] args) {

		// Creamos los  conductores de tipo Persona
		Persona luci = new Persona("Luci", "Martínez");
		Persona pato = new Persona("Pato", "Rodríguez");
		Persona maria = new Persona("María", "Jiménez");
		Persona bea = new Persona("Bea", "González");
				
		// Creamos distintos objetos de la clase Automovil
		Automovil subaru = new Automovil("Subaru", "Impreza");
		subaru.setColor(Color.BLANCO); 
		subaru.setTipo(TipoAutomovil.CONVERTIBLE);
		Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
		subaru.setMotor(motorSubaru); 
		subaru.setColor(Color.AZUL);
		subaru.setEstanque(new Estanque());
		Automovil mazda = new Automovil("Mazda","BT-50", Color.AZUL, new Motor(3.0, TipoMotor.DIESEL)); 
		mazda.setEstanque(new Estanque(45));
		mazda.setTipo(TipoAutomovil.CONVERTIBLE);
		Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO, new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
		nissan.setTipo(TipoAutomovil.COUPE);
		Automovil suzuki = new Automovil("Suzuki", "Vitara",Color.GRIS, new Motor(1.6, TipoMotor.BENCINA), new Estanque(50));
		suzuki.setTipo(TipoAutomovil.SUV);
		Automovil audi = new Automovil("Audi", "A3");
				
		// Asignar el conductor al vehiculo subaru
		subaru.setConductor(luci);
		mazda.setConductor(pato);
		nissan.setConductor(bea);
		suzuki.setConductor(maria);
		audi.setConductor(bea);
		
		// Crear un array con los coches
		Automovil[] autos = new Automovil[5];
		autos[0] = subaru;
		autos[1] = mazda;
		autos[2] = nissan;
		autos[3] = suzuki;
		autos[4] = audi;
		
		Arrays.sort(autos);
		for(Automovil auto: autos) {
			System.out.println(auto);
		}
		
	
	
		
	
	
		
		
	}

}

