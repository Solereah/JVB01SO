import logica.Evento;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        /*Imagina que estás construyendo una aplicación para gestionar eventos en una agenda.
        Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller").

        Implementa las siguientes operaciones utilizando Streams y Optionals:
        */

        List<Evento> eventos = Arrays.asList(new Evento("Cita cliente", LocalDate.of(2023,11,26),"Reunión"),
                new Evento("Daily", LocalDate.of(2023,11,18),"Reunión"),
                new Evento("Daily", LocalDate.of(2023,11,19),"Reunión"),
                new Evento("Premios Tech", LocalDate.of(2023,12,22),"Conferencia"),
                new Evento("Cómo Emprender", LocalDate.of(2023,11,26),"Conferencia"),
                new Evento("Ciberseguridad", LocalDate.of(2023,12,10),"Taller"),
                new Evento("Scrum", LocalDate.of(2024,1,14),"Taller"),
                new Evento("Clean Code", LocalDate.of(2023,11,26),"Taller"));

        //Filtra los eventos que están programados para una fecha específica.
        eventos.stream()
                .filter(e->e.getFecha().equals(LocalDate.of(2023,11,26)))
                .forEach(System.out::println);

       // Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        List<Evento> eventByCategory = eventos.stream()
                .filter(e->e.getCategoria().equalsIgnoreCase("Taller"))
                .toList();
        System.out.println(eventByCategory);
        System.out.println("La cantidad de eventos por la categoría Taller es: "+ eventByCategory.size());

        eventByCategory =  eventos.stream()
                .filter(e->e.getCategoria().equalsIgnoreCase("Taller"))
                .toList();
        System.out.println(eventByCategory);
        System.out.println("La cantidad de eventos por la categoría Reuníon es: "+ eventByCategory.size());

        eventByCategory =  eventos.stream()
                .filter(e->e.getCategoria().equalsIgnoreCase("Conferencia"))
                .toList();
        System.out.println(eventByCategory);
        System.out.println("La cantidad de eventos por la categoría Conferencia es: "+ eventByCategory.size());
      //Encuentra el evento más próximo en el tiempo utilizando Optionals.

        Optional<Evento> eventoProx = eventos.stream()
                .min(Comparator.comparing(Evento::getFecha));
        System.out.println("El evento próximo es : "+eventoProx);

    }
}