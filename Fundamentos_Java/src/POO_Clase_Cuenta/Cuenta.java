package POO_Clase_Cuenta;

public class Cuenta {
	
	// Atributos
	private String titular;
	private double cantidad;
	
	//Constructores
	// Si quieres pasa solo un parámetro
	public Cuenta(String titular){
		this.titular = titular;
		this.cantidad = 0.0;
	}

	// Si quieres puedes pasar los dos parámetros
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	
	
	// Método para establecer y obtener los valores de los atributos
	
	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	// Método toString()
	
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	
	// Otros métodos
	
	public void ingresar (double cantidad) {
		
	    if (cantidad >= 0) {
	        this.cantidad += cantidad; 
	    }

	}
	

	public void retirar (double cantidad) {
			
		    if (cantidad > 0) {
		        this.cantidad -= cantidad; 
		        if (this.cantidad < 0) {
		        	this.cantidad = 0;
		        }
		    }
	
		}
	
	
	
}
