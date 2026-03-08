import java.util.Scanner;
public class TransaccionesSospechosas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] transacciones = new int[N];
		double sumaTransacciones = 0;
		for(int i=0;i<N;i++) {
			transacciones[i] = sc.nextInt();
			sumaTransacciones = sumaTransacciones + transacciones[i]; // Sumamos las transacciones
		}
		double promedio = sumaTransacciones/N;
		System.out.println("Promedio de transacciones: "+promedio);
		// Buscamos las transacciones sospechosas
		int cantSospechosas = 0;
		for(int i=0;i<N;i++) {
			if(transacciones[i]>(2*promedio)) { // Si la transaccion supera el doble del promedio
				System.out.println("Sospechosa: posicion "+(i+1)+" con $"+transacciones[i]);
				cantSospechosas++;
			}
		}
		if(cantSospechosas==0) {
			System.out.println("Sin transacciones sospechosas");
		}
		else {
			System.out.println("Total sospechosas: "+cantSospechosas);
		}
		sc.close();
	}

}
