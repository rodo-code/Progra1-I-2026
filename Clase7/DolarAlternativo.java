import java.util.Scanner;
public class DolarAlternativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tc = sc.nextDouble();
		if(tc>=9 && tc<=12) {
			System.out.println("CHILL");
		}
		if(tc<9) {
			System.out.println("COMPRA");
		}
		if(tc>12) {
			System.out.println("VENDE");
		}
	}

}
