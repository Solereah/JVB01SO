import logica.Empleado;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        /*Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario y
        una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes
        operaciones utilizando Streams y Optionals:
        */

        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("James Gosling", 45000.00, "Desarrollador" ));
        empleados.add(new Empleado("Bill Gates", 150000.00, "Gerente" ));
        empleados.add(new Empleado("Guido Van Rossum", 50000.00, "Desarrollador" ));
        empleados.add(new Empleado("James Gosling", 45000.00, "Desarrollador" ));
        empleados.add(new Empleado("Alan Turing", 180000.00, "Gerente" ));
        empleados.add(new Empleado("Ada Lovelace", 55000.00, "Analista" ));

        // Filtra los empleados cuyo salario sea mayor a cierto valor específico
        Stream<Empleado> empleBySalario = empleados.stream()
                .filter(emp -> emp.getSalario()> 65000.00);

        empleBySalario.forEach(System.out::println);

        //Agrupa los empleados por categoría y calcula el salario promedio para cada categoría

        double promedioByCategoria = empleados.stream()
                .filter(emp->emp.getCategoria().equalsIgnoreCase("Desarrollador"))
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0.00);

        System.out.println("El salario promedio de la categoría  Desarrollador es: " +  promedioByCategoria);

        promedioByCategoria = empleados.stream()
                .filter(emp->emp.getCategoria().equalsIgnoreCase("Analista"))
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0.00);

        System.out.println("El salario promedio de la categoría Analista es: "+  promedioByCategoria);

        promedioByCategoria = empleados.stream()
                .filter(emp->emp.getCategoria().equalsIgnoreCase("Gerente"))
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0.00);

        System.out.println("El salario promedio de la categoría Gerente es: "+  promedioByCategoria);

        //Encuentra al empleado con el salario más alto utilizando Optionals.

        Optional <Empleado> empleByHigherSal = empleados.stream()
              .max(Comparator.comparingDouble(Empleado::getSalario));

        System.out.println( empleByHigherSal);
    }
}