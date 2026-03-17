
public class Main {

	public static void main(String[] args) {
		Pelicula estreno = new Pelicula("Una batalla despues de otra","Accion",120,70);
		estreno.mostrarPelicula();
		Entrada entrada = new Entrada(estreno,12,"B9");
		entrada.mostrarEntrada();
	}

}
