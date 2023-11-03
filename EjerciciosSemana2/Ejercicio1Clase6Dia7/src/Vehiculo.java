public abstract class Vehiculo {

  private int  id;
  private String placa;
  private String modelo;
  private int anio;
  private Double costo;


  public Vehiculo(int id, String placa, String modelo, int anio, Double costo) {
    this.id = id;
    this.placa = placa;
    this.modelo = modelo;
    this.anio = anio;
    this.costo = costo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public Double getCosto() {
    return costo;
  }

  public void setCosto(Double costo) {
    this.costo = costo;
  }

  public abstract int antiguedadVehiculo();

  @Override
  public String toString() {
    return  "id=" + id +
            ", placa='" + placa + '\'' +
            ", modelo='" + modelo + '\'' +
            ", anio=" + anio +
            ", costo=" + costo ;
  }
}
