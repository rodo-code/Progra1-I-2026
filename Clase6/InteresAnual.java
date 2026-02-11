// SOLUCION PROBLEMA 2 CLASE 6
import java.util.Scanner;

public class InteresAnual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos meses restan hasta fin de anio?: ");
		int meses = sc.nextInt();
		System.out.println("Cuanto capital desea invertir?: ");
		double capital = sc.nextDouble();
		System.out.println("Cuanto es la tasa de interes mensual?: ");
		double tasa = sc.nextDouble();
		double gananciaAnual = capital*(tasa/100)*meses;
		System.out.println("Hasta fin de anio ganaras "+gananciaAnual);
	}

}
