public class Main {
    public static void main(String[] args) {
       /* Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases
       y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.

        Luego, realiza las siguientes acciones:

        a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.

        b) Crea 1 objeto de la clase Electrodomestico sin parámetros.

        c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.

        d) Intenta obtener la marca del electrodoméstico creado sin parámetros.
        ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
        Se obtiene el valor null, es decir, indica que la propiedad no tiene un valor asignado.
        */

        Electrodomestico electro1 = new Electrodomestico(1001,"Samsung","Lavadora X1",250,"Blanco");
        Electrodomestico electro2 = new Electrodomestico(2002,"LG","Heladera NoFrost", 150,"Acero inoxidable");
        Electrodomestico electro3 = new Electrodomestico( 3003,"Whirlpool","Horno Microondas MZ2",800,"Negro");
        Electrodomestico electro4 = new Electrodomestico();

        System.out.println("Marca:"+electro1.getMarca()+" - "+"Modelo:"+electro1.getModelo()+" - "+"Consumo:"+electro1.getConsumo());
        System.out.println("Marca:"+electro2.getMarca()+" - "+"Modelo:"+electro2.getModelo()+" - "+"Consumo:"+electro2.getConsumo());
        System.out.println("Marca:"+electro3.getMarca()+" - "+"Modelo:"+electro3.getModelo()+" - "+"Consumo:"+electro3.getConsumo());
        System.out.println(electro4.getMarca());

    }
}