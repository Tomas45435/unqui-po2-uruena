package ar.edu.unq.po2.tp10.Empleados;

public abstract class Empleado {

	public Double sueldo() {
		Double sueldoBruto = this.calcularSueldoBruto();
		Double descuento = calcularDescuento(sueldoBruto);
		
		return sueldoBruto - descuento;
	}
	
	public Double calcularDescuento(Double sueldo) {
		return sueldo * 0.13;
	}
	
	public abstract Double calcularSueldoBruto();
}
