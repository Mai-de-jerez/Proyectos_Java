package app;

public class Principal {
	
	public static void main(String[] args) {
		// Aqui se empiza a ejecutar la aplicacion
		
		// 1.- Crear un objeto o instancia de cliente
//		int num = 5;
//		String texto = "texto jhhghglh";
		Cliente cliente = new Cliente();
		
		// 2.- Personalizar mi objeto
		cliente.codigo = 1;
		cliente.nombre = "Juan";
		cliente.telefono = 616345987L;
		cliente.cifraVentas = 1967.5690;
		cliente.email = "juan@gmail.com";
		cliente.nuevo = true;
		
		// 3.- Ver la cifra de ventas
		System.out.println(cliente.verCifraVentas());
		
		
		// 4.- Cambiar el telefono
		cliente.cambiarTelefono(626111222L);
		
		// 5.- Mostrar los datos
		cliente.mostrarDatos();
		
		Cliente cli2 = new Cliente(2, "Ana", "ana@gmail.com");
		cli2.mostrarDatos();
		
		Cliente cli3 = new Cliente(3, "Antonio", "antonio@gmail.com", 915643441L, false, 45000.40);
		cli3.mostrarDatos();
		
		float num = 56.45F;
		System.out.println("Numero: " + num);
		
	}
	


}
