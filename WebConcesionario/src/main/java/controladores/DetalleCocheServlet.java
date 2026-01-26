package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import dao.CocheDAO;
import modelo.Coche;

/**
 * Servlet implementation class DetalleCocheServlet
 */
@WebServlet("/DetalleCocheServlet")
public class DetalleCocheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetalleCocheServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Recuperamos el ID que viene en la URL (?id=5)
        String idStr = request.getParameter("id");
        
        if (idStr != null) {
            try {
                int id = Integer.parseInt(idStr);
                
                // 2. Llamamos al DAO para obtener el coche
                CocheDAO dao = new CocheDAO();
                Coche coche = dao.obtenerPorId(id);
                
                if (coche != null) {
                    // 3. Si el coche existe, lo guardamos en el request
                    request.setAttribute("cocheDetalle", coche);
                    // 4. Saltamos al JSP de detalle (asegúrate de que el JSP se llame así)
                    request.getRequestDispatcher("detalle_coche.jsp").forward(request, response);
                } else {
                    // Si el coche no existe, volvemos a la tienda
                    response.sendRedirect("tienda.jsp");
                }
                
            } catch (NumberFormatException e) {
                // Si el ID no es un número válido
                response.sendRedirect("tienda.jsp");
            }
        } else {
            // Si no viene ID en la URL
            response.sendRedirect("tienda.jsp");
        }
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
