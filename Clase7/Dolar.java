import java.util.Scanner;
public class Dolar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tc = sc.nextDouble();
		if(tc<9) {
			System.out.println("COMPRA");
		}
		else {
			if(tc>12) {
				System.out.println("VENDE");
			}
			else {
				System.out.println("CHILL");
			}
		}
	}

}
