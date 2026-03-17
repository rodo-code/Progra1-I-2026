
public class Entrada {
	Pelicula pelicula;
	int numeroSala;
	String numeroAsiento;
	public Entrada(Pelicula pelicula, int numeroSala, String numeroAsiento) {
		super();
		this.pelicula = pelicula;
		this.numeroSala = numeroSala;
		this.numeroAsiento = numeroAsiento;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public int getNumeroSala() {
		return numeroSala;
	}
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	public String getNumeroAsiento() {
		return numeroAsiento;
	}
	public void setNumeroAsiento(String numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}
	
	public void mostrarEntrada() {
		System.out.println("---INFORMACION ENTRADA---");
		pelicula.mostrarPelicula();
		System.out.println("Numero Sala: "+numeroSala);
		System.out.println("Numero Asiento: "+numeroAsiento);
	}
	
	public double obtenerPrecio() {
		return pelicula.getPrecio();
	}
}
