import java.util.Scanner;
public class ClasificacionVentas {

	public static void main(String[] args) {
		// 1. Pedir Datos
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ventas = new int[N];
		for(int i=0;i<N;i++) {
			ventas[i] = sc.nextInt();
		}
		// 2. Sacar Promedio
		int suma=0;
		for(int i=0;i<N;i++) {
			suma = suma + ventas[i];
		}
		double promedio = (double)suma/ventas.length;
		// 3. Contar regiones
		int destacadas = 0, bajas = 0, enPromedio = 0;
		for(int i=0;i<N;i++) {
			if(ventas[i]>promedio) {destacadas++;}
			if(ventas[i]<promedio) {bajas++;}
			if(ventas[i]==promedio) {enPromedio++;}
		}
		// 4. Imprimir las respuestas
		System.out.println("Promedio: "+promedio);
		System.out.println("Regiones destacadas: "+destacadas);
	}

}
