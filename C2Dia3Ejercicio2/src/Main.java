
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
    a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio
    de varios productos comprados por un cliente.
    Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario
    decida finalizar. Luego, muestra el total de la compra que debe abonar.*/

        double carrito = 0;
        double totalCompra = 0;

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);


        while(carrito !=-1){
            System.out.println("Ingrese el valor del producto comprado, para finalizar la compra ingrese -1.");
            carrito = teclado.nextDouble();
            totalCompra += carrito;
        }

        System.out.println("El valor total de la compra es: "+"$"+ totalCompra);

    }
}