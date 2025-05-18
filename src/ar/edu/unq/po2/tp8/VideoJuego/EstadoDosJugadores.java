package ar.edu.unq.po2.tp8.VideoJuego;

public class EstadoDosJugadores extends EstadoMaquina {

	private static final EstadoDosJugadores instancia = new EstadoDosJugadores();
	
	public static EstadoMaquina getInstancia() {
		return instancia;
	}

	@Override
	public void precionarBotonInicio(Maquina maquina) {
		System.out.println("Juego iniciado para dos jugadores");
		
	}

	@Override
	public void ingresarFicha(Maquina maquina) {
		throw new IllegalArgumentException("Limite de dos fichas");
		
	}
	
	
}
