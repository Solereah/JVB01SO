package logica;

import java.time.LocalDate;

public class ReservaVuelo {
    private String nombre;
    private String destino;
    private LocalDate fechaViaje;
    private int cantAsientos;

    public ReservaVuelo() {
    }

    public ReservaVuelo(String nombre, String destino, LocalDate fechaViaje, int cantAsientos) throws ReservaInvalidaException {
        if(nombre == null || destino == null){
            throw new ReservaInvalidaException("El campo es obligatorio y debe ser de tipo texto");
        }
        this.nombre = nombre;
        this.destino = destino;

        if (fechaViaje.isBefore(LocalDate.now())){
            throw new ReservaInvalidaException("Fecha de viaje es inválida!!");
        }
        this.fechaViaje = fechaViaje;
        this.cantAsientos = cantAsientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ReservaInvalidaException {
        if(nombre == null ){
            throw new ReservaInvalidaException("El campo es obligatorio y debe ser de tipo texto");
        }
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino)throws ReservaInvalidaException {
        if(destino == null ){
            throw new ReservaInvalidaException("El campo es obligatorio y debe ser de tipo texto");
        }
        this.destino = destino;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) throws ReservaInvalidaException {
        if (fechaViaje.isBefore(LocalDate.now())){
            throw new ReservaInvalidaException("Fecha de viaje es inválida!!");
        }
        this.fechaViaje = fechaViaje;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) throws ReservaInvalidaException {
        this.cantAsientos = cantAsientos;
    }
    public int reservarAsientos(int asientosLibres) throws ReservaInvalidaException {
        if (cantAsientos > asientosLibres ){
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles para realizar su reserva.");
        }
        if (cantAsientos < 0){
            throw new ReservaInvalidaException("La cantidad de asientos a reservar no puede ser un valor negativo!");
        }
        return asientosLibres -= cantAsientos;
    }




    @Override
    public String toString() {
        return "ReservaVuelo{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaViaje=" + fechaViaje +
                ", cantAsientos=" + cantAsientos +
                '}';
    }

}
