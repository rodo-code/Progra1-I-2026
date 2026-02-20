import java.util.Scanner;
public class PedirDatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantos datos desea ingresar:");
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			System.out.print("Ingrese dato "+i+": ");
			int dato = sc.nextInt();
		}
		System.out.println("Usted ha ingresado todos los datos");
		sc.close();
	}
}
