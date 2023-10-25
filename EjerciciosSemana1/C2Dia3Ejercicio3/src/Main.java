import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de
        la última semana, calcule la temperatura máxima promedio que hubo.
        Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima
        de cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo
        el vector y mostrando el resultado por pantalla.
        */
        //decclaro
        double [] temperaturas = new double[7];
        double tempMax;
        double totalTemp=0;
        double promedio =0;
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        for(int i =0 ; i < temperaturas.length  ; i++){
            System.out.println("Ingrese las temperaturas máximas de la última semana: ");
            tempMax = teclado.nextDouble();
            temperaturas[i]= tempMax;
        }

        for(int i=0; i<temperaturas.length;i++){
            totalTemp+= temperaturas[i];
        }
        promedio = totalTemp / temperaturas.length;

        System.out.println("El promedio de las temperaturas máximas es: "+ promedio);

    }
}