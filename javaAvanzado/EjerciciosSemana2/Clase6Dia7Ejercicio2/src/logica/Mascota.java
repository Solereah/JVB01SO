package logica;

public class Mascota <T> {
	private int id;
	private String nombre;
	private int edad;
	private String especie;

	public Mascota(int id, String nombre, int edad, String especie) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
	}

	public Mascota() {

	}



	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getEspecie() {
		return especie;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Mascota{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", edad=" + edad +
				", especie='" + especie + '\'' +
				'}';
	}
}
