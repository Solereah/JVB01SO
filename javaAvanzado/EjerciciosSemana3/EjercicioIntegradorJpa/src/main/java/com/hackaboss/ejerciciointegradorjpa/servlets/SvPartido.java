
package com.hackaboss.ejerciciointegradorjpa.servlets;

import com.hackaboss.ejerciciointegradorjpa.logica.Controladora;
import com.hackaboss.ejerciciointegradorjpa.logica.Equipo;
import com.hackaboss.ejerciciointegradorjpa.logica.Partido;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvPartido", urlPatterns = {"/SvPartido"})
public class SvPartido extends HttpServlet {
    List<Partido> partidos = new ArrayList();

    private Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            partidos =  control.traerPartidos();
            
         
           request.setAttribute("resultadosPartidos", partidos);
        
           //Redirigir de vuelta al formulario
           request.getRequestDispatcher("index.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        List<Equipo> listaEquipos = control.traerEquipos();
        Partido nuevoPartido = new Partido();

        String fechaInput = request.getParameter("fecha");
        String nombreEquipoLocal = request.getParameter("equipoLocal");
        String nombreEquipoVisitante = request.getParameter("equipoVisitante");
        String resultadoPartido = request.getParameter("resultadoPartido");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyy-MM-dd");
           
    try {
        if (fechaInput != null && nombreEquipoLocal != null && nombreEquipoVisitante != null) {
            Date fecha = sdf.parse(fechaInput);
            nuevoPartido.setFecha(fecha);

            for (Equipo equipo : listaEquipos) {
                if (equipo.getNombre().equalsIgnoreCase(nombreEquipoVisitante)) {
                    nuevoPartido.setEquipoLocal(equipo);
                }

                if (equipo.getNombre().equalsIgnoreCase(nombreEquipoLocal)) {
                    nuevoPartido.setEquipoVisitante(equipo);
                }
            }

            nuevoPartido.setResultado(resultadoPartido);

            control.crearPartido(nuevoPartido);
        } else {
              request.getRequestDispatcher("Error.jsp").forward(request, response);
            }
        }catch (ParseException ex) {
        Logger.getLogger(SvPartido.class.getName()).log(Level.SEVERE, "Error al parsear la fecha", ex);
        }
        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
