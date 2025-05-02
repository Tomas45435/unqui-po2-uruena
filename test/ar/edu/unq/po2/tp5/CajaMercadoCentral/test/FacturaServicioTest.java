package ar.edu.unq.po2.tp5.CajaMercadoCentral.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.CajaMercadoCentral.AgenciaMunicipal;
import ar.edu.unq.po2.tp5.CajaMercadoCentral.FacturaServicio;

class FacturaServicioTest {
	
	private FacturaServicio facturaNetflix;
	private AgenciaMunicipal agenciaBerazategui;
	
	@BeforeEach
	public void setUp() {
		agenciaBerazategui = new AgenciaMunicipal();
		facturaNetflix = new FacturaServicio("12134", LocalDate.of(2025, 4, 5), agenciaBerazategui, 5500d, 3);
	}

	@Test
	public void testConstructor() {
		assertEquals("12134", facturaNetflix.getNumero());
		assertEquals(LocalDate.of(2025, 4, 5), facturaNetflix.getFecha());
		assertEquals(agenciaBerazategui, facturaNetflix.getAgencia());
		assertEquals(5500d, facturaNetflix.getCostoUnidad());
		assertEquals(3, facturaNetflix.getUnidadesConsumidas());
	}
	
	@Test
	public void testGetMonto() {
		assertEquals(16500d, facturaNetflix.getMonto());
	}
}
