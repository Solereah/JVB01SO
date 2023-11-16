package logica;

public class ExploradorDirectorios extends Directorio {

	public void explorarDirectorio(Directorio dir, int level) {

		for (int i = 0; i < level; i++) {
			System.out.print("->");
		}
		System.out.println(dir.getNombre());

		for (Directorio subDir : dir.getSubdirectorios()) {
			explorarDirectorio(subDir, level + 1);
		}

		for (String archivo : dir.getArchivos()) {
			for (int i = 0; i <level + 1; i++) {
				System.out.print("*");
			}
			System.out.println(archivo);
		}

	}
}