import java.util.Scanner;
public class DigitosTraviesos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digitosImpares = 0;
		while(num>0) {
			int digito = num%10;
			if(digito%2==1) { // Si el digito es impar
				digitosImpares++;
			}
			num=num/10;
		}
		System.out.println("Hay "+digitosImpares+" digitos impares.");
		sc.close();

	}

}
