import java.util.Scanner;
public class NotasColegioAlternativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		double promedio = (nota1+nota2+nota3)/3.0;
		if(promedio<=50) {
			System.out.println("REPROBADO");
		}
		if(promedio>50 && promedio<=65) {
			System.out.println("REGULAR");
		}
		if(promedio>65 && promedio<=85) {
			System.out.println("BUENO");
		}
		if(promedio>85) {
			System.out.println("EXCELENTE");
		}
		sc.close();

	}

}
