import java.util.Scanner;
public class ConteoMuestras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i=0,validos=0;
		while(i<N) {
			double temperatura = sc.nextDouble();
			if(temperatura>=0) {
				validos++;
			}
			i++;
		}
		System.out.println(validos);
		sc.close();
	}

}
