public class Main {
    public static void main(String[] args) {
/*


        c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.

        d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
            No es posible asignar directamente un objeto de tipo "Animal" a "Mamifero". Se podría hacer con un casting si lo hacemos así:
             Animal animal1 = new Mamifero(1, "León", 3, "Piel peluda", "Carnívoro", 4, "Vivíparo", "Amarillo", "Savannah");

        E) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?
            No es posible acceder. Al pasar a "private" ninguna otra clase puede hacer uso de ese método, porque está encapsulado a un nivel de acceso totalmente privado.

    */

        //Instancias de cada clase
        Mamifero mamifero1 = new Mamifero(1, "León", 3, "Piel peluda", "Carnívoro", 4, "Vivíparo", "Amarillo", "Savannah");
        Ave ave1 = new Ave(2, "Águila", 7, "Plumaje", "Carnívoro", 2.5, "Planeador", "Marrón", "Pico curvado");
        Reptil reptil1 = new Reptil(3, "Cocodrilo", 10, "Escamas", "Carnívoro", 4.5, "Duras", "No venenosa", "Pantano");
        Animal animal1 = new Animal();


        //Llamando al método saludar de cada objeto.
        ave1.saludar();
        mamifero1.saludar();
        reptil1.saludar();



    }

}