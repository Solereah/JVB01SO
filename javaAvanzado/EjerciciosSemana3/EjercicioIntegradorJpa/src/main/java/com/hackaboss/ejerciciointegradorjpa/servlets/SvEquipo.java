
package com.hackaboss.ejerciciointegradorjpa.servlets;

import com.hackaboss.ejerciciointegradorjpa.logica.Controladora;
import com.hackaboss.ejerciciointegradorjpa.logica.Equipo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEquipo", urlPatterns = {"/SvEquipo"})
public class SvEquipo extends HttpServlet {
    List<Equipo> equipos = new ArrayList();

    private Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
     
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            equipos =  control.traerEquipos();
            
           // HttpSession miSession = request.getSession();
           // miSession.setAttribute("equipos",equipos);
            
       //Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultadosEquipos", equipos);
        
        //Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             Equipo equipo = new Equipo();
        
        
            String nombre = request.getParameter("nombre");
            String ciudad = request.getParameter("ciudad");
            
            equipo.setNombre(nombre);
            equipo.setCiudad(ciudad);
            
            control.crearEquipo(equipo);
          
           
             
            response.sendRedirect("index.jsp");
 
            
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
