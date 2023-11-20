package logica;

import java.util.ArrayList;
import java.util.List;
public class Tarea {
	private String nombre;
	private List<Tarea> subtareas;

	public Tarea(String nombre) {
		this.nombre = nombre;
		this.subtareas = new ArrayList<>();
	}

	public void agregarSubtarea(Tarea tarea) {
		subtareas.add(tarea);
	}

	public void mostrarTareas() {
		mostrarTareas(0);
	}

	private void mostrarTareas(int nivel) {
		System.out.println("|--".repeat(nivel) + nombre);
		for (Tarea subtarea : subtareas) {
			subtarea.mostrarTareas(nivel + 1);
		}
	}
}