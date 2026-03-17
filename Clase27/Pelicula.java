
public class Pelicula {
	String titulo, genero;
	int duracion;
	private double precio;
	public Pelicula(String titulo, String genero, int duracion, double precio) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.precio = precio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void mostrarPelicula() {
		System.out.println("---INFORMACION PELICULA---");
		System.out.println("Titulo: "+titulo);
		System.out.println("Genero: "+genero);
		System.out.println("Duracion: "+duracion);
		System.out.println("Precio: "+precio);
	}
}
