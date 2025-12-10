package POO_Clase_Cuenta;

public class CajeroAutomático {

	public static void main(String[] args) {
		// Creación de una cuenta con saldo inicial de 1000€
        Cuenta cuenta1 = new Cuenta("Javier Perez", 1000.0);
        System.out.println(cuenta1.toString()); 
        
        // Llamamos al metodo ingresar()
        cuenta1.ingresar(200.0);
        System.out.println("Saldo actual: " + cuenta1.getCantidad() + "€. Ahora tu saldo aumenta 200 €."); 
        
        // Llamamos al metodo retirar()
        cuenta1.retirar(500.0);
        System.out.println("Saldo actual: " + cuenta1.getCantidad() + "€. Ahora tu saldo disminuye 500 €."); 
        
        // Lamamos a retirar e intentamos retirar más de lo que hay
        cuenta1.retirar(900.0); 
        System.out.println("Saldo actual: " + cuenta1.getCantidad() + "€. Se queda en cero, no se convierte en saldo negativo."); 
        
        // Llamamos al metodo ingresar() de uevo
        cuenta1.ingresar(2000.0);
        System.out.println("Saldo actual: " + cuenta1.getCantidad() + "€. Tu saldo aumento a 2000 €.");
        
     // Lamamos a retirar e intentamos retirar un saldo negativo
        cuenta1.retirar(-50.0); 
        System.out.println("Saldo actual: " + cuenta1.getCantidad() + "€. No ha ocurrido nada. No se puede retirar una cantidad <=0."); 
    }
}