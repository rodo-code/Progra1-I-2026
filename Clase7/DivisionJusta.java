import java.util.Scanner;
public class DivisionJusta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// N es la cantidad de sandwiches
		int N = sc.nextInt();
		// M la cantidad de ninios
		int M = sc.nextInt();
		if(N%M == 0) { // Si el resto de dividir N entre M es cero, se puede hacer una division justa
			System.out.println("Justo");
		}
		else {
			System.out.println("Injusto");
		}
		sc.close();
	}

}
