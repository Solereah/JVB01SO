import logica.Tarea;

public class Main {

	public static void main(String[] args) {


		Tarea proyecto = new Tarea("Desarrollo de Software");
				agregarTareas(proyecto, 0, 2);
				proyecto.mostrarTareas();
				}

				public static void agregarTareas(Tarea tarea, int nivel, int maxNivel) {
				if (nivel > maxNivel) {
					return;
				}

				int numSubtareas = 2;

				for (int i = 1; i <= numSubtareas; i++) {
					String nombreTarea = "Tarea " + nivel + "." + i;
					Tarea nuevaTarea = new Tarea(nombreTarea);
					tarea.agregarSubtarea(nuevaTarea);
					agregarTareas(nuevaTarea, nivel + 1, maxNivel);
				}
	}
}








