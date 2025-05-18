package ar.edu.unq.po2.tp8.VideoJuego;

public class EstadoUnJugador extends EstadoMaquina {
	
	private static final EstadoUnJugador instancia = new EstadoUnJugador();
	
	public static EstadoMaquina getInstancia() {
		return instancia;
	}

	@Override
	public void precionarBotonInicio(Maquina maquina) {
		System.out.println("Juego iniciado para un jugador");
		
	}

	@Override
	public void ingresarFicha(Maquina maquina) {
		this.cambiarAEstado(EstadoDosJugadores.getInstancia(), maquina);
	}
	
	

}
