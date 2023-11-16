package logica;

import java.util.ArrayList;
import java.util.List;

public class InventarioAutos<T extends Auto> {
	private List<T> autos;

	public InventarioAutos() {
		this.autos = new ArrayList<>();
	}

	public void agregarProducto(T auto) {
		autos.add(auto);
		System.out.println("Auto agregado al inventario: " + auto.toString());
	}

	public void mostrarInventario() {
		System.out.println("Inventario:");
		for (T auto : autos) {
			System.out.println(auto.getMarca() + " - " + auto.getModelo() + " - $" + auto.getPrecio());
		}
	}

	public List<T> autoByAnio(int anio) {
		return autos.stream()
				.filter(a -> a.getAnio() == anio)
				.toList();
	}

	public List<T> autoByMarca(String marca) {
		return autos.stream()
				.filter(a -> a.getMarca().equalsIgnoreCase(marca))
				.toList();
	}

	public double valorTotal() {
		return autos.stream()
				.mapToDouble(Auto::getPrecio)
				.sum();

	}
}

