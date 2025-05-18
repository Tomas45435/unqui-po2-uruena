package ar.edu.unq.po2.tp9.Poker;

import java.util.ArrayList;
import java.util.List;

public class Mano {

	private List<Carta> cartas;
	
	public Mano(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		cartas = new ArrayList<>();
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
	}
	
	public List<Valor> valoresDeCartas() {
		List<Valor> valores = new ArrayList<>();
		
		for(Carta carta : cartas) {
			valores.add(carta.getValorCarta());
		}
		
		return valores;
	}
	
	public List<Palo> palosDeCartas() {
		List<Palo> palos = new ArrayList<>();
		
		for(Carta carta : cartas) {
			palos.add(carta.getPalo());
		}
		
		return palos;
	}
}
