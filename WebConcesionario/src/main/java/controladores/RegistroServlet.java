package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;
import modelo.Rol;

import java.io.IOException;

import dao.UsuarioDAO;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/RegistroServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Si alguien intenta entrar por URL, lo mandamos al formulario
		response.sendRedirect("registro.jsp");
		
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. Configurar codificación para evitar problemas con acentos o eñes
        request.setCharacterEncoding("UTF-8");

        // 2. Recoger los datos del formulario JSP
        String user = request.getParameter("usuario");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        Rol rol = Rol.CLIENTE;
         

        // 3. Validar que no vengan vacíos (un poco de seguridad extra)
        if (user == null || user.isEmpty() || email == null || pass == null) {
            request.setAttribute("error", "Todos los campos son obligatorios.");
            request.getRequestDispatcher("registro.jsp").forward(request, response);
            return;
        }

        // 4. Crear el objeto Usuario (usando el constructor de registro, sin ID)
        Usuario nuevoUsuario = new Usuario(user, email, pass, rol);
        UsuarioDAO dao = new UsuarioDAO();

        // 5. Intentar guardar en la base de datos
        if (dao.registrar(nuevoUsuario)) {
            // ✅ Éxito: Mandamos al login con un mensajito de alegría
            response.sendRedirect("login.jsp?success=true");
        } else {
            // ❌ Error: Seguramente el usuario o email ya existen (por el UNIQUE de SQL)
            request.setAttribute("error", "Error: El usuario o el email ya están registrados.");
            request.getRequestDispatcher("registro.jsp").forward(request, response);
        	}
		}
	}





