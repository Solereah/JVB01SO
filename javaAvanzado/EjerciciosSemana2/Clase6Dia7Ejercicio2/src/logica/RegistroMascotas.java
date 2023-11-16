package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas extends Mascota {
	private final List<Mascota<?>> registroMasco;

	public RegistroMascotas() {
		this.registroMasco = new ArrayList<>();

	}
	public void agregarMascota(Object mascota) {
		registroMasco.add((Mascota<?>) mascota);
		System.out.println("Mascota agregada al Registro: " + mascota.toString());
	}


	public List <Mascota<?>> buscarPorEspecie(String especie) {
		List<Mascota<?>> mascoEncontradas = new ArrayList<>();
		for (Mascota<?> masco : registroMasco) {
			if (masco.getEspecie().equalsIgnoreCase(especie)) {
				mascoEncontradas.add( masco);
			}
		}
		return  mascoEncontradas;
	}
	public List <Mascota<?>> buscarPorNombre(String nombre) {
		List<Mascota<?>> mascoEncontradas = new ArrayList<>();
		for (Mascota<?> masco : registroMasco) {
			if (masco.getNombre().equalsIgnoreCase(nombre)) {
				mascoEncontradas.add( masco);
			}
		}
		return  mascoEncontradas;
	}

	public int totalMascotas() {
		return registroMasco.size();
	}

	public  Mascota<?> generarDatosAleatorios() {
		Random random = new Random();
		String[] nombresMasco = {"Rufi", "Archi", "Polo", "Pila", "Munchy"};
		String[] especiesMasco = {"Perro","Gato","Reptil","Ave"};
		String especieRandom = especiesMasco[random.nextInt(especiesMasco.length)];
		String nombreRandom = nombresMasco[random.nextInt(nombresMasco.length)];
		int edadRandom = random.nextInt(7) + 1;
		Mascota<Object> mascota = new Mascota<>();
		mascota.setEdad(edadRandom);
		mascota.setNombre(nombreRandom);
		mascota.setEspecie(especieRandom);
		return mascota;
	}


}
