public class Main {
    public static void main(String[] args) {
 /*
    * a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String. Asigna un valor a cada variable y muestra su contenido en la consola.b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar el por qué de cada caso. Debatir con otros compañeros.*/

        //compañeros Jose del Palacio Casanova
        //Oscar Cuenca Martin

        //EL programa se rompe  porque  no puede convertir el tipo de dato. Esto se genera en todas las situaciones debido a que Java es un lenguaje fuertemente tipado y no puede convertir el tipo de dato una vez asignado.

        //Java es un lenguaje de programación fuertemente tipado (también llamado de tipado //estático). Esto quiere decir que al declarar una variable en Java tendremos que //indicar su tipo y no podrá cambiar de un tipo a otro a lo largo de la ejecución //del programa.

        int num = 7;
        double altura = 9.3;
        boolean esProgramador = true;
        String nombre = "Sol";

        System.out.println(num + " --> Es es un dato de tipo int.");
        System.out.println(altura + " --> Es es un dato de tipo double.");
        System.out.println(esProgramador + " --> Es es un dato de tipo booleano.");
        System.out.println(nombre + " --> Es es un dato de tipo string.");
        System.out.println("----------------------------------------");

        num = "2";
        altura = true;
        esProgramador = 1.9;
        nombre = 8;


        System.out.println(num + " --> Es es un dato de tipo int.");
        System.out.println(altura + " --> Es es un dato de tipo double.");
        System.out.println(esProgramador + " --> Es es un dato de tipo booleano.");
        System.out.println(nombre + " --> Es es un dato de tipo string.");

    }
}