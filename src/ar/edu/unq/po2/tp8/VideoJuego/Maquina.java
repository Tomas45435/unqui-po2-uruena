package ar.edu.unq.po2.tp8.VideoJuego;

public class Maquina {
	private EstadoMaquina estadoActual;
	
	public Maquina() {
		this.setEstadoActual(EstadoSinFichas.getInstancia());
	}
	
	private void setEstadoActual(EstadoMaquina estado) {
		estadoActual = estado;
	}
	
	public void precionarBotonInicio() {
		this.estadoActual.precionarBotonInicio(this);
	}
	
	public void ingresarFicha() {
		this.estadoActual.ingresarFicha(this);
	}
	
	protected void cambiarAEstado(EstadoMaquina estado) {
		this.setEstadoActual(estado);
	}
	
	public void terminarJuego() {
		this.cambiarAEstado(EstadoSinFichas.getInstancia());
	}
	
}
