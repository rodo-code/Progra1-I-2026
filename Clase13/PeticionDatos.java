import java.util.Scanner;
public class PeticionDatos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de datos:");
		int N = sc.nextInt();
		// Creamos el arreglo de tamanio N
		int[] datos = new int[N];
		for(int i=0;i<N;i++) { // for que guardara los datos en el arreglo
			System.out.print("Ingrese el dato "+(i+1)+": ");
			datos[i] = sc.nextInt();
		}
		System.out.println("Gracias por ingresar los datos");
		System.out.println("Los datos que ingreso fueron: ");
		// datos.length nos da el tamanio del arreglo
		for(int i=0;i<datos.length;i++) {
			System.out.println("Dato "+(i+1)+" es "+datos[i]);
		}
		sc.close();
	}

}
