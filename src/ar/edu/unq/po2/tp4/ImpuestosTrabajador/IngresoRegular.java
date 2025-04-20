package ar.edu.unq.po2.tp4.ImpuestosTrabajador;

public class IngresoRegular extends Ingreso {
	
	public IngresoRegular(String mes, String concepto, Double monto) {
		super(mes, concepto, monto);
	}

	@Override
	public Double getMontoImponible() {
		return getMonto();
	}

}
