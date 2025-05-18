package ar.edu.unq.po2.tp9.Poker;

public class Carta {
	
	private Valor valor;
	private Palo palo;
	
	public Carta(Valor valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
	}
	
	public Palo getPalo() {
		return palo;
	}
	
	public Valor getValorCarta() {
		return valor;
	}
	
	public Boolean sonDelMismoPalo(Carta carta) {
		return this.getPalo() == carta.getPalo();
	}
	
	public Boolean esMayorQue(Carta carta) {
		return this.valor.getValorNumerico() > carta.valor.getValorNumerico();
	}

}
