package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;

import java.io.IOException;

import dao.UsuarioDAO;

/**
 * Servlet implementation class EditarUsuario
 */
@WebServlet("/EditarUsuario")
public class EditarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
        
        UsuarioDAO uDAO = new UsuarioDAO();
        // Este método lo crearemos ahora en el DAO
        Usuario u = uDAO.obtenerPorId(id); 

        if (u != null) {
            request.setAttribute("usuario", u);
            request.getRequestDispatcher("editar-usuario.jsp").forward(request, response);
        } else {
            response.sendRedirect("ListarUsuariosServlet");
        }
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
	    
	    int id = Integer.parseInt(request.getParameter("id"));
	    String nombreUsu = request.getParameter("usuario");
	    String email = request.getParameter("email");
	    String rolString = request.getParameter("rol");
	    String passNueva = request.getParameter("password");

	    UsuarioDAO uDAO = new UsuarioDAO();
	    // Buscamos el usuario actual con obtenerporId()
	    Usuario u = uDAO.obtenerPorId(id); 
	    
	    if (u != null) {
	        // 2. BLINDAJE DE ROL
	        if (u.getRol().getNivel() == 1) {
	            System.out.println("🛡️ Rol blindado para Superuser.");
	        } else if (rolString != null) {
	            u.setRol(modelo.Rol.valueOf(rolString.toUpperCase()));
	        }

	        // 3. DATOS BÁSICOS
	        u.setUsuario(nombreUsu);
	        u.setEmail(email);
	        
	        // 4. LÓGICA DE PASSWORD 
	        if (passNueva != null && !passNueva.trim().isEmpty()) {
	            // Si hay texto, le ponemos la NUEVA (el DAO verá que es distinta y encriptará)
	            u.setPassword(passNueva); 
	        } else {
	            // Si está vacía, nos aseguramos de no tocar u.getPassword()
	            // porque ya contiene el hash original que sacamos en el paso 1.
	            System.out.println("ℹ️ Manteniendo contraseña original.");
	        }

	        // 5. GUARDAR
	        if (uDAO.actualizar(u)) {
	            request.getSession().setAttribute("mensaje", "Usuario actualizado.");
	        } else {
	            request.getSession().setAttribute("mensaje", "Error al guardar cambios.");
	        }
	    } else {
	        request.getSession().setAttribute("mensaje", "Usuario no encontrado.");
	    }
	    
	    response.sendRedirect("ListarUsuariosServlet");
	}

}




