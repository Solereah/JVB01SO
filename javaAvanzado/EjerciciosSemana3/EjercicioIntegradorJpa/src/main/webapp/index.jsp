
<%@page import="java.util.List"%>
<%@page import="com.hackaboss.ejerciciointegradorjpa.logica.Equipo"%>
<%@page import="com.hackaboss.ejerciciointegradorjpa.logica.Partido"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Campeonato</title>
    <!-- Agregar estilos de Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body class="bg-primary bg-gradient text-white">
    <div class="container mt-4 bg-info text-white rounded">
        <h1>Torneo de Basquet</h1>
        <h5>Registrar Equipo</h5>
        <form action="SvEquipo" method="post">
      
               <div class="form-group">
                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre">
            </div>
                <div class="form-group">
                <label for="ciudad">Ciudad</label>
                <input type="text" class="form-control" id="ciudad" name="ciudad">
            </div>
        <button type="submit" class="btn btn-primary">Registrar Equipo</button>
        </form>
        <br>
        <form action="SvEquipo" method="get">
             <button type="submit" class="btn btn-primary">Ver equipos</button>
        </form>
        <hr>

   
    <br>
    <br>
    <!-- Resultados de Equipos en tabla -->
    
      <div class="results-table rounded">
        <% if (request.getAttribute("resultadosEquipos") != null) { %>
            <h3>Equipos:</h3>
            <table class="table text-white">
                <thead>
                    <tr>
                        <th>Nombre del Equipo</th>
                        <th>Ciudad</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultadosEquipos")) { %>
                        <tr>
                            <td><%= equipo.getNombre()%></td>
                            <td><%= equipo.getCiudad()%></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% } %>
    </div>
   
 </div>
        <!-- Registrar Partido -->
     <div class="container mt-4 bg-info text-white rounded">
        
        <h5 class="p-2">Registrar Partido</h5>
        <form action="SvPartido" method="post">
      
            <div class="form-group">
                <label for="nombre">Fecha del Partido</label>
                <input type="date" class="form-control" id="nombre" name="fecha">
            </div>
            <div class="form-group">
                <label for="equipoLocal">Equipo Local</label>
                <input type="text" class="form-control" id="ciudad" name="equipoLocal" value="equipoLocal">
            </div>
            <div class="form-group">
                <label for="equipoVisitante">Equipo Visitante</label>
                <input type="text" class="form-control" id="ciudad" name="equipoVisitante" value="equipoVisitante">
            </div>
                <div class="form-group">
                <label for="resultadoPartido">Resultado del Partido</label>
                <input type="text" class="form-control" id="ciudad" name="resultadoPartido">
            </div>
            
        <button type="submit" class="btn btn-primary">Registrar Partido</button>
        </form>
        <br>
        <form action="SvPartido" method="get">
             <button type="submit" class="btn btn-primary">Ver Partidos</button>
        </form>
        <hr>

       <!-- Resultados de Partidos en tabla -->
    
      <div class="results-table rounded">
        <% if (request.getAttribute("resultadosPartidos") != null) { %>
            <h3>Resultados:</h3>
            <table class="table text-white">
                <thead>
                    <tr>
                        <th>Fecha</th>
                        <th>Equipo Local</th>
                        <th>Equipo visitante</th>
                        <th>Resultado del Partido</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Partido partido : (List<Partido>) request.getAttribute("resultadosPartidos")) { %>
                        <tr>
                            <td><%=partido.getFechaFormateada()%></td>
                            <td><%=partido.getEquipoLocal().getNombre()%></td>
                            <td><%=partido.getEquipoVisitante().getNombre()%></td>
                            <td><%=partido.getResultado()%></td>
                            
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
</html>