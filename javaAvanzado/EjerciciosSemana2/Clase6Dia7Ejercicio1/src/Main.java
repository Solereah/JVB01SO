import logica.Auto;
import logica.InventarioAutos;


public class Main {
	public static void main(String[] args) {


		// Crear inventario
		InventarioAutos<Auto> inventario1 = new InventarioAutos<>();

		inventario1.agregarProducto(new Auto("Toyota", "Corolla", 2022, 25000.0));
		inventario1.agregarProducto(new Auto("Honda", "Civic", 2021, 23000.0));
		inventario1.agregarProducto(new Auto("Chevrolet", "Malibu", 2022, 28000.0));
		inventario1.agregarProducto(new Auto("Nissan", "Altima", 2020, 20000.0));
		inventario1.agregarProducto(new Auto("Ford", "Mustang", 2023, 45000.0));
		inventario1.agregarProducto(new Auto("Ford", "Fiesta", 2021, 18000.0));
		inventario1.agregarProducto(new Auto("Ford", "Explorer", 2022, 35000.0));
		inventario1.agregarProducto(new Auto("Ford", "Escape", 2023, 27000.0));

		// Mostrar inventario
		inventario1.mostrarInventario();

		//Buscar Autos por año
		System.out.println("-----------Autos por Año-----------");
		System.out.println(inventario1.autoByAnio(2022));

		//Buscar Autos por Marca
		System.out.println("-----------Autos por Marca-----------");
		System.out.println(inventario1.autoByMarca("ford"));

		//Valor Total del Inventario
		System.out.println("-----------Valor total del Inventario-----------");
		System.out.println(inventario1.valorTotal());
	}
}