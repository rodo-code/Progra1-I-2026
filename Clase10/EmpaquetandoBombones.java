import java.util.Scanner;
public class EmpaquetandoBombones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int bombones = sc.nextInt();
		for(int i=1;i<=bombones;i++) {
			if(bombones%i == 0) { // Si se pueden repartir los bombones en un paquete de tamanio i
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
