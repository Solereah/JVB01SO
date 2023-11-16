package logica;

import java.util.ArrayList;
import java.util.List;

public class Tarea {

	private String nombre;
	private final List<Tarea>subtareas;

	public Tarea(String nombre) {
		this.nombre = nombre;
		this.subtareas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Tarea> getSubtareas() {
		return subtareas;
	}

	public void addSubtareas(Tarea tarea) {
		this.subtareas.add(tarea);
	}

	@Override
	public String toString() {
		return "Tarea{" +
				"nombre='" + nombre + '\'' +
				", subtareas=" + subtareas +
				'}';
	}
}

