public class Main {
    public static void main(String[] args) {
       /*
         b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones,
         2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).

         c) Crear los siguientes métodos (en cada subclase correspondiente):

         Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).

         Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).

         Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).

         Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).

         d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.

        PISTA: Todos tendrán el mismo método, con el mismo nombre, pero únicamente cambia el mensaje que muestran.

        */

        Vestimenta[] vestimentas = new Vestimenta[9];

        vestimentas[0] = new Zapato(1,"Zapato de senderismo",59.99,"Columbia","43","Gris","Cuero","Cordones");
        vestimentas[1] = new Zapato(2,"Sandalia de playa",24.99,"Havaianas","38","Amarillo","Goma","Correa");
        vestimentas[2] = new Zapato(3,"Botas de invierno",89.99,"Timberland","45","Marrón","Cuero","Cremallera");
        vestimentas[3] = new Pantalon(4,"Pantalón de vestir",74.99,"Hugo Boss","36","Gris","Formal","Lana");
        vestimentas[4] = new Pantalon(5,"Pantalón corto",19.99,"Adidas","L","Rojo","Casual","Algodón");
        vestimentas[5] = new Pantalon(6,"Pantalón cargo",49.99,"Columbia","33","Verde","Cargo","Lona");
        vestimentas[6] = new Camiseta(7,"Camiseta manga larga",29.99,"Adidas","XL","Gris","Larga","Redondo");
        vestimentas[7] = new Camiseta(8,"Camiseta polo",34.99,"Ralph Lauren","L","Verde","Corta","Polo");
        vestimentas[8] = new Sombrero(9,"Sombrero de verano",19.99,"SunHats","M","Azul","Panamá",58.5);

        for (Vestimenta vestimenta: vestimentas) {
            vestimenta.mostrar();
        }
    }
}