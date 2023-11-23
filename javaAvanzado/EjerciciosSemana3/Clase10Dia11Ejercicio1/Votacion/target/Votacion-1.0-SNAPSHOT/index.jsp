
<%@page import="com.hackaboss.votacion.servlets.SvVotacion"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="com.hackaboss.votacion.logica.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Votacion</title>
    <!-- Agregar estilos de Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h1>Votación</h1>
        <h5>Elija su voto:</h5>
        <form action="SvVotacion" method="post">
            <div class="form-check">
                <input class="form-check-input" type="radio" name="voto" id="flexRadioDefault1" value="partido A">
                <label class="form-check-label" for="flexRadioDefault1">
                    Partido A
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="voto" id="flexRadioDefault2"  value="partido B" checked>
                <label class="form-check-label" for="flexRadioDefault2">
                    Partido B
                </label>
            </div>
              <div class="form-check">
                <input class="form-check-input" type="radio" name="voto" id="flexRadioDefault3"  value="partido C" checked>
                <label class="form-check-label" for="flexRadioDefault3">
                   Partico C
                </label>
            </div>
   
            <br>
            <button type="submit" class="btn btn-primary">Votar</button>
        </form>

        <br>
        <form action="SvVotacion" method="get">
            <input type="hidden" name="action" value="showResults">
            <button type="submit" class="btn btn-success">Mostrar resultados</button>
        </form>
   
    <br>
    <br>
    
     <div class="results-table">
    <%
        HttpSession miSession = request.getSession();
        Map<String, Integer> listaVotos = (HashMap<String, Integer>) miSession.getAttribute("listaVotos");
    %>
    <div class="results-table" id="results-table">
        <% 
        if (listaVotos != null && !listaVotos.isEmpty()) {
        %>
   
        <h3>Resultados:</h3>
        <table class="table">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Cantidad de Votos</th>
                </tr>
            </thead>
           <tbody>
                <% 
                    for (Map.Entry<String, Integer> entry : listaVotos.entrySet()) {
                %>
                    <tr>
                        <td><%= entry.getKey() %></td>
                        <td><%= entry.getValue() %></td>
                    </tr>
                <% } %>
            </tbody>
        </table>
    <% } %>
</div>
   
 </div>
    <!-- Scripts de Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>

<script>
    // Espera a que la página se cargue por completo
        document.addEventListener("DOMContentLoaded", function() {
        // Obtiene la tabla
        var resultsTable = document.getElementById("results-table");

        // Muestra la tabla 
        resultsTable.style.display = "block";

        // Ocultar la tabla después de 5 segundos
        setTimeout(function() {
            resultsTable.style.display = "none";
        }, 5000); 
    });
</script>



</html>