import java.util.Scanner;
public class ControlCamiones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso=1.0,suma=0;
		while(peso!=0) {
			peso = sc.nextDouble();
			if(peso==0) {
				continue;
			}
			suma = suma + peso;
		}
		System.out.println(suma);
		sc.close();
	}

}
