package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Usuario;

import java.io.IOException;
import java.util.List;

import dao.UsuarioDAO;

/**
 * Servlet implementation class ListarUsuariosServlet
 */
@WebServlet("/ListarUsuariosServlet")
public class ListarUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuariosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Solo el Superuser (Nivel 1) debería gestionar usuarios
        HttpSession session = request.getSession();
        modelo.Usuario usu = (modelo.Usuario) session.getAttribute("usuarioLogueado");

        if (usu == null || usu.getRol().getNivel() != 1) {
            response.sendRedirect("login.jsp");
            return;
        }

        // 2. Obtener los datos del DAO
        // May, no lo sé si tu método se llama listarTodos o obtenerUsuarios, 
        // adáptalo a tu UsuarioDAO
        UsuarioDAO uDAO = new UsuarioDAO();
        List<Usuario> lista = uDAO.listarTodos(); 

        // 3. Enviar la lista al JSP
        request.setAttribute("listaUsuarios", lista);
        request.getRequestDispatcher("listar-usuarios.jsp").forward(request, response);
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
