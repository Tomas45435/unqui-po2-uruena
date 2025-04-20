package ar.edu.unq.po2.tp4.ImpuestosTrabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<>();
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}
	
	//Retornar el monto total percibido por el trabajador.
	public Double getTotalPercibido() {
		Double montoTotalPercibido = 0.0;
		
		for(Ingreso ingreso : ingresos) {
			montoTotalPercibido = montoTotalPercibido + ingreso.getMonto();
		}
		
		return montoTotalPercibido;
	}
	
	//Retornar el monto imponible al impuesto al trabajador
	public Double getMontoImponible() {
		Double montoImponibleTotal = 0.0;
		
		for(Ingreso ingreso : ingresos) {
			montoImponibleTotal = montoImponibleTotal + ingreso.getMontoImponible();
		}
		
		return montoImponibleTotal;
	}
	
	//Retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible.
	public Double getImpuestoAPagar() {
		
		return getMontoImponible() * 0.02;
	}
	
	public int getCantidadDeIngresos() {
		return ingresos.size();
	}
}
