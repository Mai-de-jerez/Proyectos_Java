<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="modelo.Usuario" %>
<%
    // Recuperamos al usuario de la sesión
    Usuario usu = (Usuario) session.getAttribute("usuarioLogueado");
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio | Concesionario May</title>
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
            <% 
                if (usu == null) { 
                    // CASO 1: Nadie logueado
            %>
                <a href="login.jsp" class="btn-nav">Login</a>
            <% 
                } else if (usu.getRol().getNivel() <= 2) { 
                    // CASO 2: Es SUPERUSER (Nivel 1) o EMPLEADO (Nivel 2) - Opciones de admin
            %>
                <a href="admin-panel.jsp" class="btn-nav">Admin</a>
                <a href="LogoutServlet" class="nav-link" style="margin-left:10px;">Salir</a>
            <% 
                } else { 
                	// CASO 3: Es CLIENTE (3) - Solo opciones de usuario
            %>
                <span class="nav-link">Hola, <%= usu.getUsuario() %></span>
                <a href="LogoutServlet" class="btn-nav">Cerrar Sesión</a>
            <% 
                } 
            %>
        </div>
    </nav>

    <main class="content-area">
        <section class="hero">
            <h1>Bienvenida al Concesionario May</h1>
            <p>Encuentra el coche de tus sueños con la mejor financiación.</p>
        </section>

        <div class="container">
        	<h1>🚗 Novedades de la semana</h1>
        	
        	<div class="welcome-section">
		         <p>Estas son nuestras mejores propuestas.</p>
	        </div>
   
            <div class="feature-cards">
                <div class="feature-card">
                    <h3>Audi A3</h3>
                    <p>Potencia y elegancia.</p>
                </div>
                <div class="feature-card">
                    <h3>Tesla Model 3</h3>
                    <p>El futuro es eléctrico.</p>
                </div>
                <div class="feature-card">
                    <h3>BMW Serie 1</h3>
                    <p>Pura deportividad.</p>
                </div>
            </div>
        </div>
    </main>

    <footer class="main-footer">
        <p>&copy; 2026 Concesionario May. Todos los derechos reservados.</p>
    </footer>

</body>
</html>