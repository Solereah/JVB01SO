package logica;

public class Trabajador implements Runnable{
    private Estacion estac;
    private String name;

    public Trabajador(Estacion estac, String name) {
        this.estac = estac;
        this.name = name;
    }

    @Override
    public void run() {
        estac.ensamblar(name);
        estac.controlar(name);
        estac.embalar(name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
