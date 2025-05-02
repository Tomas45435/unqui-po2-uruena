package ar.edu.unq.po2.tp5.CajaMercadoCentral.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.CajaMercadoCentral.ProductoTradicional;

class ProductoTradicionalTest  {

	private ProductoTradicional arroz;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoTradicional("Arroz", 750d, 10);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(750d, arroz.getPrecioBase());
		assertEquals(10, arroz.getStockDisponible());
	}
	
	@Test
	public void testGetMonto() {
		assertEquals(750d, arroz.getMonto());
	}

}
