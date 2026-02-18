import java.util.Scanner;
public class Playstation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tecla = sc.next();
		// switch evalua el valor de una variable
		switch(tecla) {
			// Se escriben los casos
			// Cada caso debe terminar con un break
			case "X": System.out.println("Remate"); break; 
			case "O": System.out.println("Pase Normal"); break;
			case "T": System.out.println("Centro"); break;
			case "C": System.out.println("Pase Filtrado"); break;
			default: System.out.println("No conozco esa tecla");
			// El caso default se utiliza cuando no se pudo identificar el
			// caso correcto
		}
	}

}
