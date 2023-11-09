public class Producto {
   private String nombreProducto;
   private Double precio;
   private int stock;

    public Producto() {
    }

    public Producto(String nombreProducto, Double precio, int stock) throws ProductoInvalidoException{
        if(nombreProducto==null ){
            throw new ProductoInvalidoException("El nombre del producto es un campo requerido del tipo texto.");
        }
        if(precio<=0){
            throw new ProductoInvalidoException("El valor del producto no pueder ser igual o menor a 0.");
        }
        if(stock<0){
            throw new ProductoInvalidoException("El número de stock no puede ser menor a 0.");
        }
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto)throws ProductoInvalidoException {
        if(nombreProducto==null ){
            throw new ProductoInvalidoException("El nombre del producto es un campo requerido del tipo texto.");
        }
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) throws ProductoInvalidoException{
        if(precio<=0){
            throw new ProductoInvalidoException("El valor del producto no pueder ser igual o menor a 0.");
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws ProductoInvalidoException {
        if(stock<0){
            throw new ProductoInvalidoException("El número de stock no puede ser menor a 0.");
        }
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
