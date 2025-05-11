package ar.edu.unq.po2.tp7.Cultivo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Cultivos.BaseParcela;
import ar.edu.unq.po2.tp7.Cultivos.Soja;

class SojaTest extends Soja {
	
	private BaseParcela soja;
	
	@BeforeEach
	public void setUp() {
		soja = new Soja();
	}

	@Test
	void testGetPrecioSoja() {
		assertEquals(soja.getGananciaSoja(), 500d);
	}
	
	@Test
	void testGetPrecioTrigo() {
		assertEquals(soja.getGananciaTrigo(), 0d);
	}

}
