<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="modelo.Coche" %>
<%@ page import="modelo.Usuario" %>
<%@ page import="modelo.Rol" %>
<%
    // Recuperamos el coche que nos ha enviado el Servlet
    Coche c = (Coche) request.getAttribute("cocheDetalle");
    Usuario usu = (Usuario) session.getAttribute("usuarioLogueado");

    if (c == null) {
        response.sendRedirect("tienda.jsp");
        return;
    }
    // Determinamos si el usuario es Staff o Personal
    boolean esPersonal = (usu != null && usu.getRol().getNivel() <= 2);
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><%= c.getMarca() %> <%= c.getModelo() %> | Detalle</title>
    <link rel="stylesheet" href="styles.css">
</head>
	<body class="home-body">
	
	    <nav class="navbar">
	        <div class="nav-left">
	            <a href="index.jsp" class="nav-link">Inicio</a>
	            <a href="tienda.jsp" class="nav-link">Tienda</a>
	            <a href="sobre-nosotros.jsp" class="nav-link">Sobre Nosotros</a>
	            <a href="contacto.jsp" class="nav-link">Contacto</a>
	        </div>
	        <div class="nav-right">
	            <% if (usu == null) { %>
	                <a href="login.jsp" class="btn-nav">Login</a>
	            <% } else { %>
	                <span class="nav-link">🛒 Mi Cesta</span>
	                <a href="LogoutServlet" class="btn-nav">Cerrar Sesión</a>
	            <% } %>
	        </div>
	    </nav>
	
	    <main class="content-area">
	        <section class="hero">
	            <h1>Ficha Técnica</h1>
	            <p>Detalles exclusivos de tu próximo vehículo.</p>
	        </section>
	
	        <div class="container" style="max-width: 900px;">
	            <div style="display: flex; flex-wrap: wrap; gap: 40px; align-items: start;">
	                
	                <div style="flex: 1; min-width: 300px;">
	                    <div class="feature-card" style="padding: 10px; cursor: default;">
	                        <img src="img/coche1.png" alt="<%= c.getModelo() %>" style="width:100%; border-radius:15px; box-shadow: 0 5px 15px rgba(0,0,0,0.1);">
	                    </div>
	                </div>
	
	                <div style="flex: 1.2; min-width: 300px;">
	                    
	                    <h1 style="font-size: 2.5em; display: flex; align-items: baseline; gap: 15px; flex-wrap: wrap;">
					        <span style="color: #764ba2;"><%= c.getMarca() %></span>
					        <span style="color: #333;"><%= c.getModelo() %></span>
					    </h1>
	                    
	                    <div class="table-container" style="margin: 0;">
	                        <table style="font-size: 0.95em;">
	                            <tbody>
	                    
	                                <input type="hidden" name="idCoche" value="<%= c.getId() %>">
	                                
	                                <% if (esPersonal) { %>
	                                    <tr style="background-color: #fef3c7;">
	                                        <td><strong>ID Vehículo (Interno)</strong></td>
	                                        <td><strong><%= c.getId() %></strong></td>
	                                    </tr>
	                                <% } %>
	
	                                <tr><td>Marca</td><td><%= c.getMarca() %></td></tr>
	   
	                                <tr><td>Modelo</td><td><%= c.getModelo() %></td></tr>
	                          
	                                <tr><td>Matrícula</td><td><%= c.getMatricula() %></td></tr>
	                     
	                                <tr><td>Color</td><td><%= c.getColor() %></td></tr>
	                          
	                                <tr><td>Precio</td><td style="font-weight: bold; color: #764ba2;"><%= c.getPrecio() %> €</td></tr>
	                         
	                                <tr><td>Kilómetros</td><td><%= c.getKm() %> km</td></tr>
	                    
	                                <tr><td>Año de fabricación</td><td><%= c.getAnio() %></td></tr>
	                        
	                                <tr><td>Tipo de Motor</td><td><%= c.getTipoMotor().getTexto() %></td></tr>
	                     
	                                <tr><td>Número de Puertas</td><td><%= c.getNumPuertas() %></td></tr>
	                      
	                                <tr><td>Disponibilidad</td><td>
	                                    <span class="message-success" style="padding: 2px 10px; border-radius: 5px;">
	                                        <%= c.getEstado().getTexto() %>
	                                    </span>
	                                </td></tr>
	                            </tbody>
	                        </table>
	                    </div>
	                    
	                    <div class="form-buttons" style="justify-content: flex-start; margin-top: 25px;">
						    <% 
						        if (usu == null) { %>
						        
						            <a href="login.jsp?origen=compra&idRegreso=<%= c.getId() %>" class="btn btn-secondary">Comprar</a>
						    <% 
						        } else if (usu.getRol().getNivel() <= 2) { 
	
						    %>
						            <a href="EditarVehiculo?id=<%= c.getId() %>" class="btn btn-primary">✏️ Editar Vehículo</a>
						    <% 
						        } else { 
						    %>
						            <a href="carrito.jsp?idCoche=<%= c.getId() %>&precioCoche=<%= c.getPrecio() %>" class="btn btn-success">🛒 Añadir a la cesta</a>
						    <% 
						        } 
						    %>
						    
						
						    <% if (usu != null && usu.getRol().getNivel() <= 2) { %>
						        <a href="ListarVehiculos" class="btn btn-back">Volver</a>
						    <% } else { %>
						        <a href="tienda.jsp" class="btn btn-back">Volver</a>
						    <% } %>
			
						</div>
	                    
	                                 
	                </div>
	            </div>
	        </div>
	    </main>
	
	    <footer class="main-footer">
	        <p>&copy; 2026 Concesionario May. Todos los derechos reservados.</p>
	    </footer>
	</body>
</html>