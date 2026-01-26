package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.DetallePedido;
import modelo.Pedido;
import modelo.Usuario;
import java.io.IOException;
import java.util.UUID;
import dao.PedidosDAO;

/**
 * Servlet implementation class FinalizarCompraServlet
 */
@WebServlet("/FinalizarCompraServlet")
public class FinalizarCompraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalizarCompraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Si intentan entrar por URL, los mandamos al index
	    response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
        
        // 1. Obtener los datos necesarios
        // El usuario debe estar en sesión (lo guardamos al hacer login)
        Usuario user = (Usuario) session.getAttribute("usuarioLogueado");
        
        // El coche que el usuario ha elegido (puedes pasarlo por ID o sesión)
        // Aquí supongo que lo pasas por un campo oculto en el formulario
        int idCoche = Integer.parseInt(request.getParameter("idCoche"));
        double precioCoche = Double.parseDouble(request.getParameter("precioCoche"));

        if (user != null) {
            // 2. Simulación de la Transacción (Lo que hablamos antes)
            String codigoTransaccion = UUID.randomUUID().toString();

            // 3. Crear el objeto Pedido (Cabecera)
            Pedido nuevoPedido = new Pedido();
            nuevoPedido.setEmailUsuario(user.getEmail());
            nuevoPedido.setNombreUsuario(user.getUsuario()); 
            nuevoPedido.setTotal(precioCoche);
            nuevoPedido.setTransaccionId(codigoTransaccion);
            nuevoPedido.setIdCoche(idCoche);

            // 4. Crear el objeto Detalle
            DetallePedido detalle = new DetallePedido();
            detalle.setIdCoche(idCoche);
            detalle.setPrecioVenta(precioCoche);
    

            // 5. Llamar al DAO para guardar todo en bloque
            PedidosDAO pedidoDAO = new PedidosDAO();
            boolean exito = pedidoDAO.registrarVentaCompleta(nuevoPedido, detalle);

            if (exito) {
                // Si sale bien, le mandamos a una página de éxito
                response.sendRedirect("confirmacion_compra.jsp?idTransaccion=" + codigoTransaccion);
            } else {
                // Si falla (ej: el coche ya se ha vendido), volvemos atrás
                response.sendRedirect("carrito.jsp?error=pago_fallido");
            }
        } else {
            // Si no hay usuario en sesión, a loguearse
            response.sendRedirect("login.jsp");
        }
    
	}

}
