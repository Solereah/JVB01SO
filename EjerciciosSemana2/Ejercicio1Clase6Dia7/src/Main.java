import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creo la lista que guarda las instancias de las clases
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        //Creo las intancias de cada clase
        Auto auto1 = new Auto(1,"ABC123","Model S", 2021, 60000.0,75,250);
        Auto auto2 = new Auto(2,"XYZ789","Leaf", 2022, 35000.0, 40, 150);
        Auto auto3 = new Auto(3,"123ABC", "Bolt", 2019, 40500.0,66,200);
        Camioneta camioneta1 = new Camioneta(4,"DEF456", "Rastrero", 2015, 20000.0, 80, 20);
        Camioneta camioneta2 = new Camioneta(5,"GHI789","Ranger", 2018, 55500.0,90, 12 );
        Moto moto1 = new Moto(6,"POT231", "AZX", 2014, 8000.0, 250.0, "L-Twin");
        Moto moto2 = new Moto(7,"RST662", "WRY", 2019, 7500.0, 150.0, "V4");
        Moto moto3 = new Moto(8,"AAB103", "Modelo Z", 2023, 9000.0, 300.0, "Single");

        //Agrego las instancias al ArrayList
        vehiculos.add(auto1);
        vehiculos.add(auto2);
        vehiculos.add(auto3);
        vehiculos.add(camioneta1);
        vehiculos.add(camioneta2);
        vehiculos.add(moto1);
        vehiculos.add(moto2);
        vehiculos.add(moto3);
        for (Vehiculo vehiculo: vehiculos) {
            if(vehiculo.getClass().isInstance(Auto)){
                (Auto)vehiculo.
            }
            System.out.println();

        }

        //Llamo a los métodos de las interfaces
        System.out.println("----------Forma de recarga de los vehículos----------");
        auto1.cargarEnergia();
        auto2.cargarEnergia();
        auto3.cargarEnergia();
        camioneta1.cargarCombustible();
        camioneta2.cargarCombustible();
        moto1.cargarCombustible();
        moto2.cargarCombustible();
        moto3.cargarCombustible();


        System.out.println("----------Información de los vehículos----------");
        for (Vehiculo vehiculo: vehiculos) {
            System.out.println(vehiculo.toString());
        }
        System.out.println("----------Antiguedad de los vehículos----------");
        for (Vehiculo vehiculo: vehiculos){
            System.out.println("La antiguedad del vehiculo " + vehiculo.getModelo()+ " es: "+vehiculo.antiguedadVehiculo()+" años");
        }
    }
}



