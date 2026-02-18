import java.util.Scanner;
public class PromocionTelefonica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese sus meses de antiguedad:");
		int meses = sc.nextInt();
		System.out.println("Ingrese el monto de credito a recargar:");
		int credito = sc.nextInt();
		if(meses>6) {
			credito = credito * 2;
		}
		System.out.println("Su recarga sera de "+credito);
		sc.close();
	}

}
