package hibernate;

public class Empresas {
	private int CIF;
	private String nombre;
	private int empleados;
	private String direccion;
	
	public void Empresa() {}

	public void Empresa(int id, int CIF, String nombre, int empleados, String direccion) {

		this.CIF = CIF;
		this.nombre = nombre;
		this.empleados = empleados;
		this.direccion = direccion;
	}
	
	

	public int getCIF() {
		return CIF;
	}

	public void setCIF(int CIF) {
		CIF = CIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
