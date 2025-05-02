package ar.edu.unq.po2.tp5.CajaMercadoCentral;

import java.time.LocalDate;

public class FacturaServicio extends Factura {
	
	private Double costoUnidad;
	private int unidadesConsumidas;


	public FacturaServicio(String numero, LocalDate fecha, Agencia agenciaRecaudadora, Double costoUnidad, int unidadesConsumidas) {
		super(numero, fecha, agenciaRecaudadora);
		this.setCostoUnidad(costoUnidad);
		this.setUnidadesConsumidas(unidadesConsumidas);
	}
	
	public Double getCostoUnidad() {
		return costoUnidad;
	}

	public void setCostoUnidad(Double costoUnidad) {
		this.costoUnidad = costoUnidad;
	}

	public int getUnidadesConsumidas() {
		return unidadesConsumidas;
	}

	public void setUnidadesConsumidas(int unidadesConsumidas) {
		this.unidadesConsumidas = unidadesConsumidas;
	}

	@Override
	public Double getMonto() {
		Double montoTotal = costoUnidad * unidadesConsumidas;
		return montoTotal;
	}

}
