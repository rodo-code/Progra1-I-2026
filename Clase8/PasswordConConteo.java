import java.util.Scanner;
public class PasswordConConteo {

	public static void main(String[] args) {
		String pass = "1234";
		int intentos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su contrasenia");
		String passUsuario = sc.next();
		intentos++; // ++ incrementa el valor de la variable en uno
		while(!passUsuario.equals(pass) && intentos<3) {
			System.out.println("Tu contrasenia es incorrecta, ingresala nuevamente");
			passUsuario = sc.next();
			intentos++;
		}
		if(passUsuario.equals(pass)) {
			System.out.println("Bienvenido contrasenia correcta");
		}
		else {
			System.out.println("Limite de intentos alcanzado, comunicate con tu profesor");
		}
	}
}