package ar.edu.unq.po2.tp4.ImpuestosTrabajador;

public class IngresoHorasExtras extends Ingreso {
	
	private int horasExtras;
	
	public IngresoHorasExtras(String mes, String concepto, Double monto, int horasExtras ) {
		super(mes, concepto, monto);
		this.setHorasExtras(horasExtras);
	}

	@Override
	public Double getMontoImponible() {
		return 0d;
	}
	
	private void setHorasExtras(int cantHorasExtras) {
		this.horasExtras = cantHorasExtras;
	}
	
	public int getHorasExtras() {
		return horasExtras;
	}

}
