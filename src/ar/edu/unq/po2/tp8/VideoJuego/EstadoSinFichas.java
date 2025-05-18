package ar.edu.unq.po2.tp8.VideoJuego;

public class EstadoSinFichas extends EstadoMaquina {
	
	private static final EstadoSinFichas instancia = new EstadoSinFichas();
	
	public static EstadoMaquina getInstancia() {
		return instancia;
	}

	@Override
	public void precionarBotonInicio(Maquina maquina) {
		System.out.println("Ingrese fichas");
		
	}

	@Override
	public void ingresarFicha(Maquina maquina) {
		this.cambiarAEstado(EstadoUnJugador.getInstancia(), maquina);
		
	}


}
