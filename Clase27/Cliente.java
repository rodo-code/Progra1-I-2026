
public class Cliente {
	String nombre,ci;
	Entrada[] entradas;
	int cantidadEntradas;
	public Cliente(String nombre, String ci, int cantidadEntradas) {
		this.nombre = nombre;
		this.ci = ci;
		this.cantidadEntradas = cantidadEntradas;
		entradas = new Entrada[cantidadEntradas];
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public Entrada[] getEntradas() {
		return entradas;
	}
	public void setEntradas(Entrada[] entradas) {
		this.entradas = entradas;
	}
	public int getCantidadEntradas() {
		return cantidadEntradas;
	}
	public void setCantidadEntradas(int cantidadEntradas) {
		this.cantidadEntradas = cantidadEntradas;
	}
	public void mostrarCliente() {
		System.out.println("---INFORMACION CLIENTE---");
		System.out.println("Nombre: "+nombre);
		System.out.println("CI: "+ci);
		System.out.println("Cantidad Entradas: "+cantidadEntradas);
	}
	public void agregarEntrada(Entrada ent) {
		boolean agregado = false;
		for(int i=0;i<cantidadEntradas;i++) {
			if(entradas[i]==null) {
				entradas[i] = ent;
				System.out.println("Entrada agregada");
				agregado = true;
				break;
			}	
		}
		if(agregado == false) {
			System.out.println("No pude agregar la entrada");
		}
	}
	
}
