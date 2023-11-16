import logica.*;


public class Main {
	public static void main(String[] args) {

		//perros, gatos, reptiles y aves
		RegistroMascotas registroMasco = new RegistroMascotas();


		registroMasco.agregarMascota(new Mascota<Perro>(1,"Ron", 2,  "perro"));
		registroMasco.agregarMascota(new Mascota<Perro>(2,"Floki", 1,  "perro"));
		registroMasco.agregarMascota(new Mascota<Gato>(3,"Enchufe", 3,  "gato"));
		registroMasco.agregarMascota(new Mascota<Gato>(4,"Olie", 4,  "gato"));
		registroMasco.agregarMascota(new Mascota<Ave>(5,"Lorito", 1,  "ave"));
		registroMasco.agregarMascota(new Mascota<Ave>(6,"Chimuelo", 1,  "ave"));
		registroMasco.agregarMascota(new Mascota<Reptil>(7,"Dandi", 2,  "reptil"));
		registroMasco.agregarMascota(new Mascota<Reptil>(8,"Cindi", 3,  "reptil"));

		System.out.println("--------------Buscar por Especie--------------");
		System.out.println(	registroMasco.buscarPorEspecie("perro").toString());
		System.out.println(	registroMasco.buscarPorEspecie("gato").toString());

		System.out.println("--------------Buscar por Nombre--------------");
		System.out.println(registroMasco.buscarPorNombre("Chimuelo").toString());

		//Cantidad de Mascotas
		System.out.println("El total de Mascotas registradas es:  "+ registroMasco.totalMascotas());
		System.out.println("--------------Mascota generada con datos aleatorios--------------");
		System.out.println(registroMasco.generarDatosAleatorios().toString());



	}
}