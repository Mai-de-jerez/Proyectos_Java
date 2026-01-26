package controlador;

import Modelos.*;

public class GestionTaller {
    public static void main(String[] args) {
        Taller miTaller = new Taller("Taller Atrium");
        
        // Creamos los dueños
        Propietario mai = new Propietario("María del Carmen", "Martín");
	    Propietario salvi = new Propietario("Salvador", "Dalí");
	    Propietario angel = new Propietario("Ángel", "Nieto");
	    Propietario ada = new Propietario("Ada", "Lovelace");
	    
        // Creamos los vehículos
        Coche c1 = new Coche(1, "Seat", "Ibiza", ada, TipoMotor.GASOLINA, 5);
        Moto m1 = new Moto(8, "Yamaha", "MT-07", mai,TipoMotor.GASOLINA, 690); 
        Taxi miTaxi = new Taxi(25, "Skoda", "Octavia", angel,TipoMotor.ELECTRICO, 5, "Nitax", "Radio Taxi Granada");
        

        System.out.println("--- FASE 1: ENTRADA ---");
        miTaller.entrarVehiculo(c1);
        miTaller.entrarVehiculo(m1);
        miTaller.entrarVehiculo(miTaxi);
        
        // Comprobamos cuántos hay
        System.out.println("Vehículos totales: " + miTaller.cantidadVehiculos());

        System.out.println("\n--- FASE 2: PRUEBA DE ERRORES ---");
        // Intentar meter ID repetido
        Coche c2 = new Coche(1, "Fiat", "500",salvi, TipoMotor.HIBRIDO, 3);
        miTaller.entrarVehiculo(c2); 
        

        System.out.println("\n--- FASE 3: MOSTRAR INVENTARIO ---");
        miTaller.mostrarInventario();

        System.out.println("\n--- FASE 4: SALIDA Y CIERRE ---");
        // Sacamos a la moto (ID 8)
        miTaller.salirTallerPorId(25);
        
        // Intentamos sacarlo cuando ya no está dentro
        miTaller.salirTallerPorId(25);
        
        // Intentamos sacar un ID que no existe (el 99)
        miTaller.salirTallerPorId(99);

        System.out.println("\n--- FASE 5: ESTADO FINAL ---");
        miTaller.mostrarInventario();
        System.out.println("Vehículos al final de la jornada: " + miTaller.cantidadVehiculos());
        
        miTaller.calcularCajaDiaria();
        
        
        System.out.println("\n--- FASE 6: BÚSQUEDAS Y ESTADÍSTICAS ---");
        
        // 1. Probamos buscar por motor (vamos a buscar el eléctrico)
        miTaller.buscarPorMotor(TipoMotor.ELECTRICO);

        // 2. Probamos buscar por propietario (buscamos por apellido)
        System.out.println("\nBuscando vehículos de la familia Martín:");
        miTaller.buscarPorPropietario("Martín");

        // 3. Ver el promedio de lo que vamos a cobrar
        miTaller.mostrarPromedioPresupuesto();

        // 4. ¿Ha venido una emergencia? ¡Vaciamos!
        // miTaller.vaciarTaller();
        
    }
}
