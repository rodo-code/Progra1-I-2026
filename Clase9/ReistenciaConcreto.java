import java.util.Scanner;
public class ResistenciaConcreto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Pediremos los datos hasta que nos den un 0
		double prueba = sc.nextDouble(); 		// Pedimos por primera vez
		int contadorPruebas = 0; 				// Creamos un contador de cuantas pruebas nos daran
		double sumaPruebas = 0; 				// Creamos un acumulador para guardar la suma total de las pruebas
		while(prueba != 0) { 					// Mientras la prueba sea diferente de 0
			contadorPruebas++; 					// En cada ciclo contamos que una prueba nos es dada
			sumaPruebas = sumaPruebas + prueba; // Agregamos la prueba al total
			prueba = sc.nextDouble(); 			// Volvemos a pedir al final del ciclo
		}
		// Al salir del ciclo ya tengo la cantidad de pruebas en contadorPruebas
		// y tambien la suma de todas las pruebas en sumaPruebas
		// Ahora debo sacar el promedio
		double promedio = sumaPruebas / contadorPruebas;
		System.out.println("El promedio es "+promedio);
		sc.close();
	}

}
