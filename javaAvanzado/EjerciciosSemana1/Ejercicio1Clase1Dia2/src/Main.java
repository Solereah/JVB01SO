import logica.ReservaVuelo;
import logica.ReservaInvalidaException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        String respuesta = "";
        boolean bandera = false;
        Scanner teclado = new Scanner(System.in);
        List<ReservaVuelo> listaReservas = new ArrayList<>();
        int asientosLibres = 4;


        try {
            ReservaVuelo reserva1 = new ReservaVuelo("Juan Perez","Miami", LocalDate.of(2023,12,2), 2);

            //ReservaVuelo reserva3 = new ReservaVuelo("Pedro Sanchez", null, LocalDate.of(2023,11,15),6);
            ReservaVuelo reserva2 = new ReservaVuelo();
            reserva2.setNombre("Silvia Arroyo");
            reserva2.setDestino("Miami");
            reserva2.setFechaViaje(LocalDate.of(2023,10,5));

            reserva1.reservarAsientos(asientosLibres);
            System.out.println("Su reserva se realizó con exito");
        } catch (ReservaInvalidaException e) {
            System.err.println("Hubo un error en la reserva: " + e.getMessage());
        }
        finally {
            System.out.println("Ante cualquier consulta comuniquese con Atención al cliente al 0800-333-0033");
        }

    }
}










