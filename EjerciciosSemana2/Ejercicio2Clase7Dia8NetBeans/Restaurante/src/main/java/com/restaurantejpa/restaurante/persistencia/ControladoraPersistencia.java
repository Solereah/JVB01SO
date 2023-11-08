
package com.restaurantejpa.restaurante.persistencia;

import com.restaurantejpa.restaurante.logica.Platillo;
import com.restaurantejpa.restaurante.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    PlatilloJpaController platoJpa = new PlatilloJpaController();

     public void crearPlatillo(Platillo plato){
         platoJpa.create(plato);
    }
    
    public List<Platillo> traerPlatillos(){
      return  platoJpa.findPlatilloEntities();
    }
    
    public Platillo buscarPlatillo(int id){
        return  platoJpa.findPlatillo(id);
    }
    public void eliminarPlatillo(int id){
        try {
             platoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarPlatillo(Platillo plato) {
        try {
             platoJpa.edit(plato);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
