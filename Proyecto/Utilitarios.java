import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utilitarios {
	
	public static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("1. Salir");
		System.out.println("2. Cargar Archivos");
		System.out.println("3. Obtener Total Venta Empresa");
		System.out.println("4. Obtener Total Ventas de un mes");
		System.out.println("5. Obtener Total Ventas de una sucursal");
		System.out.println("6. Obtener Total Ventas de una categoria");
		System.out.println("7. Obtener Total Ventas de un producto");
		System.out.println("8. Identificar el producto que ha generado mas ventas");
		System.out.println("9. Identificar el producto con mayor cantidad de ventas");
		System.out.println("10. Identificar la categoria con mayor venta en dinero");
		System.out.println("11. OPCION SORPRESA");
	}
	
	public static void cargarArchivoProducto(String nombre) {
		try (BufferedReader br = new BufferedReader(new FileReader(nombre))){
			String linea;
			linea = br.readLine(); // Leemos la primera linea
			boolean primeraLinea = true;
			while( linea != null ) {
				if(primeraLinea) {
					primeraLinea = false;
				}
				else {
					String[] datos = linea.split(",");
					int codigo = Integer.parseInt(datos[0]); // Integer.parseInt vuelve un string un entero
					String nombreProducto = datos[1];
					double precio = Double.parseDouble(datos[2]); // Double.parseDouble vuelve un string a double
					String categoria = datos[3];
				}
				linea = br.readLine(); // Leemos la siguiente linea
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void cargarArchivoVentas(String nombre) {
		try (BufferedReader br = new BufferedReader(new FileReader(nombre))){
			String linea;
			linea = br.readLine(); // Leemos la primera linea
			boolean primeraLinea = true;
			while( linea != null ) {
				if(primeraLinea) {
					primeraLinea = false;
				}
				else {
					String[] datos = linea.split(",");
					int codigoProducto = Integer.parseInt(datos[0]); // Integer.parseInt vuelve un string un entero
					double cantidad = Double.parseDouble(datos[1]);
					int mes = Integer.parseInt(datos[2]); // Double.parseDouble vuelve un string a double
					String sucursal = datos[3];
				}
				linea = br.readLine(); // Leemos la siguiente linea
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
