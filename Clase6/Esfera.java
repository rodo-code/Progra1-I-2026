// PROBLEMA 1 - CLASE 6
import java.util.Scanner;
public class Esfera {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el radio: ");
		double radio = sc.nextDouble();
		// Math.PI nos da el valor de PI
		double area = 4*Math.PI*radio*radio;
		// Math.pow(a,b) hace a elevado a b
		double volumen = (4.0/3.0)*Math.PI*Math.pow(radio, 3);
		System.out.println("Area: "+area);
		System.out.println("Volumen: "+volumen);
	}

}
