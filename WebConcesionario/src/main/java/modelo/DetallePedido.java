package modelo;

public class DetallePedido {
    private int id;
    private int idPedido;
    private int idCoche;
    private double precioVenta;

    public DetallePedido() {}

    public DetallePedido(int id, int idPedido, int idCoche, double precioVenta) {
        this.id = id;
        this.idPedido = idPedido;
        this.idCoche = idCoche;
        this.precioVenta = precioVenta;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

    public int getIdCoche() { return idCoche; }
    public void setIdCoche(int idCoche) { this.idCoche = idCoche; }

    public double getPrecioVenta() { return precioVenta; }
    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }


    // toString
    @Override
    public String toString() {
		return "DetallePedido [id=" + id + ", idPedido=" + idPedido + ", idCoche=" + idCoche + ", precioVenta=" + precioVenta + "]";
	}

}