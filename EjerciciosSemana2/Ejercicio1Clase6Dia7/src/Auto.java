import java.util.Calendar;

public class Auto extends Vehiculo implements IElectrico{

    private int capacidadBateria;
    private int autonomia;


    public Auto(int id, String placa, String modelo, int anio, Double costo, int capacidadBateria, int autonomia) {
        super(id, placa, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public int antiguedadVehiculo() {
        Calendar cal = Calendar.getInstance();
        return (cal.get(Calendar.YEAR) - this.getAnio());
    }



    @Override
    public void cargarEnergia() {
        System.out.println("Estoy recargando energía");
    }

    @Override
    public String toString() {
        return "Auto{" +  super.toString() +
                "capacidadBateria=" + capacidadBateria +
                ", autonomia=" + autonomia +
                '}';
    }
}
