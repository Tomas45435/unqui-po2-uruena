package ar.edu.unq.po2.tp5.CajaMercadoCentral;

import java.time.LocalDate;

public class FacturaImpuesto extends Factura {

	private Double tasaFija;
	
	public FacturaImpuesto(String numero, LocalDate fecha, Agencia agenciaRecaudadora, Double tasaFija) {
		super(numero, fecha, agenciaRecaudadora);
		this.setTasaFija(tasaFija);
	}

	public Double getTasaFija() {
		return tasaFija;
	}

	public void setTasaFija(Double tasaFija) {
		this.tasaFija = tasaFija;
	}

	@Override
	public Double getMonto() {
		return tasaFija;
	}

}
