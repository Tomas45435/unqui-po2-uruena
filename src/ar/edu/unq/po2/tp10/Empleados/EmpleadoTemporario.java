package ar.edu.unq.po2.tp10.Empleados;

public class EmpleadoTemporario extends Empleado {
	
	private int horasTrabajadas;
	private Boolean esCasado;
	private Boolean tieneHijos;
	
	public EmpleadoTemporario(int HorasTrabajadas, Boolean esCasado, Boolean tieneHijos) {
		this.setHorasTrabajadas(HorasTrabajadas);
		this.setEsCasado(esCasado);
		this.setTieneHijos(tieneHijos);
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public void setEsCasado(Boolean esCasado) {
		this.esCasado = esCasado;
	}

	public void setTieneHijos(Boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}
	
	public Double getValorHoraTrabajo() {
		return 5d;
	}
	
	public Double getSueldoBasico() {
		return 1000d;
	}
	
	public Double getMontoFamiliar() {
		return 100d;
	}

	@Override
	public Double calcularSueldoBruto() {
		Double sueldoBruto = getSueldoBasico() + (horasTrabajadas * getValorHoraTrabajo());
		if (tieneHijos || esCasado) {
			sueldoBruto += getMontoFamiliar();
		}
		return sueldoBruto;
	}

}
