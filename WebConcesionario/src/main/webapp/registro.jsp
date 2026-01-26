<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro - Usuarios</title>
    <link rel="stylesheet" href="styles.css"> 
    <style>
        /* Añado este pequeño ajuste para que el formulario no sea gigante en PC */
        .registro-box { max-width: 500px; margin: auto; }
    </style>
</head>
<body>

    <div class="container login-container">
        <h1>Crear nuevo usuario</h1>
        
        <%-- Mensajes de error o éxito --%>
        <% if(request.getAttribute("error") != null) { %>
            <div class="message message-error">
                <%= request.getAttribute("error") %>
            </div>
        <% } %>

        <form action="RegistroServlet" method="post" autocomplete="off">
            
            <div class="form-group">
                <label for="usuario">Nombre de Usuario</label>
                <input type="text" id="usuario" name="usuario" placeholder="username" required>
            </div>

            <div class="form-group">
                <label for="email">Correo Electrónico</label>
                <input type="email" id="email" name="email" placeholder="email" required>
            </div>

            <div class="form-group">
                <label for="password">Contraseña</label>
                <input type="password" id="password" name="password" placeholder="password" required autocomplete="new-password">
            </div>
            
            <div class="form-register">
                <span>¿Ya tienes cuenta?</span>
                <a href="login.jsp">Inicia sesión aquí</a>
            </div>

			<button type="submit" class="btn btn-primary" style="width: 100%;">Crear Cuenta</button>
            
        </form>
		
		<a href="index.jsp" class="btn btn-back" style="width: 100%; display: block; margin-top: 15px;">Volver al Inicio</a>
    </div>

</body>
</html>