package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Usuario;

import java.io.IOException;

import dao.UsuarioDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {      
		// 1. Recogemos los parámetros del JSP
	    String user = request.getParameter("usuario");
	    String pass = request.getParameter("password");
	    String origen = request.getParameter("origen");
	    String idRegreso = request.getParameter("idRegreso");

	    // 2. Usamos el motor que acabas de crear
	    UsuarioDAO dao = new UsuarioDAO();
	    Usuario u = dao.validar(user, pass);

	    if (u != null) {
	        // ✅ ¡Login exitoso! Creamos la sesión.
	        HttpSession sesion = request.getSession();
	        sesion.setAttribute("usuarioLogueado", u);
	        
	        // Redirigimos al listado de coches según su origen
	        
	        if ("compra".equals(origen) && idRegreso != null && !idRegreso.isEmpty()) {
	            // Volvemos al servlet de detalle con el ID del coche
	            response.sendRedirect("DetalleCocheServlet?id=" + idRegreso); 
	        } else {
	            response.sendRedirect("index.jsp"); 
	        }
	               
	        
	    } else {
	        // ❌ Error: Devolvemos al login con un mensaje
	        request.setAttribute("error", "El usuario o la clave no existen en la BD.");
	        request.getRequestDispatcher("login.jsp").forward(request, response);
	    }
	
	}
}
