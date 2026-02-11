import java.util.Scanner;
public class ProblemaInteresMensual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el capital a invertir: ");
		double capital = sc.nextDouble();
		double interes = capital * 2 / 100;
		System.out.println("El interes ganado en un mes es: "+interes);
	}

}
