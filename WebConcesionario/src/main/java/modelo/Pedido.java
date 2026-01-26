package modelo;

import java.sql.Timestamp;

public class Pedido {
    private int id;
    private String emailUsuario;
    private String nombreUsuario;
    private Timestamp fecha;
    private double total;
    private String transaccionId;
    private int idCoche;
   

    // Constructor vacío (obligatorio para Java Beans)
    public Pedido() {}

    // Constructor completo (útil para el DAO)
    public Pedido(int id, String emailUsuario, String nombreUsuario, Timestamp fecha, double total, String transaccionId, int idCoche) {
        this.id = id;
        this.emailUsuario = emailUsuario;
        this.nombreUsuario = nombreUsuario;
        this.fecha = fecha;
        this.total = total;
        this.transaccionId = transaccionId;
        this.idCoche = idCoche;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmailUsuario() { return emailUsuario; }
    public void setEmailUsuario(String emailUsuario) { this.emailUsuario = emailUsuario; }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public Timestamp getFecha() { return fecha; }
    public void setFecha(Timestamp fecha) { this.fecha = fecha; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public String getTransaccionId() { return transaccionId; }
    public void setTransaccionId(String transaccionId) { this.transaccionId = transaccionId; }
    
    public int getIdCoche() { return idCoche; }
    public void setIdCoche(int idCoche) { this.idCoche = idCoche; }
    
    
    
    
    // toString (útil para depuración)
    
    @Override
    public String toString() {
		return "Pedido [id=" + id + ", emailUsuario=" + emailUsuario + ", nombreUsuario=" + nombreUsuario
				+ ", fecha=" + fecha + ", total=" + total + ", transaccionId=" + transaccionId + ", idCoche=" + idCoche + "]";
	}
    
}


