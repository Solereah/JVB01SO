import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         CONSIGNA:
         Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

         Compañeros de grupo:
         Jose del Palacio Casanova
         Oscar Cuenca Martin

         CONCLUSIÓN:
         Con los conocimientos vistos hasta la fecha, la mejor opción que encontramos fué pedirle al usuario que evite colocar el 0 como segundo número. Hasta que podamos trabajar con estructuras de control.

         */

        int num1, num2, suma, resta, multiplicacion;
        double division;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número, tener en cuenta que debe ser distinto a cero: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + division);


    }


}