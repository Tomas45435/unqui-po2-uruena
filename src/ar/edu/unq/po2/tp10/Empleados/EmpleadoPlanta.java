package ar.edu.unq.po2.tp10.Empleados;

public class EmpleadoPlanta extends Empleado {

	private int cantHijos;
	
	public EmpleadoPlanta(int cantHijos) {
		this.setCantHijos(cantHijos);
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	public Double getSueldoBasico() {
		return 3000d;
	}
	
	public Double getMontoPorHijo() {
		return 150d;
	}

	@Override
	public Double calcularSueldoBruto() {
		Double sueldBruto = getSueldoBasico() + (cantHijos * getMontoPorHijo());
		return sueldBruto;
	}

}
