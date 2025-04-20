package ar.edu.unq.po2.tp4.ImpuestosTrabajador;

public abstract class Ingreso {

	private String mes;
	private String concepto;
	private Double monto;
	
	public Ingreso(String mes, String concepto, Double monto) {
		this.setMes(mes);
		this.setConcepto(concepto);
		this.setMonto(monto);
	}

	
	public String getMes() {
		return mes;
	}

	private void setMes(String mes) {
		this.mes = mes;
	}

	public String getConcepto() {
		return concepto;
	}

	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	private void setMonto(Double monto) {
		this.monto = monto;
	}
	

	public Double getMonto() {
		return monto;
	}
	
	public abstract Double getMontoImponible();
}
