package Modelos;

import java.util.ArrayList;
import java.util.List;

public class Taller {
	
    private String nombre;
    private List<Vehiculo> listaVehiculos; 

    public Taller(String nombre) {
        this.nombre = nombre;
        this.listaVehiculos = new ArrayList<>();
    }
    
    // Getters and setters
    
    /**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    

	// Métodos mios
	
	/**
	 * Devuelve un número entero que es el número de vehiculos en taller
	 * @return numero de vehiculos en el taller
	 */
	public int cantidadVehiculos() {
	    return listaVehiculos.size();
	}
	
	/**
	 * Ver los vehículosque hay en el taller
	 */
	public void mostrarInventario() {
	    if (listaVehiculos.isEmpty()) {
	        System.out.println("El taller está vacío.");
	    } else {
	        System.out.println("--- Inventario del Taller " + nombre + " ---");
	        for (Vehiculo v : listaVehiculos) {
	        	v.mostrarInfo();
		        // ¡Magia! v.calcularPresupuesto() sabrá si es coche, moto o taxi
		        System.out.println("Presupuesto estimado: " + v.calcularPresupuesto() + "€");
		        System.out.println("--------------------");
	        }
	    }
	}

	
	
    /**
     * Metodo que imprime un mensaje si el vehiculo ya está en el taller y si no lo agrega al Array 
     * de objetos Vehiculo del taller gracias al for each
     * @param nuevo es un objeto de la clase Vehiculo
     */
    public void entrarVehiculo(Vehiculo nuevo) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getId() == nuevo.getId()) {
                System.out.println("Error: El vehículo con ID " + nuevo.getId() + " ya está dentro.");
                return; 
            }
        }
        
        listaVehiculos.add(nuevo);
        System.out.println(nuevo.getMarca() + " (ID: " + nuevo.getId() + ") ha entrado.");
    }



	// Método para ver qué tenemos dentro
    public void buscarVehiculo(int idBuscado) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getId() == idBuscado) {
                System.out.print("Vehículo encontrado: ");
                v.mostrarInfo();
                return;
            }
        }
        
        System.out.println("No se encontró ningún vehículo con ID: " + idBuscado);
    }
    
	 // Buscar por Tipo de Motor
    public void buscarPorMotor(TipoMotor motorBuscado) {
        System.out.println("--- Vehículos con motor " + motorBuscado + " ---");
        for (Vehiculo v : listaVehiculos) {
            if (v.getMotor() == motorBuscado) {
                v.mostrarInfo();
            }
        }
    }
	    
	 // Buscar por Apellido del Propietario
    public void buscarPorPropietario(String apellido) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getDueño().getApellido().equalsIgnoreCase(apellido)) {
                v.mostrarInfo();
            }
        }
    }
    
    // Coste promedio por reparacion de un vehiculo
    
    public void mostrarPromedioPresupuesto() {
        if (listaVehiculos.isEmpty()) return;
        double total = 0;
        for (Vehiculo v : listaVehiculos) {
            total += v.calcularPresupuesto();
        }
        System.out.println("Coste medio por reparación: " + (total / listaVehiculos.size()) + "€");
    }
    
    // Dinero ganado en el día
    public void calcularCajaDiaria() {
        double totalCaja = 0;
        for (Vehiculo v : listaVehiculos) {
            totalCaja += v.calcularPresupuesto();
        }
        System.out.println("Total esperado hoy: " + totalCaja + "€");
    }
    
    // Sacarlo del taller
    public void salirTallerPorId(int idBuscado) {
        // removeIf devuelve true si realmente borró algo
        boolean borrado = listaVehiculos.removeIf(v -> v.getId() == idBuscado);
        
        if (borrado) {
            System.out.println("Vehículo con ID " + idBuscado + " ha salido del taller.");
        } else {
            System.out.println("No se puede sacar: El ID " + idBuscado + " no existe en el inventario.");
        }
    }
    
    // Vaciar el taller por alguna emergencia
    
    public void vaciarTaller() {
        listaVehiculos.clear();
        System.out.println("El taller ha sido vaciado completamente.");
    }
    
}
