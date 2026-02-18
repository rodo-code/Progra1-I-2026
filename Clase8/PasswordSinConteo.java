import java.util.Scanner;
public class PasswordSinConteo {

	public static void main(String[] args) {
		String pass = "1234";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su contrasenia");
		String passUsuario = sc.next();
		while(!passUsuario.equals(pass)) {
			System.out.println("Tu contrasenia es incorrecta, ingresala nuevamente");
			passUsuario = sc.next();
		}
		System.out.println("Bienvenido contrasenia correcta");
	}

}
