
package com.restaurantejpa.restaurante;

import com.restaurantejpa.restaurante.logica.Platillo;
import com.restaurantejpa.restaurante.persistencia.ControladoraPersistencia;
import java.util.List;

public class Restaurante {

    public static void main(String[] args) {
         
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        //Create
        Platillo plato1 = new Platillo(1,"Patatas bravas","Cebolla media, Pimentón dulce Pimentón picante , Harina de trigo y Caldo de pollo", 9.99);
        controlPersis.crearPlatillo(plato1);
        
        Platillo plato2 = new Platillo(2,"Sushi", "Arroz, Pescado fresco, Alga nori, Vinagre de arroz, Salsa de soja", 14.99);
        Platillo plato3 = new Platillo(3, "Lasagna", "Pasta de lasaña, Carne molida, Salsa de tomate, Queso ricotta, Queso mozzarella", 12.99);
        controlPersis.crearPlatillo(plato2);
        controlPersis.crearPlatillo(plato3);
        
        //Read
        System.out.println("Los Platillos ANTES son: ");
        List<Platillo> listaPlatillos = controlPersis.traerPlatillos();
        for(Platillo plato : listaPlatillos){
            System.out.println(plato.toString());
        }
        
        //Update
        plato3.setPrecio(13.99);
        controlPersis.modificarPlatillo(plato3);
        
        //Delete
        controlPersis.eliminarPlatillo(2);
        System.out.println("Los Platillos DESPUÉS son: ");
        listaPlatillos = controlPersis.traerPlatillos();
        for(Platillo plato : listaPlatillos){
            System.out.println(plato.toString());
        }

        
    }
}
