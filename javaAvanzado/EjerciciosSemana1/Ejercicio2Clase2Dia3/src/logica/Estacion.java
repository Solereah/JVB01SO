package logica;
public class Estacion {
    private String name;


    public void ensamblar(String name){
        System.out.println("Estoy ensamblando"+name);
    }
    public void controlar(String name){
        System.out.println("Estoy controlando"+name);
    }

    public void embalar(String name){
        System.out.println("Estoy embalando"+name);
    }
}
