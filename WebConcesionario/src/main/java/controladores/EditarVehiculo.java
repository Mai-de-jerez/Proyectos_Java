package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import dao.CocheDAO;
import modelo.Coche;
import modelo.EstadoVehiculo;
import modelo.TipoMotor;

/**
 * Servlet implementation class EditarVehiculo
 */
@WebServlet("/EditarVehiculo")
public class EditarVehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarVehiculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Pillamos el ID que viene en el enlace (ej: EditarVehiculo?id=3)
        int id = Integer.parseInt(request.getParameter("id"));
        
        CocheDAO dao = new CocheDAO();
        Coche coche = dao.obtenerPorId(id); 
        
        // Guardamos el coche para que el JSP pueda leerlo
        request.setAttribute("coche", coche);
        
        // Mandamos al usuario al formulario de edición
        request.getRequestDispatcher("editar-vehiculo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Recogemos todos los datos del formulario (incluido el ID oculto)
        int id = Integer.parseInt(request.getParameter("id"));
        String marca = request.getParameter("marca");
        String nombreModelo = request.getParameter("modelo");
        String matricula = request.getParameter("matricula");
        String color = request.getParameter("color");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int km = Integer.parseInt(request.getParameter("km"));
        String anio = request.getParameter("anio");

        String motorStr = request.getParameter("tipoMotor");
        TipoMotor motorEnum = TipoMotor.desdeTexto(motorStr);
       
        int numPuertas = Integer.parseInt(request.getParameter("numPuertas"));
              
        String estadoStr = request.getParameter("estado");
        EstadoVehiculo estadoEnum = EstadoVehiculo.desdeTexto(estadoStr);

        // Creamos el objeto con el ID para que el DAO sepa cuál actualizar
        Coche cocheEditado = new Coche(id, marca, nombreModelo, matricula, color, precio, km, anio, motorEnum, numPuertas, estadoEnum);

        CocheDAO dao = new CocheDAO();
        dao.actualizar(cocheEditado);
        
        // Tras editar, volvemos a la lista de vehículos
        response.sendRedirect("ListarVehiculos");
	}

}
