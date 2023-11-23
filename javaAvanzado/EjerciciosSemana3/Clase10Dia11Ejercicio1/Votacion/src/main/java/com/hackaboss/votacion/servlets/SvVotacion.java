
package com.hackaboss.votacion.servlets;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvVotacion", urlPatterns = {"/SvVotacion"})
public class SvVotacion extends HttpServlet {
  private final Map<String, Integer> listaVotos = new HashMap<>();
     
  public SvVotacion() {
       
        }

   public Map<String, Integer> getListaVotos() {
        return listaVotos;
    }
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
            HttpSession miSession = request.getSession();
            if (miSession.getAttribute("listaVotos") == null) {
                miSession.setAttribute("listaVotos", listaVotos);
            }   

        // Redirigir de vuelta al formulario
        response.sendRedirect("index.jsp");
    }
    

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
            String voto = request.getParameter("voto");
           
            votar(voto);
       
 
 
        //Redirigir después de procesar el voto
            response.sendRedirect("index.jsp");
    
    }
    
    
    private synchronized void votar(String voto) {
        
        // Sumar los votos a cada partido
        listaVotos.put(voto, listaVotos.getOrDefault(voto, 0) + 1);
    }
    
  

    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
   
}


