import java.util.Scanner;

public class CercandoTerreno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la medida del lado del terreno: ");
		double metros = sc. nextDouble();
		double perimetroTerreno = metros*4.;
		System.out.println("Los metros necesitados son "+perimetroTerreno);
	}

}
