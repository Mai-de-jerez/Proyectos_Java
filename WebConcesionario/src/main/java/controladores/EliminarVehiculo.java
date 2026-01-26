package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import dao.CocheDAO;

/**
 * Servlet implementation class EliminarVehiculo
 */
@WebServlet("/EliminarVehiculo")
public class EliminarVehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarVehiculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Recuperamos el ID que enviamos desde el enlace de la tabla
        String idParam = request.getParameter("id");
        
        if (idParam != null) {
            int id = Integer.parseInt(idParam);
            
            // 2. Llamamos al DAO para que haga la magia en la base de datos
            CocheDAO dao = new CocheDAO();
            dao.eliminar(id); 
            
         // 3. Guardamos un mensaje en la sesión para avisar al usuario
            request.getSession().setAttribute("mensaje", "✅ ¡Vehículo eliminado correctamente!");
        }
        
        // 4. Pase lo que pase, volvemos a la lista para ver el resultado
        response.sendRedirect("ListarVehiculos");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
