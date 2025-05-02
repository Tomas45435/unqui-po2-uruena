package ar.edu.unq.po2.tp5.CajaMercadoCentral.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.CajaMercadoCentral.Producto;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.ProductoCooperativa;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.ProductoTradicional;

class ProductoTest {
	
	private ProductoTradicional arroz;
	private ProductoCooperativa leche;

	@BeforeEach
	public void setup() {
		arroz = new ProductoTradicional("Arroz", 750d, 29);
		leche = new ProductoCooperativa("Leche", 600d, 2);
	}
	
	
	// Un producto al ser registrado decrementa una unidad de su stock.
	@Test
	public void testRegistrarProducto() {
		leche.registrarItem();
		arroz.registrarItem();
		
		assertEquals(28, arroz.getStockDisponible());
		assertEquals(1, leche.getStockDisponible());
	}
	
	// Se registra el mismo item mas de una vez, utilizando la misma instancia del producto
	@Test
	public void testRegistrarElMismoProductoMasDeUnaVez() {
		leche.registrarItem();
		leche.registrarItem();
		
		assertEquals(0, leche.getStockDisponible());
	}
	
	// Se lanza una exception al intentar regitrar un producto que no tiene stock
	@Test
	public void testRegistrarProductoSinStock() {
		leche.registrarItem();
		leche.registrarItem();
		
		assertThrows(IllegalStateException.class, () -> {
			leche.registrarItem();
	        });
	}
}
