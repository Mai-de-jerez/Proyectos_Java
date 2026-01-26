package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Usuario;
import util.Conexion;
import modelo.Rol;
import org.mindrot.jbcrypt.BCrypt;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO { 
	
    
    public Usuario validar(String userOrEmail, String passPlano) {
        Usuario u = null;
        // 1. Buscamos por usuario O por email (¡así es más profesional!)
        String sql = "SELECT * FROM usuarios WHERE usuario = ? OR email = ?";
        
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, userOrEmail);
            ps.setString(2, userOrEmail);
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String passEncriptadoBD = rs.getString("password");

                    // 2. Comparamos con BCrypt
                    if (BCrypt.checkpw(passPlano, passEncriptadoBD)) {
                 	
                    	// ✅ Convertimos el String de la BD al Enum de Java
                        String rolString = rs.getString("rol");
                        Rol rolEnum = Rol.valueOf(rolString.toUpperCase());
                        
                        // ✅ ¡Coinciden! Usamos el constructor completo
                        u = new Usuario(
                            rs.getInt("id"),
                            rs.getString("usuario"),
                            rs.getString("email"),
                            passEncriptadoBD,
                            rolEnum       
                        );
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al validar usuario: " + e.getMessage());
        }
        return u;
    }
    
    public List<Usuario> listarTodos() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                // Convertimos el rol de la BD al Enum
                String rolString = rs.getString("rol");
                Rol rolEnum = Rol.valueOf(rolString.toUpperCase());

                // Creamos el objeto usuario y lo añadimos a la lista
                Usuario u = new Usuario(
                    rs.getInt("id"),
                    rs.getString("usuario"),
                    rs.getString("email"),
                    rs.getString("password"), 
                    rolEnum
                );
                lista.add(u);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al listar usuarios: " + e.getMessage());
        }
        return lista;
    }
    
  
    public boolean registrar(Usuario u) {
        String sql = "INSERT INTO usuarios (usuario, email, password, rol) VALUES (?, ?, ?, ?)";
        
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getEmail());
            // Encriptamos antes de guardar
            String hash = BCrypt.hashpw(u.getPassword(), BCrypt.gensalt());
            ps.setString(3, hash);
            ps.setString(4, u.getRol().name());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("❌ Error al registrar: " + e.getMessage());
            return false;
        }
    }
    
    

    public Usuario obtenerPorId(int id) {
        Usuario u = null;
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Rol rolEnum = Rol.valueOf(rs.getString("rol").toUpperCase());
                    u = new Usuario(
                        rs.getInt("id"),
                        rs.getString("usuario"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rolEnum
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al obtener usuario por ID: " + e.getMessage());
        }
        return u;
    } 
 
    public boolean actualizar(Usuario u) {
        String sql = "UPDATE usuarios SET usuario = ?, email = ?, password = ?, rol = ? WHERE id = ?";
        
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getEmail());
            
            // 1. Recuperamos el usuario de la BD tal cual está ahora para comparar
            Usuario uOriginal = obtenerPorId(u.getId());
            String passFinal;

            if (uOriginal != null && !u.getPassword().equals(uOriginal.getPassword())) {
    			// 2. Si la contraseña es diferente, es que es nueva y hay que encriptarla
                passFinal = BCrypt.hashpw(u.getPassword(), BCrypt.gensalt());
                System.out.println("🔐 Nueva contraseña detectada y encriptada con BCrypt.");
            } else {
                // 3. Si es igual, es que el Servlet le ha pasado la clave vieja (ya encriptada)
                passFinal = u.getPassword();
            }
            
            ps.setString(3, passFinal); 
            ps.setString(4, u.getRol().name());
            ps.setInt(5, u.getId());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("❌ Error al actualizar usuario: " + e.getMessage());
            return false;
        }
    }  
    
}
