import logica.Directorio;
import logica.ExploradorDirectorios;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Directorio desktop = new Directorio(1,"desktop");

		List<Directorio> documentos = Arrays.asList(
				new Directorio(2, "personal"),
				new Directorio(3, "fotos"),
				new Directorio(4, "pendientes")
		);
		desktop.setSubdirectorios(documentos);

		List<Directorio> personal= Arrays.asList(
				new Directorio(5, "cursos"),
				new Directorio(6, "listaTareas")
		);
		desktop.getSubdirectorios().get(1).setSubdirectorios(personal);

		List<Directorio> pagoServicios = List.of(
				new Directorio(7, "tareas")
		);
		desktop.getSubdirectorios().get(2).setSubdirectorios(pagoServicios);

		List<Directorio> finalizados = List.of(
				new Directorio(8, "pagoServicios")
		);
		desktop.getSubdirectorios().get(1).getSubdirectorios().get(0).setSubdirectorios(finalizados);

		String[] boletas = {"Luz.pdf", "Gas.txt", "agua.jpg"};
		desktop.setArchivos(List.of(boletas));

		ExploradorDirectorios explorDir = new ExploradorDirectorios();
		explorDir.explorarDirectorio(desktop, 0);

	}
}