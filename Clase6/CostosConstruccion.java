// SOLUCION PROBLEMA 3 - CLASE 6
import java.util.Scanner;

public class CostosConstruccion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de metros cuadrados: ");
		double metros = sc.nextDouble();
		System.out.println("Ingrese el precio de bolsa de cemento: ");
		double precioBolsa = sc.nextDouble();
		System.out.println("Ingrese el precio del kilo de arena");
		double precioArena = sc.nextDouble();
		
		double costoTotalCemento = metros*1.5*precioBolsa;
		double costoTotalArena = metros*7*precioArena;
		double costoTotal = costoTotalCemento + costoTotalArena;
		
		System.out.println("El precio total es "+costoTotal);
	}

}
