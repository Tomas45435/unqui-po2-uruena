package ar.edu.unq.po2.tp6.Banco;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {
	
	private Garantia propiedad;
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, Double monto, int plazoEnMeses, Garantia propiedad) {
		super(cliente, monto, plazoEnMeses);
		this.setPropiedad(propiedad);
	}

	@Override
	public Boolean esAceptable() {
		return this.noSuperaIngresosMensuales(50d) && 
					noSuperaValorFiscal(70d) &&
					clienteNoEsMayorDe(65);
	}

	public Garantia getPropiedad() {
		return propiedad;
	}

	private void setPropiedad(Garantia propiedad) {
		this.propiedad = propiedad;
	}
	
	private Boolean noSuperaValorFiscal(Double porcentaje) {
		Double valorFiscal = this.getPropiedad().getValorFiscal();
		return ((valorFiscal * porcentaje) / 100) > this.getMonto();
	}
	
	private Boolean clienteNoEsMayorDe(int Edad) {
		return this.getCliente().getEdad() < Edad;
	}
	

}
