package ar.edu.unq.po2.tp6.Banco;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {
	
	public SolicitudDeCreditoPersonal(Cliente cliente, Double monto, int plazoEnMeses) {
		super(cliente, monto, plazoEnMeses);
	}

	@Override
	public Boolean esAceptable() {
		return this.getCliente().getIngresoNetoAnual() >= 15000 && this.noSuperaIngresosMensuales(70d);
	}

}
