import java.util.Scanner;
public class ContadorDigitos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero:");
		int num = sc.nextInt();
		int contDigitos=0; // Creo un contador para contar cuantos digitos hay
		while(num>0) { // Mientras el num sea mayor a 0
			int dig = num%10; // dig tendra al digito mas a la derecha del numero actual
			contDigitos++;
			num = num / 10; // Esto hace que quitemo el digito mas a la derecha del numero actual
		}
		System.out.println("El numero tiene "+contDigitos+" digitos");
		sc.close();
	}

}
