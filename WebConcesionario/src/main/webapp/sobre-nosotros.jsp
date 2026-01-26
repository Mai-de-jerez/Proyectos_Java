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
    <title>Sobre Nosotros | Concesionario May</title>
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

        <div class="container">
        	<h1>🚗 Nuestra trayectoria lo que mejor nos define</h1>
        	<img src="img/sobre-nosotros.jpg" alt="Sobre Nosotros" class="hero-image">
        	<div class="welcome-section">
		         <p>En Concesionario May, nos avala una trayectoria consolidada y una experiencia profunda en el sector automotriz, lo que nos permite ofrecer un servicio de excelencia tanto en nuestras modernas instalaciones físicas como a través de nuestra plataforma de venta online. Nos enorgullece ser un referente en el mercado de vehículos de primera y segunda mano, seleccionando cada unidad bajo los más estrictos estándares de calidad para garantizar la máxima seguridad y satisfacción de nuestros clientes. Siempre situados a la vanguardia de la industria, integramos las últimas innovaciones tecnológicas y las tendencias más punteras del mundo del motor para asegurar que cada coche en nuestro catálogo represente lo mejor en rendimiento, eficiencia y diseño. Nuestra filosofía se basa en combinar la cercanía del trato personal con la agilidad del entorno digital, ofreciendo una experiencia de compra transparente, profesional y adaptada a las necesidades de los conductores más exigentes de hoy en día.</p>
	        </div>           
        </div>
    </main>

    <footer class="main-footer">
        <p>&copy; 2026 Concesionario May. Todos los derechos reservados.</p>
    </footer>

</body>
</html>