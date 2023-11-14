import logica.Estacion;
import logica.Trabajador;

public class Main {
    public static void main(String[] args) {

        int trabajadores= 3;
        Estacion estacion = new Estacion();

        for (int i = 1; i < trabajadores; i++) {
            Thread trabajador = new Thread(new Trabajador(estacion," Trabajador "+i));
            trabajador.start();
        }
    }
}