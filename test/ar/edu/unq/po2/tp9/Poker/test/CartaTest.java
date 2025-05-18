package ar.edu.unq.po2.tp9.Poker.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ar.edu.unq.po2.tp9.Poker.Carta;
import ar.edu.unq.po2.tp9.Poker.Palo;
import ar.edu.unq.po2.tp9.Poker.Valor;

public class CartaTest {

	private Carta carta1;
	private Carta carta2;
	
	@Before
	public void setUp() {
		carta1 = new Carta(Valor.DOS, Palo.DIAMANTES);
		carta2 = new Carta(Valor.CINCO, Palo.DIAMANTES);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(carta1.getValorCarta(), Valor.DOS);
		assertEquals(carta1.getPalo(), Palo.DIAMANTES);
	}
	
	@Test
	public void testUnaCartaEsMayorQueOtra() {
		Boolean esMayor = carta1.esMayorQue(carta2);
		Boolean esMayor2 = carta2.esMayorQue(carta1);
		
		assertEquals(esMayor, false);
		assertEquals(esMayor2, true);
	}
	
	@Test
	public void testSonCartasDelMismoPalo() {
		Boolean mismoPalo = carta1.sonDelMismoPalo(carta2);
		
		assertEquals(mismoPalo, true);
	}
}
