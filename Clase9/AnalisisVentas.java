import java.util.Scanner;

public class AnalisisVentas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i=0,superaron=0; // superaron es un contador
		while(i<N) {
			double venta = sc.nextDouble();
			if(venta > 1000) {
				superaron++; // Incrementa su valor SI venta es mayor a 1000
			}
			i++; // i solo es una variable que ayuda a que el programa pida N veces un dato
		}
		System.out.println("Las ventas que superaron 1000 son "+superaron);
		sc.close();
	}

}
