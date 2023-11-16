import logica.Tarea;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Por favor, agregue un nombre a su proyecto: ");
		Scanner teclado = new Scanner(System.in);

		String nombProyect = teclado.next();
		Tarea proyecto = new Tarea(nombProyect);
		addTarea(proyecto, teclado);

		System.out.println("Proyecto: "+proyecto.getNombre());
		mostrarLista(proyecto, 0);

	}

	public static void addTarea(Tarea tarea, Scanner teclado) {
		System.out.println("Ingrese una nueva tarea: ");
		String respuesta = teclado.next();

		while(!respuesta.equalsIgnoreCase("n")){
			Tarea subtarea = new Tarea(respuesta);
			tarea.addSubtareas(subtarea);

			System.out.println("Ingrese una subtarea o presione 'n' salir:");
			 respuesta = teclado.next();
		}

	}

	public static void mostrarLista(Tarea tarea, int nivel) {
		for (int i = 0; i < nivel; i++) {
			System.out.print("  ");
		}
		System.out.println("|-- " + tarea.getNombre());

		for (Tarea subtarea : tarea.getSubtareas()) {
			mostrarLista(subtarea, nivel + 1);
		}
	}
}

