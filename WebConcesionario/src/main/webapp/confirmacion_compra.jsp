<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="modelo.Usuario" %>
<%
    // Recuperamos el objeto usuario de la sesión para estar seguros
    Usuario usu = (Usuario) session.getAttribute("usuarioLogueado");
    
    // Si alguien intenta entrar aquí sin haber comprado nada (sin ID de transacción), lo echamos
    if (request.getParameter("idTransaccion") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>¡Compra Completada!</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container" style="text-align: center; margin-top: 50px;">
        <h1 style="color: #28a745;">✔ ¡Venta Realizada con Éxito!</h1>
        <p>Gracias por tu confianza, <strong>${usuarioLogueado.usuario}</strong>.</p>
        
        <div class="ticket" style="border: 2px dashed #999; padding: 20px; display: inline-block; background-color: #f9f9f9;">
            <h3>Resumen de la Operación</h3>
            <p>ID de Transacción: <strong>${param.idTransaccion}</strong></p>
            <p>Email del cliente: <strong>${usuarioLogueado.email}</strong></p>
            <p style="font-size: 0.9em; color: #666;">Guarda este código como comprobante.</p>
        </div>

        <br><br>
        <a href="tienda.jsp" style="text-decoration: none; color: blue;">← Volver al catálogo de coches</a>
    </div>
</body>
</html>