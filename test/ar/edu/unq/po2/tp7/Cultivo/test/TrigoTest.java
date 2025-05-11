package ar.edu.unq.po2.tp7.Cultivo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Cultivos.BaseParcela;
import ar.edu.unq.po2.tp7.Cultivos.Trigo;

class TrigoTest extends Trigo {
	
	private BaseParcela trigo;

	@BeforeEach
	public void setUp() {
		trigo = new Trigo();
	}
	
	@Test
	void testGetPrecioTrigo() {
		assertEquals(trigo.getGananciaTrigo(), 300d);
	}

	@Test
	void testGetPrecioSoja() {
		assertEquals(trigo.getGananciaSoja(), 0d);
	}
	
}
