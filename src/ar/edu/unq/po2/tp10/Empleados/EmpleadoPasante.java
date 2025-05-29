package ar.edu.unq.po2.tp10.Empleados;

public class EmpleadoPasante extends Empleado {

	private int horasTrabajadas;
	
	public EmpleadoPasante(int horasTrabajadas) {
		this.setHorasTrabajadas(horasTrabajadas);
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public Double getValorHoraTrabajo() {
		return 5d;
	}


	@Override
	public Double calcularSueldoBruto() {
		Double sueldoBruto = horasTrabajadas * getValorHoraTrabajo();
		return sueldoBruto;
	}

}
