<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="modelo.Usuario" %> 
<%
    // 1. Recuperamos al sujeto
    Usuario usuLogueado = (Usuario) session.getAttribute("usuarioLogueado");
    
    // 2. SEGURIDAD: Gestión de usuarios solo para Nivel 1 (SUPERUSER)
    if (usuLogueado == null || usuLogueado.getRol().getNivel() != 1) {
        session.setAttribute("mensaje", "Acceso denegado: Solo el Administrador puede gestionar usuarios.");
        response.sendRedirect("login.jsp");
        return; 
    }
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Usuarios - Sistema de Gestión</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <div class="header-actions">
            <h1>👤 Lista de Usuarios</h1>
            <% 
			    // Recuperamos el mensaje si existe (de éxito al borrar o editar)
			    String mensaje = (String) session.getAttribute("mensaje");
			    if (mensaje != null) {
			%>
			    <div class="message message-success">
			        <%= mensaje %>
			    </div>
			<% 
			        session.removeAttribute("mensaje");
			    } 
			%>
			
			<a href="alta-usuario.jsp" class="btn btn-success">➕ Nuevo Usuario</a>
		    
        </div>

        <div class="table-container">
            <table id="tablaUsuarios">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre de Usuario</th>
                        <th>Email</th>
                        <th>Rol</th>
                        <th>Nivel</th>
                        <th style="text-align: center;">Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
                        List<Usuario> lista = (List<Usuario>) request.getAttribute("listaUsuarios");
                        
                        if (lista != null && !lista.isEmpty()) {
                            for (Usuario u : lista) {
                    %>
                    <tr>
                        <td style="font-weight: bold; color: #764ba2;"><%= u.getId() %></td>
                        <td><strong><%= u.getUsuario() %></strong></td>
                        <td><%= u.getEmail() %></td>
                        <td><%= u.getRol() %></td>
                        <td><%= u.getRol().getNivel() %></td> 
                        
                        
                        <td class="actions" style="text-align: center;">
				
						    <a href="DetalleUsuarioServlet?id=<%= u.getId() %>" class="row-btn btn-success btn-small">Ver más</a>
					
						    <a href="EditarUsuario?id=<%= u.getId() %>" class="row-btn btn-primary btn-small">Editar</a>
		
						    <% if (u.getRol().getNivel() != 1) { %>
			
						        <a href="EliminarUsuario?id=<%= u.getId() %>" 
						           class="row-btn btn-secondary btn-small" 
						           onclick="return confirm('¿Estás seguro de eliminar a <%= u.getUsuario() %>?')">Eliminar</a>
						    <% } else { %>
						        <span>🔒</span>
						    <% } %>
						</td>
                           
                    </tr>
                    <% 
                            }
                        } else { 
                    %>
                    <tr>
                        <td colspan="6" style="text-align:center;">No hay usuarios registrados todavía.</td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </div>

        <div class="nav-buttons">
            <%-- Como es gestión, volvemos al panel de control --%>
            <a href="admin-panel.jsp" class="btn btn-back">Volver al Panel</a>
        </div>
    </div>
</body>
</html>