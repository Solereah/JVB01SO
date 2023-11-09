import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Producto> inventario = new ArrayList<>();

        try {
            Producto producto1 =new Producto("Televisor", 23.5,3);
           //Producto producto2 =new Producto("Memoria RAM", 11.99,-1);
            Producto producto3 = new Producto(null, 11.99,-1);

            //Producto producto2 = new Producto();
            //producto2.setStock(-1);

            inventario.add(producto1);
            //inventario.add(producto2);
            inventario.add( producto3);
            for (Producto item: inventario) {
                System.out.println("Se realizó con exito el ingreso del " +item.toString() +" al inventario.");
            }

        } catch (ProductoInvalidoException e) {
            System.err.println("Hubo un error en la carga del producto: " + e.getMessage());
        }
        finally {
            System.out.println("Ante cualquier incoveniente comuniquese con su Supervisor de Área.");
        }


    }
}