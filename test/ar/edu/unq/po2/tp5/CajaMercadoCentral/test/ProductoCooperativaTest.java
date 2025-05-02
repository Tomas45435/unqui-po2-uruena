package ar.edu.unq.po2.tp5.CajaMercadoCentral.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.CajaMercadoCentral.ProductoCooperativa;

class ProductoCooperativaTest {
	
	private ProductoCooperativa leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoCooperativa("Leche", 500d, 20);
	}

	@Test
	public void testConstructor() {
		assertEquals("Leche", leche.getNombre());
		assertEquals(500d, leche.getPrecioBase());
		assertEquals(20, leche.getStockDisponible());
	}
	
	@Test
	public void testGetMonto() {
		assertEquals(450d, leche.getMonto());
	}

}
