package ar.edu.unq.po2.tp5.CajaMercadoCentral.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.CajaMercadoCentral.AgenciaMunicipal;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.Caja;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.FacturaServicio;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.ProductoTradicional;

class CajaTest {
	
	private Caja cajaMercadoCentral;
	private ProductoTradicional arroz;
	private FacturaServicio facturaNetflix;
	private AgenciaMunicipal agenciaBerazategui;
	
	@BeforeEach
	public void setUp() {
		cajaMercadoCentral = new Caja();
		arroz = new ProductoTradicional("Arroz", 750d, 10);
		agenciaBerazategui = new AgenciaMunicipal();
		facturaNetflix = new FacturaServicio("12134", LocalDate.of(2025, 4, 5), agenciaBerazategui, 5500d, 3);
	}
	

	@Test
	public void testConstructor() {
		assertEquals(true, cajaMercadoCentral.getItems().isEmpty());
		assertEquals(0, cajaMercadoCentral.getMontoTotal());
	}
	
	@Test
	public void testAgregarItemALaCaja() {
		cajaMercadoCentral.agregarItem(arroz);
		cajaMercadoCentral.agregarItem(facturaNetflix);
		
		assertEquals(2, cajaMercadoCentral.getItems().size());
	}
	
	@Test
	public void testRegistrarTodosLosItemEnCaja() {
		cajaMercadoCentral.agregarItem(arroz);
		cajaMercadoCentral.agregarItem(facturaNetflix);
		cajaMercadoCentral.registrarItems();
		
		assertEquals(17250d, cajaMercadoCentral.getMontoTotal());
	}
	
	@Test
	public void testInformarMontoAPagar() {
		cajaMercadoCentral.agregarItem(arroz);
		cajaMercadoCentral.agregarItem(facturaNetflix);
		cajaMercadoCentral.registrarItems();
		
		cajaMercadoCentral.informarTotal();
	}
	

}
