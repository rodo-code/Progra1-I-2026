import java.util.Scanner;
public class EstudiantesAprobados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int aprobados = 0;
		for(int i=0;i<N;i++) {
			int calificacion = sc.nextInt();
			if(calificacion>50) {
				aprobados++;
			}
		}
		System.out.println("Cantidad de aprobados es "+aprobados);
		sc.close();
	}

}
