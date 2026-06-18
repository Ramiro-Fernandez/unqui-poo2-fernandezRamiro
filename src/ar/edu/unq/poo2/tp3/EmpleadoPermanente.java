package ar.edu.unq.poo2.tp3;
import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado{

	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPermanente (String nombre, String direccion, LocalDate fechaDeNacimiento, String estadoCivil, Double sueldoBasico, int cantidadDeHijos, int antiguedad) {
		super(nombre, direccion, fechaDeNacimiento, estadoCivil, sueldoBasico);
		this.antiguedad = antiguedad;
		this.cantidadDeHijos = cantidadDeHijos;
	}
	
	@Override
	public Double calcularSueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar();
	}
	
	@Override
	public Double calcularRetenciones() {
		return this.aporteObraSocial() + this.aportesJubilatorios();
	}
	
	public Double aporteObraSocial() {
		return (this.calcularSueldoBruto() * 0.10) + (this.cantidadDeHijos * 20.00);
	}
	
	public Double aportesJubilatorios() {
		return this.calcularSueldoBruto() * 0.15;
	}
		
	public Double salarioFamiliar() {
		return this.asignacionPorHijo() + this.asignacionPorConyuge() + 50.00 * this.antiguedad;
	}
	
	public Double asignacionPorHijo() {
		return 150.00 * this.cantidadDeHijos;
	}
	
	public Double asignacionPorConyuge() {
		if(this.getEstadoCivil() == "Casado") {
			return 100.00;
		}
		else return 0.00;
	}
}
