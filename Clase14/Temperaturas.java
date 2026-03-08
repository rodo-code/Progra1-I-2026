import java.util.Scanner;
public class Temperaturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] temp = new int[N];
		for(int i=0;i<N;i++) {
			temp[i] = sc.nextInt();
		}
		int mayor=temp[0],menor=temp[0];
		for(int i=1;i<N;i++) {
			if(temp[i]>mayor) {
				mayor = temp[i];
			}
			if(temp[i]<menor) {
				menor = temp[i];
			}
		}
		// Imprimir datos
		for(int i=0;i<N;i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println("Temperatura maxima: "+mayor);
		System.out.println("Temperatura minima: "+menor);
	}

}
