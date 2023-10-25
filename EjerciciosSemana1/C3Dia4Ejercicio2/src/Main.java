public class Main {
    public static void main(String[] args) {
        /*
         Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
         (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

        a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.

        b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

        c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.

        d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.*/


        Persona [] personas = new Persona[5];


        personas[0]= new Persona(1,"Juan",30,"Calle Principal 123","555-123-4567");
        personas[1]= new Persona(2,"María",28,"Avenida Secundaria 456","555-987-6543");
        personas[2]= new Persona(3,"Carlos",35,"Calle de la Montaña 789","555-234-5678");
        personas[3]= new Persona( 4,"Laura", 25,"Calle del Bosque 321","555-876-5432");
        personas[4]= new Persona(5,"Pedro",40,"Avenida Principal 987","555-345-6789");

        for (int i = 0; i < personas.length ; i++) {
            System.out.println("Nombre: "+personas[i].getNombre()+" - "+"Edad: "+personas[i].getEdad());
        }
        System.out.println("Antes del cambio de nombre");
        System.out.println(personas[2].getId() +" - "+ personas[2].getNombre() +" - "+ personas[2].getEdad() +" - "+personas[2].getDireccion()+" - "+ personas[2].getNumTelefono() );
        System.out.println(personas[3].getId() +" - "+ personas[3].getNombre() +" - "+ personas[3].getEdad() +" - "+personas[3].getDireccion()+" - "+ personas[3].getNumTelefono() );

        System.out.println("Después del cambio de nombre");
        personas[2].setNombre("Alfredo");
        personas[3].setNombre("Juliana");

        System.out.println(personas[2].getId() +" - "+ personas[2].getNombre() +" - "+ personas[2].getEdad() +" - "+personas[2].getDireccion()+" - "+ personas[2].getNumTelefono());
        System.out.println(personas[3].getId() +" - "+ personas[3].getNombre() +" - "+ personas[3].getEdad() +" - "+personas[3].getDireccion()+" - "+ personas[3].getNumTelefono());

        System.out.println("Personas mayores de 30 años");
        for (int i = 0; i < personas.length ; i++) {
            if(personas[i].getEdad()>30){
                System.out.println("Nombre: "+personas[i].getNombre()+" - "+"Edad: "+personas[i].getEdad());
            }
        }

    }
}