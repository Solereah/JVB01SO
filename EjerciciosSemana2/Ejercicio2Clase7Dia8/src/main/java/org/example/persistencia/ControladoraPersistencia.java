package org.example.persistencia;
import org.example.logica.Platillo;

import java.util.List;


public class ControladoraPersistencia {
        PlatilloJpaController platilloJpa = new PlatilloJpaController();

        public void crearPlatillo(Platillo platillo){
            platilloJpa.create(platillo);
        }
        public void eliminarPlatillo(int id) throws Exception {
            platilloJpa.destroy(id);
        }
        public void editarPlatillo(Platillo platillo)throws Exception{
            platilloJpa.editarPlatillo(platillo);
        }

        public List<Platillo> traerPlatillos() {
            return platilloJpa.findPlatillosEntities();
        }


    }


