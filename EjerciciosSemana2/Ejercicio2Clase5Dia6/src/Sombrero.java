public class Sombrero extends Vestimenta{
    private String tipo;
    private double tamanio;

    public Sombrero() {
    }

    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo, double tamanio) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public void mostrar() {
        System.out.println("Este sombrero es de marca: "+ this.tipo);
    }
}
