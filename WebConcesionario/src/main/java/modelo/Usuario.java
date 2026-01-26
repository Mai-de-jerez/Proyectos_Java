package modelo;
import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String usuario;
    private String password;
    private Rol rol; 
    private String email;

    // Constructor vacío
    
    public Usuario(){}
    
    // Constructor para el login
    
    public Usuario(String usuario, String password) {
		this.usuario = usuario;
		this.password = password;
	}


    // Constructor para Registro (usando el Enum)
    public Usuario(String usuario, String email, String password, Rol rol) {
        this.usuario = usuario;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
    
    // Constructor completo para la BD
    public Usuario(int id, String usuario, String email, String password, Rol rol) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
    
    // Getters y Setters


	/**
	 * @return el id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return el usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario el usuario a establecer
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return el password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password el password a establecer
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return el email
	 */	
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email el email a establecer
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return el serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }

    

    public int getNivelRol() {
        return (rol != null) ? rol.getNivel() : 99; // 99 si no hay rol (sin acceso)
    }

    
    
    public String getNombreRol() {
        return (rol != null) ? rol.name() : "Invitado";
    }
	
	
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", usuario=" + usuario + ", email=" + email + ", rol=" + rol + "]";
    }
    
    
}






