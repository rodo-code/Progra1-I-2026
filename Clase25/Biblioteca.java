
public class Biblioteca {
	String nombre;
	Libro[] libros; // Arreglo de libros
	int capacidadLibros;
	
	public Biblioteca(String nombre, int capacidadLibros) {
		this.nombre = nombre;
		this.capacidadLibros = capacidadLibros;
		// Creamos el arreglo de libros
		this.libros = new Libro[capacidadLibros];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidadLibros() {
		return capacidadLibros;
	}

	public void setCapacidadLibros(int capacidadLibros) {
		this.capacidadLibros = capacidadLibros;
	}
	
	public void agregarLibro(Libro x) {
		// Buscamos donde colocarlo
		for(int i=0;i<libros.length;i++) {
			if(libros[i] == null) {
				x.setDisponible(true);
				libros[i] = x;
				System.out.println("Agregando el libro");
				x.mostrarLibro();
				return; // Si ya esta agregado acabamos el ciclo.
			}
		}
		System.out.println("Perdon, no puedo agregar el libro.");
	}
	
	public Libro buscarLibro(Libro x) {
		for(int i=0;i<libros.length;i++) {
			if(libros[i] != null) { // Nos aseguramos de no buscar en vacio
				if(libros[i].getTitulo() == x.getTitulo()
						&& libros[i].getAutor() == x.getAutor()) {
					System.out.println("Libro encontrado");
					libros[i].mostrarLibro();
					return libros[i];
				}
			}
		}
		System.out.println("Libro no encontrado");
		x.mostrarLibro();
		return null;
	}
	
	
}
