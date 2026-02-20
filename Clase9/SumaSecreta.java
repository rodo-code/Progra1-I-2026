import java.util.Scanner;
public class SumaSecreta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sumaDigitos = 0;
		while(num>0) {
			int digito = num%10;
			sumaDigitos = sumaDigitos + digito;
			num=num/10;
		}
		System.out.println("La suma de los digitos es "+sumaDigitos);
		sc.close();

	}

}
