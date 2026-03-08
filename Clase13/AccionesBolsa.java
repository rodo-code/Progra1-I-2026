import java.util.Scanner;
public class AccionesBolsa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int precioAntiguo=0,subidas=0,bajadas=0,estables=0;
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			int precioActual = sc.nextInt();
			if(i>0) {
				if(precioActual > precioAntiguo) { subidas++; }
				if(precioActual < precioAntiguo) { bajadas++; }
				if(precioActual == precioAntiguo) { estables++;}
			}
			precioAntiguo = precioActual;
		}
		System.out.println("Dias que subio: "+subidas);
	}

}
