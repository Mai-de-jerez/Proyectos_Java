package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Coche;
import modelo.TipoMotor;
import util.Conexion; 
import modelo.EstadoVehiculo;


public class CocheDAO {
	
	public List<Coche> listar() {
	    List<Coche> lista = new ArrayList<>();
	    String sql = "SELECT * FROM coche";
	    
	    try (Connection con = Conexion.getConexion();
	         PreparedStatement ps = con.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery()) {
	        
	        while (rs.next()) {
	        	
	        	String motorBD = rs.getString("tipo_motor");
	            String estadoBD = rs.getString("estado");

	            TipoMotor motor = TipoMotor.desdeTexto(motorBD);
	            EstadoVehiculo estado = EstadoVehiculo.desdeTexto(estadoBD);
	            
	            Coche c = new Coche(
	                rs.getInt("id"),
	                rs.getString("marca"),
	                rs.getString("modelo"),
	                rs.getString("matricula"),
	                rs.getString("color"),
	                rs.getDouble("precio"),
	                rs.getInt("km"),
	                rs.getString("anio"),
	                motor,
	                rs.getInt("numPuertas"),
	                estado
	            );
	            lista.add(c);
	        }
	    } catch (SQLException e) {
	        System.out.println("❌ Error al listar: " + e.getMessage());
	    }
	    
	    return lista;
	}
	
    public void insertar(Coche c) {
        // Ajustamos el SQL a los campos REALES de tu clase Coche
        String sql = "INSERT INTO coche (marca, modelo, matricula, color, precio, km, anio, tipo_motor, numPuertas, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConexion(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, c.getMarca());
            ps.setString(2, c.getModelo());
            ps.setString(3, c.getMatricula());
            ps.setString(4, c.getColor());
            ps.setDouble(5, c.getPrecio());
            ps.setInt(6, c.getKm());
            ps.setString(7, c.getAnio());
            ps.setString(8, c.getTipoMotor().getTexto());
            ps.setInt(9, c.getNumPuertas());
            ps.setString(10, c.getEstado().getTexto());

            ps.executeUpdate();
            System.out.println("✅ ¡Coche guardado con éxito, May!");

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar el coche: " + e.getMessage());
        }
    }
    
    public void actualizar(Coche c) {
        String sql = "UPDATE coche SET marca=?, modelo=?, matricula=?, color=?, precio=?, km=?, anio=?, tipo_motor=?, numPuertas=?, estado=? WHERE id=?";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, c.getMarca());
            ps.setString(2, c.getModelo());
            ps.setString(3, c.getMatricula());
            ps.setString(4, c.getColor());
            ps.setDouble(5, c.getPrecio());
            ps.setInt(6, c.getKm());
            ps.setString(7, c.getAnio());
            ps.setString(8, c.getTipoMotor().getTexto());
            ps.setInt(9, c.getNumPuertas());
            ps.setString(10, c.getEstado().getTexto());
            ps.setInt(11, c.getId()); 

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }
    
    public void eliminar(int id) {
        String sql = "DELETE FROM coche WHERE id = ?";
        
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("✅ Vehículo con ID " + id + " eliminado con éxito.");
            
        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar el vehículo: " + e.getMessage());
        }
    }
	    
	 
    public Coche obtenerPorId(int id) {
        Coche c = null;
        String sql = "SELECT * FROM coche WHERE id = ?";
        
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                	
                	// 1. Extraemos los Strings con seguridad
                    String motorBD = rs.getString("tipo_motor");
                    String estadoBD = rs.getString("estado");

                    // 2. Convertimos usando nuestros métodos desdeTexto
                    // Esto es mucho más seguro que valueOf().toUpperCase()
                    TipoMotor motor = TipoMotor.desdeTexto(motorBD);
                    EstadoVehiculo estado = EstadoVehiculo.desdeTexto(estadoBD);
                    
                    c = new Coche(
                        rs.getInt("id"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("matricula"),
                        rs.getString("color"),
                        rs.getDouble("precio"),
                        rs.getInt("km"),
                        rs.getString("anio"),
                        motor,
                        rs.getInt("numPuertas"),
                        estado
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al buscar por ID: " + e.getMessage());
        }
        return c;
    }
    
    
    public void actualizarEstado(int id, EstadoVehiculo nuevoEstado) {
        String sql = "UPDATE coche SET estado = ? WHERE id = ?";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, nuevoEstado.getTexto()); // En lugar de .name()
            ps.setInt(2, id);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("❌ Error al cambiar estado: " + e.getMessage());
        }
    }
    
}


