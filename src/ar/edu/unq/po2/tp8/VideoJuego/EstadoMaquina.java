package ar.edu.unq.po2.tp8.VideoJuego;

public abstract class EstadoMaquina {

	public abstract void precionarBotonInicio(Maquina maquina);
	
	public abstract void ingresarFicha(Maquina maquina);
	
	protected void cambiarAEstado(EstadoMaquina estado, Maquina maquina) {
		maquina.cambiarAEstado(estado);
	}
}
