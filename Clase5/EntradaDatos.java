// Para usar scanner se debe importar su libreria
import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// Para leer datos desde el teclado debemos crear un Scanner
		Scanner sc = new Scanner(System.in);
		// Scanner nos permitira obtener datos con sus metodos como 
		// nextLine, nextInt, nextString
		String nombre = sc.next();
		// Una vez obtenido el dato lo podemos utilizar
		System.out.println("Buenos dias "+nombre);
		// Es una buena practica de seguridad cerrar el Scanner con sc.close()
		sc.close();
	}

}
