import java.util.Calendar;

public class Camioneta extends Vehiculo implements ICombustion{
    private int capacidadTanque;
    private int consumoCombustible;


    public Camioneta(int id, String placa, String modelo, int anio, Double costo, int capacidadTanque, int consumoCombustible) {
        super(id, placa, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public int antiguedadVehiculo() {
        Calendar cal = Calendar.getInstance();
        return (cal.get(Calendar.YEAR) - this.getAnio());
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Estoy recargando combustible");
    }

    @Override
    public String toString() {
        return  "Camioneta{" +  super.toString() +
                " capacidadTanque=" + capacidadTanque +
                ", consumoCombustible=" + consumoCombustible +
                '}';
    }
}
