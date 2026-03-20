import java.util.Scanner;
public class Main {
	//Producto[] productos = new Productos[300];
	//Venta[] ventas = new Ventas[5000];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			Utilitarios.mostrarMenu();
			System.out.print("Ingrese una opcion: ");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1: System.out.println("Esta saliendo del sistema"); break;
			case 2: System.out.println("Ingrese la ruta del archivo de productos");
					String rutaProductos = sc.next();
					Utilitarios.cargarArchivoProducto(rutaProductos);
					System.out.println("Ingrese la ruta del archivo de ventas");
					String rutaVentas = sc.next();
					Utilitarios.cargarArchivoVentas(rutaVentas);
					break;
			case 3: System.out.println("Ingreso opcion 3"); break;
			case 4: System.out.println("Ingreso opcion 4"); break;
			case 5: System.out.println("Ingreso opcion 5"); break;
			case 6: System.out.println("Ingreso opcion 6"); break;
			case 7: System.out.println("Ingreso opcion 7"); break;
			case 8: System.out.println("Ingreso opcion 8"); break;
			case 9: System.out.println("Ingreso opcion 9"); break;
			case 10: System.out.println("Ingreso opcion 10"); break;
			case 11: System.out.println("Ingreso opcion 11"); break;
			default: System.out.println("No pusiste una opcion valida");
			}
		}while(opcion!=1);
		sc.close();
	}
}
