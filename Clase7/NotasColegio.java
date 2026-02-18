import java.util.Scanner;
public class NotasColegio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		double promedio = (nota1+nota2+nota3)/3.0;
		if(promedio<=50) {
			System.out.println("REPROBADO");
		}
		else {
			if(promedio<=65) {
				System.out.println("REGULAR");
			}
			else {
				if(promedio<=85) {
					System.out.println("BUENO");
				}
				else {
					System.out.println("EXCELENTE");
				}
			}
		}
		sc.close();

	}

}
