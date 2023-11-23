
package com.hackaboss.ejerciciointegradorjpa.logica;

import com.hackaboss.ejerciciointegradorjpa.persistencia.ControladoraPersistencia;
import com.hackaboss.ejerciciointegradorjpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controladora {
    
ControladoraPersistencia controlPersis = new ControladoraPersistencia();

  
    //CRUD EQUIPOS
    public void crearEquipo(Equipo equi){
       
        controlPersis.crearEquipo(equi);
    }
     
     public List<Equipo> traerEquipos() {
        return controlPersis.traerEquipos();
    }
     
     
     public Equipo traerdEquipo(Long id){
          return controlPersis.traerdEquipo(id);
      }
     
    public void eliminarEquipo(Long id){
          controlPersis.eliminarEquipo(id);
                  
        }
    
    public void editarEquipo(Equipo equipo) {
        controlPersis.editarEquipo(equipo);
     
     }
     
    //CRUD PARTIDOS 
    public void crearPartido(Partido partido){
      
        controlPersis.crearPartido(partido);
    }
       public List<Partido> traerPartidos() {
        return controlPersis.traerPartidos();
    }
          
     public Partido traerdPartido(Long id){
        return controlPersis.traerPartido(id);
      }
     
    public void eliminarPartido(Long id){
          controlPersis.eliminarPartido(id);
                  
        }
    
    public void editarPartido(Partido partido) {
        controlPersis.editarPartido(partido);
     }

}
