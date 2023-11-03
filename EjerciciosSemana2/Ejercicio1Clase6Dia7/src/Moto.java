import java.util.Calendar;

public class Moto extends Vehiculo implements ICombustion{

    private double  cilindrada;
    private String tipoMotor;



    public Moto(int id, String placa, String modelo, int anio, Double costo, double cilindrada, String tipoMotor) {
        super(id, placa, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
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
        return "Moto{" + super.toString() +
                "cilindrada=" + cilindrada +
                ", tipoMotor='" + tipoMotor + '\'' +
                '}';
    }
}
