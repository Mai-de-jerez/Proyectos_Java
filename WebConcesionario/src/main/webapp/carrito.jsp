<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="modelo.Usuario" %>
<%
    // Aseguramos que solo entran usuarios logueados
    Usuario usu = (Usuario) session.getAttribute("usuarioLogueado");
    if (usu == null) {
        response.sendRedirect("login.jsp");
        return; // Paramos la ejecución
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Pasarela de Pago - Concesionario May</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Resumen de tu compra</h2>
        
        <div class="resumen-coche">
            <p>Estás a punto de comprar el coche con ID: <strong>${param.idCoche}</strong></p>
            <p>Precio total: <strong>${param.precioCoche} €</strong></p>
        </div>

        <hr>

        <form action="FinalizarCompraServlet" method="post">
            <h4>Datos de Facturación</h4>
            <p>Usuario: ${usuarioLogueado.usuario}</p>
            <p>Email: ${usuarioLogueado.email}</p>

            <h4>Datos de la Tarjeta (Simulado)</h4>
            <input type="text" placeholder="Número de tarjeta" required>
            <input type="text" placeholder="MM/YY" style="width: 100px;" required>
            <input type="text" placeholder="CVV" style="width: 100px;" required>

            <input type="hidden" name="idCoche" value="${param.idCoche}">
            <input type="hidden" name="precioCoche" value="${param.precioCoche}">
            

            <br><br>
            <button type="submit" class="btn-pagar">Confirmar y Pagar</button>
        </form>
        
        <a href="index.jsp">Cancelar y volver</a>
    </div>
</body>
</html>