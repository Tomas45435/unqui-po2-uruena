package ar.edu.unq.po2.tp6.Banco;

public abstract class SolicitudDeCredito {
	
	private Cliente cliente;
	private Double monto;
	private int plazoEnMeses;
	
	public SolicitudDeCredito(Cliente cliente, Double monto, int plazoEnMeses) {
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setPlazoEnMeses(plazoEnMeses);
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	
	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Double getMonto() {
		return monto;
	}
	
	private void setMonto(Double monto) {
		this.monto = monto;
	}
	
	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
	private void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public abstract Boolean esAceptable();
	
	public Double montoCuotaMensual() {
		return this.getMonto() / this.getPlazoEnMeses();
	}
	
	public Boolean noSuperaIngresosMensuales(Double porcentaje) {
		return ((this.getCliente().getSueldoNetoMensual() * porcentaje) / 100) > this.montoCuotaMensual();
	}
	
}
