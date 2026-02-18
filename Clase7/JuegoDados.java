import java.util.Scanner;
public class JuegoDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dado1 = sc.nextInt();
		int dado2 = sc.nextInt();
		int suma = dado1 + dado2;
		if(suma%2 == 0) { // Si la suma es par
			System.out.println("Ana");
		}
		else { // Si no es par, entonces fija es impar
			System.out.println("Maria");
		}
	}

}
