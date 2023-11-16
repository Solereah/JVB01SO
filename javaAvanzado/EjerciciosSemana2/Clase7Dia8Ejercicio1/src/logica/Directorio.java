package logica;

import java.util.ArrayList;
import java.util.List;

public class Directorio {

		private int id;
		private String nombre;
		private List<Directorio> subdirectorios;
		private List<String> archivos;


	public Directorio() {
	}

	public Directorio(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.subdirectorios = new ArrayList<>();
		this.archivos = new ArrayList<>();
	}

	//Getters
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}



	public List<Directorio> getSubdirectorios() {
		return subdirectorios;
	}



	public List<String> getArchivos() {
		return archivos;
	}

	//Setters


	public void setSubdirectorios(List<Directorio> subdirectorios) {
		this.subdirectorios = subdirectorios;
	}

	public void setArchivos(List<String> archivos) {
		this.archivos = archivos;
	}

	@Override
	public String toString() {
		return "Directorio{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", subdirectorios=" + subdirectorios +
				", archivos=" + archivos +
				'}';
	}
}
