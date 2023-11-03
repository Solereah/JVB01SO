package org.example;
import org.example.logica.Platillo;
import org.example.persistencia.ControladoraPersistencia;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        ControladoraPersistencia controladora = new ControladoraPersistencia();

        //Crear los registros
        Platillo platillo1 = new Platillo(1,"Papas Bravas", "Papas fritas con salsa y picante",7.5);
        Platillo platillo2 = new Platillo(2,"Huevos Rotos", "Huevos fritos con papas y jamón",12.0);
        Platillo platillo3 = new Platillo(3,"Bocadillo Calamares", "Pan con calamares",9.40);

        controladora.crearPlatillo(platillo1);
        controladora.crearPlatillo(platillo2);
        controladora.crearPlatillo(platillo3);

        //Eliminar un registro de la DB
        controladora.eliminarPlatillo(platillo1.getId());

        //Editar un registro
        platillo3.setReceta("Sandwich de calamares fritos");
        controladora.editarPlatillo(platillo3);

    }
}