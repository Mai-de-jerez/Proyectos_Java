package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.TipoMotor;
import modelo.EstadoVehiculo;
import java.io.IOException;



/**
 * Servlet implementation class AltaVehiculo
 */
@WebServlet("/AltaVehiculo")
public class AltaVehiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AltaVehiculo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			    	    
		// 1. Recogemos los datos 	    
	    String marca = request.getParameter("marca");
	    String nombreModelo = request.getParameter("modelo");
	    String matricula = request.getParameter("matricula");
	    String color = request.getParameter("color");
	    double precio = Double.parseDouble(request.getParameter("precio"));
	    int km = Integer.parseInt(request.getParameter("km"));
	    String anio = request.getParameter("anio");

	    int numPuertas = Integer.parseInt(request.getParameter("numPuertas"));
	    
	    String motorStr = request.getParameter("tipoMotor");  	    
	    TipoMotor motorEnum = TipoMotor.valueOf(motorStr.toUpperCase());
	    
	    String estadoStr = request.getParameter("estado");
	    EstadoVehiculo estadoEnum = EstadoVehiculo.desdeTexto(estadoStr);
	
	    // 2. Creamos el objeto Coche con los datos nuevos 
	    modelo.Coche coche = new modelo.Coche(0, marca, nombreModelo, matricula, color, precio, km, anio, motorEnum, numPuertas, estadoEnum);

	    // 3. Usamos el CocheDAO para insertar 
	    dao.CocheDAO miDao = new dao.CocheDAO();
	    miDao.insertar(coche); 
	    
	    // 4. Redirigimos (mejor a un JSP de éxito o al listado)
	    response.sendRedirect("ListarVehiculos");
	}

}
