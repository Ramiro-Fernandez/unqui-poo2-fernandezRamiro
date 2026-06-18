package ar.edu.unq.poo2.tp3;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> empleados = new ArrayList<>();

	
	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
	}
	 
	public void contratar(Empleado empleado) {
	    	
	        this.empleados.add(empleado);
	    }
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}
	
	
	
	
}
