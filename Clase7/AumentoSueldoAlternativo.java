import java.util.Scanner;
public class AumentoSueldo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su salario actual:");
		double salario = sc.nextDouble();
		double nuevoSalario = salario;
		System.out.println("Ingrese su rango:");
		int rango = sc.nextInt();
		if(rango == 1) {
			nuevoSalario = salario*1.5;
		}
		if(rango == 2) {
			nuevoSalario = salario*1.3;
		}
		if(rango == 3) {
			nuevoSalario = salario*1.2;
		}
		if(rango == 4) {
			nuevoSalario = salario*1.05;
		}
		System.out.println("Su nuevo salario es "+nuevoSalario);
		sc.close();
	}

}
