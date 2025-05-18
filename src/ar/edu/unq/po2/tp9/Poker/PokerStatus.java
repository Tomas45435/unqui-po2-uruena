package ar.edu.unq.po2.tp9.Poker;

import java.util.Collections;
import java.util.List;

public class PokerStatus {
	
	public String verificar(Mano mano) {
		String resultado = "Sin juego";
		if (esPoker(mano)) {
			resultado = "Es Poker";
		}
		else if (esColor(mano)) {
			resultado = "Es Color";
		}
		else if (esTrio(mano)) {
			resultado = "Es Trio";
		}
		
		return resultado;
	}
	
	public Boolean esPoker(Mano mano) {
		List<Valor> valores = mano.valoresDeCartas();
		
		int cantidadDeAparicionesc1 = Collections.frequency(valores, valores.get(0));
		int cantidadDeAparicionesc2 = Collections.frequency(valores, valores.get(1));
		
		return cantidadDeAparicionesc1 == 4 || cantidadDeAparicionesc2 == 4;
	}
	
	public Boolean esColor(Mano mano) {
		List<Palo> valores = mano.palosDeCartas();
		
		int cantidadDeAparicionesc1 = Collections.frequency(valores, valores.get(0));
		
		return cantidadDeAparicionesc1 == 5;
	}
	
	public Boolean esTrio(Mano mano) {
		List<Valor> valores = mano.valoresDeCartas();
		
		int cantidadDeAparicionesc1 = Collections.frequency(valores, valores.get(0));
		int cantidadDeAparicionesc2 = Collections.frequency(valores, valores.get(1));
		int cantidadDeAparicionesc3 = Collections.frequency(valores, valores.get(2));
		
		return cantidadDeAparicionesc1 == 3 || cantidadDeAparicionesc2 == 3 || cantidadDeAparicionesc3 == 3;
	}
	
	
}
