
package com.hackaboss.ejerciciointegradorjpa.persistencia;

import com.hackaboss.ejerciciointegradorjpa.logica.Equipo;
import com.hackaboss.ejerciciointegradorjpa.logica.Partido;
import com.hackaboss.ejerciciointegradorjpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
     EquipoJpaController  equipoJpa = new EquipoJpaController();
     
     PartidoJpaController partidoJpa = new PartidoJpaController();
     
     //Equipos
     public void crearEquipo(Equipo equipo){
        equipoJpa.create(equipo);
     }
     
     public List<Equipo> traerEquipos() {
        return equipoJpa.findEquipoEntities();
    }
     
    public Equipo traerdEquipo(Long id){
          return equipoJpa.findEquipo(id);
      }
     
       public void eliminarEquipo(Long id){
         try {
             equipoJpa.destroy(id);
         } catch (NonexistentEntityException ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
       } 
    
    public void editarEquipo(Equipo equipo) {
         try {
             equipoJpa.edit(equipo);
         } catch (Exception ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
   
    //Partidos 
    public void crearPartido(Partido partido){
        partidoJpa.create(partido);
    }
    
    public List<Partido> traerPartidos() {
        return partidoJpa.findPartidoEntities();
    }
    public Partido traerPartido(Long id){
          return partidoJpa.findPartido(id);
      }
       
       public void eliminarPartido(Long id){
         try {
             partidoJpa.destroy(id);
         } catch (NonexistentEntityException ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
       } 
    
     public void editarPartido(Partido partido) {
         try {
            partidoJpa.edit(partido);
         } catch (Exception ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
}
