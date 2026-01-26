<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // 1. Recuperamos al sujeto
    modelo.Usuario usu = (modelo.Usuario) session.getAttribute("usuarioLogueado");
    
    // 2. EL PORTERO: Solo niveles 1 (Superuser) y 2 (Empleado)
    // Si es nulo O si es nivel 3 (Cliente), ¡fuera!
    if (usu == null || usu.getRol().getNivel() > 2) {
        request.setAttribute("error", "Acceso restringido: Solo el personal puede añadir vehículos.");
        // Usamos dispatch para que el mensaje de error llegue al login
        request.getRequestDispatcher("login.jsp").forward(request, response);
        return; 
    }
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alta de Vehículo - Sistema de Gestión</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>➕ Alta de Vehículo (Turismo)</h1>

             
        <form id="formVehiculo" action="AltaVehiculo" method="post">
		    <div class="form-grid">
		        <div class="form-group">
		            <label for="matricula">Matrícula: *</label>
		            <input type="text" id="matricula" name="matricula" required placeholder="Ej: 1234ABC">
		        </div>
		
		        <div class="form-group">
		            <label for="marca">Marca: *</label>
		            <input type="text" id="marca" name="marca" required placeholder="Ej: Toyota">
		        </div>
		
		        <div class="form-group">
		            <label for="modelo">Modelo: *</label>
		            <input type="text" id="modelo" name="modelo" required placeholder="Ej: Corolla">
		        </div>
		
		        <div class="form-group">
		            <label for="color">Color:</label>
		            <input type="text" id="color" name="color" placeholder="Ej: Blanco">
		        </div>
		
		        <div class="form-group">
		            <label for="precio">Precio (€): *</label>
		            <input type="number" step="0.01" id="precio" name="precio" required placeholder="15000.50">
		        </div>
		
		        <div class="form-group">
		            <label for="km">Kilómetros: *</label>
		            <input type="number" id="km" name="km" required placeholder="Ej: 50000">
		        </div>
		
		        <div class="form-group">
		            <label for="anio">Año:</label>
		            <input type="text" id="anio" name="anio" placeholder="Ej: 2023">
		        </div>

		        
		        <div class="form-group">
				    <label for="tipoMotor">Tipo de Motor: *</label>
				    <select id="tipoMotor" name="tipoMotor" required>
				        <option value="Gasolina">Gasolina</option>
				        <option value="Diesel">Diésel</option>
				        <option value="Eléctrico">Eléctrico</option>
				        <option value="Híbrido">Híbrido</option>
				    </select>
				</div>
		
		        <div class="form-group">
		            <label for="numPuertas">Número de Puertas:</label>
		            <select id="numPuertas" name="numPuertas">
		                <option value="3">3 puertas</option>
		                <option value="4" selected>4 puertas</option>
		                <option value="5">5 puertas</option>
		            </select>
		        </div>
		 
		        <div class="form-group">
				    <label for="estado">Estado:</label>
				    <select id="estado" name="estado">
				        <option value="Disponible">Disponible</option>
				        <option value="Reservado">Reservado</option>
				        <option value="Vendido">Vendido</option>
				    </select>
				</div>
		    </div>
		
		    <div class="form-buttons">
		        <button type="submit" class="btn btn-success">💾 Guardar Vehículo</button>
                <button type="reset" class="btn btn-secondary">🔄 Limpiar </button>
                <a href="ListarVehiculos" class="btn btn-back">❌ Cancelar</a>
		    </div>
		</form>
    </div> 
</body>
</html>
