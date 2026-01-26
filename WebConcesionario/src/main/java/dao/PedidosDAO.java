package dao;

import java.sql.*;

import modelo.DetallePedido;
import modelo.Pedido;
import util.Conexion;

public class PedidosDAO {
	
	public boolean registrarVentaCompleta(Pedido pedido, DetallePedido detalle) {
	    Connection con = null;
	    PreparedStatement psPedido = null;
	    PreparedStatement psDetalle = null;
	    PreparedStatement psCoche = null;
	    ResultSet rs = null;

	    try {
	        con = Conexion.getConexion();
	        if (con == null) return false;

	        // Iniciamos transacción
	        con.setAutoCommit(false);
	
	        // 1. Insertar Pedido 
	  
	        String sqlPedido = "INSERT INTO pedidos (email_usuario, nombre_usuario, total, transaccion_id, id_coche, fecha) VALUES (?, ?, ?, ?, ?, NOW())";
	        psPedido = con.prepareStatement(sqlPedido, Statement.RETURN_GENERATED_KEYS);
	        
	        psPedido.setString(1, pedido.getEmailUsuario());
	        psPedido.setString(2, pedido.getNombreUsuario());
	        psPedido.setDouble(3, pedido.getTotal());
	        psPedido.setString(4, pedido.getTransaccionId());
	        psPedido.setInt(5, pedido.getIdCoche()); 
	        
	        psPedido.executeUpdate();
	
	        // 2. Obtener el ID generado
	        rs = psPedido.getGeneratedKeys();
	        int idPedidoGenerado = 0;
	        if (rs.next()) {
	            idPedidoGenerado = rs.getInt(1);
	        }
	        
	        // 3. Insertar Detalle
	        String sqlDetalle = "INSERT INTO detalle_pedidos (id_pedido, id_coche, precio_venta) VALUES (?, ?, ?)";
	        psDetalle = con.prepareStatement(sqlDetalle);
	        psDetalle.setInt(1, idPedidoGenerado);
	        psDetalle.setInt(2, detalle.getIdCoche());
	        psDetalle.setDouble(3, detalle.getPrecioVenta());
	        psDetalle.executeUpdate();
	        
	        
	     // 4. Actualizar estado del coche a 'Vendido'
	        String sqlCoche = "UPDATE coche SET estado = 'Vendido' WHERE id = ?";
	        psCoche = con.prepareStatement(sqlCoche);
	        psCoche.setInt(1, detalle.getIdCoche());
	        psCoche.executeUpdate();
            

            // Si todo OK, commit
            con.commit();
            return true;

        } catch (SQLException e) {
            System.err.println("Error en la venta: " + e.getMessage());
            if (con != null) {
                try {
                    con.rollback();
                    System.out.println("Se ha hecho rollback de la transacción");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            return false;
        } finally {
            // Cerramos todo en orden inverso a su apertura
            try {
                if (rs != null) rs.close();
                if (psPedido != null) psPedido.close();
                if (psDetalle != null) psDetalle.close();
                if (psCoche != null) psCoche.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
   

      




    
 
