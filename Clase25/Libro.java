
public class Libro {
	String titulo, autor;
	boolean disponible;
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public boolean getDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public void mostrarLibro() {
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: " +autor);
		System.out.println("Disponible: "+disponible);
	}
	public void prestar() {
		disponible = false;
		System.out.println("Se esta prestando el libro");
		mostrarLibro();
	}
	
	public void devolver() {
		disponible = true;
		System.out.println("Se esta devolviendo el libro");
		mostrarLibro();
	}
	
}

