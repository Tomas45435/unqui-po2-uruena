package ar.edu.unq.po2.tp9.Poker.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9.Poker.Mano;
import ar.edu.unq.po2.tp9.Poker.Palo;
import ar.edu.unq.po2.tp9.Poker.PokerStatus;
import ar.edu.unq.po2.tp9.Poker.Valor;


class PokerStatusTest {

	private PokerStatus pokerStatus;
	private Mano mano;
	
	@BeforeEach
	public void setUp() {
		
		 // SUT : PokerStatus
		pokerStatus = new PokerStatus();
		
		// DOC
		mano = mock(Mano.class);
	}
	
	
	@Test
	void testVerificarPokerConCuatroCartasConMismoValor() {
		//SetUp
		// Retorna una lista con los valores de cartas para cumplir la jugada Poker
		when(this.mano.valoresDeCartas()).thenReturn(Arrays.asList(Valor.CINCO, Valor.CINCO, Valor.CINCO, Valor.CINCO, Valor.DOS));
		
		//Exercise
		String resultado = pokerStatus.verificar(mano);
		
		//Verify
		assertEquals(resultado, "Es Poker");
	}
	
	
	@Test
	void testVerificarTrioConTresCartasDelMismoValor() {
		//SetUp
		// Retorna una lista con los valores de cartas para cumplir la jugada Trio
		when(this.mano.valoresDeCartas()).thenReturn(Arrays.asList(Valor.DIEZ, Valor.DIEZ, Valor.DIEZ, Valor.CUATRO, Valor.A));
		// Retorna una lista con los palos de cartas para pasar la verificacion de color
		when(this.mano.palosDeCartas()).thenReturn(Arrays.asList(Palo.CORAZONES, Palo.CORAZONES, Palo.PICAS, Palo.DIAMANTES, Palo.TREBOLES));
		
		//Exercise
		String resultado = pokerStatus.verificar(mano);
		
		//Verify
		assertEquals(resultado, "Es Trio");
	}
	
	@Test
	void testVerificarColorConCincoCartasConMismoPalo() {
		//SetUp
		// Retorna una lista con los valores de cartas para cumplir la jugada Color, osea que no sea Poker
		when(this.mano.valoresDeCartas()).thenReturn(Arrays.asList(Valor.OCHO, Valor.SIETE, Valor.DIEZ, Valor.CUATRO, Valor.A));
		// Retorna una lista con los palos de cartas para cumplir la jugada Color
		when(this.mano.palosDeCartas()).thenReturn(Arrays.asList(Palo.CORAZONES, Palo.CORAZONES, Palo.CORAZONES, Palo.CORAZONES, Palo.CORAZONES));
		
		//Exercise
		String resultado = pokerStatus.verificar(mano);
		
		//Verify
		assertEquals(resultado, "Es Color");
	}
}
