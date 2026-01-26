<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="modelo.Usuario" %>
<%@ page import="modelo.Rol" %>

<%
    // 1. EL PORTERO DE SEGURIDAD: Solo Superuser (Nivel 1)
    Usuario usuLogueado = (Usuario) session.getAttribute("usuarioLogueado");
    
    if (usuLogueado == null || usuLogueado.getRol().getNivel() != 1) {
        session.setAttribute("mensaje", "Acceso denegado: Área exclusiva de administración.");
        response.sendRedirect("login.jsp");
        return; 
    }

    // 2. RECUPERAR DATOS DEL USUARIO A EDITAR
    Usuario u = (Usuario) request.getAttribute("usuario");
    if (u == null) {
        response.sendRedirect("ListarUsuariosServlet");
        return;
    }
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Editar Usuario - Sistema de Gestión</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>✏️ Editar Usuario (ID: <%= u.getId() %>)</h1>

        <form id="formUsuario" action="EditarUsuario" method="post">
            
            <%-- CAMPO OCULTO: Vital para que el Servlet sepa qué ID actualizar --%>
            <input type="hidden" name="id" value="<%= u.getId() %>">

            <div class="form-grid">
                <div class="form-group">
                    <label for="usuario">Nombre de Usuario: *</label>
                    <input type="text" id="usuario" name="usuario" required value="<%= u.getUsuario() %>">
                </div>

                <div class="form-group">
                    <label for="email">Email: *</label>
                    <input type="email" id="email" name="email" required value="<%= u.getEmail() %>">
                </div>

                <div class="form-group">
                    <label for="rol">Rol del Sistema: *</label>
    
				    <% if (u.getRol().getNivel() == 1) { %>
				        <%-- Si el usuario es Nivel 1, mostramos el campo bloqueado (gris) --%>
				        <select id="rol_visible" name="rol_visible" class="btn-disabled" disabled style="width: 100%;">
				            <option value="SUPERUSER" selected>SUPERUSER</option>
				        </select>
				        
				        <%-- IMPORTANTE: Como el 'disabled' no envía datos, mandamos el rol en un hidden --%>
				        <input type="hidden" name="rol" value="SUPERUSER">
				
				    <% } else { %>
				        <%-- Si NO es nivel 1, mostramos el select normal, pero SIN la opción de subirlo a Nivel 1 --%>
				        <select id="rol" name="rol" required>
				            <% for (Rol r : Rol.values()) { 
				                if (r.getNivel() != 1) { // Solo permitimos elegir niveles 2 y 3 %>
				                    <option value="<%= r.name() %>" <%= r == u.getRol() ? "selected" : "" %>>
				                        <%= r.name() %> (Nivel <%= r.getNivel() %>)
				                    </option>
				            <%   } 
				            } %>
				        </select>
				        <small style="color: #666;">Puedes cambiar entre Empleado y Cliente.</small>
				    <% } %>
                </div>

                <div class="form-group">
                    <label for="password">Nueva Contraseña:</label>
                    <input type="password" id="password" name="password" placeholder="Dejar en blanco para no cambiar">
                    <small style="color: #666; font-style: italic;">Solo rellena este campo si quieres resetear la clave.</small>
                </div>
            </div>

            <div class="form-buttons">
                <button type="submit" class="btn btn-success">💾 Actualizar Usuario</button>
                <button type="reset" class="btn btn-secondary">🔄 Limpiar Formulario</button>
                <a href="ListarUsuariosServlet" class="btn btn-back">❌ Cancelar</a>
            </div>
        </form>
    </div>
</body>
</html>